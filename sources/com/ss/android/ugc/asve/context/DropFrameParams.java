package com.ss.android.ugc.asve.context;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class DropFrameParams extends F9E implements Serializable {

    @InterfaceC65349Pkn("delay_time")
    public final long delayTime;

    @InterfaceC65349Pkn("is_set_params")
    public final boolean isSetParams;

    @InterfaceC65349Pkn("max_drop_count")
    public final long maxDropCount;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DropFrameParams() {
        /*
            r8 = this;
            r1 = 0
            r2 = 0
            r6 = 7
            r7 = 0
            r0 = r8
            r4 = r2
            r0.<init>(r1, r2, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.asve.context.DropFrameParams.<init>():void");
    }

    public static /* synthetic */ DropFrameParams copy$default(DropFrameParams dropFrameParams, boolean z, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = dropFrameParams.isSetParams;
        }
        if ((i & 2) != 0) {
            j = dropFrameParams.delayTime;
        }
        if ((i & 4) != 0) {
            j2 = dropFrameParams.maxDropCount;
        }
        return dropFrameParams.copy(z, j, j2);
    }

    public final DropFrameParams copy(boolean z, long j, long j2) {
        return new DropFrameParams(z, j, j2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.isSetParams), Long.valueOf(this.delayTime), Long.valueOf(this.maxDropCount)};
    }

    public final long getDelayTime() {
        return this.delayTime;
    }

    public final long getMaxDropCount() {
        return this.maxDropCount;
    }

    public final boolean isSetParams() {
        return this.isSetParams;
    }

    public DropFrameParams(boolean z, long j, long j2) {
        this.isSetParams = z;
        this.delayTime = j;
        this.maxDropCount = j2;
    }

    public /* synthetic */ DropFrameParams(boolean z, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 33333L : j, (i & 4) != 0 ? 16L : j2);
    }
}
