package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: X.6EG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6EG {
    public static final java.util.Map<String, RunnableC117154il> LIZ = new LinkedHashMap();
    public static final java.util.Map<String, List<InterfaceC117164im>> LIZIZ = new LinkedHashMap();
    public static ExecutorService LIZJ;

    public static void LIZIZ(String str) {
        Future<?> future;
        java.util.Map<String, RunnableC117154il> map = LIZ;
        RunnableC117154il runnableC117154il = (RunnableC117154il) ((LinkedHashMap) map).get(str);
        if (runnableC117154il != null && (future = runnableC117154il.LJLJJLL) != null) {
            future.cancel(true);
        }
        map.remove(str);
    }

    public static final boolean LIZJ(String str) {
        if (((LinkedHashMap) LIZ).get(str) != null) {
            return true;
        }
        return false;
    }

    public static void LIZ(int i, String str) {
        java.util.Map<String, RunnableC117154il> map = LIZ;
        RunnableC117154il runnableC117154il = (RunnableC117154il) ((LinkedHashMap) map).get(str);
        if (runnableC117154il != null && runnableC117154il.LJLILLLLZI != i) {
            Future<?> future = runnableC117154il.LJLJJLL;
            if (future != null) {
                future.cancel(true);
            }
            map.remove(str);
        }
    }

    public static final void LIZLLL(String str, InterfaceC117164im interfaceC117164im) {
        java.util.Map<String, List<InterfaceC117164im>> map = LIZIZ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        if (linkedHashMap.get(str) == null) {
            map.put(str, C47261Igj.LJJIJIL(interfaceC117164im));
            return;
        }
        List list = (List) linkedHashMap.get(str);
        if (list == null) {
            return;
        }
        list.add(interfaceC117164im);
    }
}
