package com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.api;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class SaleMode extends F9E {

    @InterfaceC65349Pkn("if_self_sale")
    public final boolean selfSale;

    public SaleMode() {
        this(false, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.selfSale)};
    }

    public SaleMode(boolean z) {
        this.selfSale = z;
    }

    public /* synthetic */ SaleMode(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
