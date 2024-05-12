package com.bytedance.android.livesdk.sei;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class SeiLiveShowExtra extends F9E {

    @InterfaceC65349Pkn("each_show_duration")
    public int eachShowDuration;

    @InterfaceC65349Pkn("show_id")
    public long showId;

    @InterfaceC65349Pkn("show_status")
    public int showStatus;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SeiLiveShowExtra() {
        /*
            r7 = this;
            r1 = 0
            r2 = 0
            r5 = 7
            r6 = 0
            r0 = r7
            r4 = r1
            r0.<init>(r1, r2, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.sei.SeiLiveShowExtra.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.eachShowDuration), Long.valueOf(this.showId), Integer.valueOf(this.showStatus)};
    }

    public SeiLiveShowExtra(int i, long j, int i2) {
        this.eachShowDuration = i;
        this.showId = j;
        this.showStatus = i2;
    }

    public /* synthetic */ SeiLiveShowExtra(int i, long j, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0L : j, (i3 & 4) != 0 ? 0 : i2);
    }
}
