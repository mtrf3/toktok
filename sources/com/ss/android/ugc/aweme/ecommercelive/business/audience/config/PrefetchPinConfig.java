package com.ss.android.ugc.aweme.ecommercelive.business.audience.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class PrefetchPinConfig extends F9E {

    @InterfaceC65349Pkn("is_enabled")
    public final boolean isEnabled;

    @InterfaceC65349Pkn("is_sync")
    public final boolean isSync;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PrefetchPinConfig() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommercelive.business.audience.config.PrefetchPinConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.isEnabled), Boolean.valueOf(this.isSync)};
    }

    public PrefetchPinConfig(boolean z, boolean z2) {
        this.isEnabled = z;
        this.isSync = z2;
    }

    public /* synthetic */ PrefetchPinConfig(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
