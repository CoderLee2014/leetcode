import java.util.Scanner;
public class Findkthnode{

	public Node find(Node head, int k){
		Node p = head;
		Node q = head;
		if(head==null){
			return null;	
		}
		while(q!=null&& k > 0){
			q = q.next;
			k--;
		}
		if(k!=0){
			return null;// can't find the node		
		}
		while(q!=null){
			p = p.next;
			q = q.next;
		}
		return p;
	}

	public static void main(String[] args){
		Node head = new Node(0);
		head.next = new Node(1);
		head.next.next = new Node(2);
		head.next.next.next = new Node(3);
		head.next.next.next.next = new Node(4);
		Findkthnode finder = new Findkthnode();
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = reader.nextInt();
		
             	throws System.out.println(finder.find(head,n).data);
	}
}
