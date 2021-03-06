/*******************************************************************************
 * Copyright (c) 2019 THALES GLOBAL SERVICES.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *   
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.cybersecurity.sirius.analysis.internal;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElementContainer;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.diagram.description.tool.NodeCreationDescription;
import org.eclipse.sirius.viewpoint.description.tool.MappingBasedToolDescription;

class ShowHideNodeTask extends ShowHideTask {

  public ShowHideNodeTask(EObject container, NodeCreationDescription tool) {
    super(container, tool);
  }

  @Override
  protected Collection<DNode> getCandidateChildren(EObject container) {
    if (container instanceof DDiagram) {
      return ((DDiagram)container).getNodes();
    } 
    if (container instanceof DDiagramElementContainer) {
      return ((DDiagramElementContainer)container).getNodes();
    }
    return Collections.emptyList();
  }

  @Override
  protected Collection<NodeMapping> getMappings(MappingBasedToolDescription tool) {
    return ((NodeCreationDescription)tool).getNodeMappings();
  }

}
