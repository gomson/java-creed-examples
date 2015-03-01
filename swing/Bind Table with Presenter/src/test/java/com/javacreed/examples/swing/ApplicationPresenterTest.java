/*
 * #%L
 * Bind Text Field with Presenter
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
package com.javacreed.examples.swing;

import org.easymock.EasyMock;
import org.easymock.IMocksControl;
import org.junit.Test;

public class ApplicationPresenterTest {

  @Test
  public void test() {
    final IMocksControl mockMaker = EasyMock.createStrictControl();
    final View view = mockMaker.createMock(View.class);

    view.showMessage(EasyMock.eq("Hello"), EasyMock.eq("Hello Albert"));
    mockMaker.replay();

    final ApplicationPresenter presenter = new ApplicationPresenter();
    presenter.setView(view);
    presenter.getDataFieldBinder().setText("Albert");
    presenter.onNameEntered();

    mockMaker.verify();
  }
}
