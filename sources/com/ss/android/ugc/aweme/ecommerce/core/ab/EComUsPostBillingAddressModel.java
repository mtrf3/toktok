package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class EComUsPostBillingAddressModel extends F9E {

    @InterfaceC65349Pkn("ecom_us_post_ba_full_page")
    public final boolean baFullPage;

    @InterfaceC65349Pkn("ecom_us_post_ba_interactive")
    public final boolean baInteractive;

    @InterfaceC65349Pkn("ecom_us_post_osp")
    public final boolean osp;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EComUsPostBillingAddressModel() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.core.ab.EComUsPostBillingAddressModel.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.baFullPage), Boolean.valueOf(this.baInteractive), Boolean.valueOf(this.osp)};
    }

    public EComUsPostBillingAddressModel(boolean z, boolean z2, boolean z3) {
        this.baFullPage = z;
        this.baInteractive = z2;
        this.osp = z3;
    }

    public /* synthetic */ EComUsPostBillingAddressModel(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }
}
