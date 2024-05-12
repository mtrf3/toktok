package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.5BA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5BA {
    public static final ConcurrentHashMap<String, Object> LIZ;
    public static final C131055Cj LIZIZ;
    public static final C130825Bm LIZJ;

    static {
        ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
        LIZ = concurrentHashMap;
        LIZIZ = new C131055Cj(concurrentHashMap);
        LIZJ = new C130825Bm(concurrentHashMap);
    }

    public static Object LIZ(EnumC127484zQ key, Object defaultVal) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(defaultVal, "defaultVal");
        C130825Bm c130825Bm = LIZJ;
        c130825Bm.getClass();
        if (c130825Bm.LIZ.containsKey(key.name())) {
            try {
                Object obj = c130825Bm.LIZ.get(key.name());
                o.LJII(obj, "null cannot be cast to non-null type T of com.ss.ugc.android.editor.core.settings.KVReaderImpl.get");
                defaultVal = obj;
                return defaultVal;
            } catch (Exception e) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("get::key=");
                LIZ2.append(key);
                LIZ2.append(", error cause = ");
                LIZ2.append(e.getMessage());
                C131935Ft.LIZLLL("KVReaderImpl", X1D.LIZIZ(LIZ2));
                return defaultVal;
            }
        }
        return defaultVal;
    }
}
