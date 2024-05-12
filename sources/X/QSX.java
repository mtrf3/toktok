package X;

import java.util.HashMap;

/* loaded from: classes12.dex */
public final class QSX {
    public static final Object LIZ = new Object();
    public static final java.util.Map<String, C67021QSb> LIZIZ = new HashMap();

    public static InterfaceC67020QSa LIZ(QSZ qsz) {
        synchronized (LIZ) {
            java.util.Map<String, C67021QSb> map = LIZIZ;
            if (((HashMap) map).containsKey(qsz.LIZIZ)) {
                return (InterfaceC67020QSa) ((HashMap) map).get(qsz.LIZIZ);
            }
            C67021QSb c67021QSb = new C67021QSb(qsz);
            ((HashMap) map).put(qsz.LIZIZ, c67021QSb);
            return c67021QSb;
        }
    }
}
