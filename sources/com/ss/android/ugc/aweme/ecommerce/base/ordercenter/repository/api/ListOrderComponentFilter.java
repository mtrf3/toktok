package com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.api;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class ListOrderComponentFilter extends F9E {

    @InterfaceC65349Pkn("status")
    public final int status;

    public ListOrderComponentFilter() {
        this(0, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.status)};
    }

    public ListOrderComponentFilter(int i) {
        this.status = i;
    }

    public /* synthetic */ ListOrderComponentFilter(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
