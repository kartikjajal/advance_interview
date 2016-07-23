package com.jpmorgan.example.linkedlist.single;

public class SingleLinkedList {

	private SingleLinkedList next;
	private int data;
	public SingleLinkedList getNext() {
		return next;
	}
	public void setNext(SingleLinkedList next) {
		this.next = next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
	public void add(int data){
		
		if(this.getNext()==null){
			SingleLinkedList singleLinkedList2 = new SingleLinkedList();
			singleLinkedList2.setData(data);
			this.next=singleLinkedList2;
		}else{
			SingleLinkedList singleLinkedList = this.next;
			while(singleLinkedList.next!=null){
				singleLinkedList = singleLinkedList.next;
			}
			SingleLinkedList singleLinkedList2 = new SingleLinkedList();
			singleLinkedList2.setData(data);
			singleLinkedList.next = singleLinkedList2;
		}		
	}
	
	public static void main(String[] args) {
		SingleLinkedList singleLinkedList = new SingleLinkedList();
		singleLinkedList.add(1);
		singleLinkedList.add(2);
		singleLinkedList.add(3);
		singleLinkedList.add(4);
	}
}
