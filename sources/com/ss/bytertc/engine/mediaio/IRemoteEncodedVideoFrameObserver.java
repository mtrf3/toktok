package com.ss.bytertc.engine.mediaio;

import com.ss.bytertc.engine.data.RemoteStreamKey;

/* loaded from: classes33.dex */
public abstract class IRemoteEncodedVideoFrameObserver {
    public abstract void onRemoteEncodedVideoFrame(RemoteStreamKey remoteStreamKey, RTCEncodedVideoFrame rTCEncodedVideoFrame);
}
