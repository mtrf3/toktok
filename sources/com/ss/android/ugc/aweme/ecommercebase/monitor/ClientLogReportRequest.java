package com.ss.android.ugc.aweme.ecommercebase.monitor;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ClientLogReportRequest {

    @InterfaceC65349Pkn("error_code")
    public final int errorCode;

    @InterfaceC65349Pkn("error_msg")
    public final String errorMsg;

    @InterfaceC65349Pkn("scene_type")
    public final int sceneType;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ClientLogReportRequest() {
        /*
            r6 = this;
            r1 = 0
            r3 = 0
            r4 = 7
            r0 = r6
            r2 = r1
            r5 = r3
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommercebase.monitor.ClientLogReportRequest.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientLogReportRequest)) {
            return false;
        }
        ClientLogReportRequest clientLogReportRequest = (ClientLogReportRequest) obj;
        return this.sceneType == clientLogReportRequest.sceneType && this.errorCode == clientLogReportRequest.errorCode && o.LJ(this.errorMsg, clientLogReportRequest.errorMsg);
    }

    public final int hashCode() {
        int i = ((this.sceneType * 31) + this.errorCode) * 31;
        String str = this.errorMsg;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ClientLogReportRequest(sceneType=");
        LIZ.append(this.sceneType);
        LIZ.append(", errorCode=");
        LIZ.append(this.errorCode);
        LIZ.append(", errorMsg=");
        return q.LIZIZ(LIZ, this.errorMsg, ')', LIZ);
    }

    public ClientLogReportRequest(int i, int i2, String str) {
        this.sceneType = i;
        this.errorCode = i2;
        this.errorMsg = str;
    }

    public /* synthetic */ ClientLogReportRequest(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? null : str);
    }
}
