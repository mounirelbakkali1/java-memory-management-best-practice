### Java memory model (JMM)
what is Java memory model (JMM) ?
> The Java memory model specifies how the Java virtual machine works with the computer's memory (RAM). The Java memory model specifies how and when different threads can see values written to shared variables by other threads, and how to synchronize access to shared variables when necessary.
![Java memory model](https://jenkov.com/images/java-concurrency/java-memory-model-5.png)

> How different threads can see values written to shared variables by other threads, and how to synchronize access to shared variables when necessary.

![JMM](https://javatutorial.net/wp-content/uploads/2015/03/java-memmory-model.png)

 
 JMM defines the Java heap, which is where all objects are stored in memory, and the stack, which is where method calls and local variables are stored


All local variables of primitive types ( boolean, byte, short, char, int, long, float, double) are fully stored on the thread stack and are thus not visible to other threads.


>### key aspects of how JMM defines object access

>- ##### Shared Memory Model :
>assumes that all threads in a Java program share a common memory (the "heap")

>- ##### Visibility:
>In a multithreaded environment. JMM provides mechanisms to ensure that changes made to shared objects by one thread become visible to other threads.

>- ##### Happens-Before Relationship

>- ##### Synchronization:
>JMM provides synchronization primitives like synchronized blocks and methods, volatile variables, and atomic classes (e.g., java.util.concurrent classes) to control access to shared objects. These mechanisms ensure that only one thread can access a synchronized block or method at a time, preventing data races and ensuring visibility of changes.

>- ##### Memory Barriers: 
>JMM also uses memory barriers (often referred to as memory fences) to enforce synchronization. Memory barriers are hardware or software instructions that prevent certain types of memory operations from being reordered. They help ensure that changes made to memory by one thread are visible to other threads in the expected order.

>- ##### Volatile Keyword:
>When a variable is declared as volatile, it guarantees that any read or write operation on that variable is atomic and enforces a happens-before relationship. This ensures that changes to volatile variables are visible to all threads immediately.

>- ##### Locks and Monitors: JMM supports locking mechanisms like synchronized blocks/methods and explicit Lock objects. These mechanisms ensure that only one thread can acquire a lock at a time, preventing concurrent access to shared resources.


### JVM structure in deepth:

![JVM Structure](https://scaler.com/topics/images/jvm-memory-structure.webp).
