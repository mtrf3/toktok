package X;

import com.ss.android.ugc.aweme.performance.PerformanceMonitor;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.5IO, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5IO {
    public static final HashMap<String, PerformanceMonitor> LIZ = new HashMap<>();

    public static final PerformanceMonitor LIZIZ(String str) {
        return LIZ.get(str);
    }

    public static final void LIZ(PerformanceMonitor performanceMonitor, String str) {
        o.LJIIIZ(performanceMonitor, "performanceMonitor");
        if (str == null) {
            return;
        }
        HashMap<String, PerformanceMonitor> hashMap = LIZ;
        hashMap.clear();
        hashMap.put(str, performanceMonitor);
    }
}
