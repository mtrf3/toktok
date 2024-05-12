package com.ss.avframework.livestreamv2.core.interact.livertc;

import com.ss.bytertc.engine.RTCStream;
import com.ss.bytertc.engine.type.StreamRemoveReason;

/* loaded from: classes12.dex */
public interface ILiveRtcEventObserver {
    void onStreamAdd(RTCStream rTCStream);

    void onStreamRemove(RTCStream rTCStream, StreamRemoveReason streamRemoveReason);
}
