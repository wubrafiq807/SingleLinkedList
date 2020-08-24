package com.rafiq.linkedList;

import java.util.Scanner;

public class LinkedListUtility {
	private Node head = null;
	Node temNode;
	public Scanner myScanner = new Scanner(System.in);

	public void createLinkedList() {
		int choice = 1;
		while (choice != 0) {
			Node newNode = createNewNode();
			if (head == null) {
				head = temNode = newNode;
			} else {
				temNode.setNext(newNode);
				temNode = newNode;
			}
			System.out.println("Press any number to add more node or press 0 to stop to adding node");
			choice = myScanner.nextInt();
		}
	}

	public void printLinkedList() {
		System.out.println("The linked list:");
		temNode = head;
		while (temNode != null) {
			System.out.print(temNode.getData());
			System.out.print(temNode.getNext() != null ? "->" : "");
			temNode = temNode.getNext();
		}
		System.out.println();
	}

	public void insertAtBigining() {
		Node newNode = createNewNode();
		newNode.setNext(head);
		head = newNode;
	}

	public void insertAtEnd() {
		temNode = head;
		while (temNode.getNext() != null) {
			temNode = temNode.getNext();
		}
		temNode.setNext(createNewNode());
	}

	public int getSize() {
		temNode = head;
		int lenthOfLinked = 0;
		while (temNode != null) {
			temNode = temNode.getNext();
			lenthOfLinked++;
		}
		return lenthOfLinked;
	}

	public void insertAtGivenPosition() {
		System.out.println("please enter the position");
		int position = myScanner.nextInt();
		if (position > getSize()) {
			System.err.println("Invalid position");
		} else {
			int count = 1;
			temNode = head;
			while (count < position) {
				temNode = temNode.getNext();
				count++;
			}
			Node newNode = createNewNode();
			newNode.setNext(temNode.getNext());
			temNode.setNext(newNode);
		}
	}

	public void deleteFromBigining() {
		if(getSize()>0) {
			temNode = head;
			head = temNode.getNext();
			temNode = null;	
		}else {
			System.err.println("Linked list is already empty can not be perform delete operation.");
		}
	}
	
	public void deleteFromEnd() {
		if(getSize()>0) {
			temNode = head;
			Node previousNode = new Node();
			while (temNode.getNext() != null) {
				previousNode=temNode;
				temNode = temNode.getNext();
			}
			previousNode.setNext(null);
			temNode=null;			
		}else {
			System.err.println("Linked list is already empty can not be perform delete operation.");
		}
	}
	
	public void deleteFromGivenPosition() {
		
		System.out.println("please enter the position");
		int position = myScanner.nextInt();
		if (position > getSize()) {
			System.err.println("Invalid position");
		} else {
			int count = 1;
			temNode = head;
			while (count < position -1) {
				temNode = temNode.getNext();
				count++;
			}
			Node nextNode =temNode.getNext();
			temNode.setNext(nextNode.getNext());
			nextNode=null;
		}
	}
	
	public void reverse() {
		Node prevousNode=null,currentNode=head,nextNode=head;
		while(nextNode!=null) {
			nextNode=nextNode.getNext();
			currentNode.setNext(prevousNode);
			prevousNode=currentNode;
			currentNode=nextNode;
		}
		head=prevousNode;
	}

	private int inputData() {
		System.out.println("Please enter data:");
		return myScanner.nextInt();
	}

	private Node createNewNode() {
		return new Node(inputData(), null);
	}
}
