/*
 * SPDX-FileCopyrightText: 2023 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package org.microg.gms.location.network.cell

interface CellDetailsCallback {
    fun onCellDetailsAvailable(cells: List<CellDetails>)
}