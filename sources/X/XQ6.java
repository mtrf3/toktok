package X;

import Y.ACallableS40S1100000_15;
import java.io.Serializable;
import java.util.concurrent.ExecutionException;

/* loaded from: classes16.dex */
public class XQ6<K, V> implements Serializable {
    public static final long serialVersionUID = 1;
    public final XQ3<K, V> LJLIL;

    public Object writeReplace() {
        return new XQ4(this.LJLIL);
    }

    public XQ6(XQ5<? super K, ? super V> xq5) {
        this.LJLIL = new XQ3<>(xq5);
    }

    public final V LIZIZ(Object obj) {
        XQ3<K, V> xq3 = this.LJLIL;
        xq3.getClass();
        obj.getClass();
        int LIZLLL = xq3.LIZLLL(obj);
        V v = (V) xq3.LJII(LIZLLL).LJII(LIZLLL, obj);
        if (v == null) {
            xq3.LJZ.LIZJ();
        } else {
            xq3.LJZ.LIZLLL();
        }
        return v;
    }

    public final Object LIZ(Object obj, ACallableS40S1100000_15 aCallableS40S1100000_15) {
        Object LJIIJJI;
        InterfaceC84796XPs<K, V> LJIIIZ;
        XQ3<K, V> xq3 = this.LJLIL;
        XPZ xpz = new XPZ(aCallableS40S1100000_15);
        xq3.getClass();
        obj.getClass();
        int LIZLLL = xq3.LIZLLL(obj);
        XQ2<K, V> LJII = xq3.LJII(LIZLLL);
        LJII.getClass();
        try {
            try {
                if (LJII.LJLILLLLZI != 0 && (LJIIIZ = LJII.LJIIIZ(LIZLLL, obj)) != null) {
                    long LIZ = LJII.LJLIL.LJLLLLLL.LIZ();
                    V LJIIJ = LJII.LJIIJ(LJIIIZ, LIZ);
                    if (LJIIJ != null) {
                        LJII.LJIILL(LJIIIZ, LIZ);
                        LJII.LJLLL.LIZLLL();
                        LJIIJJI = LJII.LJIL(LJIIIZ, obj, LIZLLL, LJIIJ, LIZ, xpz);
                    } else {
                        XPL<K, V> LIZLLL2 = LJIIIZ.LIZLLL();
                        if (LIZLLL2.isLoading()) {
                            LJIIJJI = LJII.LJJII(LJIIIZ, obj, LIZLLL2);
                        }
                    }
                    return LJIIJJI;
                }
                LJIIJJI = LJII.LJIIJJI(obj, LIZLLL, xpz);
                return LJIIJJI;
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (!(cause instanceof Error)) {
                    if (cause instanceof RuntimeException) {
                        throw new PNY(cause);
                    }
                    throw e;
                }
                throw new C68513Quj((Error) cause);
            }
        } finally {
            LJII.LJIIL();
        }
    }
}
