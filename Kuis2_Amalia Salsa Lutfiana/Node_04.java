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
public class Node_04 {
   String nama;
	int nomor;
        int hp;
	Node_04 prev, next;

	Node_04(Node_04 prev, int nomor, String nama, int hp, Node_04 next){
		this.prev = prev;
		this.nama = nama;
		this.nomor = nomor;
                this.hp = hp;
		this.next = next;
	}
}


