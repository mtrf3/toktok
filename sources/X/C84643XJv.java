package X;

/* renamed from: X.XJv, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84643XJv<E> extends C84631XJj<XK1> {
    public C84643XJv(XJT xjt) {
        super(xjt);
    }

    @Override // X.C84631XJj, X.AbstractC84633XJl
    public final Object LIZJ(C84629XJh c84629XJh) {
        if (c84629XJh instanceof XK0) {
            return c84629XJh;
        }
        if (!(c84629XJh instanceof XK1)) {
            return XKK.LIZLLL;
        }
        return null;
    }

    @Override // X.AbstractC84633XJl
    public final Object LJII(C84632XJk c84632XJk) {
        C3BS LJJIIJZLJL = ((XK1) c84632XJk.LIZ).LJJIIJZLJL(c84632XJk);
        if (LJJIIJZLJL == null) {
            return C84639XJr.LIZ;
        }
        C3BS c3bs = XJW.LIZIZ;
        if (LJJIIJZLJL == c3bs) {
            return c3bs;
        }
        return null;
    }

    @Override // X.AbstractC84633XJl
    public final void LJIIIIZZ(C84629XJh c84629XJh) {
        ((XK1) c84629XJh).LJJIIZI();
    }
}
