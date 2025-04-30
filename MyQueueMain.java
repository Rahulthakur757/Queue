class MyQueue{
    int []arr=new int[10];// allocate memory for 10 elements
    int front=-1;
    int rear=-1;
    public void enQueue(int no){
        if (rear==arr.length-1) {
            System.out.println("Queue is full");    
        } else {
            if(front==-1 && rear==-1){
                front=0;
                rear=0;
            }else{
                rear++;
            }
            arr[rear]=no;
          
        }
    }
    public void deQueue(){
        if (front==-1 && rear==-1) {
            System.out.println("Queue is empty");
            
        } else {
            System.out.println("Deleted item from front :"+ arr[front]);
            if(front==rear){
                front=-1;
                rear=-1;

            }else{
                front++;
            }  
        }
    }
    public void traverse(){
        if (front==-1 && rear==-1) {
            System.out.println("Queue is empty");
            
        }else{
            for(int i=front;i<=rear;i++){
                System.out.print(arr[i]+"\t");
            }
        }

    }


}
public class MyQueueMain {
    public static void main(String[] args) {
        MyQueue p=new MyQueue();
        p.enQueue(10);
        p.enQueue(45);
        // p.enQueue(48);
        // p.enQueue(100);
        p.traverse();
        p.deQueue();
        p.traverse();
        p.deQueue();
        p.traverse();
        
    }

    
}