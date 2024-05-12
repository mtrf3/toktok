package com.ss.android.ugc.aweme.ecommerce.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class GetItemProductInfoResponse extends BaseResponse {

    @InterfaceC65349Pkn("data")
    public final GetItemProductInfoResponseData data;

    /* JADX WARN: Multi-variable type inference failed */
    public GetItemProductInfoResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetItemProductInfoResponse) && o.LJ(this.data, ((GetItemProductInfoResponse) obj).data);
    }

    public final int hashCode() {
        GetItemProductInfoResponseData getItemProductInfoResponseData = this.data;
        if (getItemProductInfoResponseData == null) {
            return 0;
        }
        return getItemProductInfoResponseData.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GetItemProductInfoResponse(data=");
        LIZ.append(this.data);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public GetItemProductInfoResponse(GetItemProductInfoResponseData getItemProductInfoResponseData) {
        this.data = getItemProductInfoResponseData;
    }

    public /* synthetic */ GetItemProductInfoResponse(GetItemProductInfoResponseData getItemProductInfoResponseData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : getItemProductInfoResponseData);
    }
}
