package com.bytedance.android.live.wallet.model;

import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class ExchangeDisplayInfo {

    @InterfaceC65349Pkn("exchange")
    public RevenueExchange exchange;

    @InterfaceC65349Pkn("exchange_entrance_icon")
    public int exchangeEntranceIcon;

    @InterfaceC65349Pkn("exchange_entrance_subtitle")
    public int exchangeEntranceSubtitle;

    @InterfaceC65349Pkn("exchange_entrance_title")
    public int exchangeEntranceTitle;

    @InterfaceC65349Pkn("is_first_exchange")
    public boolean isFirstExchange = true;

    @InterfaceC65349Pkn("w9_tax_status")
    public int w9TaxStatus;

    public final boolean LIZ() {
        if (this.w9TaxStatus == 4) {
            return true;
        }
        return false;
    }
}
