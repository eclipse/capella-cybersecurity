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

package org.polarsys.capella.cybersecurity.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.cybersecurity.model.CybersecurityPackage;
import org.polarsys.capella.cybersecurity.model.Threat;
import org.polarsys.capella.cybersecurity.model.ThreatKind;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Threat</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.polarsys.capella.cybersecurity.model.impl.ThreatImpl#getAddressedBy <em>Addressed By</em>}</li>
 * <li>{@link org.polarsys.capella.cybersecurity.model.impl.ThreatImpl#getThreatKind <em>Threat Kind</em>}</li>
 * <li>{@link org.polarsys.capella.cybersecurity.model.impl.ThreatImpl#getLevel <em>Level</em>}</li>
 * <li>{@link org.polarsys.capella.cybersecurity.model.impl.ThreatImpl#getRationale <em>Rationale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThreatImpl extends NamedElementImpl implements Threat {

  /**
   * The cached value of the '{@link #getAddressedBy() <em>Addressed By</em>}' reference list. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @see #getAddressedBy()
   * @generated
   * @ordered
   */
  protected EList<Component> addressedBy;

  /**
   * The default value of the '{@link #getThreatKind() <em>Threat Kind</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getThreatKind()
   * @generated
   * @ordered
   */
  protected static final ThreatKind THREAT_KIND_EDEFAULT = ThreatKind.EAVESDROPPING;

  /**
   * The cached value of the '{@link #getThreatKind() <em>Threat Kind</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getThreatKind()
   * @generated
   * @ordered
   */
  protected ThreatKind threatKind = THREAT_KIND_EDEFAULT;

  /**
   * The default value of the '{@link #getLevel() <em>Level</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected static final int LEVEL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected int level = LEVEL_EDEFAULT;

  /**
   * The default value of the '{@link #getRationale() <em>Rationale</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getRationale()
   * @generated
   * @ordered
   */
  protected static final String RATIONALE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRationale() <em>Rationale</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getRationale()
   * @generated
   * @ordered
   */
  protected String rationale = RATIONALE_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected ThreatImpl() {

    super();

  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return CybersecurityPackage.Literals.THREAT;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */

  public EList<Component> getAddressedBy() {

    if (addressedBy == null) {
      addressedBy = new EObjectResolvingEList<Component>(Component.class, this,
          CybersecurityPackage.THREAT__ADDRESSED_BY);
    }
    return addressedBy;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */

  public ThreatKind getThreatKind() {

    return threatKind;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */

  public void setThreatKind(ThreatKind newThreatKind) {

    ThreatKind oldThreatKind = threatKind;
    threatKind = newThreatKind == null ? THREAT_KIND_EDEFAULT : newThreatKind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CybersecurityPackage.THREAT__THREAT_KIND, oldThreatKind,
          threatKind));

  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */

  public int getLevel() {

    return level;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */

  public void setLevel(int newLevel) {

    int oldLevel = level;
    level = newLevel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CybersecurityPackage.THREAT__LEVEL, oldLevel, level));

  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */

  public String getRationale() {

    return rationale;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */

  public void setRationale(String newRationale) {

    String oldRationale = rationale;
    rationale = newRationale;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CybersecurityPackage.THREAT__RATIONALE, oldRationale,
          rationale));

  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
    case CybersecurityPackage.THREAT__ADDRESSED_BY:
      return getAddressedBy();
    case CybersecurityPackage.THREAT__THREAT_KIND:
      return getThreatKind();
    case CybersecurityPackage.THREAT__LEVEL:
      return getLevel();
    case CybersecurityPackage.THREAT__RATIONALE:
      return getRationale();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
    case CybersecurityPackage.THREAT__ADDRESSED_BY:
      getAddressedBy().clear();
      getAddressedBy().addAll((Collection<? extends Component>) newValue);
      return;
    case CybersecurityPackage.THREAT__THREAT_KIND:
      setThreatKind((ThreatKind) newValue);
      return;
    case CybersecurityPackage.THREAT__LEVEL:
      setLevel((Integer) newValue);
      return;
    case CybersecurityPackage.THREAT__RATIONALE:
      setRationale((String) newValue);
      return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
    case CybersecurityPackage.THREAT__ADDRESSED_BY:
      getAddressedBy().clear();
      return;
    case CybersecurityPackage.THREAT__THREAT_KIND:
      setThreatKind(THREAT_KIND_EDEFAULT);
      return;
    case CybersecurityPackage.THREAT__LEVEL:
      setLevel(LEVEL_EDEFAULT);
      return;
    case CybersecurityPackage.THREAT__RATIONALE:
      setRationale(RATIONALE_EDEFAULT);
      return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
    case CybersecurityPackage.THREAT__ADDRESSED_BY:
      return addressedBy != null && !addressedBy.isEmpty();
    case CybersecurityPackage.THREAT__THREAT_KIND:
      return threatKind != THREAT_KIND_EDEFAULT;
    case CybersecurityPackage.THREAT__LEVEL:
      return level != LEVEL_EDEFAULT;
    case CybersecurityPackage.THREAT__RATIONALE:
      return RATIONALE_EDEFAULT == null ? rationale != null : !RATIONALE_EDEFAULT.equals(rationale);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy())
      return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (threatKind: "); //$NON-NLS-1$
    result.append(threatKind);
    result.append(", level: "); //$NON-NLS-1$
    result.append(level);
    result.append(", rationale: "); //$NON-NLS-1$
    result.append(rationale);
    result.append(')');
    return result.toString();
  }

} // ThreatImpl