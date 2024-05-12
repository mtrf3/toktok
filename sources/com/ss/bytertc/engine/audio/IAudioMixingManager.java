package com.ss.bytertc.engine.audio;

import com.ss.bytertc.engine.IAudioFileFrameObserver;
import com.ss.bytertc.engine.data.AudioMixingConfig;
import com.ss.bytertc.engine.data.AudioMixingDualMonoMode;
import com.ss.bytertc.engine.data.AudioMixingType;
import com.ss.bytertc.engine.utils.AudioFrame;

/* loaded from: classes33.dex */
public abstract class IAudioMixingManager {
    public abstract void disableAudioMixingFrame(int i);

    public abstract void enableAudioMixingFrame(int i, AudioMixingType audioMixingType);

    public abstract int getAudioMixingCurrentPosition(int i);

    public abstract int getAudioMixingDuration(int i);

    public abstract int getAudioMixingPlaybackDuration(int i);

    public abstract int getAudioTrackCount(int i);

    public abstract void pauseAllAudioMixing();

    public abstract void pauseAudioMixing(int i);

    public abstract void preloadAudioMixing(int i, String str);

    public abstract int pushAudioMixingFrame(int i, AudioFrame audioFrame);

    public abstract void registerAudioFileFrameObserver(IAudioFileFrameObserver iAudioFileFrameObserver);

    public abstract void resumeAllAudioMixing();

    public abstract void resumeAudioMixing(int i);

    public abstract void selectAudioTrack(int i, int i2);

    public abstract void setAllAudioMixingVolume(int i, AudioMixingType audioMixingType);

    public abstract void setAudioMixingDualMonoMode(int i, AudioMixingDualMonoMode audioMixingDualMonoMode);

    public abstract void setAudioMixingLoudness(int i, float f);

    public abstract void setAudioMixingPitch(int i, int i2);

    public abstract int setAudioMixingPlaybackSpeed(int i, int i2);

    public abstract void setAudioMixingPosition(int i, int i2);

    public abstract void setAudioMixingProgressInterval(int i, long j);

    public abstract void setAudioMixingVolume(int i, int i2, AudioMixingType audioMixingType);

    public abstract void startAudioMixing(int i, String str, AudioMixingConfig audioMixingConfig);

    public abstract void stopAllAudioMixing();

    public abstract void stopAudioMixing(int i);

    public abstract void unloadAudioMixing(int i);
}
