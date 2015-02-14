/*
 * #%L
 * Software Transansactional Memory Example
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
package com.javacreed.examples.concurrency.part3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Example4 {

  public static final Logger LOGGER = LoggerFactory.getLogger(Example4.class);

  public static void main(final String[] args) throws Exception {
    // Break point 1
    final int limit = 10000000;
    final StmAccount[] array = new StmAccount[limit];
    for (int i = 0; i < limit; i++) {
      array[i] = new StmAccount(i);
    }

    // Break point 2
    Example4.LOGGER.debug("Done");
  }

}
