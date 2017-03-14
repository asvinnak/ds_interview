package com.gowtham.test.air;
// You are given two non-empty linked lists representing two non-negative integers. 

//The digits are stored in reverse order and each of their nodes contain a single digit. 
//Add the two numbers and return it as a linked list.

// You may assume the two numbers do not contain any leading zero, except the number 0 itself.

// Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
// Output: 7 -> 0 -> 8

//  Definition for singly-linked list.

public class addTwoNumbers {

	public static void main(String[] args) {

		addTwoNumbers an = new addTwoNumbers();

		an.test();

	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public void test() {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);

		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);

		ListNode l3 = addTwoNumber(l1, l2);

		while (l3 != null) {
			System.out.println("test -- " + l3.val);
			l3 = l3.next;
		}
	}

	public ListNode addTwoNumber(ListNode l1, ListNode l2) {

		ListNode current1 = l1;
		ListNode current2 = l2;

		ListNode head = new ListNode(0);
		ListNode currentHead = head;

		int sum = 0;

		while (current1 != null || current2 != null) {

			sum /= 10;

			if (current1 != null) {

				sum += current1.val;
				current1 = current1.next;

			}

			if (current2 != null) {

				sum += current2.val;
				current2 = current2.next;

			}

			currentHead.next = new ListNode(sum % 10);
			currentHead = currentHead.next;

		}

		if (sum / 10 == 1) {

			currentHead.next = new ListNode(1);

		}

		return head.next;

	}

}