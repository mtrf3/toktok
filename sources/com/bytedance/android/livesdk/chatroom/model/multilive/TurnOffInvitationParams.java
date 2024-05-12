package com.bytedance.android.livesdk.chatroom.model.multilive;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class TurnOffInvitationParams extends F9E {

    @InterfaceC65349Pkn("room_id")
    public Long roomId;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.roomId;
        return new Object[]{l, l};
    }
}
