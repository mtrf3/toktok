package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class GuaranteeConfig extends F9E {

    @InterfaceC65349Pkn("ec_payment_ccdc_popup")
    public final boolean ccdcPopup;

    @InterfaceC65349Pkn("ec_payment_guarantee_info")
    public final boolean enableGuarantee;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GuaranteeConfig() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.core.ab.GuaranteeConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enableGuarantee), Boolean.valueOf(this.ccdcPopup)};
    }

    public GuaranteeConfig(boolean z, boolean z2) {
        this.enableGuarantee = z;
        this.ccdcPopup = z2;
    }

    public /* synthetic */ GuaranteeConfig(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
