package X;

import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;

/* renamed from: X.Izm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48442Izm implements InterfaceC48417IzN {
    public final /* synthetic */ C47778Ip4 LIZ;

    public C48442Izm(C47778Ip4 c47778Ip4) {
        this.LIZ = c47778Ip4;
    }

    @Override // X.InterfaceC48417IzN
    public final void LIZIZ(InterfaceC47775Ip1 interfaceC47775Ip1) {
        C47778Ip4 c47778Ip4 = this.LIZ;
        IMediaPlayer.OnPreparedListener<AbsPlayer<T>> onPreparedListener = c47778Ip4.preparedListener;
        if (onPreparedListener != 0) {
            onPreparedListener.onPrepared(c47778Ip4.self);
        }
    }
}
