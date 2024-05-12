package X;

import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;

/* renamed from: X.Izo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48444Izo implements InterfaceC48414IzK {
    public final /* synthetic */ C48437Izh LIZ;

    public C48444Izo(C48437Izh c48437Izh) {
        this.LIZ = c48437Izh;
    }

    @Override // X.InterfaceC48414IzK
    public final void LIZ(InterfaceC47775Ip1 interfaceC47775Ip1) {
        C48437Izh c48437Izh = this.LIZ;
        IMediaPlayer.OnCompletionListener<AbsPlayer<T>> onCompletionListener = c48437Izh.completionListener;
        if (onCompletionListener != 0) {
            onCompletionListener.onCompletion(c48437Izh.self);
        }
    }
}
