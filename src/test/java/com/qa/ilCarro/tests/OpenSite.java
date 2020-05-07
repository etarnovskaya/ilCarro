package com.qa.ilCarro.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenSite extends  TestBase{

  @Test
  public void isSiteOpenedOnSearhPage(){
    String currenURL = app.getSession().getURL();
    Assert.assertEquals(currenURL, "https://ilcarro-1578153671498.web.app/search");
  }
}
