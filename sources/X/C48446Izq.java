package X;

import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;

/* renamed from: X.Izq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48446Izq implements InterfaceC48416IzM {
    public final /* synthetic */ C48439Izj LIZ;

    public C48446Izq(C48439Izj c48439Izj) {
        this.LIZ = c48439Izj;
    }

    @Override // X.InterfaceC48416IzM
    public final boolean LJ(InterfaceC47775Ip1 interfaceC47775Ip1, int i, int i2) {
        C48439Izj c48439Izj;
        IMediaPlayer.OnFirstFrameListener<AbsPlayer<T>> onFirstFrameListener;
        if (i == 3 && (onFirstFrameListener = (c48439Izj = this.LIZ).firstFrameListener) != 0) {
            onFirstFrameListener.onFirstFrame(c48439Izj.self);
            return false;
        }
        return false;
    }
}
