package com.ss.android.ugc.aweme.im.sdk.chat.feature.media.mic.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SpeechErrorResponse {

    @InterfaceC65349Pkn("err_code")
    public final Integer errorCode;

    @InterfaceC65349Pkn("err_msg")
    public final String errorMsg;

    /* JADX WARN: Multi-variable type inference failed */
    public SpeechErrorResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpeechErrorResponse)) {
            return false;
        }
        SpeechErrorResponse speechErrorResponse = (SpeechErrorResponse) obj;
        return o.LJ(this.errorCode, speechErrorResponse.errorCode) && o.LJ(this.errorMsg, speechErrorResponse.errorMsg);
    }

    public final int hashCode() {
        Integer num = this.errorCode;
        return this.errorMsg.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SpeechErrorResponse(errorCode=");
        LIZ.append(this.errorCode);
        LIZ.append(", errorMsg=");
        return q.LIZIZ(LIZ, this.errorMsg, ')', LIZ);
    }

    public SpeechErrorResponse(Integer num, String errorMsg) {
        o.LJIIIZ(errorMsg, "errorMsg");
        this.errorCode = num;
        this.errorMsg = errorMsg;
    }

    public /* synthetic */ SpeechErrorResponse(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? "" : str);
    }
}
