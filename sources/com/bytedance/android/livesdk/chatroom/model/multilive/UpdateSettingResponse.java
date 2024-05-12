package com.bytedance.android.livesdk.chatroom.model.multilive;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class UpdateSettingResponse extends F9E {

    @InterfaceC65349Pkn("data")
    public UpdateRoomLayoutSettings data;

    @InterfaceC65349Pkn("extra")
    public Extra extra;

    /* loaded from: classes14.dex */
    public static final class Extra {

        @InterfaceC65349Pkn("now")
        public long now;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        UpdateRoomLayoutSettings updateRoomLayoutSettings = this.data;
        return new Object[]{updateRoomLayoutSettings, updateRoomLayoutSettings};
    }
}
