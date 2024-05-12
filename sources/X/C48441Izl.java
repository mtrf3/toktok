package X;

import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;

/* renamed from: X.Izl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48441Izl implements InterfaceC48417IzN {
    public final /* synthetic */ C48437Izh LIZ;

    public C48441Izl(C48437Izh c48437Izh) {
        this.LIZ = c48437Izh;
    }

    @Override // X.InterfaceC48417IzN
    public final void LIZIZ(InterfaceC47775Ip1 interfaceC47775Ip1) {
        C48437Izh c48437Izh = this.LIZ;
        IMediaPlayer.OnPreparedListener<AbsPlayer<T>> onPreparedListener = c48437Izh.preparedListener;
        if (onPreparedListener != 0) {
            onPreparedListener.onPrepared(c48437Izh.self);
        }
    }
}
