package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PriceInfo implements Serializable {

    @InterfaceC65349Pkn("diamond_id")
    public long diamondId;

    @InterfaceC65349Pkn("iap_id")
    public String iapId = "";

    @InterfaceC65349Pkn("price_in_usd")
    public String priceInUsd = "";

    public final long getDiamondId() {
        return this.diamondId;
    }

    public final String getIapId() {
        return this.iapId;
    }

    public final String getPriceInUsd() {
        return this.priceInUsd;
    }

    public final void setDiamondId(long j) {
        this.diamondId = j;
    }

    public final void setIapId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.iapId = str;
    }

    public final void setPriceInUsd(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.priceInUsd = str;
    }
}
