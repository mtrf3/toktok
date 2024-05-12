package com.ss.ttlivestreamer.core.player;

import X.X1D;
import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.ss.ttlivestreamer.core.player.IAVPlayer;
import com.ss.ttlivestreamer.core.utils.AVLog;

/* loaded from: classes12.dex */
public class AVPlayerBase implements IAVPlayer, IAVPlayer.EventListener, IAVPlayer.ErrorListener {
    public static final String TAG = AVPlayerBase.class.getName();
    public IAVPlayer.ErrorListener mErrorListener;
    public IAVPlayer.EventListener mListener;
    public boolean mLoop;
    public IAVPlayer.MetaData mMetaData = new IAVPlayer.MetaData();

    public long getCurrentPlaybackTimeMs() {
        return 0L;
    }

    @Override // com.ss.ttlivestreamer.core.player.IAVPlayer
    public float getVolume() {
        return 0.0f;
    }

    @Override // com.ss.ttlivestreamer.core.player.IAVPlayer
    public boolean isPlaying() {
        return false;
    }

    public boolean isSystemMediaPlayer() {
        return false;
    }

    public boolean isTTPlayer() {
        return false;
    }

    @Override // com.ss.ttlivestreamer.core.player.IAVPlayer
    public void pause() {
    }

    @Override // com.ss.ttlivestreamer.core.player.IAVPlayer
    public void prepare() {
    }

    @Override // com.ss.ttlivestreamer.core.player.IAVPlayer
    public void prepareAsync() {
    }

    @Override // com.ss.ttlivestreamer.core.player.IAVPlayer
    public void release() {
    }

    @Override // com.ss.ttlivestreamer.core.player.IAVPlayer
    public void seekTo(long j) {
    }

    @Override // com.ss.ttlivestreamer.core.player.IAVPlayer
    public void setConnectTimeoutMs(long j) {
    }

    @Override // com.ss.ttlivestreamer.core.player.IAVPlayer
    public void setDataSource(Context context, String str) {
    }

    @Override // com.ss.ttlivestreamer.core.player.IAVPlayer
    public void setDisplay(Surface surface) {
    }

    @Override // com.ss.ttlivestreamer.core.player.IAVPlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
    }

    public boolean setExternalNativeAudioRender(long j) {
        return false;
    }

    @Override // com.ss.ttlivestreamer.core.player.IAVPlayer
    public void setMixerEnable(boolean z) {
    }

    public int setOption(Object obj, Object obj2) {
        return -1;
    }

    @Override // com.ss.ttlivestreamer.core.player.IAVPlayer
    public void setReconnectCounts(int i) {
    }

    @Override // com.ss.ttlivestreamer.core.player.IAVPlayer
    public void setReconnectDelayMaxMs(long j) {
    }

    @Override // com.ss.ttlivestreamer.core.player.IAVPlayer
    public void setVolume(float f) {
    }

    @Override // com.ss.ttlivestreamer.core.player.IAVPlayer
    public void start() {
    }

    @Override // com.ss.ttlivestreamer.core.player.IAVPlayer
    public void stop() {
    }

    @Override // com.ss.ttlivestreamer.core.player.IAVPlayer
    public IAVPlayer.MetaData getMetaData() {
        return this.mMetaData;
    }

    @Override // com.ss.ttlivestreamer.core.player.IAVPlayer
    public boolean isLoop() {
        return this.mLoop;
    }

    @Override // com.ss.ttlivestreamer.core.player.IAVPlayer.EventListener
    public void onCompletion(IAVPlayer iAVPlayer) {
        IAVPlayer.EventListener eventListener = this.mListener;
        if (eventListener != null) {
            eventListener.onCompletion(this);
        }
        String str = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCompletion this ");
        LIZ.append(iAVPlayer);
        AVLog.iod(str, X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.ttlivestreamer.core.player.IAVPlayer
    public void setErrorListener(IAVPlayer.ErrorListener errorListener) {
        this.mErrorListener = errorListener;
    }

    @Override // com.ss.ttlivestreamer.core.player.IAVPlayer
    public void setEventListener(IAVPlayer.EventListener eventListener) {
        this.mListener = eventListener;
    }

    @Override // com.ss.ttlivestreamer.core.player.IAVPlayer
    public void setLoop(boolean z) {
        this.mLoop = z;
    }

    @Override // com.ss.ttlivestreamer.core.player.IAVPlayer.EventListener
    public void onPause(IAVPlayer iAVPlayer, int i) {
        IAVPlayer.EventListener eventListener = this.mListener;
        if (eventListener != null) {
            eventListener.onPause(this, i);
        }
    }

    @Override // com.ss.ttlivestreamer.core.player.IAVPlayer.EventListener
    public void onPrepared(IAVPlayer iAVPlayer, int i) {
        IAVPlayer.EventListener eventListener = this.mListener;
        if (eventListener != null) {
            eventListener.onPrepared(this, i);
        }
    }

    @Override // com.ss.ttlivestreamer.core.player.IAVPlayer.EventListener
    public void onProgress(IAVPlayer iAVPlayer, long j) {
        IAVPlayer.EventListener eventListener = this.mListener;
        if (eventListener != null) {
            eventListener.onProgress(this, j);
        }
    }

    @Override // com.ss.ttlivestreamer.core.player.IAVPlayer.EventListener
    public void onStarted(IAVPlayer iAVPlayer, int i) {
        IAVPlayer.EventListener eventListener = this.mListener;
        if (eventListener != null) {
            eventListener.onStarted(this, i);
        }
    }

    @Override // com.ss.ttlivestreamer.core.player.IAVPlayer.EventListener
    public void onStop(IAVPlayer iAVPlayer, int i) {
        IAVPlayer.EventListener eventListener = this.mListener;
        if (eventListener != null) {
            eventListener.onStop(this, i);
        }
    }

    @Override // com.ss.ttlivestreamer.core.player.IAVPlayer.ErrorListener
    public void onError(IAVPlayer iAVPlayer, int i, Exception exc) {
        IAVPlayer.ErrorListener errorListener = this.mErrorListener;
        if (errorListener != null) {
            errorListener.onError(iAVPlayer, i, exc);
        }
        String str = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onError this ");
        LIZ.append(iAVPlayer);
        AVLog.ioe(str, X1D.LIZIZ(LIZ), exc);
    }

    @Override // com.ss.ttlivestreamer.core.player.IAVPlayer.EventListener
    public void onSeeked(IAVPlayer iAVPlayer, long j, boolean z) {
        IAVPlayer.EventListener eventListener = this.mListener;
        if (eventListener != null) {
            eventListener.onSeeked(this, j, z);
        }
    }
}
