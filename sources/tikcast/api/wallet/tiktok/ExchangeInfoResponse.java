package tikcast.api.wallet.tiktok;

import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class ExchangeInfoResponse {

    @InterfaceC65349Pkn("data")
    public ExchangeInfoData data;

    /* loaded from: classes14.dex */
    public static final class ExchangeInfoData {

        @InterfaceC65349Pkn("auto_exchange_enable")
        public boolean autoExchangeEnable;

        @InterfaceC65349Pkn("exchange")
        public Exchange exchange;

        @InterfaceC65349Pkn("exchange_entrance_icon")
        public int exchangeEntranceIcon;

        @InterfaceC65349Pkn("exchange_entrance_subtitle")
        public int exchangeEntranceSubtitle;

        @InterfaceC65349Pkn("exchange_entrance_title")
        public int exchangeEntranceTitle;

        @InterfaceC65349Pkn("exchange_panel_hint")
        public int exchangePanelHint;

        @InterfaceC65349Pkn("is_first_exchange")
        public boolean isFirstExchange;

        @InterfaceC65349Pkn("w9_tax_status")
        public long w9TaxStatus;
    }
}
