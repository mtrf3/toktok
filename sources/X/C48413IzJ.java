package X;

import android.media.MediaPlayer;

/* renamed from: X.IzJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48413IzJ implements MediaPlayer.OnVideoSizeChangedListener {
    public final InterfaceC48418IzO LJLIL;
    public final InterfaceC47775Ip1 LJLILLLLZI;

    public C48413IzJ(InterfaceC48418IzO interfaceC48418IzO, InterfaceC47775Ip1 interfaceC47775Ip1) {
        this.LJLIL = interfaceC48418IzO;
        this.LJLILLLLZI = interfaceC47775Ip1;
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        this.LJLIL.LIZLLL(this.LJLILLLLZI, i, i2);
    }
}
