package X;

import android.media.MediaPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.DefaultSystemPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;

/* loaded from: classes9.dex */
public class J0A implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ DefaultSystemPlayer LJLIL;

    public J0A(DefaultSystemPlayer defaultSystemPlayer) {
        this.LJLIL = defaultSystemPlayer;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        DefaultSystemPlayer defaultSystemPlayer = this.LJLIL;
        IMediaPlayer.OnErrorListener<AbsPlayer<T>> onErrorListener = defaultSystemPlayer.errorListener;
        if (onErrorListener != 0) {
            onErrorListener.onError(defaultSystemPlayer.self, i, i2, "");
            return false;
        }
        return false;
    }
}
