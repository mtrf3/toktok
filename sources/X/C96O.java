package X;

import com.bytedance.keva.Keva;
import java.util.HashMap;

/* renamed from: X.96O, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C96O {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C96P.LJLIL);
    public static final HashMap<Integer, C95U> LIZIZ = new HashMap<>();

    public static C95U LIZ(int i, Class cls) {
        C95U c95u;
        C95U c95u2 = LIZIZ.get(Integer.valueOf(i));
        if (!(c95u2 instanceof C95U)) {
            c95u2 = null;
        }
        C95U c95u3 = c95u2;
        if (c95u3 != null) {
            return c95u3;
        }
        Keva keva = (Keva) LIZ.getValue();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("touchpoint_");
        LIZ2.append(i);
        String string = keva.getString(X1D.LIZIZ(LIZ2), "");
        if (C96Q.LIZ(string)) {
            try {
                c95u = (C95U) C62819Ol5.LJIIL(string, cls);
            } catch (Throwable unused) {
            }
            if ((c95u instanceof C95U) || c95u == null) {
                return null;
            }
            LIZIZ.put(Integer.valueOf(i), c95u);
            return c95u;
        }
        c95u = null;
        if (c95u instanceof C95U) {
            return null;
        }
        LIZIZ.put(Integer.valueOf(i), c95u);
        return c95u;
    }
}
