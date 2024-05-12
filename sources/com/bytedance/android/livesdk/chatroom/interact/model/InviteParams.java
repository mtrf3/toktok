package com.bytedance.android.livesdk.chatroom.interact.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes17.dex */
public final class InviteParams extends F9E {

    @InterfaceC65349Pkn("effective_seconds")
    public Long effectiveSeconds;

    @InterfaceC65349Pkn("invitation_mic_idx")
    public Long invitationMicIdx;

    @InterfaceC65349Pkn("room_id")
    public Long roomId;

    @InterfaceC65349Pkn("to_user_id")
    public Long toUserId;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.roomId;
        Long l2 = this.toUserId;
        Long l3 = this.effectiveSeconds;
        Long l4 = this.invitationMicIdx;
        return new Object[]{l, l, l2, l2, l3, l3, l4, l4};
    }
}
