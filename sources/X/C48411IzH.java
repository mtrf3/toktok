package X;

import android.media.MediaPlayer;

/* renamed from: X.IzH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48411IzH implements MediaPlayer.OnInfoListener {
    public final InterfaceC48416IzM LJLIL;
    public final InterfaceC47775Ip1 LJLILLLLZI;

    public C48411IzH(InterfaceC48416IzM interfaceC48416IzM, InterfaceC47775Ip1 interfaceC47775Ip1) {
        this.LJLILLLLZI = interfaceC47775Ip1;
        this.LJLIL = interfaceC48416IzM;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        return this.LJLIL.LJ(this.LJLILLLLZI, i, i2);
    }
}
