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
package com.javacreed.examples.multiverse.part2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Example2 {

  private static final Logger LOGGER = LoggerFactory.getLogger(Example2.class);

  public static void main(final String[] args) {
    final Account a = new Account(10);
    final Account b = new Account(10);

    a.transferBetween(b, 5);
    Example2.LOGGER.debug("Account (a) {}", a);
    Example2.LOGGER.debug("Account (b) {}", b);

    try {
      a.transferBetween(b, 20);
    } catch (final IllegalStateException e) {
      Example2.LOGGER.warn("Failed to transfer money");
    }

    Example2.LOGGER.debug("Account (a) {}", a);
    Example2.LOGGER.debug("Account (b) {}", b);
  }

}
