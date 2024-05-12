package com.ss.android.ugc.aweme.kpro;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class KproActivityResponse extends BaseResponse {

    @InterfaceC65349Pkn("data")
    public final KproActivityResponseData data;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KproActivityResponse) && o.LJ(this.data, ((KproActivityResponse) obj).data);
    }

    public final int hashCode() {
        KproActivityResponseData kproActivityResponseData = this.data;
        if (kproActivityResponseData == null) {
            return 0;
        }
        return kproActivityResponseData.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("KproActivityResponse(data=");
        LIZ.append(this.data);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public KproActivityResponse(KproActivityResponseData kproActivityResponseData) {
        this.data = kproActivityResponseData;
    }
}
