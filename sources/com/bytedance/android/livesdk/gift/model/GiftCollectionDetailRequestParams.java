package com.bytedance.android.livesdk.gift.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes16.dex */
public final class GiftCollectionDetailRequestParams extends F9E {

    @InterfaceC65349Pkn("anchor_id")
    public Long anchorId;

    @InterfaceC65349Pkn("gift_id")
    public Long giftId;

    @InterfaceC65349Pkn("room_id")
    public Long roomId;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.giftId;
        Long l2 = this.anchorId;
        Long l3 = this.roomId;
        return new Object[]{l, l, l2, l2, l3, l3};
    }
}
