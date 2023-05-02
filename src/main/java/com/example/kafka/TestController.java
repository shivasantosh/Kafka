package com.example.kafka;

public class TestController {

	public static void main(String[] args) {
		int a[] = { 2, 9, 31, -4, 21, 7 };
		int k = 3;
		int wSum = 0;
		int mSum = Integer.MIN_VALUE;
		for (int i = 0; i < k; i++) {
			wSum = wSum + a[i];
		}

		for (int i = k; i < a.length; i++) {
			wSum = wSum - a[i - k] + a[i];
			mSum = Math.max(mSum, wSum);
		}
		System.out.println(mSum);
	}

//		List<Integer> numbers = new ArrayList<>();
//
//		for(int i=1;i<=100;i++) {
//			numbers.add(String.valueOf(i));
//		}
//
//
//
//		List<String> replacedList = new ArrayList<>(100);
//		for(int i=0;i<numbers.size();i++) {
//			if(numbers.get(i) % 3 == 0 && numbers.get(i) % 5 == 0) {
//				replacedList.add(i, "PingPong");
//			}
//			else if(numbers.get(i)%3==0 ) {
//				replacedList.add(i, "Ping");
//			}
//			else if(numbers.get(i)%5==0 ) {
//				replacedList.add(i, "Pong");
//			}else {
//				replacedList.add(i, String.valueOf(i));
//			}
//		}
//
//		List<String> result = IntStream.rangeClosed(1, 100)
//                .mapToObj(i -> i % 15 == 0 ? "Pingpong" : i % 3 == 0 ? "ping" : i % 5 == 0 ? "pong" : String.valueOf(i))
//                .collect(Collectors.toList());
//		System.err.println(result);
	//
	// String a = "Te@acd$fb";
	// String b = "";
	//
	// for(int i=a.toCharArray().length-1,j=0 ;i>=0;i--,j++) {
	// if(!Character.isLetter(a.charAt(i))) {
	// b=b+a.charAt(j);
	// }else {
	// b=b+a.charAt(i);
	// }
	// }
	// System.out.println(b);
	//
	// int[] arr=new int[2];
	// HashSet<Integer> set = new HashSet<>();
	//
	// List<Integer> list1 = new ArrayList<>();
	// list1.add(1);
	// list1.add(2);
	// list1.add(3);
	// list1.add(3);
	//
	//// list1 = list1.stream().;
	//// System.out.println(list1);
	//
	// List<Integer> list2 = new ArrayList<>();
	// list2.add(0);
	// list2.add(4);
	// list2.add(5);
	// list2.add(7);
	//
	// TreeSet<Integer> tree = new TreeSet<>(list1);
	// tree.addAll(list2);
	//
	// System.out.println(tree);
//	}
}
