package com.bytedance.android.livesdk.model.message;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class LinkerCreateContent extends F9E {

    @InterfaceC65349Pkn("link_type")
    public Long linkType;

    @InterfaceC65349Pkn("owner_id")
    public Long ownerId;

    @InterfaceC65349Pkn("owner_room_id")
    public Long ownerRoomId;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.ownerId;
        Long l2 = this.ownerRoomId;
        Long l3 = this.linkType;
        return new Object[]{l, l, l2, l2, l3, l3};
    }
}
