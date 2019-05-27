/*******************************************************************************
 * Copyright (c) 2019 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *   
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.cybersecurity.ui.properties.sections;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
  private static final String BUNDLE_NAME = "org.polarsys.capella.cybersecurity.ui.properties.sections.messages"; //$NON-NLS-1$
  public static String ActorCybersecuritySection_0;
  public static String ActorCybersecuritySection_1;
  public static String FunctionalPrimaryAssetSection_0;
  public static String FunctionalPrimaryAssetSection_1;
  public static String FunctionCybersecuritySection_0;
  public static String InformationPrimaryAssetSection_0;
  public static String InformationPrimaryAssetSection_1;
  public static String SecurityNeedsSection_1;
  public static String SecurityNeedsSection_2;
  public static String SecurityNeedsSection_3;
  public static String SecurityNeedsSection_4;
  static {
    // initialize resource bundle
    NLS.initializeMessages(BUNDLE_NAME, Messages.class);
  }

  private Messages() {
  }
}
