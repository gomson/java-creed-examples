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
package com.javacreed.examples.concurrency.part5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Example6 {

  private static final Logger LOGGER = LoggerFactory.getLogger(Example6.class);

  public static void main(final String[] args) {
      Accounts accounts = new Accounts();
      accounts.addAccount(new Account(10));
      accounts.addAccount(new Account(20));

    Example6.LOGGER.debug("Average Balance: {}", accounts.calculateAverageBalance());
  }
}
