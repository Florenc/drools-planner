/*
 * Copyright 2012 JBoss Inc
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

package org.drools.planner.core.heuristic.selector.variable;

import java.util.Iterator;

import org.drools.planner.api.domain.variable.PlanningVariable;
import org.drools.planner.core.heuristic.selector.Selector;

/**
 * Selects {@link PlanningVariable} annotated properties.
 * @see AbstractValueSelector
 */
public interface ValueSelector extends Selector {

    Iterator<Object> iterator(Object entity);

}