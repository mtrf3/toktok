package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class AddonRecomOptConfig extends F9E {

    @InterfaceC65349Pkn("enable_addon_recom_opt")
    public int enableAddonRecommOpt;

    public AddonRecomOptConfig() {
        this(0, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.enableAddonRecommOpt)};
    }

    public AddonRecomOptConfig(int i) {
        this.enableAddonRecommOpt = i;
    }

    public /* synthetic */ AddonRecomOptConfig(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
