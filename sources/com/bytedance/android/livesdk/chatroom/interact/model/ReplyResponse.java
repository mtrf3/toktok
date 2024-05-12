package com.bytedance.android.livesdk.chatroom.interact.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class ReplyResponse extends F9E {

    @InterfaceC65349Pkn("data")
    public LinkInRoomReplyResponse data;

    @Override // X.F9E
    public final Object[] getObjects() {
        LinkInRoomReplyResponse linkInRoomReplyResponse = this.data;
        return new Object[]{linkInRoomReplyResponse, linkInRoomReplyResponse};
    }
}
