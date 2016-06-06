public class ReverseListRecursion{
	
	public Node reverse(Node head){
		if(head == null || head.next == null){
			return head;	
		}
		Node newhead = reverse(head.next);
		head.next.next = head;
		head.next = null;
		return newhead;
	}	

	public static void main(String[] args){	
		ReverseListRecursion reverser = new ReverseListRecursion();
		Node head = new Node(1);
		head.next =  new Node(2);
		head.next.next =  new Node(3);
		head = reverser.reverse(head);
		while(head!=null){
			System.out.println(head.data);	
			head = head.next;	
		}
		return ;
	}
}
