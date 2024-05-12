package X;

import android.util.Pair;

/* renamed from: X.W7b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81763W7b extends W7Z {
    public final W6O LIZLLL;

    @Override // X.W7Z, X.AbstractC81797W8j
    public final /* bridge */ /* synthetic */ Pair<W6U, String> LJII(InterfaceC81770W7i interfaceC81770W7i) {
        return LJII(interfaceC81770W7i);
    }

    @Override // X.W7Z
    /* renamed from: LJIIIZ */
    public final Pair<W6U, String> LJII(InterfaceC81770W7i interfaceC81770W7i) {
        String valueOf;
        W5O LJ = interfaceC81770W7i.LJ();
        W6O w6o = this.LIZLLL;
        interfaceC81770W7i.LIZIZ();
        C61834OOo LIZJ = w6o.LIZJ(LJ);
        if (!interfaceC81770W7i.LJ().LJIJJ) {
            valueOf = interfaceC81770W7i.getId();
        } else {
            valueOf = String.valueOf(interfaceC81770W7i.LJI().getValue());
        }
        return Pair.create(LIZJ, valueOf);
    }

    public C81763W7b(W6O w6o, C81765W7d c81765W7d) {
        super(w6o, c81765W7d);
        this.LIZLLL = w6o;
    }
}
