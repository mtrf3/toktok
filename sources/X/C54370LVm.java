package X;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.LVm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54370LVm {
    public static final java.util.Map<Class<?>, Object> LIZ = new ConcurrentHashMap();

    public static Object LIZ(Context context, Class cls) {
        Context LLLLL = C16880lQ.LLLLL(context);
        o.LJIIIIZZ(LLLLL, "context.applicationContext");
        if (!cls.isInterface()) {
            return null;
        }
        if (o.LJ(XSI.class, cls)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZ;
            Object obj = concurrentHashMap.get(cls);
            if (obj == null || !(obj instanceof C54371LVn)) {
                C54371LVn c54371LVn = new C54371LVn(LLLLL);
                concurrentHashMap.put(cls, c54371LVn);
                return c54371LVn;
            }
            return obj;
        }
        if (!o.LJ(XSO.class, cls)) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) LIZ;
        Object obj2 = concurrentHashMap2.get(cls);
        if (obj2 == null || !(obj2 instanceof C54294LSo)) {
            C54294LSo c54294LSo = new C54294LSo(LLLLL);
            concurrentHashMap2.put(cls, c54294LSo);
            return c54294LSo;
        }
        return obj2;
    }
}
