package com.osemenov.rxviperreflectionbug;

import org.junit.Before;
import org.junit.Test;

/**
 * Demonstrates issue with dynamic proxy in rc1 version of RxViper library
 *
 * Created by alexs on 2/22/18.
 */
public class SpaceMapPresenterTest {

  private SpaceMapPresenter presenter;

  @Before public void setUp() {
    presenter = new SpaceMapPresenter();

    presenter.takeRouter(new SpaceMapRouter() {
      @Override public void navigateToLaunchRocketScreen() {

      }
    });
    presenter.takeView(new SpaceMapViewCallbacks() {
      @Override public void displayRouteToMars() {

      }
    });
  }

  @Test public void testRouter() throws Exception {
    // should just launch rocket to selected route
    presenter.makeRouteToMarsOnClick();
  }

  @Test public void testView() throws Exception {
    // should draw route to destination
    presenter.onRouteCalculated("Mars");
  }
}