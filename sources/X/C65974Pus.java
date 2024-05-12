package X;

import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.jvm.internal.o;

/* renamed from: X.Pus, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65974Pus {
    public static final C65964Pui<java.util.Map<String, Object>> LIZ;
    public static final Type LIZIZ;

    static {
        Object obj;
        C65964Pui<java.util.Map<String, Object>> c65964Pui;
        String str = "";
        Type type = new C65978Puw().getType();
        o.LJIIIIZZ(type, "object : TypeToken<List<…String, Any?>>>() {}.type");
        LIZIZ = type;
        try {
            str = C66046Pw2.LIZ("region", "");
        } catch (Exception unused) {
        }
        C65973Pur c65973Pur = new C65973Pur();
        if (str.length() == 0) {
            c65964Pui = new C65964Pui<>(20, c65973Pur, null, 4, null);
        } else {
            Type type2 = LIZIZ;
            o.LJIIIZ(type2, "type");
            try {
                obj = C39536FfQ.LIZ.LJII(str, type2);
            } catch (Throwable unused2) {
                obj = null;
            }
            Collection collection = (Collection) obj;
            if (collection == null) {
                collection = C61878OQg.INSTANCE;
            }
            c65964Pui = new C65964Pui<>(20, c65973Pur, collection);
        }
        LIZ = c65964Pui;
    }
}
