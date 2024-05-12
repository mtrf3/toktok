package X;

import android.os.StrictMode;
import java.util.concurrent.Callable;

/* renamed from: X.ZgB, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90543ZgB {
    public static <T> T LIZ(Callable<T> callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            return callable.call();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
