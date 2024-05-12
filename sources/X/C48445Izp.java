package X;

import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;

/* renamed from: X.Izp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48445Izp implements InterfaceC48414IzK {
    public final /* synthetic */ C47778Ip4 LIZ;

    public C48445Izp(C47778Ip4 c47778Ip4) {
        this.LIZ = c47778Ip4;
    }

    @Override // X.InterfaceC48414IzK
    public final void LIZ(InterfaceC47775Ip1 interfaceC47775Ip1) {
        C47778Ip4 c47778Ip4 = this.LIZ;
        IMediaPlayer.OnCompletionListener<AbsPlayer<T>> onCompletionListener = c47778Ip4.completionListener;
        if (onCompletionListener != 0) {
            onCompletionListener.onCompletion(c47778Ip4.self);
        }
    }
}
