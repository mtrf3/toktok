package X;

import android.media.MediaPlayer;

/* renamed from: X.J7g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48644J7g implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ C48642J7e LJLIL;

    public C48644J7g(C48642J7e c48642J7e) {
        this.LJLIL = c48642J7e;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.LJLIL.LJIIJJI();
        C48642J7e c48642J7e = this.LJLIL;
        EnumC79954VZm enumC79954VZm = EnumC79954VZm.PLAYBACK_STATE_STOPPED;
        c48642J7e.LJIIIIZZ = enumC79954VZm;
        c48642J7e.LJIILIIL.LJFF(c48642J7e, enumC79954VZm);
        C48642J7e c48642J7e2 = this.LJLIL;
        c48642J7e2.LJIILIIL.LJIIIIZZ(c48642J7e2);
    }
}
