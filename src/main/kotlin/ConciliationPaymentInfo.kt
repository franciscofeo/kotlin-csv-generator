data class ConciliationPaymentInfo(
    val orderId: String,
    val paymentId: String,
    val paymentValue: Int,
    val paymentMethodFee: Int,
    val netAmount: Int,
    val paymentDate: String,
    val currency: String,
    val paymentMethod: String,
    val ddc: String,
    val paymentStatus: String,
    val settlementId: String,
    val settlementDate: String,
    val settlementValue: Int,
    val settlementStatus: String,
    val settlementBeneficiary: String
) {
    companion object {
        val HEADERS = listOf(
            "order_ID" to ConciliationPaymentInfo::orderId,
            "Payment ID" to ConciliationPaymentInfo::paymentId,
            "Payment value" to ConciliationPaymentInfo::paymentValue,
            "Payment method fee" to ConciliationPaymentInfo::paymentMethodFee,
            "Net amount" to ConciliationPaymentInfo::netAmount,
            "Payment date" to ConciliationPaymentInfo::paymentDate,
            "Currency" to ConciliationPaymentInfo::currency,
            "Payment method" to ConciliationPaymentInfo::paymentMethod,
            "DDC" to ConciliationPaymentInfo::ddc,
            "Payment Status" to ConciliationPaymentInfo::paymentStatus,
            "Settlement ID" to ConciliationPaymentInfo::settlementId,
            "Settlement date" to ConciliationPaymentInfo::settlementDate,
            "Settlement value" to ConciliationPaymentInfo::settlementValue,
            "Settlement status" to ConciliationPaymentInfo::settlementStatus,
            "Settlement Beneficiary" to ConciliationPaymentInfo::settlementBeneficiary
        )
    }
} 