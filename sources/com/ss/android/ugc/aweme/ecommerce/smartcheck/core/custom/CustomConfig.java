package com.ss.android.ugc.aweme.ecommerce.smartcheck.core.custom;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class CustomConfig extends F9E {

    @InterfaceC65349Pkn("enable")
    public final boolean enable;

    public CustomConfig() {
        this(false, 1, null);
    }

    public static /* synthetic */ CustomConfig copy$default(CustomConfig customConfig, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = customConfig.enable;
        }
        return customConfig.copy(z);
    }

    public final CustomConfig copy(boolean z) {
        return new CustomConfig(z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enable)};
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public CustomConfig(boolean z) {
        this.enable = z;
    }

    public /* synthetic */ CustomConfig(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
