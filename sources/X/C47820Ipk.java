package X;

import android.content.Context;
import android.media.AudioManager;

/* renamed from: X.Ipk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47820Ipk {
    public static AudioManager LIZ = null;
    public static int LIZIZ = -1;
    public static boolean LIZJ;
    public static C47848IqC LIZLLL;

    public static boolean LIZ(Context context) {
        if (LIZ == null) {
            try {
                LIZ = (AudioManager) C16880lQ.LLILL(context, "audio");
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        if (LIZ == null) {
            return true;
        }
        return false;
    }
}
