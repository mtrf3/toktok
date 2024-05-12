package X;

import Y.ARunnableS24S0200000_5;
import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.ClM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32260ClM {
    public static final Object LIZ = new Object();
    public static final Handler LIZIZ = new Handler(C16880lQ.LLJJJJ());
    public static final java.util.Map<Class<?>, Object> LIZJ = new ConcurrentHashMap();
    public static final java.util.Map<Class<?>, java.util.Set<InterfaceC32261ClN<?>>> LIZLLL = new HashMap();

    public static <T> T LIZ(Class<T> cls) {
        return (T) ((ConcurrentHashMap) LIZJ).get(cls);
    }

    public static <T> void LIZIZ(Class<T> cls, T t) {
        java.util.Map<Class<?>, Object> map = LIZJ;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) map;
        Object obj = concurrentHashMap.get(cls);
        if (t == null) {
            concurrentHashMap.remove(cls);
        } else {
            concurrentHashMap.put(cls, t);
        }
        if (obj != t) {
            new HashMap(map);
            synchronized (LIZ) {
                java.util.Set set = (java.util.Set) ((HashMap) LIZLLL).get(cls);
                if (set != null && !set.isEmpty()) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        LIZIZ.post(new ARunnableS24S0200000_5(cls, t, (InterfaceC32261ClN) it.next(), 57));
                    }
                }
            }
        }
    }
}
