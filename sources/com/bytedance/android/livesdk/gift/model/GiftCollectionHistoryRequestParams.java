package com.bytedance.android.livesdk.gift.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes17.dex */
public final class GiftCollectionHistoryRequestParams extends F9E {

    @InterfaceC65349Pkn("anchor_id")
    public Long anchorId;

    @InterfaceC65349Pkn("gift_id")
    public Long giftId;

    @InterfaceC65349Pkn("offset")
    public Long offset;

    @InterfaceC65349Pkn("room_id")
    public Long roomId;

    @InterfaceC65349Pkn("size")
    public Long size;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.giftId;
        Long l2 = this.anchorId;
        Long l3 = this.roomId;
        Long l4 = this.offset;
        Long l5 = this.size;
        return new Object[]{l, l, l2, l2, l3, l3, l4, l4, l5, l5};
    }
}
