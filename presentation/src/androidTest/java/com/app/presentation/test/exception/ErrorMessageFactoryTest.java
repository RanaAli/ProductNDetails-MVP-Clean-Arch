
package com.app.presentation.test.exception;

import android.test.AndroidTestCase;
import com.app.data.exception.NetworkConnectionException;
import com.app.data.exception.NotFoundException;
import com.app.presentation.R;
import com.app.presentation.exception.ErrorMessageFactory;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ErrorMessageFactoryTest extends AndroidTestCase {

  @Override protected void setUp() throws Exception {
    super.setUp();
  }

  public void testNetworkConnectionErrorMessage() {
    String expectedMessage = getContext().getString(R.string.exception_message_no_connection);
    String actualMessage = ErrorMessageFactory.create(getContext(),
        new NetworkConnectionException());

    assertThat(actualMessage, is(equalTo(expectedMessage)));
  }

  public void testNotFoundErrorMessage() {
    String expectedMessage = getContext().getString(R.string.exception_message_not_found);
    String actualMessage = ErrorMessageFactory.create(getContext(), new NotFoundException());

    assertThat(actualMessage, is(equalTo(expectedMessage)));
  }
}
