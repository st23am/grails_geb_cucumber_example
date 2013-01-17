package pages.book

import geb.Page


class ListPage extends Page {
    static url = "book/list"

    static at = {
        title ==~ /Book List/
    }

    static content = {
    }
}
