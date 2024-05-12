package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class AddressSearchMapConfig extends F9E {

    @InterfaceC65349Pkn("is_enable")
    public final boolean isEnable;

    @InterfaceC65349Pkn("pin_movable")
    public final boolean pinMovable;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AddressSearchMapConfig() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.core.ab.AddressSearchMapConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.isEnable), Boolean.valueOf(this.pinMovable)};
    }

    public AddressSearchMapConfig(boolean z, boolean z2) {
        this.isEnable = z;
        this.pinMovable = z2;
    }

    public /* synthetic */ AddressSearchMapConfig(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
