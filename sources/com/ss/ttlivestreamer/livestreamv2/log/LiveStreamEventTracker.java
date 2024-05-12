package com.ss.ttlivestreamer.livestreamv2.log;

/* loaded from: classes12.dex */
public class LiveStreamEventTracker {
    public LiveStreamConnectResultEventResult mConnectResultEventResult;
    public LiveStreamConnectResultEventSource mConnectResultEventSource;

    public LiveStreamConnectResultEventResult getConnectResultEventResult() {
        return this.mConnectResultEventResult;
    }

    public LiveStreamConnectResultEventSource getConnectResultEventSource() {
        return this.mConnectResultEventSource;
    }

    public void createRtmpConnectBySource(LiveStreamConnectResultEventSource liveStreamConnectResultEventSource) {
        this.mConnectResultEventSource = liveStreamConnectResultEventSource;
    }

    public void handleRtmpConnectResult(LiveStreamConnectResultEventResult liveStreamConnectResultEventResult) {
        this.mConnectResultEventResult = liveStreamConnectResultEventResult;
    }
}
