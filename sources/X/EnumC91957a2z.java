package X;

/* renamed from: X.a2z, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public enum EnumC91957a2z {
    CardNumber("eg_ccdc_global_card_number"),
    ExpirationDate("eg_ccdc_global_expiration_date"),
    ExpirationYear("eg_ccdc_global_expiration_year"),
    ExpirationMonth("eg_ccdc_global_expiration_month"),
    SecurityCode("eg_ccdc_global_cvv"),
    CardHolderName("eg_ccdc_global_holder_name"),
    ProxyType("eg_ccdc_global_proxy_type"),
    CPF("eg_ccdc_global_identity"),
    CNPJ("eg_ccdc_global_company_id"),
    MobilePhone("eg_ccdc_global_mobile_phone"),
    PhoneCountryCode("eg_ccdc_global_phone_country_code"),
    Phone("eg_ccdc_global_phone"),
    EMail("eg_ccdc_global_email"),
    Address("eg_ccdc_global_billing_address"),
    AddressCountryRegion("eg_ccdc_global_billing_address_country_regin"),
    AddressState("eg_ccdc_global_billing_address_state"),
    AddressCity("eg_ccdc_global_billing_address_city"),
    Street("eg_ccdc_global_billing_address_street"),
    PostalCode("eg_ccdc_global_billing_address_postal_code");

    public final String LJLIL;

    public static EnumC91957a2z valueOf(String str) {
        return (EnumC91957a2z) V0N.LJJJ(EnumC91957a2z.class, str);
    }

    public final String getType() {
        return this.LJLIL;
    }

    EnumC91957a2z(String str) {
        this.LJLIL = str;
    }
}
