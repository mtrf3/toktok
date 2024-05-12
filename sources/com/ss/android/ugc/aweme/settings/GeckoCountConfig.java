package com.ss.android.ugc.aweme.settings;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class GeckoCountConfig extends F9E {

    @InterfaceC65349Pkn("ad_landing_page_preload_cache_count")
    public final int h5PageGeckoCacheCount;

    @InterfaceC65349Pkn("ad_lynx_page_preload_cache_count")
    public final int lynxPageGeckoCacheCount;

    @InterfaceC65349Pkn("ad_splash_page_preload_cache_count")
    public final int splashPageGeckoCacheCount;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GeckoCountConfig() {
        /*
            r6 = this;
            r1 = 0
            r4 = 7
            r5 = 0
            r0 = r6
            r2 = r1
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.settings.GeckoCountConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.h5PageGeckoCacheCount), Integer.valueOf(this.splashPageGeckoCacheCount), Integer.valueOf(this.lynxPageGeckoCacheCount)};
    }

    public GeckoCountConfig(int i, int i2, int i3) {
        this.h5PageGeckoCacheCount = i;
        this.splashPageGeckoCacheCount = i2;
        this.lynxPageGeckoCacheCount = i3;
    }

    public /* synthetic */ GeckoCountConfig(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
