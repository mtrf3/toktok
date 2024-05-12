package com.bytedance.android.live.broadcast.mirror.message;

import X.C15C;
import X.C15D;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class DualLiveStateMessage implements C15D {

    @InterfaceC65349Pkn("duration_sec")
    public long durationSec;

    @InterfaceC65349Pkn("live_state")
    public int liveState;

    @InterfaceC65349Pkn("resume_timestamp_millsec")
    public long resumeTimestampMillSec;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DualLiveStateMessage() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.mirror.message.DualLiveStateMessage.<init>():void");
    }

    @Override // X.C15D
    public final String getMethodName() {
        return C15C.DualLiveState.getMethod();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("liveState = ");
        LIZ.append(this.liveState);
        LIZ.append(",durationSec = ");
        LIZ.append(this.durationSec);
        LIZ.append(",resumeTimestampMillSec = ");
        LIZ.append(this.resumeTimestampMillSec);
        return X1D.LIZIZ(LIZ);
    }

    public DualLiveStateMessage(int i, long j, long j2) {
        this.liveState = i;
        this.durationSec = j;
        this.resumeTimestampMillSec = j2;
    }

    public /* synthetic */ DualLiveStateMessage(int i, long j, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? 0L : j2);
    }
}
