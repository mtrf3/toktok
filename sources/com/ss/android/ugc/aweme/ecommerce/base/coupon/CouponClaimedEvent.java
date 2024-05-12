package com.ss.android.ugc.aweme.ecommerce.base.coupon;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherInfoNew;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class CouponClaimedEvent {

    @InterfaceC65349Pkn("voucher_info_list")
    public final List<VoucherInfoNew> voucherIds;

    @InterfaceC65349Pkn("voucher_type")
    public final Integer voucherType;

    public CouponClaimedEvent(List<VoucherInfoNew> list, Integer num) {
        this.voucherIds = list;
        this.voucherType = num;
    }

    public /* synthetic */ CouponClaimedEvent(List list, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? 1 : num);
    }
}
