package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.MXn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56971MXn {
    public static final HashMap<Class, C56972MXo> LIZ = new HashMap<>();

    public static void LIZIZ() {
        HashMap<Class, C56972MXo> hashMap = LIZ;
        synchronized (hashMap) {
            Iterator<Map.Entry<Class, C56972MXo>> it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                C56972MXo value = it.next().getValue();
                if (value != null) {
                    value.LIZ = false;
                    value.LIZIZ = -1;
                }
            }
        }
    }

    public static void LIZ(Class cls, C56972MXo c56972MXo) {
        HashMap<Class, C56972MXo> hashMap = LIZ;
        synchronized (hashMap) {
            hashMap.put(cls, c56972MXo);
        }
    }
}
