import java.util.Scanner;
class Arr{
	int d;
	public static int kurang(int a, int b){
		return a-b;
	}
	public int jumlah(int a, int b){
		int c;
		return a+b;
	}
	public static void main(String [] aaa){
		int c;
		Arr obj = new Arr();
		/*int bilangan[] = new int[5]; int y = 0;
		Scanner input = new Scanner(System.in);
		for(int i=0; i<bilangan.length; i++){
			System.out.print("bilangan ke-" + i +" = ");	
			bilangan[i] =  input.nextInt();
		}
		System.out.println("Bilangan yang disimpan");	
		while (y<bilangan.length){
		System.out.println(bilangan[y]);
		y++;
		}*/
		System.out.println(obj.jumlah(5,6));
		System.out.println(kurang(5,6));
		
	}
}