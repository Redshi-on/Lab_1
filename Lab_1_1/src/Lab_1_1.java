import java.util.*;


public class Lab_1_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("������� ����� �������: ");
		int n=in.nextInt() , array[] = new int [n];
		
		for(int i=0; i < n; i++) {
			array[i] = 100+rand.nextInt(900);
			System.out.print(array[i]+ "\t");
		}
		
		int first_name = array[0]%10;
		
		for(int i=1; i<n;i++) {
			int c = array[i], count_numder=0;
			while(c > 0 && count_numder < 3) {
				if(c%10 == first_name) {
					count_numder++;
				}
				c/=10;
			}
			if(count_numder == 2) {
				System.out.print("\n����� ��������: "+ (i+1));
			}
		}
		
	}

}


/*�������� ������. ���������� ���������� ������ ��������� �������, �������� ������� �������� ���������
����� ������� �������� ������� 2 ���� (�.�. � ������� ������ ���� �� ������ ����������� �����).*/