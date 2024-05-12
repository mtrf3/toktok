package X;

import android.media.MediaPlayer;

/* renamed from: X.IzF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48409IzF implements MediaPlayer.OnCompletionListener {
    public final InterfaceC48414IzK LJLIL;
    public final InterfaceC47775Ip1 LJLILLLLZI;

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.LJLIL.LIZ(this.LJLILLLLZI);
    }

    public C48409IzF(InterfaceC48414IzK interfaceC48414IzK, InterfaceC47775Ip1 interfaceC47775Ip1) {
        this.LJLILLLLZI = interfaceC47775Ip1;
        this.LJLIL = interfaceC48414IzK;
    }
}
