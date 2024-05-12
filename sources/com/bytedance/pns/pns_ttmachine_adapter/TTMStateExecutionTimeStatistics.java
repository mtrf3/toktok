package com.bytedance.pns.pns_ttmachine_adapter;

import X.X1D;
import defpackage.b0;

/* loaded from: classes10.dex */
public class TTMStateExecutionTimeStatistics {
    public final int callBdiTotalTime;
    public final int callJniMethodTime;
    public final int callUsrBdiTotalTime;
    public final long cuid;
    public final int runEngineTotalTime;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TTMStateExecutionTimeStatistics{cuid=");
        LIZ.append(this.cuid);
        LIZ.append(", runEngineTotalTime=");
        LIZ.append(this.runEngineTotalTime);
        LIZ.append(", callBdiTotalTime=");
        LIZ.append(this.callBdiTotalTime);
        LIZ.append(", callUsrBdiTotalTime=");
        LIZ.append(this.callUsrBdiTotalTime);
        LIZ.append(", callJniMethodTime=");
        return b0.LIZJ(LIZ, this.callJniMethodTime, '}', LIZ);
    }

    public int getCallBdiTotalTime() {
        return this.callBdiTotalTime;
    }

    public int getCallJniMethodTime() {
        return this.callJniMethodTime;
    }

    public int getCallUsrBdiTotalTime() {
        return this.callUsrBdiTotalTime;
    }

    public long getCuid() {
        return this.cuid;
    }

    public int getRunEngineTotalTime() {
        return this.runEngineTotalTime;
    }

    public TTMStateExecutionTimeStatistics(long j, int i, int i2, int i3, int i4) {
        this.cuid = j;
        this.runEngineTotalTime = i;
        this.callBdiTotalTime = i2;
        this.callUsrBdiTotalTime = i3;
        this.callJniMethodTime = i4;
    }
}
