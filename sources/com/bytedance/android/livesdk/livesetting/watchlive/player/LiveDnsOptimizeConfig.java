package com.bytedance.android.livesdk.livesetting.watchlive.player;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LiveDnsOptimizeConfig {

    @InterfaceC65349Pkn("check_host_count")
    public int checkHostCount;

    @InterfaceC65349Pkn("enable_check_dns")
    public int enableCheckDns;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LiveDnsOptimizeConfig() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.watchlive.player.LiveDnsOptimizeConfig.<init>():void");
    }

    public LiveDnsOptimizeConfig(int i, int i2) {
        this.enableCheckDns = i;
        this.checkHostCount = i2;
    }

    public /* synthetic */ LiveDnsOptimizeConfig(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
