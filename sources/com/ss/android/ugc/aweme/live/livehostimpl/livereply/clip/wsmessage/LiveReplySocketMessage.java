package com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.wsmessage;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes13.dex */
public abstract class LiveReplySocketMessage implements Serializable {

    @InterfaceC65349Pkn("room_id")
    public long roomId;

    public final long getRoomId() {
        return this.roomId;
    }

    public final void setRoomId(long j) {
        this.roomId = j;
    }
}
