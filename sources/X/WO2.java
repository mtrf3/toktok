package X;

import Y.ARunnableS18S0101000_14;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;

/* loaded from: classes15.dex */
public final class WO2 {
    public final MediaPlayer LIZ;
    public final Handler LIZIZ = new Handler();
    public WO8 LIZJ;
    public ARunnableS18S0101000_14 LIZLLL;
    public boolean LJ;

    public final void LIZ() {
        if (!this.LJ) {
            this.LJ = true;
            MediaPlayer mediaPlayer = this.LIZ;
            if (mediaPlayer == null) {
                return;
            }
            mediaPlayer.release();
            ARunnableS18S0101000_14 aRunnableS18S0101000_14 = this.LIZLLL;
            if (aRunnableS18S0101000_14 != null) {
                this.LIZIZ.removeCallbacks(aRunnableS18S0101000_14);
            }
        }
    }

    public WO2(Context context, android.net.Uri uri) {
        this.LIZ = MediaPlayer.create(context, uri);
    }
}
