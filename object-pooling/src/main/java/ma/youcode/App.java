package ma.youcode;

import org.apache.commons.pool2.impl.GenericObjectPool;

public class App
{
    /*
    TODO
     Object pooling is a technique where a pool of objects is maintained,
     and objects are reused from the pool instead of being created anew each time they’re needed.
     This can be an effective way to reduce memory usage and improve performance,
     particularly in situations where objects are frequently created and discarded.
     Object pooling can be implemented using a variety of libraries, such as :
        -> Apache Commons Pool
        -> C3P0
   */
    public static void main( String[] args )
    {
        StringBufferFactory object = new StringBufferFactory();
        GenericObjectPool<StringBuffer> pool = new GenericObjectPool<>(object);
        ReaderUtil readerUtil = new ReaderUtil(pool);
    }
    // TODO :
    //  resources
    //  https://softwareengineering.stackexchange.com/questions/115163/is-object-pooling-a-deprecated-technique
}
