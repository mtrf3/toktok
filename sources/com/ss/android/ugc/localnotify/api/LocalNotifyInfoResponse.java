package com.ss.android.ugc.localnotify.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class LocalNotifyInfoResponse extends BaseResponse {

    @InterfaceC65349Pkn("payload")
    public final String pushMsg;

    /* JADX WARN: Multi-variable type inference failed */
    public LocalNotifyInfoResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalNotifyInfoResponse) && o.LJ(this.pushMsg, ((LocalNotifyInfoResponse) obj).pushMsg);
    }

    public final int hashCode() {
        String str = this.pushMsg;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LocalNotifyInfoResponse(pushMsg=");
        return q.LIZIZ(LIZ, this.pushMsg, ')', LIZ);
    }

    public LocalNotifyInfoResponse(String str) {
        this.pushMsg = str;
    }

    public /* synthetic */ LocalNotifyInfoResponse(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
