package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K4S {
    public static final java.util.Map<String, K4H> LIZ = new HashMap();

    public static K4H LIZ(String keyword) {
        o.LJIIIZ(keyword, "keyword");
        K4H k4h = (K4H) ((HashMap) LIZ).get(keyword);
        if (k4h == null) {
            return K4L.LIZ;
        }
        return k4h;
    }
}
