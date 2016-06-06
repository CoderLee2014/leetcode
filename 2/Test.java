public class Test{
	public static void main(String[] args){
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		
		Solution solution = new Solution();
		ListNode list = solution.addTwoNumbers(l1, l2);

		while(list!=null){
			System.out.println(list.val);
			list = list.next;
		}
		return;		
	}
}
