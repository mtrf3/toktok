package X;

import android.media.MediaPlayer;

/* renamed from: X.IzI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48412IzI implements MediaPlayer.OnPreparedListener {
    public final InterfaceC48417IzN LJLIL;
    public final InterfaceC47775Ip1 LJLILLLLZI;

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        this.LJLIL.LIZIZ(this.LJLILLLLZI);
    }

    public C48412IzI(InterfaceC48417IzN interfaceC48417IzN, InterfaceC47775Ip1 interfaceC47775Ip1) {
        this.LJLIL = interfaceC48417IzN;
        this.LJLILLLLZI = interfaceC47775Ip1;
    }
}
