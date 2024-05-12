package X;

import android.content.Context;
import android.media.AudioManager;

/* loaded from: classes11.dex */
public final class NRH {
    public final AudioManager LIZ;
    public NSP LIZIZ;
    public C59435NUh LIZJ;

    public final int LIZ() {
        int i = -1;
        try {
            AudioManager audioManager = this.LIZ;
            if (audioManager == null) {
                return -1;
            }
            i = audioManager.getStreamVolume(3);
            return i;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            return i;
        }
    }

    public NRH(Context context) {
        this.LIZ = (AudioManager) C04330Ez.LJ(context, AudioManager.class);
    }
}
