package X;

import android.media.MediaPlayer;

/* renamed from: X.WNh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82185WNh implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ C82183WNf LJLIL;

    public C82185WNh(C82183WNf c82183WNf) {
        this.LJLIL = c82183WNf;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.LJLIL.LIZJ = true;
    }
}
