package com.ss.android.ugc.aweme.model;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PaidCollectionRefundResponse extends BaseResponse {

    @InterfaceC65349Pkn("web_purchase_price")
    public final String webPurchasePrice;

    /* JADX WARN: Multi-variable type inference failed */
    public PaidCollectionRefundResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final int hashCode() {
        return Objects.hash(this.webPurchasePrice);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("PaidCollectionRefundResponse:%s", this.webPurchasePrice);
    }

    public PaidCollectionRefundResponse(String webPurchasePrice) {
        o.LJIIIZ(webPurchasePrice, "webPurchasePrice");
        this.webPurchasePrice = webPurchasePrice;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaidCollectionRefundResponse)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((PaidCollectionRefundResponse) obj).webPurchasePrice}, new Object[]{this.webPurchasePrice});
    }

    public /* synthetic */ PaidCollectionRefundResponse(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
