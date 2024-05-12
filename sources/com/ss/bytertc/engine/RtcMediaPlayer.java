package com.ss.bytertc.engine;

import com.ss.bytertc.engine.audio.IMediaPlayer;
import com.ss.bytertc.engine.data.AudioMixingDualMonoMode;
import com.ss.bytertc.engine.data.AudioMixingType;
import com.ss.bytertc.engine.data.MediaPlayerConfig;
import com.ss.bytertc.engine.data.MediaPlayerCustomSource;
import com.ss.bytertc.engine.data.ReturnStatus;
import com.ss.bytertc.engine.handler.RTCMediaPlayerAudioFrameObserver;
import com.ss.bytertc.engine.handler.RTCMediaPlayerCustomSourceProvider;
import com.ss.bytertc.engine.handler.RTCMediaPlayerEventHandler;
import com.ss.bytertc.engine.utils.AudioFrame;
import com.ss.bytertc.engine.utils.LogUtil;

/* loaded from: classes33.dex */
public class RtcMediaPlayer extends IMediaPlayer {
    public RTCMediaPlayerAudioFrameObserver mAudioFrameObserver;
    public RTCMediaPlayerCustomSourceProvider mMediaPlayerCustomSourceProvider;
    public RTCMediaPlayerEventHandler mMediaPlayerEventHandler;
    public long mNativeMediaPlayer;
    public long mNativeRTCEngine;

