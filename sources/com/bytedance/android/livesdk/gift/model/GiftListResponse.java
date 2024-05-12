package com.bytedance.android.livesdk.gift.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.service.model.GiftListExtra;

/* loaded from: classes14.dex */
public final class GiftListResponse extends F9E {

    @InterfaceC65349Pkn("data")
    public GiftListResult data;

    @InterfaceC65349Pkn("extra")
    public GiftListExtra extra;

    @Override // X.F9E
    public final Object[] getObjects() {
        GiftListResult giftListResult = this.data;
        GiftListExtra giftListExtra = this.extra;
        return new Object[]{giftListResult, giftListResult, giftListExtra, giftListExtra};
    }
}
