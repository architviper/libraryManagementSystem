package com.manage.librarymanager.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {

    public static void main(String[] args) {

        int[] nums = {1,2,3};
        System.out.println(combinationSum4(nums, 4));


    }
    public static int combinationSum4(int[] nums, int target) {
        
        ArrayList<Integer> list = IntStream.of(nums)
                                   .boxed()
                                   .collect(Collectors.toCollection(ArrayList::new));

        doRecursesum(0 , list, new ArrayList<Integer>(), target);
        //System.out.println(ans1);
        
       return ans1.size();
    }
    
    

    
    static void doRecursesum(int index, ArrayList<Integer> A, ArrayList<Integer> b, int sum){
        if(index == A.size()){
            
            if(sum == 0){
                ArrayList<Integer> temp = new ArrayList<>();
                temp = (ArrayList<Integer>)b.clone();
                //System.out.println(temp);
                recurse(0,temp);
                
            }
            return;
        }else if(sum == 0){
              ArrayList<Integer> temp = new ArrayList<>();
                temp = (ArrayList<Integer>)b.clone();
                //System.out.println(temp);
                recurse(0,temp);
        
                return;
        }else if(sum < 0){
            return;
        }
        
        b.add(A.get(index));
        doRecursesum(index, A, b, sum - A.get(index));
        b.remove(b.size()-1);
        doRecursesum(index+1, A, b, sum);
        
    }
   static  Set<ArrayList<Integer>> ans1 = new HashSet<>();
    public static void recurse(int curr_index, ArrayList<Integer> arr){
        
        if(curr_index == arr.size()-1){
            
            ArrayList<Integer> myobject = new ArrayList<>();
            myobject = (ArrayList<Integer>) arr.clone();
            System.out.println(myobject);
            ans1.add(myobject);
            return ;
        }
        
        
        int n = arr.size();
        for(int i = curr_index; i < n ; i++ ){
                Collections.swap(arr, i,curr_index);
                recurse(curr_index+1, arr);
                Collections.swap(arr, i,curr_index); 
   
        }
        
        return;
        
    }
}