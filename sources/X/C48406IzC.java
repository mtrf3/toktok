package X;

import android.media.MediaPlayer;
import kotlin.jvm.internal.o;

/* renamed from: X.IzC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48406IzC implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnVideoSizeChangedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnInfoListener {
    public final /* synthetic */ C48407IzD LJLIL;

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mp, int i) {
        o.LJIIJ(mp, "mp");
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mp) {
        o.LJIIJ(mp, "mp");
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mp, int i, int i2) {
        o.LJIIJ(mp, "mp");
    }

    public C48406IzC(C48407IzD c48407IzD) {
        this.LJLIL = c48407IzD;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mp) {
        o.LJIIJ(mp, "mp");
        C48407IzD c48407IzD = this.LJLIL;
        c48407IzD.LIZ = 7;
        C48405IzB c48405IzB = c48407IzD.LIZJ;
        if (c48405IzB != null) {
            c48405IzB.LIZJ(mp.getDuration(), false);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mp) {
        o.LJIIJ(mp, "mp");
        C48407IzD c48407IzD = this.LJLIL;
        c48407IzD.LIZ = 2;
        C48405IzB c48405IzB = c48407IzD.LIZJ;
        if (c48405IzB != null) {
            c48405IzB.onPrepared();
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mp, int i, int i2) {
        o.LJIIJ(mp, "mp");
        C48407IzD c48407IzD = this.LJLIL;
        c48407IzD.LIZ = 9;
        C48405IzB c48405IzB = c48407IzD.LIZJ;
        if (c48405IzB != null) {
            c48405IzB.LIZLLL(i, String.valueOf(i2), false);
            return true;
        }
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mp, int i, int i2) {
        C48405IzB c48405IzB;
        o.LJIIJ(mp, "mp");
        if (i != 3 || (c48405IzB = this.LJLIL.LIZJ) == null) {
            return true;
        }
        c48405IzB.LJI(mp.getDuration());
        return true;
    }
}
