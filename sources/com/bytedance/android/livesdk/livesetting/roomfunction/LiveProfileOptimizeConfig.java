package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LiveProfileOptimizeConfig {

    @InterfaceC65349Pkn("cache_expired_time")
    public long cacheExpiredTime;

    @InterfaceC65349Pkn("enable_cache")
    public boolean enableCache;

    @InterfaceC65349Pkn("enable_pre_pass")
    public boolean enablePrePass;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LiveProfileOptimizeConfig() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.roomfunction.LiveProfileOptimizeConfig.<init>():void");
    }

    public LiveProfileOptimizeConfig(boolean z, boolean z2, long j) {
        this.enablePrePass = z;
        this.enableCache = z2;
        this.cacheExpiredTime = j;
    }

    public /* synthetic */ LiveProfileOptimizeConfig(boolean z, boolean z2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? 6000L : j);
    }
}