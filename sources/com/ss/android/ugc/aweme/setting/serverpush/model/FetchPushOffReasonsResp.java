package com.ss.android.ugc.aweme.setting.serverpush.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class FetchPushOffReasonsResp extends BaseResponse {

    @InterfaceC65349Pkn("data")
    public final PushOffReasonsData data;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FetchPushOffReasonsResp) && o.LJ(this.data, ((FetchPushOffReasonsResp) obj).data);
    }

    public final int hashCode() {
        PushOffReasonsData pushOffReasonsData = this.data;
        if (pushOffReasonsData == null) {
            return 0;
        }
        return pushOffReasonsData.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FetchPushOffReasonsResp(data=");
        LIZ.append(this.data);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public FetchPushOffReasonsResp(PushOffReasonsData pushOffReasonsData) {
        this.data = pushOffReasonsData;
    }
}
