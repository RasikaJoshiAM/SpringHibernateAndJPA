package com.upgrad.movieapp;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.upgrad.movieapp.dao.CustomerDAO;
import com.upgrad.movieapp.dao.MovieDao;
import com.upgrad.movieapp.dao.TheatreDao;
import com.upgrad.movieapp.entities.Customer;
import com.upgrad.movieapp.entities.Movie;
import com.upgrad.movieapp.entities.Theatre;

@SpringBootApplication
public class MovieappApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(MovieappApplication.class, args);
//		
//		CustomerDAO customerDAO = context.getBean(CustomerDAO.class);
//		Customer customer = new Customer();
//		customer.setFirstName("Rasika");
//		customer.setLastName("Joshi");
//		customer.setUserName("abcedfghi");
//		customer.setPassword("******");
//		customer.setDateOfBirth(LocalDateTime.of(1998,11,6,0,0));
//		System.out.println("Before saving to databse" + customer);
//		
//		Customer afterSaved = customerDAO.save(customer);
//		System.out.println("After saving to Databse" + afterSaved);
//		
//		Customer retrieveCustomer = customerDAO.findById(afterSaved.getCutomerId());
//		System.out.println(retrieveCustomer);
//		
//		customer.setUserName("newName");
//		
//		Customer updateCustomer = customerDAO.update(customer);
//		System.out.println("After update" + updateCustomer);
//		
//		customerDAO.delete(updateCustomer);
//		System.out.println("After deleting" + customerDAO.findById(updateCustomer.getCutomerId()));
		
		
		/* 
		 * Crud operations for Movie
		 */
//		MovieDao movieDao = context.getBean(MovieDao.class);
//		Movie movie = new Movie();
//		movie.setMovieName("Avengers Infinity Wars");
//		movie.setMovieDescription("Avengers must stop thanos");
//		movie.setReleaseDate(LocalDateTime.of(2018,4,27,5,30));
//		movie.setDuration(150);
//		movie.setCoverPhotoUrl("coverAvengerurl.com");
//		movie.setTrailerUrl("TrailerURL.com");
//		
//		Movie savedMovie = movieDao.save(movie);
//		System.out.println(savedMovie);
		
		
		
		/* 
		 * Crud operations on Theatre Dao
		 */
	    TheatreDao theatreDao = context.getBean(TheatreDao.class);

	    Theatre theatre1 = new Theatre();
	    theatre1.setTheatreName("Urvashi Cinema");
	    theatre1.setTicketPrice(500);

	    Theatre theatre2 = new Theatre();
	    theatre2.setTheatreName("Cinepolis Multiplex");
	    theatre2.setTicketPrice(600);

	    Theatre theatre3 = new Theatre();
	    theatre3.setTheatreName("PVR Koramangla");
	    theatre3.setTicketPrice(550);

	    Theatre theatre4 = new Theatre();
	    theatre4.setTheatreName("PVR IMAX");
	    theatre4.setTicketPrice(700);

	    Theatre theatre5 = new Theatre();
	    theatre5.setTheatreName("INOX");
	    theatre5.setTicketPrice(400);

//	    System.out.println("Before Saving: " + theatre1);
//	    Theatre savedTheatre = theatreDao.save(theatre1);
//	    System.out.println("After saving: " + savedTheatre);

//	    theatreDao.saveAll(List.of(theatre1, theatre2, theatre3, theatre4, theatre5));
	    List<Theatre> theatres = Arrays.asList(theatre1, theatre2, theatre3, theatre4, theatre5);
	    theatreDao.saveAll(theatres);
		
	}

}
