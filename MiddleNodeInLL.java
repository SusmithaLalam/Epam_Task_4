import java.util.*;
import java.util.Scanner;

class Node{
  int data;
  Node next=null;
  Node(int data){
    this.data=data;
  }
}
class MiddleNodeInLL {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Node head=null;
    Node temp=null;
    for(int i=0;i<n;i++){
      if(i==0){
        Node x=new Node(sc.nextInt());
        head=x;
        temp=head;
      }
      else{
        Node x=new Node(sc.nextInt());
        temp.next=x;
        temp=temp.next;
      }
    }
    if(n%2==0){
      int c=0;
      temp=head;
      while(c!=(n/2)){
        temp=temp.next;
        c=c+1;
      }
      System.out.println(temp.data);
    }
    else{
      int c=0;
      temp=head;
      while(c!=n/2){
          temp=temp.next;
          c=c+1;
      }
      System.out.println(temp.data);
    }
  }
}