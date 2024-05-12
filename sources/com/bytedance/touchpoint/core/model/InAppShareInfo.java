package com.bytedance.touchpoint.core.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes4.dex */
public final class InAppShareInfo extends F9E {

    @InterfaceC65349Pkn("cash_number")
    public final Integer cashNumber;

    @InterfaceC65349Pkn("currency_symbol")
    public final String currencySymbol;

    @InterfaceC65349Pkn("image")
    public final String image;

    @InterfaceC65349Pkn("link")
    public final String link;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.link, this.image, this.currencySymbol, this.cashNumber};
    }

    public InAppShareInfo(String str, String str2, String str3, Integer num) {
        this.link = str;
        this.image = str2;
        this.currencySymbol = str3;
        this.cashNumber = num;
    }
}
