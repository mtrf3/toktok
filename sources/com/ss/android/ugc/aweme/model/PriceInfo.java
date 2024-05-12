package com.ss.android.ugc.aweme.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PriceInfo extends F9E implements Serializable {

    @InterfaceC65349Pkn("diamond_id")
    public final long diamondId;

    @InterfaceC65349Pkn("iap_id")
    public final String iapId;

    @InterfaceC65349Pkn("price_in_usd")
    public final String priceInUsd;

    /* JADX WARN: Multi-variable type inference failed */
    public PriceInfo() {
        this(0L, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PriceInfo copy$default(PriceInfo priceInfo, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = priceInfo.diamondId;
        }
        if ((i & 2) != 0) {
            str = priceInfo.iapId;
        }
        if ((i & 4) != 0) {
            str2 = priceInfo.priceInUsd;
        }
        return priceInfo.copy(j, str, str2);
    }

    public final PriceInfo copy(long j, String iapId, String priceInUsd) {
        o.LJIIIZ(iapId, "iapId");
        o.LJIIIZ(priceInUsd, "priceInUsd");
        return new PriceInfo(j, iapId, priceInUsd);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.diamondId), this.iapId, this.priceInUsd};
    }

    public final long getDiamondId() {
        return this.diamondId;
    }

    public final String getIapId() {
        return this.iapId;
    }

    public final String getPriceInUsd() {
        return this.priceInUsd;
    }

    public PriceInfo(long j, String iapId, String priceInUsd) {
        o.LJIIIZ(iapId, "iapId");
        o.LJIIIZ(priceInUsd, "priceInUsd");
        this.diamondId = j;
        this.iapId = iapId;
        this.priceInUsd = priceInUsd;
    }

    public /* synthetic */ PriceInfo(long j, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }
}
