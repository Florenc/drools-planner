/*
 * Copyright 2010 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.planner.examples.nurserostering.domain.solver;

import java.io.Serializable;
import java.util.Comparator;

import org.apache.commons.lang.builder.CompareToBuilder;
import org.drools.planner.examples.nurserostering.domain.ShiftAssignment;
import org.drools.planner.examples.nurserostering.domain.Shift;

public class ShiftAssignmentDifficultyComparator implements Comparator<ShiftAssignment>, Serializable {

    public int compare(ShiftAssignment a, ShiftAssignment b) {
        Shift aShift = a.getShift();
        Shift bShift = b.getShift();
        return new CompareToBuilder()
                    .append(bShift.getShiftDate(), aShift.getShiftDate()) // Descending
                    .append(bShift.getShiftType(), aShift.getShiftType()) // Descending
                    // For construction heuristics, scheduling the shifts in sequence is better
                    .append(aShift.getRequiredEmployeeSize(), bShift.getRequiredEmployeeSize())
                    .toComparison();
    }

}
