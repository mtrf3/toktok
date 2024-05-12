package com.ss.android.ugc.aweme.ecommercelive.business.feed.popcard.api;

import X.C16880lQ;
import X.C47135Ieh;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommercelive.business.feed.popcard.data.FeedProduct;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class FeedProductResp {

    @InterfaceC65349Pkn("product")
    public final FeedProduct product;

    @InterfaceC65349Pkn("server_time")
    public final long serverTime;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedProductResp)) {
            return false;
        }
        FeedProductResp feedProductResp = (FeedProductResp) obj;
        return o.LJ(this.product, feedProductResp.product) && this.serverTime == feedProductResp.serverTime;
    }

    public final int hashCode() {
        FeedProduct feedProduct = this.product;
        return C16880lQ.LLJIJIL(this.serverTime) + ((feedProduct == null ? 0 : feedProduct.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedProductResp(product=");
        LIZ.append(this.product);
        LIZ.append(", serverTime=");
        return C47135Ieh.LIZIZ(LIZ, this.serverTime, ')', LIZ);
    }

    public FeedProductResp(FeedProduct feedProduct, long j) {
        this.product = feedProduct;
        this.serverTime = j;
    }

    public /* synthetic */ FeedProductResp(FeedProduct feedProduct, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(feedProduct, (i & 2) != 0 ? 0L : j);
    }
}
