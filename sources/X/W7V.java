package X;

import android.os.SystemClock;
import java.util.HashMap;

/* loaded from: classes15.dex */
public final class W7V implements InterfaceC81759W6x<W8X> {
    public static V20 LIZLLL;
    public final W84 LIZ;
    public final WB4 LIZIZ;
    public final QGQ LIZJ;

    @Override // X.InterfaceC81759W6x
    public final void LIZIZ(W7F<W8X> w7f, InterfaceC81770W7i interfaceC81770W7i) {
        interfaceC81770W7i.LIZ().LIZ(interfaceC81770W7i.getId(), "NetworkFetchProducer");
        QGS LJ = this.LIZJ.LJ(w7f, interfaceC81770W7i);
        V20 v20 = LIZLLL;
        if (v20 != null && !v20.LIZ(LJ.LIZJ())) {
            LJFF(LJ, new Throwable("The expired url does not initiate the request"));
        } else {
            this.LIZJ.LIZIZ(LJ, new W7U(this, LJ));
        }
    }

    public final java.util.Map<String, String> LIZJ(QGS qgs, int i) {
        if (!qgs.LIZIZ().LJIIIZ(qgs.LIZ())) {
            return null;
        }
        return this.LIZJ.LIZ(qgs, i);
    }

    public final void LIZLLL(AbstractC81374Vwg abstractC81374Vwg, QGS qgs) {
        long j;
        long uptimeMillis = SystemClock.uptimeMillis();
        W5O LJ = qgs.LIZIZ.LJ();
        if (!qgs.LIZIZ.LIZJ()) {
            return;
        }
        this.LIZJ.LIZLLL();
        long j2 = uptimeMillis - qgs.LIZJ;
        if (LJ.LJJI) {
            j = 10;
        } else {
            j = 100;
        }
        if (j2 < j) {
            return;
        }
        qgs.LIZJ = uptimeMillis;
        qgs.LIZIZ().LJII(qgs.LIZ());
        LJ(abstractC81374Vwg, 0, qgs.LIZ, qgs.LJFF);
    }

    public final void LJFF(QGS qgs, Throwable th) {
        String LIZIZ;
        java.util.Map LIZJ = LIZJ(qgs, -1);
        if (LIZJ == null) {
            LIZJ = new HashMap(1);
        }
        if (this.LIZJ == null) {
            LIZIZ = "null";
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LIZJ.getClass().getName());
            LIZ.append(", ");
            LIZ.append(this.LIZJ.toString());
            LIZIZ = X1D.LIZIZ(LIZ);
        }
        LIZJ.put("NetworkFetcher", LIZIZ);
        qgs.LIZIZ().LJI(qgs.LIZ(), "NetworkFetchProducer", th, LIZJ);
        qgs.LIZIZ().LIZLLL(qgs.LIZ(), "NetworkFetchProducer", false);
        qgs.LIZ.onFailure(th);
    }

    public W7V(W84 w84, WB4 wb4, QGQ qgq) {
        this.LIZ = w84;
        this.LIZIZ = wb4;
        this.LIZJ = qgq;
    }

    public static void LJ(AbstractC81374Vwg abstractC81374Vwg, int i, W7F w7f, java.util.Map map) {
        C81392Vwy LJIIL = C81392Vwy.LJIIL(((C81373Vwf) abstractC81374Vwg).LIZ());
        W8X w8x = null;
        try {
            W8X w8x2 = new W8X(LJIIL);
            try {
                w8x2.LJLLL = map;
                C81392Vwy<InterfaceC81378Vwk> c81392Vwy = w8x2.LJLIL;
                if (c81392Vwy != null && (c81392Vwy.LJI() instanceof C81379Vwl)) {
                    ((C81379Vwl) w8x2.LJLIL.LJI()).LJLILLLLZI = map;
                }
                w8x2.LJLL = null;
                w8x2.LJIIL();
                w8x2.LJLZ = false;
                w8x2.LJLLLLLL = false;
                w8x2.LJLLLL = true;
                w7f.LIZIZ(i, w8x2);
                W8X.LIZIZ(w8x2);
                C81392Vwy.LJ(LJIIL);
            } catch (Throwable th) {
                th = th;
                w8x = w8x2;
                W8X.LIZIZ(w8x);
                C81392Vwy.LJ(LJIIL);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
