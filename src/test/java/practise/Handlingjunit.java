package practise;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Handlingjunit {
  @Test
  public void f() {
	  Assert.assertEquals("yahoo","yahoo");
  }
  
  @BeforeClass
  public static void google() {
	  Assert.assertEquals("google","google");
	  }

	  @Ignore
	  public void facebook() {
	  Assert.assertEquals("google","google");
	  }
}
