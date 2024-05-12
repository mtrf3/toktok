package com.ss.android.ugc.aweme.live.notification;

import X.C26070ALa;
import X.InterfaceC61312at;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ResponseState implements InterfaceC61312at {
    public final C26070ALa cacheEvent;
    public final C26070ALa networkEvent;
    public final int pushState;
    public final int statusCode;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ResponseState() {
        /*
            r7 = this;
            r1 = 0
            r3 = 0
            r5 = 15
            r0 = r7
            r2 = r1
            r4 = r3
            r6 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.notification.ResponseState.<init>():void");
    }

    public static /* synthetic */ ResponseState copy$default(ResponseState responseState, int i, int i2, C26070ALa c26070ALa, C26070ALa c26070ALa2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = responseState.pushState;
        }
        if ((i3 & 2) != 0) {
            i2 = responseState.statusCode;
        }
        if ((i3 & 4) != 0) {
            c26070ALa = responseState.cacheEvent;
        }
        if ((i3 & 8) != 0) {
            c26070ALa2 = responseState.networkEvent;
        }
        return responseState.copy(i, i2, c26070ALa, c26070ALa2);
    }

    public final ResponseState copy(int i, int i2, C26070ALa c26070ALa, C26070ALa c26070ALa2) {
        return new ResponseState(i, i2, c26070ALa, c26070ALa2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseState)) {
            return false;
        }
        ResponseState responseState = (ResponseState) obj;
        return this.pushState == responseState.pushState && this.statusCode == responseState.statusCode && o.LJ(this.cacheEvent, responseState.cacheEvent) && o.LJ(this.networkEvent, responseState.networkEvent);
    }

    public int hashCode() {
        int i = ((this.pushState * 31) + this.statusCode) * 31;
        C26070ALa c26070ALa = this.cacheEvent;
        int hashCode = (i + (c26070ALa == null ? 0 : c26070ALa.hashCode())) * 31;
        C26070ALa c26070ALa2 = this.networkEvent;
        return hashCode + (c26070ALa2 != null ? c26070ALa2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ResponseState(pushState=");
        LIZ.append(this.pushState);
        LIZ.append(", statusCode=");
        LIZ.append(this.statusCode);
        LIZ.append(", cacheEvent=");
        LIZ.append(this.cacheEvent);
        LIZ.append(", networkEvent=");
        LIZ.append(this.networkEvent);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final C26070ALa getCacheEvent() {
        return this.cacheEvent;
    }

    public final C26070ALa getNetworkEvent() {
        return this.networkEvent;
    }

    public final int getPushState() {
        return this.pushState;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public ResponseState(int i, int i2, C26070ALa c26070ALa, C26070ALa c26070ALa2) {
        this.pushState = i;
        this.statusCode = i2;
        this.cacheEvent = c26070ALa;
        this.networkEvent = c26070ALa2;
    }

    public /* synthetic */ ResponseState(int i, int i2, C26070ALa c26070ALa, C26070ALa c26070ALa2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? null : c26070ALa, (i3 & 8) != 0 ? null : c26070ALa2);
    }
}
