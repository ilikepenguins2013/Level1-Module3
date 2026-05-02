package _04_netflix;

public class NetflixQueueRunner {

	public static void main(String[] args) {
		Movie arryOtter = new Movie("arryOtter", 4);
		Movie ickeyOuse = new Movie("ickeyOuse", 3);
		Movie hostUsters = new Movie("hostUsters", 1);
		Movie redKey = new Movie("redKey", 5);
		Movie something = new Movie("something", 2);
		NetflixQueue queue = new NetflixQueue();
		
		System.out.println(arryOtter.getTicketPrice());
		queue.addMovie(arryOtter);
		queue.addMovie(ickeyOuse);
		queue.addMovie(hostUsters);
		queue.addMovie(redKey);
		queue.addMovie(something);
		queue.printMovies();
		queue.sortMoviesByRating();
		System.out.println("the best movie is " + queue.getBestMovie());
		System.out.println("the second best movie is " + queue.getMovie(1));
	}

}
