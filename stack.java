class StackOfStrings
{
    private Node first;
    
    public boolean isEmpty(){
        return first == null;
    }

    /**
    *   Adds a String at the first position on the stack
    */
    
    
    public void push(String item){
   // 1. Create a reference called ‘second’ that points
   	   //    to the first node
		Node second = first;

	   // 2. Point the ‘first’ reference to a new Node.
        first = new Node();

	   // 3. Add the new String to the new Node.
        first.item = item;

	   // 4. Set the ‘next’ reference of the new Node to
	   //    point to the ‘second’ node.
        first.next = second;

    }

    /**
    *   Removes and returns the first element on the stack.
    */
    public String pop(){
	   // 1. Set a String reference to the item in the first node.
        String item = first.item;

	   // 2. Set the ‘first’ reference to point to the second node.
        first = first.next;

	   // 3. Return the removed String.
        return item;
    }
}
