package X;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes12.dex */
public final class PY3 {
    public static final AtomicLong LIZ = new AtomicLong(SystemClock.uptimeMillis());

    public static long LIZ() {
        return LIZ.incrementAndGet();
    }
}
