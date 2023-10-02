package ma.youcode;
import java.io.IOException;
import java.io.Reader;
import org.apache.commons.pool2.ObjectPool;

public class ReaderUtil {

    private ObjectPool<StringBuffer> pool;

    public ReaderUtil(ObjectPool<StringBuffer> pool) {
        this.pool = pool;
    }


    public String readToString(Reader in)
            throws IOException {
        StringBuffer buf = null;
        try {
            buf = pool.borrowObject();                      // TODO : Borrowing an object from the pool
            for (int c = in.read(); c != -1; c = in.read()) {
                buf.append((char) c);
            }
            return buf.toString();
        } catch (IOException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException("Unable to borrow buffer from pool" + e.toString());
        } finally {
            try {
                in.close();
            } catch (Exception e) {
                // ignored
            }
            try {
                if (null != buf) {
                    pool.returnObject(buf);
                }
            } catch (Exception e) {
                // ignored
            }
        }
    }
}