/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

/**
 *
 * @author shubham.goswami
 */
public class LinkList {
    Node o1=null;
    
    public void insertNode(int data){
        if(o1==null){
            o1=new Node();
            o1.setData(data);
            o1.setNext(null);
        }else{
            Node temp=o1;
            while(temp.getNext()!=null){
                temp=temp.getNext();
            }
            Node o2=new Node();
            o2.setData(data);
            temp.setNext(o2);            
        }
    }
    public void interateNode(){
        Node itr=o1;
   while(itr!=null){
       
       
       System.err.println(itr.getData());
       
            itr = itr.getNext();
       
   }
    }
    
    public static void main(String args[]){
        LinkList list=new LinkList();
        list.insertNode(1);
        list.insertNode(2);
        list.insertNode(3);
        list.insertNode(4);
        list.insertNode(5);
        list.insertNode(6);
        list.insertNode(7);
        list.interateNode();
    }
    
}
