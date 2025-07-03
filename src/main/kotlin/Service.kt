import ConciliationPaymentInfo.Companion.HEADERS
import org.apache.commons.csv.CSVFormat.DEFAULT
import org.apache.commons.csv.CSVPrinter
import java.io.FileWriter

class Service(
    private val repository: Repository = Repository(),

) {

    fun createCsv() {
        val paymentsInfo = repository.findAllQRCodePayments()
        val headers = HEADERS.map { it.first }

        FileWriter("testeneslte.csv").use { writer ->
            val csvFormat = DEFAULT.builder().setHeader(*headers.toTypedArray()).get()
            CSVPrinter(writer, csvFormat).use { csvPrinter ->
                paymentsInfo.forEach {
                    val values = HEADERS.map { (k, v) -> v.get(it) }
                    csvPrinter.printRecord(values)
                }
            }
        }
        println("passou")
    }
} 