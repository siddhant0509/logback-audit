/**
 * Logback: the reliable, generic, fast and flexible logging framework.
 * Copyright (C) 2006-2011, QOS.ch. All rights reserved.
 * 
 * This program and the accompanying materials are dual-licensed under
 * either the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation
 *  
 *   or (per the licensee's choosing)
 *  
 * under the terms of the GNU Lesser General Public License version 2.1
 * as published by the Free Software Foundation.
 */

package ch.qos.logback.audit.client;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ClientAllTest extends TestCase {

  public static Test suite() {
    TestSuite suite = new TestSuite();
 
    suite.addTest(ch.qos.logback.audit.client.PackageTest.suite());
    suite.addTest(ch.qos.logback.audit.client.joran.PackageTest.suite());

    return suite;
  }
}
