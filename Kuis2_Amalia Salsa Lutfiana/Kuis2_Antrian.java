/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kuis2_amalia;

/**
 *
 * @author Hp
 */
public class Kuis2_Antrian {

  Node_04 front, rear;
	int size;

	public Kuis2_Antrian(){
		front = null;
		rear = null;
		size = 0;
	}

	public boolean isEmpty(){
		return front == null;
	}

	public void Enqueue(int nomor, String nama, int hp){
		Node_04 newNode = new Node_04(null, nomor, nama, hp, null);
		if(isEmpty()){
			front = newNode;
			rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
		size++;
	}
        
        

	public void Dequeue() throws Exception{
		if(isEmpty()){
			throw new Exception("Linked list masih kosong, tidak dapat dihapus");
		} else if (size == 1){
			removeLast();
		} else {
			System.out.println(front.nama + "telah selesai divaksin");
			front = front.next;
			front.prev = null;
			size--;
		}
	}

	public void removeLast() throws Exception{
		if(isEmpty()){
			throw new Exception("Linked list masih kosong, tidak dapat dihapus");
		} else if(front.next == null) {
			front = null;
			size--;
			return;
		}
		Node_04 current = front;
		while(current.next.next != null){
			current = current.next;
		}
		current.next = null;
		size--;
	}

	public void print(){
		if(!isEmpty()){
			Node_04 tmp = front;
			System.out.println("++++++++++++++++++++++++++++++++++");
			System.out.println("Daftar Antrian");
			System.out.println("++++++++++++++++++++++++++++++++++");
			System.out.println("|Nomor\t|Nama\t|Nomor HP\t|");
			while(tmp != null){
				System.out.println("|" + tmp.nomor + "\t|" + tmp.nama + "\t|" + tmp.hp + "\t|");
				tmp = tmp.next;
			} 
			System.out.print("Sisa Antrian: " + size);
			System.out.println("");
		} else {
			System.out.println("Linked list kosong");
		}
	}
}