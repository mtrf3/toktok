package com.bytedance.android.livesdk.chatroom.interact.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class InviteResponse extends F9E {

    @InterfaceC65349Pkn("data")
    public LinkInRoomInviteResponse data;

    @Override // X.F9E
    public final Object[] getObjects() {
        LinkInRoomInviteResponse linkInRoomInviteResponse = this.data;
        return new Object[]{linkInRoomInviteResponse, linkInRoomInviteResponse};
    }
}
