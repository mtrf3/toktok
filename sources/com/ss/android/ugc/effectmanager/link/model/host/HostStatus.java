package com.ss.android.ugc.effectmanager.link.model.host;

import X.C48339Iy7;
import X.Q89;
import X.X1D;

/* loaded from: classes7.dex */
public class HostStatus {
    public long duration;
    public Exception exception;
    public Host host;
    public boolean isSuccess;
    public long sendTime;
    public int status;
    public String traceCode;
    public String url;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HostStatus{url='");
        Q89.LIZIZ(LIZ, this.url, '\'', ", host=");
        LIZ.append(this.host.toString());
        LIZ.append(", status=");
        LIZ.append(this.status);
        LIZ.append(", duration=");
        LIZ.append(this.duration);
        LIZ.append(", sendTime=");
        LIZ.append(this.sendTime);
        LIZ.append(", traceCode='");
        Q89.LIZIZ(LIZ, this.traceCode, '\'', ", exception=");
        LIZ.append(this.exception);
        LIZ.append(", isSuccess=");
        return C48339Iy7.LIZJ(LIZ, this.isSuccess, '}', LIZ);
    }

    public HostStatus(String str, Host host, int i, long j, long j2, String str2, Exception exc, boolean z) {
        this.url = str;
        this.host = host;
        this.status = i;
        this.duration = j;
        this.sendTime = j2;
        this.traceCode = str2;
        this.exception = exc;
        this.isSuccess = z;
    }
}
