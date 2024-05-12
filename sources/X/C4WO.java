package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.4WO, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4WO {
    public static volatile C4WO LIZLLL;
    public final java.util.Set<Object> LIZ = new CopyOnWriteArraySet();
    public final java.util.Set<Object> LIZIZ = new CopyOnWriteArraySet();
    public java.util.Map<String, C63120Opw> LIZJ = new ConcurrentHashMap();

    public static C4WO LIZIZ() {
        if (LIZLLL == null) {
            synchronized (C4WO.class) {
                if (LIZLLL == null) {
                    LIZLLL = new C4WO();
                }
            }
        }
        return LIZLLL;
    }
}
