/*
 * Use of this source code is governed by the MIT license that can be
 * found in the LICENSE file.
 */

package org.openpolicyagent.ideaplugin.opa.tool

import com.intellij.openapi.util.SystemInfo

object OpaBaseTool {
    val opaBinary = if (SystemInfo.isWindows) "opa.exe" else "opa"
}
