package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PQI {
    public static final java.util.Map<String, PQM> LIZ;
    public static final PQK LIZIZ;

    static {
        java.util.Map map = PQG.LIZJ;
        if (map != null) {
            LIZ = map;
            LIZIZ = new PQK();
        } else {
            o.LJIJI("_fluencyTracerFactories");
            throw null;
        }
    }
}
