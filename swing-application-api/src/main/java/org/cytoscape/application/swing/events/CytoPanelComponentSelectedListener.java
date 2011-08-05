
package org.cytoscape.application.swing.events;

import org.cytoscape.event.CyListener;

/**
 * The listener for handling CytoPanelComponentSelectedEvent.
 */
public interface CytoPanelComponentSelectedListener extends CyListener {

	/**
	 * Handles specified event.
	 * @param e The event to be handled.
	 */
	public void handleEvent(CytoPanelComponentSelectedEvent e);
}