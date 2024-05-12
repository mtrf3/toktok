package X;

import android.app.KeyguardManager;
import android.os.Build;

/* loaded from: classes9.dex */
public final class IG1 {
    public static boolean LIZ() {
        try {
            KeyguardManager keyguardManager = (KeyguardManager) C16880lQ.LLILL(EF7.LIZIZ(), "keyguard");
            if (Build.VERSION.SDK_INT < 23 || keyguardManager == null) {
                return false;
            }
            return keyguardManager.isDeviceSecure();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }
}
