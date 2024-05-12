package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Zyp, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91699Zyp {
    public static String LIZ(Class cls) {
        java.util.Map<Class<?>, String> map = C91700Zyq.LIZIZ;
        String str = (String) ((LinkedHashMap) map).get(cls);
        if (str == null) {
            InterfaceC91694Zyk interfaceC91694Zyk = (InterfaceC91694Zyk) cls.getAnnotation(InterfaceC91694Zyk.class);
            if (interfaceC91694Zyk == null) {
                str = null;
            } else {
                str = interfaceC91694Zyk.value();
            }
            if (LIZIZ(str)) {
                map.put(cls, str);
            } else {
                String LJIILLIIL = o.LJIILLIIL(C16880lQ.LJLLJ(cls), "No @Navigator.Name annotation found for ");
                LJIILLIIL.toString();
                throw new IllegalArgumentException(LJIILLIIL);
            }
        }
        o.LJI(str);
        return str;
    }

    public static boolean LIZIZ(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return true;
    }
}