    public synchronized void destroy() {
        NativeMediaPlayerFunctions.nativeDestory(this.mNativeMediaPlayer);
        this.mNativeMediaPlayer = 0L;
        this.mNativeRTCEngine = 0L;
        this.mAudioFrameObserver = null;
        this.mMediaPlayerEventHandler = null;
        this.mMediaPlayerCustomSourceProvider = null;
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int getAudioTrackCount() {
        long j = this.mNativeMediaPlayer;
        if (j == 0) {
            LogUtil.e("MediaPlayer", "native MediaPlayer is invalid, getAudioTrackCount failed.");
            return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        }
        return NativeMediaPlayerFunctions.nativeGetAudioTrackCount(j);
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int getPlaybackDuration() {
        long j = this.mNativeMediaPlayer;
        if (j == 0) {
            LogUtil.e("MediaPlayer", "native MediaPlayer is invalid, getPlaybackDuration failed.");
            return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        }
        return NativeMediaPlayerFunctions.nativeGetPlaybackDuration(j);
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int getPosition() {
        long j = this.mNativeMediaPlayer;
        if (j == 0) {
            LogUtil.e("MediaPlayer", "native MediaPlayer is invalid, getPosition failed.");
            return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        }
        return NativeMediaPlayerFunctions.nativeGetPosition(j);
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int getTotalDuration() {
        long j = this.mNativeMediaPlayer;
        if (j == 0) {
            LogUtil.e("MediaPlayer", "native MediaPlayer is invalid, getTotalDuration failed.");
            return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        }
        return NativeMediaPlayerFunctions.nativeGetTotalDuration(j);
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int pause() {
        long j = this.mNativeMediaPlayer;
        if (j == 0) {
            LogUtil.e("MediaPlayer", "native MediaPlayer is invalid, pause failed.");
            return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        }
        return NativeMediaPlayerFunctions.nativePause(j);
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int resume() {
        long j = this.mNativeMediaPlayer;
        if (j == 0) {
            LogUtil.e("MediaPlayer", "native MediaPlayer is invalid, resume failed.");
            return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        }
        return NativeMediaPlayerFunctions.nativeResume(j);
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int start() {
        long j = this.mNativeMediaPlayer;
        if (j == 0) {
            LogUtil.e("MediaPlayer", "native MediaPlayer is invalid, start failed.");
            return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        }
        return NativeMediaPlayerFunctions.nativeStart(j);
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int stop() {
        long j = this.mNativeMediaPlayer;
        if (j == 0) {
            LogUtil.e("MediaPlayer", "native MediaPlayer is invalid, stop failed.");
            return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        }
        return NativeMediaPlayerFunctions.nativeStop(j);
    }

    public RtcMediaPlayer(long j) {
        this(j, 0L);
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int getVolume(AudioMixingType audioMixingType) {
        long j = this.mNativeMediaPlayer;
        if (j == 0) {
            LogUtil.e("MediaPlayer", "native MediaPlayer is invalid, getVolume failed.");
            return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        }
        return NativeMediaPlayerFunctions.nativeGetVolume(j, audioMixingType.value());
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int pushExternalAudioFrame(AudioFrame audioFrame) {
        long j = this.mNativeMediaPlayer;
        if (j == 0) {
            LogUtil.e("MediaPlayer", "native MediaPlayer is invalid, pushExternalAudioFrame failed.");
            return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        }
        return NativeMediaPlayerFunctions.nativePushExternalAudioFrame(j, audioFrame.buffer, audioFrame.samples, audioFrame.sampleRate.value(), audioFrame.channel.value());
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int registerAudioFrameObserver(IMediaPlayerAudioFrameObserver iMediaPlayerAudioFrameObserver) {
        if (this.mNativeMediaPlayer == 0) {
            LogUtil.e("MediaPlayer", "native MediaPlayer is invalid, registerAudioFrameObserver failed.");
            return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        }
        this.mAudioFrameObserver.setAudioFrameObserver(iMediaPlayerAudioFrameObserver);
        if (iMediaPlayerAudioFrameObserver == null) {
            return NativeMediaPlayerFunctions.nativeRegisterAudioFrameObserver(this.mNativeMediaPlayer, null);
        }
        return NativeMediaPlayerFunctions.nativeRegisterAudioFrameObserver(this.mNativeMediaPlayer, this.mAudioFrameObserver);
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int selectAudioTrack(int i) {
        long j = this.mNativeMediaPlayer;
        if (j == 0) {
            LogUtil.e("MediaPlayer", "native MediaPlayer is invalid, selectAudioTrack failed.");
            return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        }
        return NativeMediaPlayerFunctions.nativeSelectAudioTrack(j, i);
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int setAudioDualMonoMode(AudioMixingDualMonoMode audioMixingDualMonoMode) {
        long j = this.mNativeMediaPlayer;
        if (j == 0) {
            LogUtil.e("MediaPlayer", "native MediaPlayer is invalid, setAudioDualMonoMode failed.");
            return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        }
        return NativeMediaPlayerFunctions.nativeSetAudioDualMonoMode(j, audioMixingDualMonoMode.value());
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int setAudioPitch(int i) {
        long j = this.mNativeMediaPlayer;
        if (j == 0) {
            LogUtil.e("MediaPlayer", "native MediaPlayer is invalid, setAudioPitch failed.");
            return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        }
        return NativeMediaPlayerFunctions.nativeSetAudioPitch(j, i);
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int setEventHandler(IMediaPlayerEventHandler iMediaPlayerEventHandler) {
        if (this.mNativeMediaPlayer == 0) {
            LogUtil.e("MediaPlayer", "native MediaPlayer is invalid, setEventHandler failed.");
            return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        }
        this.mMediaPlayerEventHandler.setMediaPlayerEventHandler(iMediaPlayerEventHandler);
        if (iMediaPlayerEventHandler == null) {
            return NativeMediaPlayerFunctions.nativeSetEventHandler(this.mNativeMediaPlayer, null);
        }
        return NativeMediaPlayerFunctions.nativeSetEventHandler(this.mNativeMediaPlayer, this.mMediaPlayerEventHandler);
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int setLoudness(float f) {
        long j = this.mNativeMediaPlayer;
        if (j == 0) {
            LogUtil.e("MediaPlayer", "native MediaPlayer is invalid, setLoudness failed.");
            return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        }
        return NativeMediaPlayerFunctions.nativeSetLoudness(j, f);
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int setPlaybackSpeed(int i) {
        long j = this.mNativeMediaPlayer;
        if (j == 0) {
            LogUtil.e("MediaPlayer", "native MediaPlayer is invalid, setPlaybackSpeed failed.");
            return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        }
        return NativeMediaPlayerFunctions.nativeSetPlaybackSpeed(j, i);
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int setPosition(int i) {
        long j = this.mNativeMediaPlayer;
        if (j == 0) {
            LogUtil.e("MediaPlayer", "native MediaPlayer is invalid, setPosition failed.");
            return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        }
        return NativeMediaPlayerFunctions.nativeSetPosition(j, i);
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int setProgressInterval(long j) {
        long j2 = this.mNativeMediaPlayer;
        if (j2 == 0) {
            LogUtil.e("MediaPlayer", "native MediaPlayer is invalid, setProgressInterval failed.");
            return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        }
        return NativeMediaPlayerFunctions.nativeSetProgressInterval(j2, j);
    }

    public RtcMediaPlayer(long j, long j2) {
        this.mNativeMediaPlayer = j;
        this.mNativeRTCEngine = j2;
        this.mAudioFrameObserver = new RTCMediaPlayerAudioFrameObserver();
        this.mMediaPlayerEventHandler = new RTCMediaPlayerEventHandler();
        this.mMediaPlayerCustomSourceProvider = new RTCMediaPlayerCustomSourceProvider();
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int open(String str, MediaPlayerConfig mediaPlayerConfig) {
        long j = this.mNativeMediaPlayer;
        if (j == 0) {
            LogUtil.e("MediaPlayer", "native MediaPlayer is invalid, open failed.");
            return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        }
        return NativeMediaPlayerFunctions.nativeOpen(j, str, mediaPlayerConfig.type.value(), mediaPlayerConfig.playCount, mediaPlayerConfig.startPos, mediaPlayerConfig.autoPlay, mediaPlayerConfig.callbackOnProgressInterval, mediaPlayerConfig.syncProgressToRecordFrame);
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int openWithCustomSource(MediaPlayerCustomSource mediaPlayerCustomSource, MediaPlayerConfig mediaPlayerConfig) {
        if (this.mNativeMediaPlayer == 0) {
            LogUtil.e("MediaPlayer", "native MediaPlayer is invalid, openWithCustomSource failed.");
            return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        }
        this.mMediaPlayerCustomSourceProvider.setCustomSourceProvider(mediaPlayerCustomSource.provider);
        return NativeMediaPlayerFunctions.nativeOpenWithCustomSource(this.mNativeMediaPlayer, mediaPlayerCustomSource.mode.value(), mediaPlayerCustomSource.type.value(), this.mMediaPlayerCustomSourceProvider, mediaPlayerConfig.type.value(), mediaPlayerConfig.playCount, mediaPlayerConfig.startPos, mediaPlayerConfig.autoPlay, mediaPlayerConfig.callbackOnProgressInterval, mediaPlayerConfig.syncProgressToRecordFrame);
    }

    @Override // com.ss.bytertc.engine.audio.IMediaPlayer
    public synchronized int setVolume(int i, AudioMixingType audioMixingType) {
        long j = this.mNativeMediaPlayer;
        if (j == 0) {
            LogUtil.e("MediaPlayer", "native MediaPlayer is invalid, setVolume failed.");
            return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        }
        return NativeMediaPlayerFunctions.nativeSetVolume(j, i, audioMixingType.value());
    }
}
