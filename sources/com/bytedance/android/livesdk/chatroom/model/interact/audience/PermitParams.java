package com.bytedance.android.livesdk.chatroom.model.interact.audience;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class PermitParams extends F9E {

    @InterfaceC65349Pkn("effective_seconds")
    public Long effectiveSeconds;

    @InterfaceC65349Pkn("from_user_role")
    public Long fromUserRole;

    @InterfaceC65349Pkn("permit_status")
    public int permitStatus;

    @InterfaceC65349Pkn("room_id")
    public Long roomId;

    @InterfaceC65349Pkn("sec_to_user_id")
    public String secToUserId;

    @InterfaceC65349Pkn("to_user_id")
    public Long toUserId;

    @InterfaceC65349Pkn("transparent_extra")
    public String transparentExtra;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.roomId;
        Long l2 = this.toUserId;
        String str = this.secToUserId;
        Long l3 = this.fromUserRole;
        Long l4 = this.effectiveSeconds;
        String str2 = this.transparentExtra;
        return new Object[]{l, l, l2, l2, str, str, l3, l3, l4, l4, str2, str2, Integer.valueOf(this.permitStatus)};
    }
}
