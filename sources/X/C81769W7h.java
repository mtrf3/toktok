package X;

/* renamed from: X.W7h, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81769W7h extends W90<W8X, C81392Vwy<InterfaceC81378Vwk>> {
    public C81769W7h(W7F w7f) {
        super(w7f);
    }

    @Override // X.AbstractC81756W6u
    public final void LJII(int i, Object obj) {
        W8X w8x = (W8X) obj;
        C81392Vwy<InterfaceC81378Vwk> c81392Vwy = null;
        try {
            if (W8X.LJIIJJI(w8x)) {
                c81392Vwy = w8x.LIZLLL();
            }
            this.LIZIZ.LIZIZ(i, c81392Vwy);
        } finally {
            C81392Vwy.LJ(c81392Vwy);
        }
    }
}
