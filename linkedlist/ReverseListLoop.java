public class ReverseListLoop{
	
	public Node reverse(Node head){
		if(head == null|| head.next == null){
			return head;
		}
		Node pre = null;
 		Node next = null;  
		while(head!=null){
			next =  head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;
	}
	public static void main(String[] args){
		Node head = new Node(0);
		head.next = new Node(1);
		head.next.next = new Node(2);
		head.next.next.next = null;
		ReverseListLoop reverser = new ReverseListLoop();
		head = reverser.reverse(head);
		while(head!=null){
			System.out.println(head.data+" ");
			head = head.next;
		}
		return ;
	} 
}
