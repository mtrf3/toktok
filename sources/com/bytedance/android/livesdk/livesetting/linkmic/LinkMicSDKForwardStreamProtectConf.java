package com.bytedance.android.livesdk.livesetting.linkmic;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LinkMicSDKForwardStreamProtectConf {

    @InterfaceC65349Pkn("enable_miss_push")
    public boolean enableMissPush;

    @InterfaceC65349Pkn("enable_push_more")
    public boolean enablePushMore;

    @InterfaceC65349Pkn("push_more_timer_interval")
    public long pushMoreTimerInterval;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LinkMicSDKForwardStreamProtectConf() {
        /*
            r7 = this;
            r1 = 0
            r3 = 0
            r5 = 7
            r6 = 0
            r0 = r7
            r2 = r1
            r0.<init>(r1, r2, r3, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSDKForwardStreamProtectConf.<init>():void");
    }

    public LinkMicSDKForwardStreamProtectConf(boolean z, boolean z2, long j) {
        this.enableMissPush = z;
        this.enablePushMore = z2;
        this.pushMoreTimerInterval = j;
    }

    public /* synthetic */ LinkMicSDKForwardStreamProtectConf(boolean z, boolean z2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? 20L : j);
    }
}
