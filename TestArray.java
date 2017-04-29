package day03;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class TestArray {

	public static void main(String[] args) {
		// 打印数组元素
		int a[]={10,20,30,20,40,50};
		
		for(int i=0;i<a.length;i++){
			System.out.println("数组元素为："+a[i]);
		}
		System.out.println("============");
		//计算数组中元素总和
		int total=0;
		for(int i=0;i<a.length;i++){
			total+=a[i];
		}
		System.out.println("数组元素总和:"+total);
		System.out.println("============");
		//查找数组最大元素
		int max=a[0];
		for(int i=0;i<a.length;i++ ){
			if(a[i]>max){
				max=a[i];
			}
		}
		System.out.println("数组中最大元素为："+max);
		System.out.println("============");
		//查找数组最小元素
		int min=a[0];
		for(int i=0;i<a.length;i++ ){
			if(a[i]<min){
				min=a[i];
			}
		}
		System.out.println("数组中最小元素为："+min);
		System.out.println("============");
		//数组元素从小到大排序
		int temp;
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("数组从小到大排序后的元素顺序为：");
		for(int m=0;m<a.length;m++){
			System.out.print(a[m]+" ");
		}
		System.out.println("\n");
		//数组元素从大到小排序
	
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]<a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("数组从大到小排序后的元素顺序为：");
		for(int m=0;m<a.length;m++){
			System.out.print(a[m]+" ");
		}
		System.out.println("\n");
		//list集合实现数组元素去重并统计重复元素的个数
		int count1=a.length;
		//System.out.println(count1);
		ArrayList list = new ArrayList(); 
	    for (int i=0; i<a.length; i++) {    
	        if(!list.contains(a[i])) {    
	            list.add(a[i]);    
	        }    
	    }    
	    System.out.println("去除重复后的list集合"+list);
	    int count2=list.size();
	    int count=count1-count2;
	    System.out.println("数组中重复的元素个数为:"+count);
	    //使用集合个工具类： Collections.reverse(ArrayList) 将数组进行反转
	    System.out.println("反转前排序: " + list);  
	      Collections.reverse(list);  
	      System.out.println("反转后排序: " + list);  
	   // 直接使用数组实现反转  
	      System.out.println("反转前排序: " );
	      for(int i=0;i<a.length;i++){
	    	  
	    	  System.out.print(a[i]+" ");
	      }
	      System.out.println("\n");
	      System.out.println("反转后顺序为：");
	      int b[]=new int[a.length];
	      for(int i=0;i<a.length;i++){
	    	  b[i]=a[a.length-i-1];
	    	  System.out.print(b[i]+" ");
	    	  
	      }

		}
	}


