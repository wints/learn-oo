public class FieldAccessDriver {
	public static void main( String[] args ) {
		FieldAccess j = new FieldAccess("Robert", "Parker", "Butch");
		System.out.println(j.getFullName());

		j.setLast("Elliott");
		j.setFirst("Samuel");
		j.setNick("Sam");
		System.out.println(j.getFullName());

		j.first = "Avery";
		// j.last = "Markham";
		System.out.println(j.nick);
	}
}
