package X;

/* renamed from: X.Vun, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81257Vun implements W4P<W4W<C81392Vwy<W5A>>> {
    public final /* synthetic */ W5O LIZ;
    public final /* synthetic */ Object LIZIZ = null;
    public final /* synthetic */ W50 LIZJ;
    public final /* synthetic */ W6J LIZLLL;

    @Override // X.W4P
    public final W4W<C81392Vwy<W5A>> get() {
        W92 w92;
        W6J w6j = this.LIZLLL;
        W5O w5o = this.LIZ;
        Object obj = this.LIZIZ;
        W50 w50 = this.LIZJ;
        w6j.getClass();
        if (w5o != null) {
            w92 = w5o.LJIIJJI;
        } else {
            w92 = W92.HIGH;
        }
        return w6j.LIZLLL(w5o, obj, w50, null, w92);
    }

    public final String toString() {
        C81254Vuk LIZIZ = C81256Vum.LIZIZ(this);
        LIZIZ.LIZIZ(this.LIZ.LIZIZ, "uri");
        return LIZIZ.toString();
    }

    public C81257Vun(W6J w6j, W5O w5o, W50 w50) {
        this.LIZLLL = w6j;
        this.LIZ = w5o;
        this.LIZJ = w50;
    }
}
