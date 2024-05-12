package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LiveMatchTimeOutData {

    @InterfaceC65349Pkn("live_interact_match_inviter_extra_time")
    public int extra_time;

    @InterfaceC65349Pkn("live_interact_match_timeout_v2")
    public int timeout_v2;

    @InterfaceC65349Pkn("live_interact_match_timeout_v3")
    public int timeout_v3;

    @InterfaceC65349Pkn("live_interact_match_timeout_v4")
    public int timeout_v4;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LiveMatchTimeOutData() {
        /*
            r7 = this;
            r1 = 0
            r5 = 15
            r6 = 0
            r0 = r7
            r2 = r1
            r3 = r1
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTimeOutData.<init>():void");
    }

    public LiveMatchTimeOutData(int i, int i2, int i3, int i4) {
        this.timeout_v2 = i;
        this.timeout_v3 = i2;
        this.timeout_v4 = i3;
        this.extra_time = i4;
    }

    public /* synthetic */ LiveMatchTimeOutData(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 40 : i, (i5 & 2) != 0 ? 50 : i2, (i5 & 4) != 0 ? 60 : i3, (i5 & 8) != 0 ? 10 : i4);
    }
}
