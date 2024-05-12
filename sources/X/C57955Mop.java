package X;

import com.google.gson.j;
import com.google.gson.m;

/* renamed from: X.Mop, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57955Mop {
    public static final m LIZ;
    public static final C62822Ol8 LIZIZ;

    static {
        m mVar = new m();
        mVar.LJJIIJ("enable", 0);
        LIZ = mVar;
        LIZIZ = C221108m2.LIZIZ(C57959Mot.LJLIL);
    }

    public static boolean LIZ() {
        m mVar;
        j LJJIJ;
        if (!C90343gc.LIZ() || (mVar = (m) LIZIZ.getValue()) == null || (LJJIJ = mVar.LJJIJ("enable")) == null || LJJIJ.LJIILJJIL() != 1) {
            return false;
        }
        return true;
    }
}
