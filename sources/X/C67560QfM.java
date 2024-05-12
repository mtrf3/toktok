package X;

import android.util.Base64;
import java.util.HashSet;

/* renamed from: X.QfM, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67560QfM implements QMY {
    public final C67555QfH LIZ;

    public C67560QfM(C67555QfH c67555QfH) {
        this.LIZ = c67555QfH;
    }

    @Override // X.QMY
    public final C67646Qgk LIZ(C67562QfO c67562QfO) {
        C67555QfH c67555QfH = this.LIZ;
        if (c67555QfH.LIZJ == null) {
            return C67637Qgb.LIZLLL(new ETJ(-2, null));
        }
        try {
            byte[] decode = Base64.decode(c67562QfO.LIZ, 10);
            Long l = c67562QfO.LIZIZ;
            c67555QfH.LIZ.LIZ("requestIntegrityToken(%s)", c67562QfO);
            final C67649Qgn c67649Qgn = new C67649Qgn();
            final C67574Qfa c67574Qfa = c67555QfH.LIZJ;
            C67561QfN c67561QfN = new C67561QfN(c67555QfH, c67649Qgn, decode, l, c67649Qgn, c67562QfO);
            synchronized (c67574Qfa.LJFF) {
                ((HashSet) c67574Qfa.LJ).add(c67649Qgn);
                c67649Qgn.LIZ.LIZIZ(new InterfaceC67661Qgz() { // from class: X.QfQ
                    @Override // X.InterfaceC67661Qgz
                    public final void onComplete(AbstractC67638Qgc abstractC67638Qgc) {
                        C67574Qfa c67574Qfa2 = C67574Qfa.this;
                        C67649Qgn c67649Qgn2 = c67649Qgn;
                        synchronized (c67574Qfa2.LJFF) {
                            ((HashSet) c67574Qfa2.LJ).remove(c67649Qgn2);
                        }
                    }
                });
            }
            synchronized (c67574Qfa.LJFF) {
                if (c67574Qfa.LJIIJ.getAndIncrement() > 0) {
                    C67554QfG c67554QfG = c67574Qfa.LIZIZ;
                    Object[] objArr = new Object[0];
                    if (android.util.Log.isLoggable("PlayCore", 3)) {
                        C67554QfG.LIZIZ(c67554QfG.LIZ, "Already connected to the service.", objArr);
                    } else {
                        c67554QfG.getClass();
                    }
                }
            }
            c67574Qfa.LIZ().post(new C67573QfZ(c67574Qfa, c67649Qgn, c67561QfN));
            return c67649Qgn.LIZ;
        } catch (IllegalArgumentException e) {
            return C67637Qgb.LIZLLL(new ETJ(-13, e));
        }
    }
}
