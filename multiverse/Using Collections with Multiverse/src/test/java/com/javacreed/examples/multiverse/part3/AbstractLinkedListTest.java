/*
 * #%L
 * Using Collections with Multiverse
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2012 - 2015 Java Creed
 * %%
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
 * #L%
 */
package com.javacreed.examples.multiverse.part3;

import org.multiverse.api.GlobalStmInstance;
import org.multiverse.api.Stm;
import org.multiverse.api.TxnThreadLocal;
import org.multiverse.api.collections.TxnList;
import org.slf4j.Logger;

import com.javacreed.examples.multiverse.utils.LoggerUtils;

public abstract class AbstractLinkedListTest {

  private static final Logger LOGGER = LoggerUtils.getLogger(AbstractLinkedListTest.class);

  protected <E> TxnList<E> createList() {
    AbstractLinkedListTest.LOGGER.trace("Creating List");
    final Stm stm = GlobalStmInstance.getGlobalStmInstance();
    TxnThreadLocal.clearThreadLocalTxn();

    return new BasicTxnLinkedList<>(stm);
  }
}