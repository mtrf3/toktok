package com.ss.ttlivestreamer.core.player;

import X.KMP;
import android.content.Context;
import android.media.MediaPlayer;
import com.ss.ttlivestreamer.core.player.IAVPlayer;

/* loaded from: classes16.dex */
public class AVPlayerSystem extends AVPlayerBase {
    public MediaPlayer mMediaPlayer = new MediaPlayer();

    @Override // com.ss.ttlivestreamer.core.player.AVPlayerBase, com.ss.ttlivestreamer.core.player.IAVPlayer
    public boolean isPlaying() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            return mediaPlayer.isPlaying();
        }
        return false;
    }

    @Override // com.ss.ttlivestreamer.core.player.AVPlayerBase, com.ss.ttlivestreamer.core.player.IAVPlayer
    public void pause() {
        this.mMediaPlayer.pause();
        super.pause();
    }

    @Override // com.ss.ttlivestreamer.core.player.AVPlayerBase, com.ss.ttlivestreamer.core.player.IAVPlayer
    public void release() {
        this.mMediaPlayer.release();
        super.release();
        this.mMediaPlayer = null;
    }

    @Override // com.ss.ttlivestreamer.core.player.AVPlayerBase, com.ss.ttlivestreamer.core.player.IAVPlayer
    public void start() {
        this.mMediaPlayer.start();
        this.mMediaPlayer.setLooping(this.mLoop);
        super.start();
    }

    @Override // com.ss.ttlivestreamer.core.player.AVPlayerBase, com.ss.ttlivestreamer.core.player.IAVPlayer
    public void stop() {
        this.mMediaPlayer.stop();
        super.stop();
    }

    @Override // com.ss.ttlivestreamer.core.player.AVPlayerBase, com.ss.ttlivestreamer.core.player.IAVPlayer
    public IAVPlayer.MetaData getMetaData() {
        return super.getMetaData();
    }

    @Override // com.ss.ttlivestreamer.core.player.AVPlayerBase, com.ss.ttlivestreamer.core.player.IAVPlayer
    public void prepare() {
        super.prepare();
    }

    @Override // com.ss.ttlivestreamer.core.player.AVPlayerBase, com.ss.ttlivestreamer.core.player.IAVPlayer
    public void prepareAsync() {
        super.prepareAsync();
    }

    @Override // com.ss.ttlivestreamer.core.player.AVPlayerBase, com.ss.ttlivestreamer.core.player.IAVPlayer
    public void seekTo(long j) {
        this.mMediaPlayer.seekTo((int) j);
        super.seekTo(j);
    }

    @Override // com.ss.ttlivestreamer.core.player.AVPlayerBase, com.ss.ttlivestreamer.core.player.IAVPlayer
    public void setLoop(boolean z) {
        super.setLoop(z);
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(z);
        }
    }

    @Override // com.ss.ttlivestreamer.core.player.AVPlayerBase, com.ss.ttlivestreamer.core.player.IAVPlayer
    public void setDataSource(Context context, String str) {
        try {
            this.mMediaPlayer.setDataSource(str);
        } catch (Exception e) {
            onError(this, -1, e);
        }
        this.mMediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.ss.ttlivestreamer.core.player.AVPlayerSystem.1
            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                AVPlayerSystem.this.onError(null, i, new Exception(KMP.LJ("Error:", i2)));
                return false;
            }
        });
        this.mMediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.ss.ttlivestreamer.core.player.AVPlayerSystem.2
            @Override // android.media.MediaPlayer.OnPreparedListener
            public void onPrepared(MediaPlayer mediaPlayer) {
                AVPlayerSystem.this.onPrepared(null, 0);
            }
        });
        this.mMediaPlayer.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: com.ss.ttlivestreamer.core.player.AVPlayerSystem.3
            @Override // android.media.MediaPlayer.OnInfoListener
            public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
                if (i != 3) {
                    if (i != 805) {
                        return false;
                    }
                    AVPlayerSystem.this.onPause(null, i);
                    return false;
                }
                AVPlayerSystem.this.onStarted(null, i);
                return false;
            }
        });
        this.mMediaPlayer.setOnBufferingUpdateListener(new MediaPlayer.OnBufferingUpdateListener() { // from class: com.ss.ttlivestreamer.core.player.AVPlayerSystem.4
            @Override // android.media.MediaPlayer.OnBufferingUpdateListener
            public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            }
        });
        this.mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.ss.ttlivestreamer.core.player.AVPlayerSystem.5
            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer) {
                AVPlayerSystem.this.onCompletion(null);
            }
        });
        super.setDataSource(context, str);
    }
}
