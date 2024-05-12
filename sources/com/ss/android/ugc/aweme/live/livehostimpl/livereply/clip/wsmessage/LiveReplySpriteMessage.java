package com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.wsmessage;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import tikcast.api.anchor.FrameInfo;

/* loaded from: classes13.dex */
public final class LiveReplySpriteMessage extends LiveReplySocketMessage {

    @InterfaceC65349Pkn("end_time")
    public long endTime;

    @InterfaceC65349Pkn("frame_list")
    public List<FrameInfo> frameList;

    @InterfaceC65349Pkn("start_time")
    public long startTime;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveReplyClipMessagePayload(roomId=");
        LIZ.append(getRoomId());
        LIZ.append(", startTime=");
        LIZ.append(this.startTime);
        LIZ.append(", endTime=");
        LIZ.append(this.endTime);
        LIZ.append(", frameList=");
        return C1NE.LIZIZ(LIZ, this.frameList, ')', LIZ);
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final List<FrameInfo> getFrameList() {
        return this.frameList;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setFrameList(List<FrameInfo> list) {
        this.frameList = list;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }
}
