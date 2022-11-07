package comp1110.exam;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * COMP1110 Exam, Question 3.2
 */
public class Q3GetMaxArticlesInCategoryTest {
    @Rule
    public Timeout globalTimeout = Timeout.millis(500);

    Integer[] articleIds = new Integer[]{31353, 8091, 50223, 72758, 159979, 159973, 25781, 142540};
    String[] names = new String[]{
            "The Hitchhikers Guide to the Galaxy",
            "Douglas Adams",
            "Dirk Gently's Holistic Detective Agency",
            "BBC Radio 4",
            "Arthur Dent",
            "Marvin the Paranoid Android",
            "Robot",
            "Mos Def"};
    String[] categories = new String[]{
            "Book",
            "Person",
            "Book",
            "Radio Station",
            "Fictional Character",
            "Fictional Character",
            "Technology",
            "Person"};

    // FIXME add one ore more JUnit unit tests that test the getMaxArticlesInCategory() method of the Q3Wiki class
    @Test
    public void testGetMaxCoStars(){
        Q3Wiki q3Wiki = new Q3Wiki();
        q3Wiki.articles.add(new Q3Wiki.Article(articleIds[0], names[0], categories[0], new HashSet<>()));
        assertEquals("getMaxCoStars() returned incorrect value", 1, q3Wiki.getMaxArticlesInCategory());
        q3Wiki.articles.add(new Q3Wiki.Article(articleIds[1], names[1], categories[1], new HashSet<>()));
        assertEquals("getMaxCoStars() returned incorrect value", 1, q3Wiki.getMaxArticlesInCategory());
        q3Wiki.articles.add(new Q3Wiki.Article(articleIds[2], names[2], categories[2], new HashSet<>()));
        assertEquals("getMaxCoStars() returned incorrect value", 2, q3Wiki.getMaxArticlesInCategory());
        q3Wiki.articles.add(new Q3Wiki.Article(articleIds[3], names[3], categories[3], new HashSet<>()));
        assertEquals("getMaxCoStars() returned incorrect value", 2, q3Wiki.getMaxArticlesInCategory());
        q3Wiki.articles.add(new Q3Wiki.Article(articleIds[4], names[4], categories[4], new HashSet<>()));
        assertEquals("getMaxCoStars() returned incorrect value", 2, q3Wiki.getMaxArticlesInCategory());
        q3Wiki.articles.add(new Q3Wiki.Article(articleIds[5], names[5], categories[5], new HashSet<>()));
        assertEquals("getMaxCoStars() returned incorrect value", 2, q3Wiki.getMaxArticlesInCategory());
        q3Wiki.articles.add(new Q3Wiki.Article(articleIds[6], names[6], categories[6], new HashSet<>()));
        assertEquals("getMaxCoStars() returned incorrect value", 2, q3Wiki.getMaxArticlesInCategory());
        q3Wiki.articles.add(new Q3Wiki.Article(articleIds[7], names[7], categories[7], new HashSet<>()));
        assertEquals("getMaxCoStars() returned incorrect value", 2, q3Wiki.getMaxArticlesInCategory());
    }
}
