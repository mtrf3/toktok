package com.ss.android.ugc.aweme.ecommerce.anchor.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class AnchorECSaleMode extends F9E {

    @InterfaceC65349Pkn("has_non_self_product")
    public final boolean hasNonSelfProduct;

    @InterfaceC65349Pkn("has_self_product")
    public final boolean hasSelfProduct;

    @InterfaceC65349Pkn("if_bc_whitelist")
    public final boolean isBcWhiteList;

    @InterfaceC65349Pkn("if_self_sale")
    public final boolean isSelfMode;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AnchorECSaleMode() {
        /*
            r7 = this;
            r1 = 0
            r5 = 15
            r6 = 0
            r0 = r7
            r2 = r1
            r3 = r1
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.model.AnchorECSaleMode.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.isSelfMode), Boolean.valueOf(this.hasSelfProduct), Boolean.valueOf(this.hasNonSelfProduct), Boolean.valueOf(this.isBcWhiteList)};
    }

    public AnchorECSaleMode(boolean z, boolean z2, boolean z3, boolean z4) {
        this.isSelfMode = z;
        this.hasSelfProduct = z2;
        this.hasNonSelfProduct = z3;
        this.isBcWhiteList = z4;
    }

    public /* synthetic */ AnchorECSaleMode(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4);
    }
}
