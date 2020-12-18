/*
 * Use of this source code is governed by the MIT license that can be
 * found in the LICENSE file.
 */

package org.openpolicyagent.ideaplugin.lang

class RegoParsingTestCase : RegoParsingTestCaseBase() {

    fun `test array`() = doTest(true, true)
    fun `test object`() = doTest(true, true)
    fun `test number`() = doTest(true, true)

    fun `test array comprehension`() = doTest(true, true)
    fun `test set comprehension`() = doTest(true, true)
    fun `test set comprehensions 2`() = doTest(true, true)
    fun `test set comprehensions 3`() = doTest(true, true)
    fun `test object comprehension`() = doTest(true, true)

    fun `test implicit or`() = doTest(true, true)

    fun `test default keyword`() = doTest(true, true)
    fun `test else keyword`() = doTest(true, true)
    fun `test with keyword`() = doTest(true, true)

    fun `test complex rule 1`() = doTest(true, true)
    fun `test complex rule 2`() = doTest(true, true)
    fun `test complex rule 3`() = doTest(true, true)

    fun `test array comprehensions 2`() = doTest(true, true)
    fun `test built in functions`() = doTest(true, true)
    fun `test functions`() = doTest(true, true)
    fun `test multiple expressions`() = doTest(true, true)
    fun `test rules`() = doTest(true, true)
    fun `test self joins`() = doTest(true, true)
    fun `test with keyword 2`() = doTest(true, true)

    fun `test composite keys`() = doTest(true, true)
    fun `test composite values`() = doTest(true, true)
    fun `test else keyword 2`() = doTest(true, true)
    fun `test imports`() = doTest(true, true)
    fun `test negations`() = doTest(true, true)
    fun `test package with simple rule`() = doTest(true, true)
    fun `test references`() = doTest(true, true)
    fun `test rules with single predicates`() = doTest(true, true)
    fun `test scalars assignment`() = doTest(true, true)
    fun `test sets`() = doTest(true, true)
    fun `test strings`() = doTest(true, true)
    fun `test variables`() = doTest(true, true)
}
