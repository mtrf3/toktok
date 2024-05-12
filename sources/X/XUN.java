package X;

import android.media.MediaPlayer;

/* loaded from: classes16.dex */
public final class XUN {
    public static volatile MediaPlayer LIZ;

    public static MediaPlayer LIZ() {
        if (LIZ == null) {
            synchronized (XUN.class) {
                if (LIZ == null) {
                    LIZ = new MediaPlayer();
                }
            }
        }
        return LIZ;
    }
}
