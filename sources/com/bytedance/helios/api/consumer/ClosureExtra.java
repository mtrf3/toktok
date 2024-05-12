package com.bytedance.helios.api.consumer;

import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes12.dex */
public final class ClosureExtra extends F9E {
    public final long callCloseTime;
    public long realCloseTime;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ClosureExtra() {
        /*
            r7 = this;
            r1 = 0
            r5 = 3
            r6 = 0
            r0 = r7
            r3 = r1
            r0.<init>(r1, r3, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.api.consumer.ClosureExtra.<init>():void");
    }

    public static /* synthetic */ ClosureExtra copy$default(ClosureExtra closureExtra, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = closureExtra.callCloseTime;
        }
        if ((i & 2) != 0) {
            j2 = closureExtra.realCloseTime;
        }
        return closureExtra.copy(j, j2);
    }

    public final ClosureExtra copy(long j, long j2) {
        return new ClosureExtra(j, j2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.callCloseTime), Long.valueOf(this.realCloseTime)};
    }

    public final long getCallCloseTime() {
        return this.callCloseTime;
    }

    public final long getRealCloseTime() {
        return this.realCloseTime;
    }

    public final void setRealCloseTime(long j) {
        this.realCloseTime = j;
    }

    public ClosureExtra(long j, long j2) {
        this.callCloseTime = j;
        this.realCloseTime = j2;
    }

    public /* synthetic */ ClosureExtra(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2);
    }
}
