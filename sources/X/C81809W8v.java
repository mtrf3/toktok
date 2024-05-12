package X;

import java.util.HashMap;

/* renamed from: X.W8v, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81809W8v {
    public static final Class<?> LIZIZ = C81809W8v.class;
    public final java.util.Map<W6U, W8X> LIZ = new HashMap();

    public final synchronized void LIZIZ() {
        W58.LJIIJJI(LIZIZ, "Count = %d", Integer.valueOf(((HashMap) this.LIZ).size()));
    }

    public final synchronized W8X LIZ(W6U w6u) {
        w6u.getClass();
        W8X w8x = (W8X) ((HashMap) this.LIZ).get(w6u);
        if (w8x != null) {
            synchronized (w8x) {
                if (!W8X.LJIIJJI(w8x)) {
                    ((HashMap) this.LIZ).remove(w6u);
                    W58.LJIIZILJ(LIZIZ, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(w8x)), w6u.LIZ(), Integer.valueOf(System.identityHashCode(w6u)));
                    return null;
                }
                w8x = W8X.LIZ(w8x);
            }
        }
        return w8x;
    }

    public final void LIZJ(W6U w6u) {
        W8X w8x;
        w6u.getClass();
        synchronized (this) {
            w8x = (W8X) ((HashMap) this.LIZ).remove(w6u);
        }
        if (w8x == null) {
            return;
        }
        try {
            w8x.LJIIJ();
        } finally {
            w8x.close();
        }
    }

    public final synchronized void LIZLLL(W6U w6u, W8X w8x) {
        w6u.getClass();
        w8x.getClass();
        C32151Nz.LJI(W8X.LJIIJJI(w8x));
        W8X w8x2 = (W8X) ((HashMap) this.LIZ).get(w6u);
        if (w8x2 == null) {
            return;
        }
        C81392Vwy<InterfaceC81378Vwk> LIZLLL = w8x2.LIZLLL();
        C81392Vwy<InterfaceC81378Vwk> LIZLLL2 = w8x.LIZLLL();
        if (LIZLLL != null && LIZLLL2 != null) {
            try {
                if (LIZLLL.LJI() == LIZLLL2.LJI()) {
                    ((HashMap) this.LIZ).remove(w6u);
                    C81392Vwy.LJ(LIZLLL2);
                    C81392Vwy.LJ(LIZLLL);
                    W8X.LIZIZ(w8x2);
                    LIZIZ();
                }
            } finally {
                C81392Vwy.LJ(LIZLLL2);
                C81392Vwy.LJ(LIZLLL);
                W8X.LIZIZ(w8x2);
            }
        }
    }
}
