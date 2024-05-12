package X;

import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;

/* renamed from: X.Izn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48443Izn implements InterfaceC48414IzK {
    public final /* synthetic */ C48439Izj LIZ;

    public C48443Izn(C48439Izj c48439Izj) {
        this.LIZ = c48439Izj;
    }

    @Override // X.InterfaceC48414IzK
    public final void LIZ(InterfaceC47775Ip1 interfaceC47775Ip1) {
        C48439Izj c48439Izj = this.LIZ;
        IMediaPlayer.OnCompletionListener<AbsPlayer<T>> onCompletionListener = c48439Izj.completionListener;
        if (onCompletionListener != 0) {
            onCompletionListener.onCompletion(c48439Izj.self);
        }
    }
}
