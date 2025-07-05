package org.example
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements

fun main() {
    val doc: Document = Jsoup.connect("https://mybook.ru/author/duglas-adams/" +
            "avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/")
        .timeout(10000)
        .get()

    val quotes: Elements = doc.select("article")

    quotes.forEachIndexed { index, quote ->
        println("Цитата № ${index + 1}")
        println(quote.text())
    }

}
