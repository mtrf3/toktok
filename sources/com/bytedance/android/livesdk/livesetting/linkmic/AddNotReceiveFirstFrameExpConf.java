package com.bytedance.android.livesdk.livesetting.linkmic;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class AddNotReceiveFirstFrameExpConf {

    @InterfaceC65349Pkn("enable")
    public boolean enable;

    @InterfaceC65349Pkn("report_when_not_reach_frame_linked")
    public boolean reportWhenNotReachFrameLinked;

    @InterfaceC65349Pkn("time_out")
    public long timeOUt;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AddNotReceiveFirstFrameExpConf() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.linkmic.AddNotReceiveFirstFrameExpConf.<init>():void");
    }

    public AddNotReceiveFirstFrameExpConf(boolean z, long j, boolean z2) {
        this.enable = z;
        this.timeOUt = j;
        this.reportWhenNotReachFrameLinked = z2;
    }

    public /* synthetic */ AddNotReceiveFirstFrameExpConf(boolean z, long j, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? 180L : j, (i & 4) != 0 ? true : z2);
    }
}
