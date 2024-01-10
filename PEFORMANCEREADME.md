### Java Performance Tuning

1. **Memory Issues** : Out of memory

    
    Metaspace issue - avoid unwanted dependency using mvn dependency tree

    Memory Leakages - Efficient use of garbage collector

    Slow Queries    - Query tuning, table index tuning


2. **Thread Issues**
    
    
    Deadlock - Unable to proceed with another request. Concurrency usage, timeout, avoid nested loops
    
    Blocked Threads - I/O operations(Database and other operations), Locked(wait and notify), sleep(Sleeping thread)
    

3. **CPU Spikes**


    Inefficient Code

    Infinite Loops
    
    Concurrency Issue
    
    Thread Pool Configurations


4. **System Spikes**

    
    
    System Process/Memory Usage
    
    Disk Space
    
    Network Bottlenecks
    
    Continous Log Monitoring
