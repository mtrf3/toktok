package com.bytedance.android.livesdk.chatroom.model.interact.audience;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class GetSettingsParams extends F9E {

    @InterfaceC65349Pkn("get_ab_params")
    public Boolean getAbParams;

    @InterfaceC65349Pkn("owner_id")
    public Long ownerId;

    @InterfaceC65349Pkn("room_id")
    public Long roomId;

    @InterfaceC65349Pkn("sec_owner_id")
    public String secOwnerId;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.roomId;
        String str = this.secOwnerId;
        Long l2 = this.ownerId;
        Boolean bool = this.getAbParams;
        return new Object[]{l, l, str, str, l2, l2, bool, bool};
    }
}
