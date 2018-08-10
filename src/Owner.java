/*
 * Hannah Kelly
 * 8/7/18
 */
public class Owner {
//String breed, String name,String color, int hungry, int energy
	public static void main(String[] args) {
		Dog pitbull = new Dog("Pitbull","Heidi","Black",10,8);
		System.out.println(pitbull);
		pitbull.sleep();
		System.out.println(pitbull);
		pitbull.eat();
		System.out.println(pitbull);
	}
}