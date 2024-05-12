package X;

import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;

/* loaded from: classes9.dex */
public final class J0E<T> implements IMediaPlayer.OnCompletionListener {
    public final /* synthetic */ J0F LIZ;
    public final /* synthetic */ IMediaPlayer.OnCompletionListener<AbsPlayer<C47778Ip4>> LIZIZ;

    public J0E(J0F j0f, IMediaPlayer.OnCompletionListener<AbsPlayer<C47778Ip4>> onCompletionListener) {
        this.LIZ = j0f;
        this.LIZIZ = onCompletionListener;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer.OnCompletionListener
    public final void onCompletion(Object obj) {
        this.LIZ.LJI.invoke();
        IMediaPlayer.OnCompletionListener<AbsPlayer<C47778Ip4>> onCompletionListener = this.LIZIZ;
        if (onCompletionListener != null) {
            onCompletionListener.onCompletion(obj);
        }
    }
}
