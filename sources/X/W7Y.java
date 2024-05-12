package X;

import android.util.Pair;

/* loaded from: classes15.dex */
public final class W7Y extends AbstractC81797W8j<Pair<W6U, String>, C81392Vwy<W5A>> {
    public final W6O LIZJ;

    @Override // X.AbstractC81797W8j
    public final C81392Vwy<W5A> LIZJ(C81392Vwy<W5A> c81392Vwy) {
        return C81392Vwy.LIZJ(c81392Vwy);
    }

    @Override // X.AbstractC81797W8j
    public final C81392Vwy<W5A> LIZLLL(C81392Vwy<W5A> c81392Vwy) {
        C81392Vwy<W5A> c81392Vwy2 = c81392Vwy;
        if (c81392Vwy2 != null && c81392Vwy2.LJI() != null) {
            return C81392Vwy.LJIIL(c81392Vwy2.LJI().cloneOrNull());
        }
        return null;
    }

    @Override // X.AbstractC81797W8j
    public final C81828W9o LJI(C81392Vwy<W5A> c81392Vwy) {
        C81392Vwy<W5A> c81392Vwy2 = c81392Vwy;
        if (c81392Vwy2 != null && c81392Vwy2.LJI() != null) {
            return c81392Vwy2.LJI().getImageFormat();
        }
        return null;
    }

    @Override // X.AbstractC81797W8j
    public final Pair<W6U, String> LJII(InterfaceC81770W7i interfaceC81770W7i) {
        String valueOf;
        V91 LIZIZ = this.LIZJ.LIZIZ(interfaceC81770W7i.LJ(), interfaceC81770W7i.LIZIZ());
        if (!interfaceC81770W7i.LJ().LJIJJ) {
            valueOf = interfaceC81770W7i.getId();
        } else {
            valueOf = String.valueOf(interfaceC81770W7i.LJI().getValue());
        }
        return Pair.create(LIZIZ, valueOf);
    }

    public W7Y(W6O w6o, W7N w7n) {
        super(w7n);
        this.LIZJ = w6o;
    }
}
