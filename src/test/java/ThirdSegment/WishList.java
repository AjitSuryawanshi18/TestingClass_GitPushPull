package ThirdSegment;

import org.testng.annotations.Test;

public class WishList {
  @Test
  public void favProducts() {
	  System.out.println("User can see their fav products here");
  }
  @Test
  public void BuyOption() {
	  System.out.println("User can buy fav products here");
  }
  @Test
  public void Unfav_option() {
	  System.out.println("User can Un favourite their fav products");
  }
}
