public class GunMain {
	public static void main(String[] args) throws OutOfRoundsException, NotReadyException {
		Gun gun = new Gun();

		System.out.println(gun);

		gun.reload();
		gun.prepare();

		System.out.println(gun);

		gun.shoot();
		gun.shoot();

		System.out.println(gun);

		gun.shoot();
		gun.shoot();
		gun.shoot();
		gun.shoot();
		gun.shoot();
		gun.shoot();
		
		System.out.println(gun);
	}
}