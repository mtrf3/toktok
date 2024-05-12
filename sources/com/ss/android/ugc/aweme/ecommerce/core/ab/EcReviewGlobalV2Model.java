package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class EcReviewGlobalV2Model extends F9E {

    @InterfaceC65349Pkn("enable")
    public final int enable;

    public EcReviewGlobalV2Model() {
        this(0, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.enable)};
    }

    public EcReviewGlobalV2Model(int i) {
        this.enable = i;
    }

    public /* synthetic */ EcReviewGlobalV2Model(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
