package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class PdpLynxPreloadItem extends F9E {

    @InterfaceC65349Pkn("preload_duration")
    public final int duration;

    @InterfaceC65349Pkn("enable_preload")
    public final boolean enablePreload;

    /* JADX WARN: Multi-variable type inference failed */
    public PdpLynxPreloadItem() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enablePreload), Integer.valueOf(this.duration)};
    }

    public PdpLynxPreloadItem(boolean z, int i) {
        this.enablePreload = z;
        this.duration = i;
    }

    public /* synthetic */ PdpLynxPreloadItem(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 1000 : i);
    }
}
