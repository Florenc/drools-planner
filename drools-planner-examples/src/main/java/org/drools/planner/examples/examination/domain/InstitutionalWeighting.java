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

package org.drools.planner.examples.examination.domain;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.commons.lang.builder.CompareToBuilder;
import org.drools.planner.examples.common.domain.AbstractPersistable;

@XStreamAlias("InstitutionalWeighting")
public class InstitutionalWeighting extends AbstractPersistable {

    private int twoInARowPenalty;
    private int twoInADayPenalty;
    private int periodSpreadLength;
    private int periodSpreadPenalty;
    private int mixedDurationPenalty;
    private int frontLoadLargeTopicSize;
    private int frontLoadLastPeriodSize;
    private int frontLoadPenalty;

    public int getTwoInARowPenalty() {
        return twoInARowPenalty;
    }

    public void setTwoInARowPenalty(int twoInARowPenalty) {
        this.twoInARowPenalty = twoInARowPenalty;
    }

    public int getTwoInADayPenalty() {
        return twoInADayPenalty;
    }

    public void setTwoInADayPenalty(int twoInADayPenalty) {
        this.twoInADayPenalty = twoInADayPenalty;
    }

    public int getPeriodSpreadLength() {
        return periodSpreadLength;
    }

    public void setPeriodSpreadLength(int periodSpreadLength) {
        this.periodSpreadLength = periodSpreadLength;
    }

    public int getPeriodSpreadPenalty() {
        return periodSpreadPenalty;
    }

    public void setPeriodSpreadPenalty(int periodSpreadPenalty) {
        this.periodSpreadPenalty = periodSpreadPenalty;
    }

    public int getMixedDurationPenalty() {
        return mixedDurationPenalty;
    }

    public void setMixedDurationPenalty(int mixedDurationPenalty) {
        this.mixedDurationPenalty = mixedDurationPenalty;
    }

    public int getFrontLoadLargeTopicSize() {
        return frontLoadLargeTopicSize;
    }

    public void setFrontLoadLargeTopicSize(int frontLoadLargeTopicSize) {
        this.frontLoadLargeTopicSize = frontLoadLargeTopicSize;
    }

    public int getFrontLoadLastPeriodSize() {
        return frontLoadLastPeriodSize;
    }

    public void setFrontLoadLastPeriodSize(int frontLoadLastPeriodSize) {
        this.frontLoadLastPeriodSize = frontLoadLastPeriodSize;
    }

    public int getFrontLoadPenalty() {
        return frontLoadPenalty;
    }

    public void setFrontLoadPenalty(int frontLoadPenalty) {
        this.frontLoadPenalty = frontLoadPenalty;
    }

}
