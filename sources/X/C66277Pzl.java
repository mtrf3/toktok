package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Pzl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66277Pzl {
    public static final C2310194v LIZ = new InterfaceC2310294w() { // from class: X.94v
        @Override // X.InterfaceC2310294w
        public final String LIZ(String str, String str2, Object[] objArr) {
            boolean z;
            StringBuilder sb = new StringBuilder();
            if (objArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                for (Object obj : objArr) {
                    if ((obj instanceof String) || (obj instanceof Number)) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append('-');
                        LIZ2.append(obj);
                        sb.append(X1D.LIZIZ(LIZ2));
                    }
                }
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(str);
            LIZ3.append('-');
            LIZ3.append(str2);
            LIZ3.append((Object) sb);
            return X1D.LIZIZ(LIZ3);
        }
    };
    public static final java.util.Map<Integer, C66282Pzq> LIZIZ = new LinkedHashMap();

    public static void LIZ(int i, InterfaceC66286Pzu store, J1T strategy, InterfaceC66285Pzt interfaceC66285Pzt) {
        C2310194v c2310194v = LIZ;
        o.LJIIIZ(store, "store");
        o.LJIIIZ(strategy, "strategy");
        java.util.Map<Integer, C66282Pzq> map = LIZIZ;
        synchronized (map) {
            map.put(Integer.valueOf(i), new C66282Pzq(strategy, store, c2310194v, interfaceC66285Pzt));
        }
    }
}
