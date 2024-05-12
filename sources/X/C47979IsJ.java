package X;

import android.media.MediaPlayer;

/* renamed from: X.IsJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47979IsJ implements MediaPlayer.OnBufferingUpdateListener {
    public final InterfaceC47888Iqq LJLIL;
    public final InterfaceC47775Ip1 LJLILLLLZI;

    public C47979IsJ(C47811Ipb c47811Ipb, InterfaceC47775Ip1 interfaceC47775Ip1) {
        this.LJLILLLLZI = interfaceC47775Ip1;
        this.LJLIL = c47811Ipb;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        AbstractC47755Ioh abstractC47755Ioh = ((C47811Ipb) this.LJLIL).LIZ.get();
        if (abstractC47755Ioh == null) {
            return;
        }
        abstractC47755Ioh.LJIIJ(i);
    }
}
