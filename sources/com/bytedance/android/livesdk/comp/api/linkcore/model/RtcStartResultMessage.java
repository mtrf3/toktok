package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class RtcStartResultMessage {
    public final LinkCoreError error;
    public final boolean startSuccess;

    public static /* synthetic */ RtcStartResultMessage copy$default(RtcStartResultMessage rtcStartResultMessage, boolean z, LinkCoreError linkCoreError, int i, Object obj) {
        if ((i & 1) != 0) {
            z = rtcStartResultMessage.startSuccess;
        }
        if ((i & 2) != 0) {
            linkCoreError = rtcStartResultMessage.error;
        }
        return rtcStartResultMessage.copy(z, linkCoreError);
    }

    public final RtcStartResultMessage copy(boolean z, LinkCoreError linkCoreError) {
        return new RtcStartResultMessage(z, linkCoreError);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RtcStartResultMessage)) {
            return false;
        }
        RtcStartResultMessage rtcStartResultMessage = (RtcStartResultMessage) obj;
        return this.startSuccess == rtcStartResultMessage.startSuccess && o.LJ(this.error, rtcStartResultMessage.error);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.startSuccess;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        LinkCoreError linkCoreError = this.error;
        return i + (linkCoreError == null ? 0 : linkCoreError.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RtcStartResultMessage(startSuccess=");
        LIZ.append(this.startSuccess);
        LIZ.append(", error=");
        LIZ.append(this.error);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final LinkCoreError getError() {
        return this.error;
    }

    public final boolean getStartSuccess() {
        return this.startSuccess;
    }

    public RtcStartResultMessage(boolean z, LinkCoreError linkCoreError) {
        this.startSuccess = z;
        this.error = linkCoreError;
    }
}
