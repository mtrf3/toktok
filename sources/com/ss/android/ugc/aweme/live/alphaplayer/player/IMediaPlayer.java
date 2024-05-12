package com.ss.android.ugc.aweme.live.alphaplayer.player;

import android.view.Surface;
import com.ss.android.ugc.aweme.live.alphaplayer.model.VideoInfo;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;

/* loaded from: classes15.dex */
public interface IMediaPlayer<T extends IMediaPlayer> {

    /* loaded from: classes9.dex */
    public interface OnCompletionListener<T> {
        void onCompletion(T t);
    }

    /* loaded from: classes9.dex */
    public interface OnErrorListener<T> {
        void onError(T t, int i, int i2, String str);
    }

    /* loaded from: classes9.dex */
    public interface OnFirstFrameListener<T> {
        void onFirstFrame(T t);
    }

    /* loaded from: classes9.dex */
    public interface OnPreparedListener<T> {
        void onPrepared(T t);
    }

    int getCurrentPosition();

    String getPlayerSimpleName();

    VideoInfo getVideoInfo();

    void initMediaPlayer();

    boolean isPlaying();

    void pause();

    void prepareAsync();

    void release();

    void reset();

    void seekTo(int i);

    void setDataSource(String str);

    void setLooping(boolean z);

    void setOnCompletionListener(OnCompletionListener<T> onCompletionListener);

    void setOnErrorListener(OnErrorListener<T> onErrorListener);

    void setOnFirstFrameListener(OnFirstFrameListener<T> onFirstFrameListener);

    void setOnPreparedListener(OnPreparedListener<T> onPreparedListener);

    void setScreenOnWhilePlaying(boolean z);

    void setSurface(Surface surface);

    void start();

    void stop();
}
