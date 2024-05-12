package X;

import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.os.Build;
import android.text.TextUtils;
import android.view.Surface;
import com.ss.android.ugc.aweme.live.alphaplayer.model.VideoInfo;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;

/* loaded from: classes9.dex */
public final class J07 extends AbsPlayer<J07> {
    public MediaPlayer LIZ;
    public String LIZIZ;
    public boolean LJ;
    public final MediaMetadataRetriever LIZJ = new MediaMetadataRetriever();
    public J00 LIZLLL = null;
    public final J08 LJFF = new J08(this);
    public final J06 LJI = new J06(this);
    public final J05 LJII = new J05(this);
    public final J09 LJIIIIZZ = new J09(this);

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final String getPlayerSimpleName() {
        return "DefaultSystemPlayer";
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final int getCurrentPosition() {
        MediaPlayer mediaPlayer = this.LIZ;
        if (mediaPlayer != null) {
            return mediaPlayer.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final VideoInfo getVideoInfo() {
        int i;
        int i2;
        if (!TextUtils.isEmpty(this.LIZIZ)) {
            if (this.LIZLLL == null) {
                MediaPlayer mediaPlayer = this.LIZ;
                int i3 = 0;
                if (mediaPlayer != null) {
                    i = mediaPlayer.getVideoWidth();
                } else {
                    i = 0;
                }
                MediaPlayer mediaPlayer2 = this.LIZ;
                if (mediaPlayer2 != null) {
                    i2 = mediaPlayer2.getVideoHeight();
                } else {
                    i2 = 0;
                }
                MediaPlayer mediaPlayer3 = this.LIZ;
                if (mediaPlayer3 != null) {
                    i3 = mediaPlayer3.getDuration();
                }
                this.LIZLLL = new J00(i, i2, i3);
            }
            return this.LIZLLL;
        }
        throw new Exception("dataSource is null, please set setDataSource firstly");
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void initMediaPlayer() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.LIZ = mediaPlayer;
        mediaPlayer.setOnCompletionListener(this.LJFF);
        this.LIZ.setOnPreparedListener(this.LJI);
        this.LIZ.setOnErrorListener(this.LJII);
        this.LIZ.setOnInfoListener(this.LJIIIIZZ);
        if (this.LJ) {
            this.LIZ.setVolume(0.0f, 0.0f);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final boolean isPlaying() {
        MediaPlayer mediaPlayer = this.LIZ;
        if (mediaPlayer != null) {
            return mediaPlayer.isPlaying();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void pause() {
        MediaPlayer mediaPlayer = this.LIZ;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void prepareAsync() {
        MediaPlayer mediaPlayer = this.LIZ;
        if (mediaPlayer != null) {
            mediaPlayer.prepareAsync();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void release() {
        MediaPlayer mediaPlayer = this.LIZ;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        this.LIZIZ = null;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void reset() {
        MediaPlayer mediaPlayer = this.LIZ;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
        }
        this.LIZIZ = null;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void start() {
        MediaPlayer mediaPlayer = this.LIZ;
        if (mediaPlayer != null) {
            mediaPlayer.start();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void stop() {
        MediaPlayer mediaPlayer = this.LIZ;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void seekTo(int i) {
        MediaPlayer mediaPlayer = this.LIZ;
        if (mediaPlayer != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                mediaPlayer.seekTo(i, 3);
            } else {
                mediaPlayer.seekTo(i);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setDataSource(String str) {
        this.LIZIZ = str;
        MediaPlayer mediaPlayer = this.LIZ;
        if (mediaPlayer != null) {
            mediaPlayer.setDataSource(str);
        }
        MediaMetadataRetriever mediaMetadataRetriever = this.LIZJ;
        if (mediaMetadataRetriever != null) {
            mediaMetadataRetriever.setDataSource(str);
        }
        this.LIZLLL = null;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setLooping(boolean z) {
        MediaPlayer mediaPlayer = this.LIZ;
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setScreenOnWhilePlaying(boolean z) {
        MediaPlayer mediaPlayer = this.LIZ;
        if (mediaPlayer != null) {
            mediaPlayer.setScreenOnWhilePlaying(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setSurface(Surface surface) {
        MediaPlayer mediaPlayer = this.LIZ;
        if (mediaPlayer != null) {
            mediaPlayer.setSurface(surface);
        }
    }
}
