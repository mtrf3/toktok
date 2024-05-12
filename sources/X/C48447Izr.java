package X;

import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;

/* renamed from: X.Izr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48447Izr implements InterfaceC48416IzM {
    public final /* synthetic */ C48437Izh LIZ;

    public C48447Izr(C48437Izh c48437Izh) {
        this.LIZ = c48437Izh;
    }

    @Override // X.InterfaceC48416IzM
    public final boolean LJ(InterfaceC47775Ip1 interfaceC47775Ip1, int i, int i2) {
        C48437Izh c48437Izh;
        IMediaPlayer.OnFirstFrameListener<AbsPlayer<T>> onFirstFrameListener;
        if (i == 3 && (onFirstFrameListener = (c48437Izh = this.LIZ).firstFrameListener) != 0) {
            onFirstFrameListener.onFirstFrame(c48437Izh.self);
            return false;
        }
        return false;
    }
}
