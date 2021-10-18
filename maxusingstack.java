import java.util.*;
 class maxusingstack{
    public static void main(String[]args){
       Stack<Integer>st1=new Stack();
       Stack<Integer>st2=new Stack();
       int[]arr={2,4,9,7,10,15,6,11};
        
        number(st1,st2,arr);
    }
    public static void number(Stack<Integer>st1,Stack<Integer>st2,int[]arr){
        int max=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            st1.push(arr[i]);
            max=Math.max(max,arr[i]);
            st2.push(max);
        }

        while(st2.size()!=0){
            System.out.print(st2.pop()+" ");
        }
    }
}