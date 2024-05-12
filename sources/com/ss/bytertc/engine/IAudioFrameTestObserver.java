package com.ss.bytertc.engine;

import com.ss.bytertc.engine.utils.AudioFrame;

/* loaded from: classes33.dex */
public interface IAudioFrameTestObserver {
    void onAudioRecordFrame(AudioFrame audioFrame);

    void onLocalAudioVolume(int i, int i2);

    boolean onPlayoutBufferSink(int i, AudioFrame audioFrame);
}
