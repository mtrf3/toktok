package X;

import android.content.Context;
import android.media.AudioManager;

/* renamed from: X.VAn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79305VAn {
    public final Context LIZ;
    public InterfaceC47775Ip1 LIZIZ = null;
    public float LIZJ;

    public final float LIZ() {
        int i;
        Context context = this.LIZ;
        if (context == null) {
            return 0.0f;
        }
        AudioManager audioManager = (AudioManager) C16880lQ.LLILL(context, "audio");
        int i2 = 0;
        if (audioManager != null) {
            try {
                i = C16880lQ.LLLLLLZZ(audioManager, 3);
            } catch (Exception unused) {
            }
            if (i < 0) {
                return i2;
            }
            i2 = i;
            return i2;
        }
        i = 0;
        i2 = i;
        return i2;
    }

    public final float LIZIZ() {
        int i;
        AudioManager audioManager;
        Context context = this.LIZ;
        if (context == null) {
            return 0.0f;
        }
        int i2 = 0;
        try {
            audioManager = (AudioManager) C16880lQ.LLILL(context, "audio");
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        if (audioManager != null) {
            i = audioManager.getStreamVolume(3);
            if (i < 0) {
                return i2;
            }
            i2 = i;
            return i2;
        }
        i = 0;
        i2 = i;
        return i2;
    }

    public C79305VAn(Context context) {
        this.LIZ = context;
    }
}
