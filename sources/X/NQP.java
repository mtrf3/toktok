package X;

import android.content.Context;
import android.media.AudioManager;

/* loaded from: classes11.dex */
public final class NQP {
    public final AudioManager LIZ;
    public int LIZIZ = -1;
    public C59436NUi LIZJ;
    public C59333NQj LIZLLL;

    static {
        C16880lQ.LJLLJ(NQP.class);
    }

    public final int LIZ() {
        AudioManager audioManager = this.LIZ;
        int i = -1;
        if (audioManager == null) {
            return -1;
        }
        try {
            i = audioManager.getStreamVolume(3);
            return i;
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
            return i;
        }
    }

    public NQP(Context context) {
        this.LIZ = (AudioManager) C16880lQ.LLILL(context, "audio");
    }
}
