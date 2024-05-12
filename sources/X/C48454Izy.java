package X;

import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;

/* renamed from: X.Izy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48454Izy implements InterfaceC48415IzL {
    public final /* synthetic */ C48439Izj LIZ;

    public C48454Izy(C48439Izj c48439Izj) {
        this.LIZ = c48439Izj;
    }

    @Override // X.InterfaceC48415IzL
    public final boolean LIZJ(InterfaceC47775Ip1 interfaceC47775Ip1, int i, int i2) {
        C48439Izj c48439Izj = this.LIZ;
        IMediaPlayer.OnErrorListener<AbsPlayer<T>> onErrorListener = c48439Izj.errorListener;
        if (onErrorListener != 0) {
            onErrorListener.onError(c48439Izj.self, i, i2, "TTMediaPlayer on error");
            return false;
        }
        return false;
    }
}
