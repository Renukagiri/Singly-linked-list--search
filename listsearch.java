/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structure;

import java.util.Scanner;


public class listsearch {
    
    Node head; //head of list
    
    static class Node       //defines as static so that main() can access it
    {
        int data;      //like structure in c
        Node next;
        
        
    Node(int d)     //constructor
    {
        data = d;
        next = null;
    }
    }
    
    static int c=0;
    public static Node insert(listsearch list,int data)
    {
      
        c++;
        Node new_node = new Node(data); //new node with data
        new_node.next = null;
        Node last = null;
        if(list.head == null) //if the list is empty
            list.head = new_node; // insert list with new node
        else
        {
            last = list.head;  //if not empty create new node called last and traverse until lastnode and insert node at last.
        while(last.next != null)   //check if there is value in nextnode // traverse until last node 
        {
            last = last.next;    // head moves to nextnode if there is value until last.next becomes empty
            
           
            
        }
        
        last.next = new_node; // insert as last node
        
        }
       
        System.out.println("i"+c);
    return last;
      
    }
    
    
     
   public static Node insertlist(listsearch list,int data,int index,int c)
   {
       
       long startTime, endTime,end1; 
        startTime= System.currentTimeMillis(); 
      Node new_node = new Node(data);
      new_node.next = null;
      Node last = null;
      Node temp = null;
      //Node temp1 = null;
      last = list.head;
      //temp1 = last.next;
      int c1=0;
      for(int i=1;i<=c;i++)
      {
         c1++;
          if(index==1) //if the list is empty
          {
            Node temp1 = list.head;
            last = new_node;
            new_node.next = temp;
          }
          if((i<index)||(i>index))
          {
          last = last.next;
          temp = last.next;
          }
          else if(i==index)
          {
              last.next = new_node;
              last = new_node;
              new_node.next = temp;
              //new_node.next = last.next;
              //break;
          }
          
      }
       
      System.out.println("c to check"+c1);
    
        endTime = System.currentTimeMillis();  
       end1 = endTime - startTime;
        System.out.println("time"+(endTime-startTime));
     return last;  
     
   
        
   }
   
  
   public static int search(listsearch list,int key,int c)
    {
        System.out.println("c:"+c);
        int c4 = 0,c3 = 0;
        Node curnode = list.head; // create node called curnode which contains list's head
        while(curnode != null)//check if curnode is empty
        {
            c4++;
            if(curnode.data == key)
            {
            
                String g="present";
            break;
            }
            else
            {
                c3++;
            curnode = curnode.next; // moves further
            }
             
        }
        if((c+1)!=c3)
        {
            System.out.println("present");
        }
        else
        {
            System.out.println("not present");
        }
        System.out.println("number of nodes:"+(c+1));
        return c4;
    }
    
    public static int print(listsearch list)
    {
        int c = 0;
        Node curnode = list.head; // create node called curnode which contains list's head
        while(curnode != null)//check if curnode is empty
        {
            c++;
            System.out.println(curnode.data); // print the value
            curnode = curnode.next; // moves further
              //System.out.println("c"+c);
        }
        System.out.println("number of nodes:"+c);
        return c;
    }
    
    
    public static void main(String[] args) 
    {
        int value,index,value1;
        Scanner in = new Scanner(System.in);
     listsearch list = new  listsearch();
       int n;
       n=in.nextInt();
       int a[] = new int[n];
       for(int i=0;i<n;i++)
       {
           a[i] = in.nextInt();
       }
       //sorting the values
       
      for(int i=0;i<n;i++)
       {
            for(int j=0;j<n;j++)
       {
           if(a[i]<a[j])
           {
               int t =a[i];
               a[i] =a[j];
               a[j]=t;
           }
       }
       }
       for(int i=0;i<n;i++)
       {
       //System.out.println(a[i]);
       //}
       list.insert(list,a[i]);
       }
//       list.insert(list,2);
//         
//       list.insert(list,3);
//         
//       list.insert(list,4);
//       list.insert(list,5);
//      
       
        print(list);
        System.out.println("enter the value");
        value = in.nextInt();
        System.out.println("enter the index");
        index = in.nextInt();
        insertlist(list,value,index,c);
        print(list);
        
         System.out.println("enter the value to search");
         long s,e;
         s = System.currentTimeMillis();
        value1 = in.nextInt();
        search(list,value1,c);
        e = System.currentTimeMillis();
        System.out.println("search time"+(e-s));
        
    }
    
}
    

