package com.ss.android.ugc.aweme.ab;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public final class PullStreamSyncConfig extends F9E {

    @InterfaceC65349Pkn("delay")
    public final long delayTime;

    @InterfaceC65349Pkn("stream_keep_time")
    public final long streamKeepTime;

    @InterfaceC65349Pkn("sync")
    public final boolean sync;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PullStreamSyncConfig() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ab.PullStreamSyncConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.sync), Long.valueOf(this.streamKeepTime), Long.valueOf(this.delayTime)};
    }

    public PullStreamSyncConfig(boolean z, long j, long j2) {
        this.sync = z;
        this.streamKeepTime = j;
        this.delayTime = j2;
    }

    public /* synthetic */ PullStreamSyncConfig(boolean z, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? 0L : j2);
    }
}
