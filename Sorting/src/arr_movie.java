package study;
import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		
		
		System.out.print("������ ������ �Է��ϼ���:"); //�Է¹ޱ�
		Scanner s = new Scanner(System.in); // �Է°� �ν�
		int size = s.nextInt(); //�Է°� size�� �ֱ�
		
		int arr[] = new int[size]; //�迭 ���� , �迭�� ũ��� �Է¹��� size�̴�
		
		System.out.println("���� "+size+"���� �Է��ϼ���:"); //size ��ŭ�� ���� �迭�� �Է�

		
		for(int i = 0; i<size; i++) { // �迭�� �� �ִ� �ݺ���
			Scanner n = new Scanner(System.in); // ���ڸ� �ν�
			int num = n.nextInt(); //num�� �ֱ�
			arr[i] = num; //�迭i��°�� num �� �ֱ�
		}

		System.out.print("�̵��� ������ �Է��ϼ���:"); //��� �̵��� ���ΰ�?
		Scanner m = new Scanner(System.in); // ���� �ν�
		int move =m.nextInt(); //move�� �� �ֱ�
		
		for(int i =  0; i < move; i++) { // �� �̵� �ݺ���
			
			int temp = arr[0]; // ���� temp�� arr[0]���� �ִ´�
			
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
