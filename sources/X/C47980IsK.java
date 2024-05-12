package X;

import android.media.MediaPlayer;

/* renamed from: X.IsK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47980IsK implements MediaPlayer.OnSeekCompleteListener {
    public final InterfaceC47890Iqs LJLIL;
    public final InterfaceC47775Ip1 LJLILLLLZI;

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        AbstractC47755Ioh abstractC47755Ioh = ((C47811Ipb) this.LJLIL).LIZ.get();
        if (abstractC47755Ioh == null) {
            return;
        }
        abstractC47755Ioh.LJIILLIIL();
    }

    public C47980IsK(C47811Ipb c47811Ipb, InterfaceC47775Ip1 interfaceC47775Ip1) {
        this.LJLIL = c47811Ipb;
        this.LJLILLLLZI = interfaceC47775Ip1;
    }
}
