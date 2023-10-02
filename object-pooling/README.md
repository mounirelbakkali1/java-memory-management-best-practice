### Object pooling 
>is a technique where a pool of objects is maintained,
and objects are reused from the pool instead of being created anew each time they’re needed.
This can be an effective way to reduce memory usage and improve performance,
particularly in situations where objects are frequently created and discarded.
Object pooling can be implemented using a variety of libraries, such as :
>- Apache Commons Pool
>- C3P0

>The key function of object pooling is to create objects in advance and store them in a pool, rather than have them created and destroyed on demand. When an object is needed, it's taken from the pool and used, and when no longer needed, it's returned to the pool rather than being destroyed.


Resources : 

- [Object Pooling Pattern](https://www.javatpoint.com/object-pool-pattern)
- [is-object-pooling-a-deprecated-technique ?](https://softwareengineering.stackexchange.com/questions/115163/is-object-pooling-a-deprecated-technique)
- [ Example of object pooling using Apache Commons Pool](https://commons.apache.org/proper/commons-pool/examples.html)