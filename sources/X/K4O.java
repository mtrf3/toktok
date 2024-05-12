package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K4O {
    public static final java.util.Map<String, K4I> LIZ = new HashMap();

    public static K4I LIZ(String keyword) {
        o.LJIIIZ(keyword, "keyword");
        K4I k4i = (K4I) ((HashMap) LIZ).get(keyword);
        if (k4i == null) {
            return K4K.LIZ;
        }
        return k4i;
    }

    public static K4I LIZIZ(String keyword) {
        o.LJIIIZ(keyword, "keyword");
        long currentTimeMillis = System.currentTimeMillis();
        K4I k4i = new K4I(keyword);
        k4i.LIZ = currentTimeMillis;
        ((HashMap) LIZ).put(keyword, k4i);
        return k4i;
    }
}
