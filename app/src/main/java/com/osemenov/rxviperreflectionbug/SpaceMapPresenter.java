package com.osemenov.rxviperreflectionbug;

import com.dzaitsev.rxviper.ViperPresenter;

/**
 * Shows space map and navigation
 *
 * Created by alexs on 2/22/18.
 */

public class SpaceMapPresenter extends ViperPresenter<SpaceMapViewCallbacks, SpaceMapRouter> {

  public void makeRouteToMarsOnClick() {
    getRouter().navigateToLaunchRocketScreen();
  }

  public void onRouteCalculated(String destination) {
    getView().displayRouteToMars();
  }
}
