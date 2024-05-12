package X;

import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;

/* renamed from: X.Izs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48448Izs implements InterfaceC48416IzM {
    public final /* synthetic */ C47778Ip4 LIZ;

    public C48448Izs(C47778Ip4 c47778Ip4) {
        this.LIZ = c47778Ip4;
    }

    @Override // X.InterfaceC48416IzM
    public final boolean LJ(InterfaceC47775Ip1 interfaceC47775Ip1, int i, int i2) {
        C47778Ip4 c47778Ip4;
        IMediaPlayer.OnFirstFrameListener<AbsPlayer<T>> onFirstFrameListener;
        if (i == 3 && (onFirstFrameListener = (c47778Ip4 = this.LIZ).firstFrameListener) != 0) {
            onFirstFrameListener.onFirstFrame(c47778Ip4.self);
            return false;
        }
        return false;
    }
}
