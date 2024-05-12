package X;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes10.dex */
public final class L0A {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(L09.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(L0D.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(L0C.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(L0B.LJLIL);
    public static final java.util.Map<Integer, String> LJ = new LinkedHashMap();

    public static final boolean LIZIZ() {
        return ((Boolean) LIZJ.getValue()).booleanValue();
    }

    public static void LIZ() {
        if (LIZIZ()) {
            Iterator it = ((LinkedHashMap) LJ).keySet().iterator();
            while (it.hasNext()) {
                C16970lZ.LJII(((Number) it.next()).intValue());
            }
        }
    }
}
