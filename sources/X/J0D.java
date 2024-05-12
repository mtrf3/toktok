package X;

import android.media.MediaPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.DefaultSystemPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;

/* loaded from: classes9.dex */
public class J0D implements MediaPlayer.OnInfoListener {
    public final /* synthetic */ DefaultSystemPlayer LJLIL;

    public J0D(DefaultSystemPlayer defaultSystemPlayer) {
        this.LJLIL = defaultSystemPlayer;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        DefaultSystemPlayer defaultSystemPlayer;
        IMediaPlayer.OnFirstFrameListener<AbsPlayer<T>> onFirstFrameListener;
        if (i == 3 && (onFirstFrameListener = (defaultSystemPlayer = this.LJLIL).firstFrameListener) != 0) {
            onFirstFrameListener.onFirstFrame(defaultSystemPlayer.self);
            return false;
        }
        return false;
    }
}
