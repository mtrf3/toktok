package com.ss.bytertc.ktv;

import com.ss.bytertc.engine.NativeKTVPlayerFunctions;
import com.ss.bytertc.engine.handler.KTVPlayEventHandler;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.ktv.data.AudioPlayType;
import com.ss.bytertc.ktv.data.AudioTrackType;

/* loaded from: classes33.dex */
public class KTVPlayerImpl extends IKTVPlayer {
    public KTVPlayEventHandler handler;
    public final long mNativeKTVPlayer;
    public long mNativePlayerEventHandler;

    public void destroy() {
        long j = this.mNativePlayerEventHandler;
        if (j != 0) {
            NativeKTVPlayerFunctions.nativeReleaseKTVPlayerEventHandler(j);
            this.mNativePlayerEventHandler = 0L;
        }
        this.handler = null;
    }

    public KTVPlayerImpl(long j) {
        this.mNativeKTVPlayer = j;
    }

    @Override // com.ss.bytertc.ktv.IKTVPlayer
    public void pauseMusic(String str) {
        long j = this.mNativeKTVPlayer;
        if (j == 0) {
            LogUtil.e("KTVPlayerImpl", "native mNativeKTVPlayer is invalid, pauseMusic failed.");
        } else {
            NativeKTVPlayerFunctions.nativePauseMusic(j, str);
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVPlayer
    public void resumeMusic(String str) {
        long j = this.mNativeKTVPlayer;
        if (j == 0) {
            LogUtil.e("KTVPlayerImpl", "native mNativeKTVPlayer is invalid, resumeMusic failed.");
        } else {
            NativeKTVPlayerFunctions.nativeResumeMusic(j, str);
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVPlayer
    public void setPlayerEventHandler(IKTVPlayerEventHandler iKTVPlayerEventHandler) {
        KTVPlayEventHandler kTVPlayEventHandler = new KTVPlayEventHandler(iKTVPlayerEventHandler);
        this.handler = kTVPlayEventHandler;
        long j = this.mNativePlayerEventHandler;
        this.mNativePlayerEventHandler = NativeKTVPlayerFunctions.nativeSetPlayerEventHandler(this.mNativeKTVPlayer, kTVPlayEventHandler);
        if (j != 0) {
            NativeKTVPlayerFunctions.nativeReleaseKTVPlayerEventHandler(j);
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVPlayer
    public void stopMusic(String str) {
        long j = this.mNativeKTVPlayer;
        if (j == 0) {
            LogUtil.e("KTVPlayerImpl", "native mNativeKTVPlayer is invalid, stopMusic failed.");
        } else {
            NativeKTVPlayerFunctions.nativeStopMusic(j, str);
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVPlayer
    public void switchAudioTrackType(String str) {
        long j = this.mNativeKTVPlayer;
        if (j == 0) {
            LogUtil.e("KTVPlayerImpl", "native mNativeKTVPlayer is invalid, switchAudioTrackType failed.");
        } else {
            NativeKTVPlayerFunctions.nativeSwitchAudioTrackType(j, str);
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVPlayer
    public void seekMusic(String str, int i) {
        long j = this.mNativeKTVPlayer;
        if (j == 0) {
            LogUtil.e("KTVPlayerImpl", "native mNativeKTVPlayer is invalid, seekMusic failed.");
        } else {
            NativeKTVPlayerFunctions.nativeSeekMusic(j, str, i);
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVPlayer
    public void setMusicPitch(String str, int i) {
        long j = this.mNativeKTVPlayer;
        if (j == 0) {
            LogUtil.e("KTVPlayerImpl", "native mNativeKTVPlayer is invalid, setMusicPitch failed.");
        } else {
            NativeKTVPlayerFunctions.nativeSetMusicPitch(j, str, i);
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVPlayer
    public void setMusicVolume(String str, int i) {
        long j = this.mNativeKTVPlayer;
        if (j == 0) {
            LogUtil.e("KTVPlayerImpl", "native mNativeKTVPlayer is invalid, setMusicVolume failed.");
        } else {
            NativeKTVPlayerFunctions.nativeSetMusicVolume(j, str, i);
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVPlayer
    public void playMusic(String str, AudioTrackType audioTrackType, AudioPlayType audioPlayType) {
        long j = this.mNativeKTVPlayer;
        if (j == 0) {
            LogUtil.e("KTVPlayerImpl", "native mNativeKTVPlayer is invalid, playMusic failed.");
        } else {
            NativeKTVPlayerFunctions.nativePlayMusic(j, str, audioTrackType.value(), audioPlayType.value());
        }
    }
}
