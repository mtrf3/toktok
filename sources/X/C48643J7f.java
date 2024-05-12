package X;

import android.media.MediaPlayer;

/* renamed from: X.J7f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48643J7f implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ C48642J7e LJLIL;

    public C48643J7f(C48642J7e c48642J7e) {
        this.LJLIL = c48642J7e;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        J7Z.LIZIZ(C48642J7e.LJIILJJIL, "---> onPrepared()");
        C48642J7e c48642J7e = this.LJLIL;
        c48642J7e.LIZIZ = true;
        c48642J7e.LJIILIIL.LJII(c48642J7e);
        C48642J7e c48642J7e2 = this.LJLIL;
        if (c48642J7e2.LIZJ) {
            c48642J7e2.LJIILIIL();
        }
    }
}
