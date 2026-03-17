package classes_and_objects.recipe_book;

public class TestRecipe{
    public static void main(String[] args) {
        
        Recipe rec1 = new Recipe("Ice-Cream", "Easy", 120);
        Recipe rec2 = new Recipe("Beff Welington", "Hard", 180);

        rec1.displayDetails();
        rec2.displayDetails();
    }
}