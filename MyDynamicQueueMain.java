class Node{
    int no;
    Node next;
    Node(int no){
        this.no=no;
        this.next=null;
    }
}
class MyDynamicQueue{
    Node front=null;
    Node rear=null;
    public void enQueue(int no){
        Node p=new Node(no);
        if(front==null && rear==null){
            front=p;
            rear=p;
        }else{
            rear.next=p;// doosare box ka address pahleme rakh do
            rear=p;  //doosare box ka address rear me bi rakh do
        }    
    }
    public void deQueue(){
        if(front==null && rear==null){
            System.out.println("Queue is empty element unable to delete");
        }else{
            System.out.println("Delete item from front of queue=="+ front.no);
            if (front==rear) {
                front=null;
                rear=null;   
            }else{
                front =front.next;
            }
        }
    }
    public void traverse(){
        if(front==null && rear==null){
            System.out.println("Queue is empty element does not delete");
        }else{
            Node temp;
            temp=front;
            while (temp!=null) {
                System.out.print(temp.no + "\t");
                temp=temp.next;
                
            }
        }
        

    }
    public void sumAllElement(){
        int sum=0;
        Node temp=front;
        if(front==null && rear==null){
            System.out.println("Queue is empty element does not delete");
        }else{
            while (temp!=null) {
                sum=sum+temp.no;
                temp=temp.next;
                
            }
            System.out.println("\n sum ao all element is  " + sum);
            
        }

    }
    public void greatestElement(){
        int max=front.no;
        Node temp=front;
        while (temp!=null) {
            if (temp.no>max) {
                max=temp.no;
                
            }
            temp=temp.next;
            
        }
        System.out.println("Greatest element of queue is " + max);
    
            
    }
}

public class MyDynamicQueueMain {
    public static void main(String[] args) {
        MyDynamicQueue t=new MyDynamicQueue();
        t.enQueue(10);
        t.enQueue(22); 
        t.enQueue(88);
        t.traverse();
        t.deQueue();
        t.traverse();
        t.enQueue(45);
       // t.enQueue(725);
        t.enQueue(12); 
        t.traverse();
        t.sumAllElement();
        t.greatestElement();
        

    }
    
}
