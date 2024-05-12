package com.bytedance.android.livesdk.chatroom.interact.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes16.dex */
public final class InitParams extends F9E {

    @InterfaceC65349Pkn("layout")
    public Long layout;

    @InterfaceC65349Pkn("linkmic_layout")
    public Long linkmicLayout;

    @InterfaceC65349Pkn("linkmic_vendor")
    public Long linkmicVendor;

    @InterfaceC65349Pkn("room_id")
    public Long roomId;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.roomId;
        Long l2 = this.linkmicVendor;
        Long l3 = this.linkmicLayout;
        Long l4 = this.layout;
        return new Object[]{l, l, l2, l2, l3, l3, l4, l4};
    }
}
