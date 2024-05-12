package X;

import kotlin.jvm.internal.o;
import m43.u;

/* loaded from: classes12.dex */
public final class Q5S {
    public final synchronized Q5L LIZ() {
        Q5L q5l;
        if (Q5L.LJ == null) {
            C10760bY LIZ = C10760bY.LIZ(u.LIZJ());
            o.LJIIIIZZ(LIZ, "getInstance(applicationContext)");
            Q5L.LJ = new Q5L(LIZ, new C66422Q5a());
        }
        q5l = Q5L.LJ;
        if (q5l == null) {
            o.LJIJI("instance");
            throw null;
        }
        return q5l;
    }
}
