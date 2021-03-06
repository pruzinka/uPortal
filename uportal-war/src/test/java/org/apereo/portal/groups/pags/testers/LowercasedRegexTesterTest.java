/**
 * Licensed to Apereo under one or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information regarding copyright ownership. Apereo
 * licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the License at the
 * following location:
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apereo.portal.groups.pags.testers;

import org.apereo.portal.groups.pags.TestPersonAttributesGroupTestDefinition;
import org.junit.Assert;
import org.junit.Test;

public class LowercasedRegexTesterTest {

    @Test
    public void testRegexPatterns() {
        LowercasedRegexTester tester = new LowercasedRegexTester(
                new TestPersonAttributesGroupTestDefinition("fakeAttribute", "^02([a-d])*"));
        Assert.assertTrue(tester.test("02A"));
        Assert.assertTrue(tester.test("02ABCD"));
        Assert.assertFalse(tester.test("A02D"));
        Assert.assertTrue(tester.test("02"));
        Assert.assertFalse(tester.test("02MisMatch"));
        Assert.assertFalse(tester.test("PatternWillNeverMatch"));
    }
}
