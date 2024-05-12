package com.bytedance.android.livesdk.game.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes17.dex */
public final class GameInvite extends F9E {

    @InterfaceC65349Pkn("create_time")
    public Long createTime;

    @InterfaceC65349Pkn("expire_time")
    public Long expireTime;

    @InterfaceC65349Pkn("id")
    public Long id;

    @InterfaceC65349Pkn("id_str")
    public String idStr;

    @InterfaceC65349Pkn("kind")
    public Long kind;

    @InterfaceC65349Pkn("now_time")
    public Long nowTime;

    @InterfaceC65349Pkn("room_id")
    public Long roomId;

    @InterfaceC65349Pkn("status")
    public Long status;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.id;
        Long l2 = this.kind;
        Long l3 = this.createTime;
        Long l4 = this.nowTime;
        Long l5 = this.expireTime;
        Long l6 = this.status;
        Long l7 = this.roomId;
        String str = this.idStr;
        return new Object[]{l, l, l2, l2, l3, l3, l4, l4, l5, l5, l6, l6, l7, l7, str, str};
    }
}
