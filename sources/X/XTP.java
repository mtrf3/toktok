package X;

import android.media.MediaPlayer;

/* loaded from: classes16.dex */
public final class XTP {
    public static volatile MediaPlayer LIZ;

    public static MediaPlayer LIZ() {
        if (LIZ == null) {
            synchronized (XTP.class) {
                if (LIZ == null) {
                    LIZ = new MediaPlayer();
                }
            }
        }
        return LIZ;
    }
}
