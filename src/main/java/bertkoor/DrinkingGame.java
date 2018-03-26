package bertkoor;

public class DrinkingGame {
	public static void main(String[] args) {
		new DrinkingGame().start();
	}
	private void start() {
		try {
			drink(new Bottle());
		} catch (Puke onTheFloor) {
			System.err.println(onTheFloor);
		}
	}
	private void drink(Bottle bottle) throws Puke {
		Puke up = null;
		Portion gulp = bottle.pourGlass();
		try {
			drink(bottle.getRemainder());
		} catch (RuntimeException emptyBottle) {
			up = new Puke(gulp, emptyBottle);
		} catch (Puke swallow) {
			up = new Puke(gulp, swallow);
		}
		if (up != null) throw up;
	}
	class Bottle {
		private String content;
		public Bottle() {
			this("!dlrow ,olleH");
		}
		private Bottle(String payload) {
			content = payload;
		}
		public Bottle getRemainder() {
			return new Bottle(content.substring(1));
		}
		public Portion pourGlass() {
			return new Portion(content.charAt(0));
		}
	}
	class Portion {
		private char content;
		public Portion(char payload) {
			content = payload;
		}
		public String getPayload() {
			return "" + content;
		}
	}
	class Puke extends Throwable {
		public Puke(Portion gulp, Throwable up) {
			super(gulp.getPayload(), up);
		}
		@Override
		public String toString() {
			return (getCause() instanceof Puke ? getCause() : "") + getMessage();
		}
		private static final long serialVersionUID = (long)Double.NaN;
	}
}
