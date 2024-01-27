package dev.maxchtse.movies;

public class ReviewService {
    public Review createReview(String reviewBody, String imdbId) {
        Review review = new Review(reviewBody);
    }
}
