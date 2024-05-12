package X;

import android.media.MediaPlayer;

/* renamed from: X.WNg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82184WNg implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ C82183WNf LJLIL;

    public C82184WNg(C82183WNf c82183WNf) {
        this.LJLIL = c82183WNf;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        this.LJLIL.LIZIZ = true;
    }
}
