package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class OspJumpOptConfig extends F9E {

    @InterfaceC65349Pkn("address_cache_timeout_hour")
    public final int addressCacheTimeoutHour;

    @InterfaceC65349Pkn("enable")
    public final boolean enable;

    @InterfaceC65349Pkn("osp_jump_fix")
    public final boolean ospJumpFix;

    @InterfaceC65349Pkn("osp_loading_forbid_return")
    public final boolean ospLoadingForbidReturn;

    /* JADX WARN: Multi-variable type inference failed */
    public OspJumpOptConfig() {
        this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.ospJumpFix), Boolean.valueOf(this.enable), Integer.valueOf(this.addressCacheTimeoutHour), Boolean.valueOf(this.ospLoadingForbidReturn)};
    }

    public OspJumpOptConfig(boolean z, boolean z2, int i, boolean z3) {
        this.ospJumpFix = z;
        this.enable = z2;
        this.addressCacheTimeoutHour = i;
        this.ospLoadingForbidReturn = z3;
    }

    public /* synthetic */ OspJumpOptConfig(boolean z, boolean z2, int i, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? false : z3);
    }
}
