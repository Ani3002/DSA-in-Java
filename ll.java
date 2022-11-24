class linkedlist
{
    Node head;
    int size=0; 
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {data=d;next=null;}
    }
    public void push (int new_data)
    {
        Node new_node=new Node(new_data); 
        if (head==null)
        {
            head=new_node;
        }
        else
        {
            new_node.next=head;
            head=new_node;
        }

    }
    public void pop()
    {
        if(head==null)
        {
            System.out.println("Empty list");
        }
        head=head.next;
    }

    public void insertAfter(Node prev_node, int new_data)
	{
		if (prev_node == null)
		{
			System.out.println("The given previous node cannot be null");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}

    public void deleteAfter(Node prev_node)
    {
        prev_node.next=prev_node.next.next;
    }

    public void printList()
    {
        Node tnode=head;
        while (tnode!=null)
            {
                System.out.println(tnode.data); 
                tnode=tnode.next;
            }
    }

public static void main (String[] args)
{
    linkedlist list=new linkedlist();

    //System.out.println("Enter the first node");

    list.push(1);
    list.push(2);
    list.push(3);
    list.push(4);
    list.push(5);
    list.pop();
    list.printList();
}
}
