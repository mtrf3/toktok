package com.ss.android.ugc.aweme.live.alphaplayer.player;

import X.HOT;
import X.J0A;
import X.J0B;
import X.J0C;
import X.J0D;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.text.TextUtils;
import android.view.Surface;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.live.alphaplayer.model.VideoInfo;

/* loaded from: classes9.dex */
public class DefaultSystemPlayer extends AbsPlayer<DefaultSystemPlayer> {
    public String dataSource;
    public MediaPlayer mediaPlayer;
    public MediaMetadataRetriever retriever = new MediaMetadataRetriever();
    public MediaPlayer.OnCompletionListener mCompletionListener = new J0B(this);
    public MediaPlayer.OnPreparedListener mPreparedListener = new J0C(this);
    public MediaPlayer.OnErrorListener mErrorListener = new J0A(this);
    public MediaPlayer.OnInfoListener mInfoListener = new J0D(this);

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public String getPlayerSimpleName() {
        return "DefaultSystemPlayer";
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public int getCurrentPosition() {
        return this.mediaPlayer.getCurrentPosition();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public VideoInfo getVideoInfo() {
        if (!TextUtils.isEmpty(this.dataSource)) {
            this.retriever.setDataSource(this.dataSource);
            String LIZIZ = HOT.LIZIZ(this.retriever);
            String LIZ = HOT.LIZ(this.retriever);
            if (!TextUtils.isEmpty(LIZIZ) && !TextUtils.isEmpty(LIZ)) {
                return new VideoInfo(CastIntegerProtector.parseInt(LIZIZ), CastIntegerProtector.parseInt(LIZ), this.mediaPlayer.getDuration());
            }
            throw new Exception("retriever get metadata failure");
        }
        throw new Exception("dataSource is null, please set setDataSource firstly");
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void initMediaPlayer() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.mediaPlayer = mediaPlayer;
        mediaPlayer.setOnCompletionListener(this.mCompletionListener);
        this.mediaPlayer.setOnPreparedListener(this.mPreparedListener);
        this.mediaPlayer.setOnErrorListener(this.mErrorListener);
        this.mediaPlayer.setOnInfoListener(this.mInfoListener);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public boolean isPlaying() {
        return this.mediaPlayer.isPlaying();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void pause() {
        this.mediaPlayer.pause();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void prepareAsync() {
        this.mediaPlayer.prepareAsync();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void release() {
        this.mediaPlayer.release();
        this.dataSource = null;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void reset() {
        this.mediaPlayer.reset();
        this.dataSource = null;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void start() {
        this.mediaPlayer.start();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void stop() {
        this.mediaPlayer.stop();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void seekTo(int i) {
        this.mediaPlayer.seekTo(i, 3);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void setDataSource(String str) {
        this.dataSource = str;
        this.mediaPlayer.setDataSource(str);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void setLooping(boolean z) {
        this.mediaPlayer.setLooping(z);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void setScreenOnWhilePlaying(boolean z) {
        this.mediaPlayer.setScreenOnWhilePlaying(z);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void setSurface(Surface surface) {
        this.mediaPlayer.setSurface(surface);
    }
}
