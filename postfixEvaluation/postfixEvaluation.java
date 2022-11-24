class stackClass
{
    Node head;
    class Node 
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

        public boolean isEmpty() 
        {
            return head == null;
        }

        public void push(int newData) 
        {
            Node newNode = new Node(newData);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public int pop()
        {
            if (isEmpty()) {
                return 0;// throw Exception;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        static int Stack(String str)
        {
            stackClass postfix = new stackClass();
            for (int i = 0; i < str.length(); i++) 
            {
                char c = str.charAt(i);
                if (Character.isDigit(c)) 
                {
                    postfix.push(c -'0');
                } 
                else 
                {
                    int tmp1 = postfix.pop();
                    int tmp2 = postfix.pop();

                    switch (c) 
                    {
                        case '+':
                            postfix.push(tmp1 + tmp2);
                            break;

                        case '-':
                            postfix.push(tmp1 - tmp2);
                            break;

                        case '*':
                            postfix.push(tmp1 * tmp2);
                            break;
                        case '/':
                            postfix.push(tmp1 / tmp2);
                            break;
                    }
                    //return head.data;
                }
            }
            return postfix.pop();
        }
    


    public static void main(String args[]) throws Exception 
    {
        
        String str = "52+32-*";
        System.out.println("postfix evaluation: " + Stack(str));
    }
}
