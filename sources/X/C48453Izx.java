package X;

import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;

/* renamed from: X.Izx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48453Izx implements InterfaceC48415IzL {
    public final /* synthetic */ C48437Izh LIZ;

    public C48453Izx(C48437Izh c48437Izh) {
        this.LIZ = c48437Izh;
    }

    @Override // X.InterfaceC48415IzL
    public final boolean LIZJ(InterfaceC47775Ip1 interfaceC47775Ip1, int i, int i2) {
        C48437Izh c48437Izh = this.LIZ;
        IMediaPlayer.OnErrorListener<AbsPlayer<T>> onErrorListener = c48437Izh.errorListener;
        if (onErrorListener != 0) {
            onErrorListener.onError(c48437Izh.self, i, i2, "TTMediaPlayer on error");
            return false;
        }
        return false;
    }
}
