/**
 * Copyright (c) 2019 Cotta & Cush Limited.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cottacush.android.currencyedittext

import java.util.regex.Pattern

fun parseMoneyValue(value: String, groupingSeparator: String, currencySymbol: String): String =
    value.replace(groupingSeparator, "").replace(currencySymbol, "")
fun removeAllOccurenceOfChar(text: String): String {
    val p = Pattern.compile("\\d+") // regex to extract only numbers from a string
    val m = p.matcher(text)
    val noChar = StringBuilder()
    while (m.find()) {
        noChar.append(m.group())
    }
    return noChar.toString()
}