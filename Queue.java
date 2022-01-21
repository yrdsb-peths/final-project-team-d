public Queue<String> toQueue(String[] array) {
    Queue<String> queue = new Queue<String>();
    for (String str : array){
        queue.enqueue(str);
    }
    while (queue.isEmpty()){
        System.out.println(queue.dequeue());
    }
    return queue;
}
