class Repository {

    fun findAllQRCodePayments(): List<ConciliationPaymentInfo> = listOf(
        ConciliationPaymentInfo(
            orderId = "647717480; 141217410",
            paymentId = "56b378537f4484d9b36bdc2dbb673607",
            paymentValue = 958745,
            paymentMethodFee = 100,
            netAmount = 158655,
            paymentDate = "9/4/2025 20:58",
            currency = "BRL",
            paymentMethod = "Pix",
            ddc = "Nestle Alpha",
            paymentStatus = "Pago",
            settlementId = "c8daa59a-6f9f-46ad-a347-481795f5aae9",
            settlementDate = "25/04/2025 11:32:04",
            settlementValue = 814735,
            settlementStatus = "ENVIADO",
            settlementBeneficiary = "Nestle"
        ),
        ConciliationPaymentInfo(
            orderId = "647717481",
            paymentId = "56b378537f4484d9b36bdc2dbb673608",
            paymentValue = 179655,
            paymentMethodFee = 101,
            netAmount = 179655,
            paymentDate = "9/4/2025 20:58",
            currency = "BRL",
            paymentMethod = "Pix",
            ddc = "Nestle Barbacena",
            paymentStatus = "Pago",
            settlementId = "f8tyl859-6f9f-46ad-a347-481795f5aae9",
            settlementDate = "25/04/2025 11:32:04",
            settlementValue = 179655,
            settlementStatus = "ENVIADO",
            settlementBeneficiary = "Nestle"
        ),
        ConciliationPaymentInfo(
            orderId = "647717482",
            paymentId = "56b378537f4484d9b36bdc2dbb673609",
            paymentValue = 557459,
            paymentMethodFee = 102,
            netAmount = 158655,
            paymentDate = "9/4/2025 20:58",
            currency = "BRL",
            paymentMethod = "Pix",
            ddc = "Nestle Alpha",
            paymentStatus = "Pago",
            settlementId = "u7yt59a-6f9f-46ad-a347-481795f5aae9",
            settlementDate = "25/04/2025 11:32:04",
            settlementValue = 158655,
            settlementStatus = "FAILED",
            settlementBeneficiary = "Nestle"
        )
    )
} 