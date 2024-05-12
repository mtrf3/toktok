package X;

import android.util.Pair;

/* loaded from: classes15.dex */
public class W7Z extends AbstractC81797W8j<Pair<W6U, String>, W8X> {
    public final W6O LIZJ;

    @Override // X.AbstractC81797W8j
    public final W8X LIZJ(W8X w8x) {
        return W8X.LIZ(w8x);
    }

    @Override // X.AbstractC81797W8j
    public final C81828W9o LJI(W8X w8x) {
        W8X w8x2 = w8x;
        if (w8x2 != null) {
            w8x2.LJIILIIL();
            return w8x2.LJLJI;
        }
        return null;
    }

    @Override // X.AbstractC81797W8j
    /* renamed from: LJIIIZ, reason: merged with bridge method [inline-methods] */
    public Pair<W6U, String> LJII(InterfaceC81770W7i interfaceC81770W7i) {
        String valueOf;
        C245519kJ LIZ = this.LIZJ.LIZ(interfaceC81770W7i.LJ(), interfaceC81770W7i.LIZIZ());
        if (!interfaceC81770W7i.LJ().LJIJJ) {
            valueOf = interfaceC81770W7i.getId();
        } else {
            valueOf = String.valueOf(interfaceC81770W7i.LJI().getValue());
        }
        return Pair.create(LIZ, valueOf);
    }

    public W7Z(W6O w6o, InterfaceC81759W6x interfaceC81759W6x) {
        super(interfaceC81759W6x);
        this.LIZJ = w6o;
    }
}
