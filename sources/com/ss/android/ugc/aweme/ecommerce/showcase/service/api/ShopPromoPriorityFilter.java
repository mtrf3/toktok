package com.ss.android.ugc.aweme.ecommerce.showcase.service.api;

import X.EnumC46456ILc;
import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ShopPromoPriorityFilter extends F9E {

    @InterfaceC65349Pkn("filter_type")
    public final int filterType;

    @InterfaceC65349Pkn("voucher_type_id")
    public final String voucherTypeId;

    /* JADX WARN: Multi-variable type inference failed */
    public ShopPromoPriorityFilter() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.filterType), this.voucherTypeId};
    }

    public ShopPromoPriorityFilter(int i, String voucherTypeId) {
        o.LJIIIZ(voucherTypeId, "voucherTypeId");
        this.filterType = i;
        this.voucherTypeId = voucherTypeId;
    }

    public /* synthetic */ ShopPromoPriorityFilter(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? EnumC46456ILc.UNKNOWN.getValue() : i, (i2 & 2) != 0 ? "" : str);
    }
}
