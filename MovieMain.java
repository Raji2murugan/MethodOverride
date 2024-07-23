package methodOverride;

/**
 * 3. Create hierarchy from Movie class with Child classes of different genremovies like RomComMovie, ThrillerMovie, etc. Demonstrate polymorphism using them.
 */

public class MovieMain {

	public static void main(String[] args) {
		Movie romCom = new RomComMovie("Romantic Movie", "Joe", 2021);
		Movie thriller = new ThrillerMovie("Thrilling Movie", "RRR", 2022);
		Movie action = new ActionMovie("Action Movie", "JackyChan", 2023);

		Movie[] movies = { romCom, thriller, action };

		for (Movie movie : movies) {
			System.out.println(movie.getDetails());
		}

	}

}

class Movie {
	private String title;
	private String movieName;
	private int year;

	public Movie(String title, String movieName, int year) {
		this.title = title;
		this.movieName = movieName;
		this.year = year;
	}

	public String getGenre() {
		return "General Movie";
	}

	public String getDetails() {
		return "Title: " + title + ", Director: " + movieName + ", Year: " + year + ", Genre: " + getGenre();
	}
}

class RomComMovie extends Movie {
	public RomComMovie(String title, String director, int year) {
		super(title, director, year);
	}

}

class ThrillerMovie extends Movie {
	public ThrillerMovie(String title, String director, int year) {
		super(title, director, year);
	}

}

class ActionMovie extends Movie {
	public ActionMovie(String title, String director, int year) {
		super(title, director, year);
	}

	@Override
	public String getGenre() {
		return "Action";
	}
}
