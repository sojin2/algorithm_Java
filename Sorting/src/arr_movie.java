package study;
import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		
		
		System.out.print("원소의 개수를 입력하세요:"); //입력받기
		Scanner s = new Scanner(System.in); // 입력값 인식
		int size = s.nextInt(); //입력값 size에 넣기
		
		int arr[] = new int[size]; //배열 선언 , 배열의 크기는 입력받은 size이다
		
		System.out.println("원소 "+size+"개를 입력하세요:"); //size 만큼의 수를 배열에 입력

		
		for(int i = 0; i<size; i++) { // 배열에 값 넣는 반복문
			Scanner n = new Scanner(System.in); // 숫자를 인식
			int num = n.nextInt(); //num에 넣기
			arr[i] = num; //배열i번째에 num 수 넣기
		}

		System.out.print("이동할 개수를 입력하세요:"); //몇번 이동할 것인가?
		Scanner m = new Scanner(System.in); // 숫자 인식
		int move =m.nextInt(); //move에 수 넣기
		
		for(int i =  0; i < move; i++) { // 수 이동 반복문
			
			int temp = arr[0]; // 변수 temp에 arr[0]값을 넣는다
			
			for(int j = 0; j < size - 1; j++) { //
				
				arr[j] = arr[j+1];
				
			}
			
			arr[size - 1]= temp;
		
		}
		
		for (int i = 0; i<size; i++) {
			
			System.out.print(arr[i]+ " ");
		
		}

	}

}
