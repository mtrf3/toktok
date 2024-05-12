package X;

import androidx.lifecycle.Lifecycle;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS76S1100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L9T {
    public static final ConcurrentHashMap<String, WeakReference<InterfaceC55235Lm3>> LIZ = new ConcurrentHashMap<>();

    public static InterfaceC55235Lm3 LIZ(String key) {
        o.LJIIIZ(key, "key");
        WeakReference<InterfaceC55235Lm3> weakReference = LIZ.get(key);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void LIZIZ(String key, C55238Lm6 c55238Lm6, Lifecycle lifecycle) {
        o.LJIIIZ(key, "key");
        LIZ.put(key, new WeakReference<>(c55238Lm6));
        L9U.LIZIZ(new AqS76S1100000_9(lifecycle, key, 2));
    }
}
