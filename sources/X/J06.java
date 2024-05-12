package X;

import android.media.MediaPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;

/* loaded from: classes9.dex */
public class J06 implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ J07 LJLIL;

    public J06(J07 j07) {
        this.LJLIL = j07;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        J07 j07 = this.LJLIL;
        IMediaPlayer.OnPreparedListener<AbsPlayer<T>> onPreparedListener = j07.preparedListener;
        if (onPreparedListener != 0) {
            onPreparedListener.onPrepared(j07.self);
        }
    }
}
