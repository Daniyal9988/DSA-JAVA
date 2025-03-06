public LinkedList reverseLinkedList(LinkedList list) {
    Node prev = null;
    Node current = list.head;
    Node next = null;

    while (current != null) {
      next = current.getNextNode(); 
      current.setNextNode(prev); 
      prev = current;
      current = next;
    }
    list.head = prev; 
    return list;
  }