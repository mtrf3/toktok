package X;

import android.content.Context;
import android.media.AudioManager;

/* renamed from: X.O7h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61385O7h {
    public C61403O7z LIZ;
    public C61379O7b LIZIZ;
    public final Context LIZJ;
    public final AudioManager LIZLLL;
    public boolean LJ;

    public final int LIZ() {
        int i = -1;
        try {
            AudioManager audioManager = this.LIZLLL;
            if (audioManager == null) {
                return -1;
            }
            i = audioManager.getStreamVolume(3);
            return i;
        } catch (Exception e) {
            O8O.LIZLLL().LIZ(e, "key_exception_volume_npe");
            return i;
        }
    }

    public C61385O7h(Context context) {
        this.LIZJ = context;
        this.LIZLLL = (AudioManager) C16880lQ.LLILL(C16880lQ.LLLLL(context), "audio");
    }
}
