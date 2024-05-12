package com.bytedance.helios.sdk.signal;

import X.InterfaceC65349Pkn;

/* loaded from: classes12.dex */
public class ClosureSignal extends Signal {

    @InterfaceC65349Pkn("hash")
    public long targetObjectHashCode;

    public long getTargetObjectHashCode() {
        return this.targetObjectHashCode;
    }

    public void setTargetObjectHashCode(long j) {
        this.targetObjectHashCode = j;
    }

    public ClosureSignal(String str, long j) {
        super(str);
        this.targetObjectHashCode = j;
    }

    public ClosureSignal(String str, long j, long j2) {
        super(str, j);
        this.targetObjectHashCode = j2;
    }
}
