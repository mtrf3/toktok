package com.ss.android.ugc.aweme.live.alphaplayer.controller;

import X.InterfaceC79901VXl;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.IMonitor;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.IProgressListener;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.live.alphaplayer.model.MaskSrc;

/* loaded from: classes15.dex */
public interface IPlayerController {
    void attachAlphaView(ViewGroup viewGroup);

    void cancel();

    void detachAlphaView(ViewGroup viewGroup);

    int getCurFrame();

    int getDuration();

    String getPlayerType();

    View getView();

    boolean isPlaying();

    void pause();

    void release();

    void reset();

    void resume();

    void seekTo(int i);

    void setMask(MaskSrc maskSrc);

    void setMonitor(IMonitor iMonitor);

    void setPrepareListener(InterfaceC79901VXl interfaceC79901VXl);

    void setProgressListener(IProgressListener iProgressListener, long j);

    void setSurface(Surface surface);

    void setVisibility(int i);

    void start(DataSource dataSource);

    void startPlay();

    void startWithLastFrameHold(DataSource dataSource, boolean z);

    void stop();

    IPlayerController withVideoAction(AlphaPlayerAction alphaPlayerAction);
}
