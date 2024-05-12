package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes15.dex */
public final class W6D {
    public final W6U LIZ;
    public final W6X<W6U, W5A> LIZIZ;
    public final LinkedHashSet<W6U> LIZLLL = new LinkedHashSet<>();
    public final W6F LIZJ = new W6F(this);

    public final C81392Vwy<W5A> LIZJ() {
        W6U w6u;
        C81392Vwy<W5A> LJJ;
        do {
            synchronized (this) {
                Iterator<W6U> it = this.LIZLLL.iterator();
                if (it.hasNext()) {
                    w6u = it.next();
                    it.remove();
                } else {
                    w6u = null;
                }
            }
            if (w6u == null) {
                return null;
            }
            try {
                LJJ = this.LIZIZ.LJJ(w6u);
            } catch (Exception unused) {
                return null;
            }
        } while (LJJ == null);
        return LJJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(int i) {
        ArrayList LJIIIZ;
        if (i == -1) {
            return;
        }
        W6X<W6U, W5A> w6x = this.LIZIZ;
        W6E w6e = new W6E(this, i);
        w6x.getClass();
        ArrayList arrayList = new ArrayList();
        synchronized (w6x) {
            LJIIIZ = w6x.LJLIL.LJIIIZ(w6e);
            for (int i2 = 0; i2 < LJIIIZ.size(); i2++) {
                arrayList.add(w6x.LJLILLLLZI.LJIIIIZZ(((C81736W6a) LJIIIZ.get(i2)).LIZ));
            }
        }
        w6x.LJIILL(arrayList);
        W6X.LJIJ(LJIIIZ);
        w6x.LJIJJ();
        w6x.LJIILLIIL();
        arrayList.size();
    }

    public final boolean LIZIZ(int i) {
        boolean LIZIZ;
        W6X<W6U, W5A> w6x = this.LIZIZ;
        C81723W5n c81723W5n = new C81723W5n(this.LIZ, i);
        synchronized (w6x) {
            LIZIZ = w6x.LJLILLLLZI.LIZIZ(c81723W5n);
        }
        return LIZIZ;
    }

    public W6D(VIE vie, W6X w6x) {
        this.LIZ = vie;
        this.LIZIZ = w6x;
    }
}
