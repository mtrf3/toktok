package X;

import android.media.MediaPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;

/* loaded from: classes9.dex */
public class J08 implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ J07 LJLIL;

    public J08(J07 j07) {
        this.LJLIL = j07;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        J07 j07 = this.LJLIL;
        IMediaPlayer.OnCompletionListener<AbsPlayer<T>> onCompletionListener = j07.completionListener;
        if (onCompletionListener != 0) {
            onCompletionListener.onCompletion(j07.self);
        }
    }
}
