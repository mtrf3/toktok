package X;

import android.media.MediaPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.DefaultSystemPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;

/* loaded from: classes9.dex */
public class J0B implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ DefaultSystemPlayer LJLIL;

    public J0B(DefaultSystemPlayer defaultSystemPlayer) {
        this.LJLIL = defaultSystemPlayer;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        DefaultSystemPlayer defaultSystemPlayer = this.LJLIL;
        IMediaPlayer.OnCompletionListener<AbsPlayer<T>> onCompletionListener = defaultSystemPlayer.completionListener;
        if (onCompletionListener != 0) {
            onCompletionListener.onCompletion(defaultSystemPlayer.self);
        }
    }
}
