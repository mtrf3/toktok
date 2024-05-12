package com.ss.android.ugc.aweme.comment.event;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PinResult extends BaseResponse {

    @InterfaceC65349Pkn("notice")
    public final PinNotice notice;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PinResult) && o.LJ(this.notice, ((PinResult) obj).notice);
    }

    public final int hashCode() {
        PinNotice pinNotice = this.notice;
        if (pinNotice == null) {
            return 0;
        }
        return pinNotice.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PinResult(notice=");
        LIZ.append(this.notice);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public PinResult(PinNotice pinNotice) {
        this.notice = pinNotice;
    }
}
