package com.ss.android.ugc.aweme.live.alphaplayer.multi_player;

import X.InterfaceC79901VXl;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.live.alphaplayer.Configuration;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.IMonitor;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.IProgressListener;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.live.alphaplayer.model.MaskSrc;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;

/* loaded from: classes15.dex */
public class MultiPlayerController implements IMultiPlayerController {
    public final IPlayerController backgroundPlayerController;
    public final IPlayerController foregroundPlayerController;

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public String getPlayerType() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void setMask(MaskSrc maskSrc) {
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void setSurface(Surface surface) {
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void startWithLastFrameHold(DataSource dataSource, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void cancel() {
        this.foregroundPlayerController.cancel();
        this.backgroundPlayerController.cancel();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.multi_player.IMultiPlayerController
    public View getBackgroundView() {
        return this.backgroundPlayerController.getView();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public int getCurFrame() {
        return this.foregroundPlayerController.getCurFrame();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public int getDuration() {
        return this.foregroundPlayerController.getDuration();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public View getView() {
        return this.foregroundPlayerController.getView();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public boolean isPlaying() {
        if (this.foregroundPlayerController.isPlaying() && this.backgroundPlayerController.isPlaying()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void pause() {
        this.foregroundPlayerController.pause();
        this.backgroundPlayerController.pause();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void release() {
        this.foregroundPlayerController.release();
        this.backgroundPlayerController.release();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void reset() {
        this.foregroundPlayerController.reset();
        this.backgroundPlayerController.reset();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void resume() {
        this.foregroundPlayerController.resume();
        this.backgroundPlayerController.resume();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void startPlay() {
        this.foregroundPlayerController.startPlay();
        this.backgroundPlayerController.startPlay();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void stop() {
        this.foregroundPlayerController.stop();
        this.backgroundPlayerController.stop();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void attachAlphaView(ViewGroup viewGroup) {
        this.foregroundPlayerController.attachAlphaView(viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.multi_player.IMultiPlayerController
    public void attachBackgroundAlphaView(ViewGroup viewGroup) {
        this.backgroundPlayerController.attachAlphaView(viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void detachAlphaView(ViewGroup viewGroup) {
        this.foregroundPlayerController.detachAlphaView(viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.multi_player.IMultiPlayerController
    public void detachBackgroundAlphaView(ViewGroup viewGroup) {
        this.backgroundPlayerController.detachAlphaView(viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void seekTo(int i) {
        this.foregroundPlayerController.seekTo(i);
        this.backgroundPlayerController.seekTo(i);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.multi_player.IMultiPlayerController
    public void setBackgroundMonitor(IMonitor iMonitor) {
        this.backgroundPlayerController.setMonitor(iMonitor);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void setMonitor(IMonitor iMonitor) {
        this.foregroundPlayerController.setMonitor(iMonitor);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void setPrepareListener(InterfaceC79901VXl interfaceC79901VXl) {
        this.foregroundPlayerController.setPrepareListener(interfaceC79901VXl);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void setVisibility(int i) {
        this.foregroundPlayerController.setVisibility(i);
        this.backgroundPlayerController.setVisibility(i);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void start(DataSource dataSource) {
        this.foregroundPlayerController.start(dataSource);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.multi_player.IMultiPlayerController
    public void startBackground(DataSource dataSource) {
        this.backgroundPlayerController.start(dataSource);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.multi_player.IMultiPlayerController
    public IPlayerController withBackgroundVideoAction(AlphaPlayerAction alphaPlayerAction) {
        return this.backgroundPlayerController.withVideoAction(alphaPlayerAction);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public IPlayerController withVideoAction(AlphaPlayerAction alphaPlayerAction) {
        return this.foregroundPlayerController.withVideoAction(alphaPlayerAction);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void setProgressListener(IProgressListener iProgressListener, long j) {
        this.foregroundPlayerController.setProgressListener(iProgressListener, j);
    }

    public MultiPlayerController(Configuration configuration, IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer, IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer2) {
        Configuration copy = configuration.copy();
        copy.setThreadName("alpha-play-thread");
        Configuration copy2 = configuration.copy();
        copy2.setThreadName("alpha-play-background-thread");
        copy2.setAlphaVideoViewType(1);
        this.foregroundPlayerController = PlayerController.get(copy, iMediaPlayer);
        this.backgroundPlayerController = PlayerController.get(copy2, iMediaPlayer2);
    }

    public static MultiPlayerController get(Configuration configuration, IMediaPlayer iMediaPlayer, IMediaPlayer iMediaPlayer2) {
        return new MultiPlayerController(configuration, iMediaPlayer, iMediaPlayer2);
    }
}
