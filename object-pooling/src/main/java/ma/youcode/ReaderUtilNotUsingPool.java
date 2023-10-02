package ma.youcode;
import java.io.Reader;
import java.io.IOException;

public class ReaderUtilNotUsingPool {
    public ReaderUtilNotUsingPool() {
    }


    public String readToString(Reader in) throws IOException {
        StringBuffer buf = new StringBuffer();                 // TODO : Creating a new object each time
        try {
            for(int c = in.read(); c != -1; c = in.read()) {
                buf.append((char)c);
            }
            return buf.toString();
        } catch(IOException e) {
            throw e;
        } finally {
            try {
                in.close();
            } catch(Exception e) {
                // ignored
            }
        }
    }
}
