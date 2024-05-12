package com.ss.bytertc.engine;

import com.ss.bytertc.engine.data.RemoteStreamKey;
import com.ss.bytertc.engine.utils.IAudioFrame;

/* loaded from: classes33.dex */
public interface IAudioFrameObserver {
    void onMixedAudioFrame(IAudioFrame iAudioFrame);

    void onPlaybackAudioFrame(IAudioFrame iAudioFrame);

    void onRecordAudioFrame(IAudioFrame iAudioFrame);

    void onRemoteUserAudioFrame(RemoteStreamKey remoteStreamKey, IAudioFrame iAudioFrame);
}
