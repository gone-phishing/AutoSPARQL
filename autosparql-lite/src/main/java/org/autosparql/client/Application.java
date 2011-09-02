package org.autosparql.client;

import org.autosparql.client.controller.ApplicationController;

import com.extjs.gxt.ui.client.GXT;
import com.extjs.gxt.ui.client.mvc.Dispatcher;
import com.extjs.gxt.ui.client.util.Theme;
import com.google.gwt.core.client.EntryPoint;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Application implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad(){
		GXT.setDefaultTheme(Theme.BLUE, true);
		
		AutoSPARQLServiceAsync service = AutoSPARQLService.Util.getInstance();
		
		Dispatcher dispatcher = Dispatcher.get();
		dispatcher.addController(new ApplicationController(service));

		Dispatcher.forwardEvent(AppEvents.Init);
		

		GXT.hideLoadingPanel("loading");
	}
}