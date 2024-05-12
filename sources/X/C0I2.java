package X;

import Y.IDRunnableS6S0101000;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.0I2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0I2 {
    public static final Handler LIZ = new Handler(C16880lQ.LLJJJJ());

    public static void LIZ() {
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
            return;
        }
        final String str = "This method must call on main thread";
        RuntimeException runtimeException = new RuntimeException(str) { // from class: X.0I1
        };
        LIZ.post(new IDRunnableS6S0101000(0, runtimeException, 17));
        throw runtimeException;
    }
}
