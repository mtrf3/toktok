package com.ss.android.ugc.aweme.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class EcomProfileSettingPreciseConfig extends F9E {

    @InterfaceC65349Pkn("preload_enable")
    public final boolean preloadEnable;

    @InterfaceC65349Pkn("profile_enable")
    public final boolean profileEnable;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EcomProfileSettingPreciseConfig() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.experiment.EcomProfileSettingPreciseConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.profileEnable), Boolean.valueOf(this.preloadEnable)};
    }

    public EcomProfileSettingPreciseConfig(boolean z, boolean z2) {
        this.profileEnable = z;
        this.preloadEnable = z2;
    }

    public /* synthetic */ EcomProfileSettingPreciseConfig(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
