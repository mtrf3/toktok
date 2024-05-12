package X;

import android.media.MediaPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;

/* loaded from: classes9.dex */
public class J05 implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ J07 LJLIL;

    public J05(J07 j07) {
        this.LJLIL = j07;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        J07 j07 = this.LJLIL;
        IMediaPlayer.OnErrorListener<AbsPlayer<T>> onErrorListener = j07.errorListener;
        if (onErrorListener != 0) {
            onErrorListener.onError(j07.self, i, i2, "");
            return false;
        }
        return false;
    }
}
