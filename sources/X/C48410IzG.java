package X;

import android.media.MediaPlayer;

/* renamed from: X.IzG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48410IzG implements MediaPlayer.OnErrorListener {
    public final InterfaceC48415IzL LJLIL;
    public final InterfaceC47775Ip1 LJLILLLLZI;

    public C48410IzG(InterfaceC48415IzL interfaceC48415IzL, InterfaceC47775Ip1 interfaceC47775Ip1) {
        this.LJLILLLLZI = interfaceC47775Ip1;
        this.LJLIL = interfaceC48415IzL;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        return this.LJLIL.LIZJ(this.LJLILLLLZI, i, i2);
    }
}
