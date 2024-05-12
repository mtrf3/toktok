package X;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.PgY, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65086PgY {
    public static volatile C65086PgY LJIIJ;
    public final C65019PfT LJFF;
    public final C65019PfT LJI;
    public final C65019PfT LJII;
    public final C65019PfT LJIIIIZZ;
    public final List<InterfaceC65049Pfx> LJIIIZ = new CopyOnWriteArrayList();
    public final ConcurrentHashMap<Class, Object> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Class, Object> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Class, Object> LIZJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Class, Object> LIZLLL = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Class, Object> LJ = new ConcurrentHashMap<>();

    public static C65086PgY LIZ() {
        if (LJIIJ == null) {
            synchronized (C65086PgY.class) {
                if (LJIIJ == null) {
                    LJIIJ = new C65086PgY();
                }
            }
        }
        return LJIIJ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0101, code lost:
    
        r5.add(new com.ss.android.ugc.aweme.net.monitor.HybridTrafficColoringInterceptor());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C65086PgY() {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65086PgY.<init>():void");
    }
}
