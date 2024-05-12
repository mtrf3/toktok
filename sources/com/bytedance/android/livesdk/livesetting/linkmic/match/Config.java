package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class Config {

    @InterfaceC65349Pkn("live_match_half_rtt_limit")
    public long live_match_half_rtt_limit;

    @InterfaceC65349Pkn("live_match_start_time_anchor_opt")
    public boolean live_match_start_time_anchor_opt;

    @InterfaceC65349Pkn("live_match_start_time_opt")
    public boolean live_match_start_time_opt;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Config() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.linkmic.match.Config.<init>():void");
    }

    public Config(boolean z, boolean z2, long j) {
        this.live_match_start_time_opt = z;
        this.live_match_start_time_anchor_opt = z2;
        this.live_match_half_rtt_limit = j;
    }

    public /* synthetic */ Config(boolean z, boolean z2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? 2000L : j);
    }
}
