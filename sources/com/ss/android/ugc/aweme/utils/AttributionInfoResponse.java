package com.ss.android.ugc.aweme.utils;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AttributionInfoResponse extends BaseResponse {

    @InterfaceC65349Pkn("data")
    public final AttributionInfoData data;

    @InterfaceC65349Pkn("err_no")
    public final int errCode;

    /* JADX WARN: Multi-variable type inference failed */
    public AttributionInfoResponse() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttributionInfoResponse)) {
            return false;
        }
        AttributionInfoResponse attributionInfoResponse = (AttributionInfoResponse) obj;
        return this.errCode == attributionInfoResponse.errCode && o.LJ(this.data, attributionInfoResponse.data);
    }

    public final int hashCode() {
        int i = this.errCode * 31;
        AttributionInfoData attributionInfoData = this.data;
        return i + (attributionInfoData == null ? 0 : attributionInfoData.hashCode());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AttributionInfoResponse(errCode=");
        LIZ.append(this.errCode);
        LIZ.append(", data=");
        LIZ.append(this.data);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public AttributionInfoResponse(int i, AttributionInfoData attributionInfoData) {
        this.errCode = i;
        this.data = attributionInfoData;
    }

    public /* synthetic */ AttributionInfoResponse(int i, AttributionInfoData attributionInfoData, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? null : attributionInfoData);
    }
}
