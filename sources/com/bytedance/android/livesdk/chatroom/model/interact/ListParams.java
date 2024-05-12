package com.bytedance.android.livesdk.chatroom.model.interact;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes17.dex */
public final class ListParams extends F9E {

    @InterfaceC65349Pkn("anchor_id")
    public Long anchorId;

    @InterfaceC65349Pkn("count")
    public Long count;

    @InterfaceC65349Pkn("enable_pagination")
    public Boolean enablePagination;

    @InterfaceC65349Pkn("link_status")
    public Long linkStatus;

    @InterfaceC65349Pkn("link_type")
    public Long linkType;

    @InterfaceC65349Pkn("modify_time_after")
    public Long modifyTimeAfter;

    @InterfaceC65349Pkn("offset")
    public Long offset;

    @InterfaceC65349Pkn("room_id")
    public Long roomId;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.roomId;
        Long l2 = this.linkStatus;
        Long l3 = this.offset;
        Long l4 = this.count;
        Long l5 = this.anchorId;
        Long l6 = this.linkType;
        Boolean bool = this.enablePagination;
        Long l7 = this.modifyTimeAfter;
        return new Object[]{l, l, l2, l2, l3, l3, l4, l4, l5, l5, l6, l6, bool, bool, l7, l7};
    }
}
