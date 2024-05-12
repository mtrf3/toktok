package com.ss.android.ugc.aweme.im.sdk.common.data.model;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class WelcomeMsgEnabledResponse extends BaseResponse {

    @InterfaceC65349Pkn("enabled")
    public Boolean hasWelcomeMsg;

    /* JADX WARN: Multi-variable type inference failed */
    public WelcomeMsgEnabledResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WelcomeMsgEnabledResponse) && o.LJ(this.hasWelcomeMsg, ((WelcomeMsgEnabledResponse) obj).hasWelcomeMsg);
    }

    public final int hashCode() {
        Boolean bool = this.hasWelcomeMsg;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WelcomeMsgEnabledResponse(hasWelcomeMsg=");
        return C78920UyC.LIZIZ(LIZ, this.hasWelcomeMsg, ')', LIZ);
    }

    public WelcomeMsgEnabledResponse(Boolean bool) {
        this.hasWelcomeMsg = bool;
    }

    public /* synthetic */ WelcomeMsgEnabledResponse(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool);
    }
}
