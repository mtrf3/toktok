package X;

import android.media.MediaPlayer;

/* loaded from: classes9.dex */
public final class J9L implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ J9K LJLIL;

    public J9L(J9K j9k) {
        this.LJLIL = j9k;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        this.LJLIL.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("media player error what ");
        LIZ.append(i);
        LIZ.append("  extra ");
        LIZ.append(i2);
        H78.LIZIZ("image_mode", X1D.LIZIZ(LIZ));
        return true;
    }
}
