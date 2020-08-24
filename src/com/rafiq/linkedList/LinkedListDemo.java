package com.rafiq.linkedList;

public class LinkedListDemo {
	// TODO Auto-generated method stub
	static LinkedListUtility linkedListUtility = new LinkedListUtility();

	public static void main(String[] args) {
		linkedListAdapter();
	}
	
	private static void linkedListAdapter() {
		System.out.println("Please choice the optin you want to perform the operation on linked list.");
		System.out.println(""
				+ "1:create\n"
				+ "2:Display\n"
				+ "3:insert at bigining\n"
				+ "4:insert at End\n"
				+ "5:insert at given position\n"
				+ "6:Delete from bigining\n"
				+ "7:Delete from End\n"
				+ "8:Delete from given position\n"
				+ "9:Reverse\n");
		int choice = linkedListUtility.myScanner.nextInt();
		switch (choice) {
		case 1:
			linkedListUtility.createLinkedList();
			linkedListAdapter();
			break;
		case 2:
			linkedListUtility.printLinkedList();
			linkedListAdapter();
			break;
		case 3:
			linkedListUtility.insertAtBigining();
			linkedListAdapter();
			break;
		case 4:
			linkedListUtility.insertAtEnd();
			linkedListAdapter();
			break;
		case 5:
			linkedListUtility.insertAtGivenPosition();
			linkedListAdapter();
			break;
		case 6:
			linkedListUtility.deleteFromBigining();
			linkedListAdapter();
			break;
		case 7:
			linkedListUtility.deleteFromEnd();
			linkedListAdapter();
			break;
		case 8:
			linkedListUtility.deleteFromGivenPosition();
			linkedListAdapter();
			break;
		case 9:
			linkedListUtility.reverse();
			linkedListAdapter();
			break;	
		default:
			linkedListAdapter();
			break;			
		}
	}
}
