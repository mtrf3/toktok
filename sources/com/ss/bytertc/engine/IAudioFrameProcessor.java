package com.ss.bytertc.engine;

import com.ss.bytertc.engine.data.RemoteStreamKey;
import com.ss.bytertc.engine.utils.IAudioFrame;

/* loaded from: classes33.dex */
public interface IAudioFrameProcessor {
    int onProcessEarMonitorAudioFrame(IAudioFrame iAudioFrame);

    int onProcessPlayBackAudioFrame(IAudioFrame iAudioFrame);

    int onProcessRecordAudioFrame(IAudioFrame iAudioFrame);

    int onProcessRemoteUserAudioFrame(RemoteStreamKey remoteStreamKey, IAudioFrame iAudioFrame);

    int onProcessScreenAudioFrame(IAudioFrame iAudioFrame);
}
