package com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.wsmessage;

import X.C47135Ieh;
import X.InterfaceC65349Pkn;
import X.X1D;

/* loaded from: classes13.dex */
public final class LiveReplyClipFinishedMessage extends LiveReplySocketMessage {

    @InterfaceC65349Pkn("fragment_id")
    public long fragmentId;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveReplyClipFinishedMessage(roomId=");
        LIZ.append(getRoomId());
        LIZ.append(", fragment_id=");
        return C47135Ieh.LIZIZ(LIZ, this.fragmentId, ')', LIZ);
    }

    public final long getFragmentId() {
        return this.fragmentId;
    }

    public final void setFragmentId(long j) {
        this.fragmentId = j;
    }
}
