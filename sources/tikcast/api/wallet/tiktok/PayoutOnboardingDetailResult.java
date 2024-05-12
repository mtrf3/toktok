package tikcast.api.wallet.tiktok;

import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class PayoutOnboardingDetailResult {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes6.dex */
    public static final class Data {

        @InterfaceC65349Pkn("confirmed")
        public boolean confirmed;

        @InterfaceC65349Pkn("default_pi_status")
        public int defaultPiStatus;

        @InterfaceC65349Pkn("kyc_fail_reason")
        public int kycFailReason;

        @InterfaceC65349Pkn("kyc_status")
        public int kycStatus;

        @InterfaceC65349Pkn("masked_instrument_identity")
        public String maskedInstrumentIdentity = "";

        @InterfaceC65349Pkn("pi_bind_status")
        public int piBindStatus;

        @InterfaceC65349Pkn("user_tax_status")
        public int userTaxStatus;
    }
}
