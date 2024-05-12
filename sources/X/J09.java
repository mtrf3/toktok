package X;

import android.media.MediaPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;

/* loaded from: classes9.dex */
public class J09 implements MediaPlayer.OnInfoListener {
    public final /* synthetic */ J07 LJLIL;

    public J09(J07 j07) {
        this.LJLIL = j07;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        J07 j07;
        IMediaPlayer.OnFirstFrameListener<AbsPlayer<T>> onFirstFrameListener;
        if (i == 3 && (onFirstFrameListener = (j07 = this.LJLIL).firstFrameListener) != 0) {
            onFirstFrameListener.onFirstFrame(j07.self);
            return false;
        }
        return false;
    }
}
