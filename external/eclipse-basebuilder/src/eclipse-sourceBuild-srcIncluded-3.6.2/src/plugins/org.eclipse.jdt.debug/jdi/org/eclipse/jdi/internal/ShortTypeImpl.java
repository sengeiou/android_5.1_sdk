/*******************************************************************************
 * Copyright (c) 2000, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jdi.internal;


import com.sun.jdi.ShortType;
import com.sun.jdi.Value;

/**
 * this class implements the corresponding interfaces
 * declared by the JDI specification. See the com.sun.jdi package
 * for more information.
 *
 */
public class ShortTypeImpl extends PrimitiveTypeImpl implements ShortType {
	/**
	 * Creates new instance.
	 */
	public ShortTypeImpl(VirtualMachineImpl vmImpl) {
		super("ShortType", vmImpl, "short" , "S"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}
	
	/**
	 * @returns primitive type tag.
	 */
	public byte tag() {
		return ShortValueImpl.tag;
	}
	
	/**
	 * @return Create a null value instance of the type.
	 */
	public Value createNullValue() {
		return virtualMachineImpl().mirrorOf((short)0);
	}
}
