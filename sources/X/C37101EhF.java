package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.EhF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37101EhF {
    public static final ConcurrentHashMap<String, Integer> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, AbstractC40550Fvm> LIZIZ = new ConcurrentHashMap<>();

    public static void LIZ(String packageName, AbstractC40550Fvm abstractC40550Fvm) {
        o.LJIIIZ(packageName, "packageName");
        ConcurrentHashMap<String, AbstractC40550Fvm> concurrentHashMap = LIZIZ;
        synchronized (concurrentHashMap) {
            concurrentHashMap.put(packageName, abstractC40550Fvm);
        }
    }
}
