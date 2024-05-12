package X;

import android.media.MediaPlayer;

/* renamed from: X.J7h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48645J7h implements MediaPlayer.OnSeekCompleteListener {
    public final /* synthetic */ C48642J7e LJLIL;
    public final /* synthetic */ J7Y LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    public C48645J7h(C48642J7e c48642J7e, C80055VbP c80055VbP, long j) {
        this.LJLIL = c48642J7e;
        this.LJLILLLLZI = c80055VbP;
        this.LJLJI = j;
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        J7Y j7y = this.LJLILLLLZI;
        if (j7y != null) {
            j7y.LIZ(this.LJLJI, true);
        }
        this.LJLIL.LJIILJJIL(true);
        this.LJLIL.LJI = false;
    }
}
