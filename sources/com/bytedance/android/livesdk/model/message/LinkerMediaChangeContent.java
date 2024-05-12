package com.bytedance.android.livesdk.model.message;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class LinkerMediaChangeContent extends F9E {

    @InterfaceC65349Pkn("anchor_id")
    public Long anchorId;

    @InterfaceC65349Pkn("change_scene")
    public int changeScene;

    @InterfaceC65349Pkn("op")
    public int op;

    @InterfaceC65349Pkn("room_id")
    public Long roomId;

    @InterfaceC65349Pkn("to_user_id")
    public Long toUserId;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.toUserId;
        Long l2 = this.anchorId;
        Long l3 = this.roomId;
        return new Object[]{Integer.valueOf(this.op), l, l, l2, l2, l3, l3};
    }
}
