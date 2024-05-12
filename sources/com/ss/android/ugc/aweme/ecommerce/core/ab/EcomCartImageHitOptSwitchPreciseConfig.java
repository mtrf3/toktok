package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class EcomCartImageHitOptSwitchPreciseConfig extends F9E {

    @InterfaceC65349Pkn("cart_product_border_width")
    public final double cartProductBorderWidth;

    @InterfaceC65349Pkn("cart_product_width")
    public final double cartProductWidth;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EcomCartImageHitOptSwitchPreciseConfig() {
        /*
            r7 = this;
            r1 = 0
            r5 = 3
            r6 = 0
            r0 = r7
            r3 = r1
            r0.<init>(r1, r3, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.core.ab.EcomCartImageHitOptSwitchPreciseConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Double.valueOf(this.cartProductWidth), Double.valueOf(this.cartProductBorderWidth)};
    }

    public EcomCartImageHitOptSwitchPreciseConfig(double d, double d2) {
        this.cartProductWidth = d;
        this.cartProductBorderWidth = d2;
    }

    public /* synthetic */ EcomCartImageHitOptSwitchPreciseConfig(double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 96.0d : d, (i & 2) != 0 ? 0.5d : d2);
    }
}
