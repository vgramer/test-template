/*
 * Use of this source code is governed by the MIT license that can be
 * found in the LICENSE file.
 */

package org.openpolicyagent.ideaplugin

interface OpaTestCase {

    fun getTestDataPath(): String

    companion object {
        const val testResourcesPath = "src/test/resources"
    }
}
