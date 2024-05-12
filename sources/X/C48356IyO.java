package X;

import android.os.Handler;
import android.os.Process;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.IyO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48356IyO {
    public static final C48356IyO LIZ = new C48356IyO();
    public static final AtomicInteger LIZIZ;
    public static final WeakHashMap<C48357IyP, java.util.Map<String, Object>> LIZJ;

    static {
        Process.myPid();
        new Handler(C06M.LIZ("keys_keep").getLooper());
        LIZIZ = new AtomicInteger(1);
        LIZJ = new WeakHashMap<>();
        new C0M5();
    }

    public final synchronized java.util.Map<String, Object> LIZ(C48357IyP c48357IyP) {
        java.util.Map<String, Object> map;
        WeakHashMap<C48357IyP, java.util.Map<String, Object>> weakHashMap = LIZJ;
        map = weakHashMap.get(c48357IyP);
        if (map == null) {
            map = new LinkedHashMap<>();
            weakHashMap.put(c48357IyP, map);
        }
        return map;
    }
}
