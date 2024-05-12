package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public final class ECSkuOptimizeForShopBagSwitchConfig extends F9E {

    @InterfaceC65349Pkn("expire_duration")
    public int expireDuration;

    /* renamed from: switch, reason: not valid java name */
    @InterfaceC65349Pkn("optimize_switch")
    public boolean f20switch;

    /* JADX WARN: Multi-variable type inference failed */
    public ECSkuOptimizeForShopBagSwitchConfig() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.f20switch), Integer.valueOf(this.expireDuration)};
    }

    public ECSkuOptimizeForShopBagSwitchConfig(boolean z, int i) {
        this.f20switch = z;
        this.expireDuration = i;
    }

    public /* synthetic */ ECSkuOptimizeForShopBagSwitchConfig(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 10000 : i);
    }
}
