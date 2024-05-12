package X;

import android.os.SystemClock;
import java.util.LinkedHashMap;

/* renamed from: X.95A, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C95A implements B45 {
    public static final C95A LIZ = new C95A();
    public static final java.util.Map<String, Long> LIZIZ = new LinkedHashMap();

    public static long LIZIZ(String str) {
        Long l = (Long) ((LinkedHashMap) LIZIZ).get(str);
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    @Override // X.B45
    public final void LIZ(String str) {
        LIZIZ.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
    }
}
