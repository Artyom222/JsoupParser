package org.example
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements

fun main() {
    val doc: Document = Jsoup.connect("https://mybook.ru/author/duglas-adams/" +
            "avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/")
        .timeout(10000)
        .get()

    val quotes: Elements = doc.select(".sc-2aegk7-2.bzpNIu")

    var i = 0
    for (quote: Element in quotes) {
        ++i
        println("Цитатата № $i")
        println(quote.text())
    }

}
