
public class MineP_NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=18;
		int weight=45;
		if(age>18) {
			if(weight>45) {
				System.out.println("u can give blood");
			}
			else {
				System.out.println("u r not eligible to donate blood");
			}
		}else {
			System.out.println("age must be greater than 18");
		}

	}

}
