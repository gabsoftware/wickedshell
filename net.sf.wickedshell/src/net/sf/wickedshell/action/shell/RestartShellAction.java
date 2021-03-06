/*
 * RestartShellAction.java
 * 
 * Copyright 2003-2004 Stefan Reichert.
 * All Rights Reserved.
 * 
 * This software is the proprietary information of Stefan Reichert.
 * Use is subject to license terms.
 * 
 */
package net.sf.wickedshell.action.shell;

import net.sf.wickedshell.facade.ShellActivationException;
import net.sf.wickedshell.facade.ShellDeactivationException;
import net.sf.wickedshell.ui.shell.ShellView;
import net.sf.wickedshell.util.ShellLogger;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;

/**
 * @author Stefan Reichert
 * @since 22.12.2005
 */
public class RestartShellAction implements IViewActionDelegate {

	/** The <code>Reader</code> of the shell. */
	private final ShellLogger shellLogger = new ShellLogger(
			RestartShellAction.class);

	private IViewPart view;

	/**
	 * @see org.eclipse.ui.IViewActionDelegate#init(org.eclipse.ui.IViewPart)
	 */
	public void init(IViewPart view) {
		this.view = view;
	}

	/**
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {

	}

	/**
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {
		ShellView shellView = (ShellView) view;
		try {
			shellView.getShellViewer().getShellFacade().restart();
		}
		catch (ShellDeactivationException exception) {
			shellLogger.error(exception.getMessage(), exception);
		}
		catch (ShellActivationException exception) {
			shellLogger.error(exception.getMessage(), exception, true);
		}

	}
}
