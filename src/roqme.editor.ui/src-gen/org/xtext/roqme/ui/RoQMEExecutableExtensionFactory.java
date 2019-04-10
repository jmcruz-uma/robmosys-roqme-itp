/*
 * generated by Xtext 2.12.0
 */
package org.xtext.roqme.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import roqme.editor.ui.internal.EditorActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class RoQMEExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return EditorActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return EditorActivator.getInstance().getInjector(EditorActivator.ORG_XTEXT_ROQME_ROQME);
	}
	
}
