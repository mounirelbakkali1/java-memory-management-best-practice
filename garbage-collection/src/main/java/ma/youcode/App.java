package ma.youcode;


import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;

public class App
{
    /* TODO By default, the JVM uses the concurrent mark-and-sweep (CMS) collector in JVM v7,v8 and v9.
        TODO Developers can also configure the garbage collector to use other algorithms, such as the parallel scavenge collector, which is better suited for multi-core systems.

    /* TODO
        Garbage Collection Tuning
            consider using newer java versions to get better performance from the garbage collector.
            -> it uses G1GC by default, which has a better performance than CMS.
       Options :
            Z Garbage Collector
            G1 Garbage Collector
            Parallel Garbage Collector
            Concurrent Mark Sweep (CMS) Garbage Collector
            Serial Garbage Collector
            Parallel Old Garbage Collector
            Parallel Scavenge Garbage Collector
            Serial Old Garbage Collector
    TODO
     how to enable it ?
        add one of these flags to the JVM arguments :
            -XX:+UseG1GC
            -XX:+UseParallelGC
            -XX:+UseConcMarkSweepGC
            -XX:+UseSerialGC
            -XX:+UseParallelOldGC
            -XX:+UseParNewGC
            -XX:+UseSerialOldGC



     */
    public static void main( String[] args )
    {
        // print the current garbage collector
        List<GarbageCollectorMXBean> beans =  ManagementFactory.getGarbageCollectorMXBeans();
        for (GarbageCollectorMXBean bean : beans) {
            System.out.println("Garbage Collector Name: " + bean.getName());
        }
    }


    /*
    TODO resources
        Tunning Garbage collection
     https://sematext.com/blog/java-garbage-collection-tuning/#:~:text=You%20can%20turn%20on%20the,the%20%2DXX%3A%2DUseParallelGC%20flag.
        Understanding JMM
     https://www.digitalocean.com/community/tutorials/java-jvm-memory-model-memory-management-in-java

     */
}
