package Collectiontopic;

import java.util.ArrayList;

public class A6 {
public static void main(String[] args) {
	ArrayList<Integer> a1=new ArrayList<>();
	a1.add(10);
	a1.add(20);
	a1.add(30);
	a1.add(50);
	a1.add(100);
	ArrayList<Integer> a2=new ArrayList<>();
	a2.add(10);
	a2.add(20);
	a2.add(30);
	a2.add(120);
	a2.add(145);
	System.out.println(a1);
	System.out.println(a2);
	a2.retainAll(a1);
	System.out.println(a2);

}
}
