/**
 * Copyright (c) 2010-2020 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.maxcube.internal.exceptions;

/**
 * Will be thrown when there is an attempt to put a new message line into the message processor,
 * the processor detects a known message indicator, but the message could not be parsed correctly.
 * 
 * @author Christian Rockrohr <christian@rockrohr.de>
 */
public class UnprocessableMessageException extends Exception {

    private static final long serialVersionUID = 648805723501492041L;

}
