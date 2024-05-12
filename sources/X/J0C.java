package X;

import android.media.MediaPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.DefaultSystemPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;

/* loaded from: classes9.dex */
public class J0C implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ DefaultSystemPlayer LJLIL;

    public J0C(DefaultSystemPlayer defaultSystemPlayer) {
        this.LJLIL = defaultSystemPlayer;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        DefaultSystemPlayer defaultSystemPlayer = this.LJLIL;
        IMediaPlayer.OnPreparedListener<AbsPlayer<T>> onPreparedListener = defaultSystemPlayer.preparedListener;
        if (onPreparedListener != 0) {
            onPreparedListener.onPrepared(defaultSystemPlayer.self);
        }
    }
}
