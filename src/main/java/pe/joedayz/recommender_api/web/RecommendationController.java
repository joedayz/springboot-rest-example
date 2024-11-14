package pe.joedayz.recommender_api.web;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pe.joedayz.recommender_api.model.Movie;

@RestController
public class RecommendationController {


  //@RequestMapping(method = RequestMethod.GET, value = "/movies")
  @GetMapping("/movies")
  public List<Movie> getAllMovies(){
    return Arrays.asList(
        new Movie(1, "The Shawshank Redemption", 9.2),
        new Movie(2, "The Godfather", 9.1),
        new Movie(3, "The Dark Knight", 9.0),
        new Movie(4, "The Lord of the Rings: The Return of the King", 8.9),
        new Movie(5, "Pulp Fiction", 8.9),
        new Movie(6, "Schindler's List", 8.9),
        new Movie(7, "Forrest Gump", 8.8),
        new Movie(8, "Inception", 8.8),
        new Movie(9, "The Lord of the Rings: The Fellowship of the Ring", 8.8),
        new Movie(10, "Fight Club", 8.8),
        new Movie(11, "The Lord of the Rings: The Two Towers", 8.7),
        new Movie(12, "The Matrix", 8.7)
    );
  }
}
