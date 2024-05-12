package tikcast.api.wallet.tiktok;

import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class GetTotalBalanceResponse {

    @InterfaceC65349Pkn("data")
    public GetTotalBalanceData data;

    /* loaded from: classes6.dex */
    public static final class BalanceInfo {

        @InterfaceC65349Pkn("decimal_place")
        public int decimalPlace;

        @InterfaceC65349Pkn("code")
        public String code = "";

        @InterfaceC65349Pkn("symbol")
        public String symbol = "";

        @InterfaceC65349Pkn("amount")
        public String amount = "";
    }

    /* loaded from: classes6.dex */
    public static final class GetTotalBalanceData {

        @InterfaceC65349Pkn("balance")
        public BalanceInfo balance;

        @InterfaceC65349Pkn("has_income_before")
        public boolean hasIncomeBefore;
    }
}
