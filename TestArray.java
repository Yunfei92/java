package day03;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class TestArray {

	public static void main(String[] args) {
		// ��ӡ����Ԫ��
		int a[]={10,20,30,20,40,50};
		
		for(int i=0;i<a.length;i++){
			System.out.println("����Ԫ��Ϊ��"+a[i]);
		}
		System.out.println("============");
		//����������Ԫ���ܺ�
		int total=0;
		for(int i=0;i<a.length;i++){
			total+=a[i];
		}
		System.out.println("����Ԫ���ܺ�:"+total);
		System.out.println("============");
		//�����������Ԫ��
		int max=a[0];
		for(int i=0;i<a.length;i++ ){
			if(a[i]>max){
				max=a[i];
			}
		}
		System.out.println("���������Ԫ��Ϊ��"+max);
		System.out.println("============");
		//����������СԪ��
		int min=a[0];
		for(int i=0;i<a.length;i++ ){
			if(a[i]<min){
				min=a[i];
			}
		}
		System.out.println("��������СԪ��Ϊ��"+min);
		System.out.println("============");
		//����Ԫ�ش�С��������
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
		System.out.println("�����С����������Ԫ��˳��Ϊ��");
		for(int m=0;m<a.length;m++){
			System.out.print(a[m]+" ");
		}
		System.out.println("\n");
		//����Ԫ�شӴ�С����
	
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]<a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("����Ӵ�С������Ԫ��˳��Ϊ��");
		for(int m=0;m<a.length;m++){
			System.out.print(a[m]+" ");
		}
		System.out.println("\n");
		//list����ʵ������Ԫ��ȥ�ز�ͳ���ظ�Ԫ�صĸ���
		int count1=a.length;
		//System.out.println(count1);
		ArrayList list = new ArrayList(); 
	    for (int i=0; i<a.length; i++) {    
	        if(!list.contains(a[i])) {    
	            list.add(a[i]);    
	        }    
	    }    
	    System.out.println("ȥ���ظ����list����"+list);
	    int count2=list.size();
	    int count=count1-count2;
	    System.out.println("�������ظ���Ԫ�ظ���Ϊ:"+count);
	    //ʹ�ü��ϸ������ࣺ Collections.reverse(ArrayList) ��������з�ת
	    System.out.println("��תǰ����: " + list);  
	      Collections.reverse(list);  
	      System.out.println("��ת������: " + list);  
	   // ֱ��ʹ������ʵ�ַ�ת  
	      System.out.println("��תǰ����: " );
	      for(int i=0;i<a.length;i++){
	    	  
	    	  System.out.print(a[i]+" ");
	      }
	      System.out.println("\n");
	      System.out.println("��ת��˳��Ϊ��");
	      int b[]=new int[a.length];
	      for(int i=0;i<a.length;i++){
	    	  b[i]=a[a.length-i-1];
	    	  System.out.print(b[i]+" ");
	    	  
	      }

		}
	}


