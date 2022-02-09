/*===================================================
     ���� Ŭ������ �ν��Ͻ� ����
===================================================*/

// �� Test073.java ���ϰ� ��Ʈ~!!!


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CircleTest 
{
	// ��� ���� �� �ֿ� �Ӽ�(������)
	int r;                          // ������					
	final double PI = 3.141592;     // ������

	// ��� �޼ҵ� �� �ֿ� ���(����, ����)
	// ������ �Է� ��� �� �޼ҵ� ����
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("������ �Է� : ");
		r = Integer.parseInt(br.readLine());
	}
	
	// ���� ��� ��� �� �޼ҵ� ����
	double calArea() 
	{
		return r * r * PI;
	}
	 
	// �ѷ� ��� ��� �� �޼ҵ� ����
	double calLength()
	{	
		return r * 2 * PI;
	}

	// ��� ��� �� �޼ҵ� ����
	void print(double a, double l) 
	{
		System.out.println(">> �������� " + r + " �� ����");
		System.out.printf(">> ���� : %.2f\n", a);
		System.out.printf(">> �ѷ� : %.2f\n", l);
	}

}
