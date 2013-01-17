package steps

import pages.book.ListPage
import static org.junit.Assert.assertTrue
import static cucumber.api.groovy.EN.*

When(~'^I run it$') { ->
    // Express the Regexp above with the code you wish you had
    assert true
}
Then(~'^it should pass$') { ->
    // Express the Regexp above with the code you wish you had
    assert true
}

Given(~'^I am running this with:$') {  table ->
    // Express the Regexp above with the code you wish you had
   to ListPage
   at ListPage
}
