package com.ss.ttlivestreamer.core.player;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.ss.ttlivestreamer.core.utils.TEBundle;

/* loaded from: classes12.dex */
public interface IAVPlayer {

    /* loaded from: classes12.dex */
    public interface ErrorListener {
        void onError(IAVPlayer iAVPlayer, int i, Exception exc);
    }

    /* loaded from: classes12.dex */
    public interface EventListener {
        void onCompletion(IAVPlayer iAVPlayer);

        void onPause(IAVPlayer iAVPlayer, int i);

        void onPrepared(IAVPlayer iAVPlayer, int i);

        void onProgress(IAVPlayer iAVPlayer, long j);

        void onSeeked(IAVPlayer iAVPlayer, long j, boolean z);

        void onStarted(IAVPlayer iAVPlayer, int i);

        void onStop(IAVPlayer iAVPlayer, int i);
    }

    /* loaded from: classes12.dex */
    public static class MetaData extends TEBundle {
    }

    MetaData getMetaData();

    float getVolume();

    boolean isLoop();

    boolean isPlaying();

    void pause();

    void prepare();

    void prepareAsync();

    void release();

    void seekTo(long j);

    void setConnectTimeoutMs(long j);

    void setDataSource(Context context, String str);

    void setDisplay(Surface surface);

    void setDisplay(SurfaceHolder surfaceHolder);

    void setErrorListener(ErrorListener errorListener);

    void setEventListener(EventListener eventListener);

    void setLoop(boolean z);

    void setMixerEnable(boolean z);

    void setReconnectCounts(int i);

    void setReconnectDelayMaxMs(long j);

    void setVolume(float f);

    void start();

    void stop();
}
