class que
{
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {data=d;next=null;}
    }
    public void insert (int new_data)
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
    public void delete()
    {
        Node SL = head;
        Node L = head.next;
        while(L.next!=null)
        {
            L=L.next;
            SL=SL.next;
        }
        SL.next=null;
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
    que list=new que();

    //System.out.println("Enter the first node");

    list.insert(1);
    list.insert(2);
    list.insert(3);
    list.insert(4);
    list.insert(5);
    list.delete();
    list.printList();
}
}
