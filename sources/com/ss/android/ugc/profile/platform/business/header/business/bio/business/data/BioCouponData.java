package com.ss.android.ugc.profile.platform.business.header.business.bio.business.data;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.commerce.CouponInfo;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import java.util.List;

/* loaded from: classes5.dex */
public final class BioCouponData extends BizBaseData {

    @InterfaceC65349Pkn("coupon_list")
    public List<CouponInfo> couponList;

    public final List<CouponInfo> getCouponList() {
        return this.couponList;
    }

    public final void setCouponList(List<CouponInfo> list) {
        this.couponList = list;
    }
}
