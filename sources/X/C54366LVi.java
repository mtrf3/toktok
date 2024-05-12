package X;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.LVi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54366LVi {
    public static Object LIZ(Class cls) {
        Context LLLLL = C16880lQ.LLLLL(EF7.LIZIZ());
        if (LLLLL != null && cls.isInterface()) {
            if (LVS.class.equals(cls)) {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C54368LVk.LIZ;
                Object obj = concurrentHashMap.get(cls);
                if (obj != null && (obj instanceof LUM)) {
                    return obj;
                }
                LUM lum = new LUM(LLLLL);
                concurrentHashMap.put(cls, lum);
                return lum;
            }
            if (InterfaceC56896MUq.class.equals(cls)) {
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) C54368LVk.LIZ;
                Object obj2 = concurrentHashMap2.get(cls);
                if (obj2 != null && (obj2 instanceof FR9)) {
                    return obj2;
                }
                FR9 fr9 = new FR9(LLLLL);
                concurrentHashMap2.put(cls, fr9);
                return fr9;
            }
            if (InterfaceC54369LVl.class.equals(cls)) {
                ConcurrentHashMap concurrentHashMap3 = (ConcurrentHashMap) C54368LVk.LIZ;
                Object obj3 = concurrentHashMap3.get(cls);
                if (obj3 != null && (obj3 instanceof C54367LVj)) {
                    return obj3;
                }
                C54367LVj c54367LVj = new C54367LVj(LLLLL);
                concurrentHashMap3.put(cls, c54367LVj);
                return c54367LVj;
            }
        }
        return null;
    }
}
