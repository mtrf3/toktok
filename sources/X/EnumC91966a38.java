package X;

/* renamed from: X.a38, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public enum EnumC91966a38 {
    CardNumber("card_number"),
    ExpirationDate("expiration_date"),
    ExpirationMonth("expiration_month"),
    ExpirationYear("expiration_year"),
    SecurityCode("cvv"),
    CardHolderName("holder_name"),
    HolderFirstName("holder_first_name"),
    HolderLastName("holder_last_name"),
    HolderFirstNameKatakana("holder_first_name_katakana"),
    HolderLastNameKatakana("holder_last_name_katakana"),
    Address("address"),
    BillingCountryRegion("billing_country_region"),
    BillingState("billing_state"),
    BillingCity("billing_city"),
    BillingStreet("billing_street"),
    BillingPostalCode("billing_postal_code"),
    CPF("identity"),
    CNPJ("company_id"),
    Email("email"),
    MobilePhone("mobile_phone"),
    PhoneCountryCode("phone_country_code"),
    Phone("phone"),
    BankCode("bank_code"),
    WalletID("wallet_id");

    public final String LJLIL;

    public static EnumC91966a38 valueOf(String str) {
        return (EnumC91966a38) V0N.LJJJ(EnumC91966a38.class, str);
    }

    public final String getType() {
        return this.LJLIL;
    }

    EnumC91966a38(String str) {
        this.LJLIL = str;
    }
}
