package com.ss.bytertc.ktv;

import com.ss.bytertc.ktv.data.AudioPlayType;
import com.ss.bytertc.ktv.data.AudioTrackType;

/* loaded from: classes33.dex */
public abstract class IKTVPlayer {
    public abstract void pauseMusic(String str);

    public abstract void playMusic(String str, AudioTrackType audioTrackType, AudioPlayType audioPlayType);

    public abstract void resumeMusic(String str);

    public abstract void seekMusic(String str, int i);

    public abstract void setMusicPitch(String str, int i);

    public abstract void setMusicVolume(String str, int i);

    public abstract void setPlayerEventHandler(IKTVPlayerEventHandler iKTVPlayerEventHandler);

    public abstract void stopMusic(String str);

    public abstract void switchAudioTrackType(String str);
}
