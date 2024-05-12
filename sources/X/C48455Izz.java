package X;

import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;

/* renamed from: X.Izz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48455Izz implements InterfaceC48415IzL {
    public final /* synthetic */ C47778Ip4 LIZ;

    public C48455Izz(C47778Ip4 c47778Ip4) {
        this.LIZ = c47778Ip4;
    }

    @Override // X.InterfaceC48415IzL
    public final boolean LIZJ(InterfaceC47775Ip1 interfaceC47775Ip1, int i, int i2) {
        C47778Ip4 c47778Ip4 = this.LIZ;
        IMediaPlayer.OnErrorListener<AbsPlayer<T>> onErrorListener = c47778Ip4.errorListener;
        if (onErrorListener != 0) {
            onErrorListener.onError(c47778Ip4.self, i, i2, "TTMediaPlayer on error");
            return false;
        }
        return false;
    }
}
