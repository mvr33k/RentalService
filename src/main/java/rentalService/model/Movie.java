package rentalService.model;

//import jakarta.persistence.*;


public class Movie {
    private Integer id;
    private Category category;
    private String title;
    private boolean isAvailable;
    public void setId(Integer id) {
        this.id = id;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    public Integer getId() {
        return id;
    }
//    public void setId(Integer id) {
//        this.id = id;
//    }
//    public Movie(String category, String title) {
//        this.id=nextID++;
//        this.category=category;
//        this.title=title;
//    }
//    public Movie() {
//    }

    //    private static Integer nextID = 1;
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
