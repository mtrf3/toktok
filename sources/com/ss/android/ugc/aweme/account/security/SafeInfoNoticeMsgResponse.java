package com.ss.android.ugc.aweme.account.security;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SafeInfoNoticeMsgResponse extends BaseResponse {

    @InterfaceC65349Pkn("data")
    public final SafeInfoNoticeMsg data;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeInfoNoticeMsgResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SafeInfoNoticeMsgResponse) && o.LJ(this.data, ((SafeInfoNoticeMsgResponse) obj).data);
    }

    public final int hashCode() {
        SafeInfoNoticeMsg safeInfoNoticeMsg = this.data;
        if (safeInfoNoticeMsg == null) {
            return 0;
        }
        return safeInfoNoticeMsg.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SafeInfoNoticeMsgResponse(data=");
        LIZ.append(this.data);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public SafeInfoNoticeMsgResponse(SafeInfoNoticeMsg safeInfoNoticeMsg) {
        this.data = safeInfoNoticeMsg;
    }

    public /* synthetic */ SafeInfoNoticeMsgResponse(SafeInfoNoticeMsg safeInfoNoticeMsg, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : safeInfoNoticeMsg);
    }
}
