package X;

/* renamed from: X.Wbd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82617Wbd<T> extends AbstractC82618Wbe<T> {
    public final AbstractC82618Wbe<T> LIZIZ;
    public T LIZJ;
    public boolean LIZLLL;

    public C82617Wbd(AbstractC82618Wbe<T> abstractC82618Wbe) {
        this.LIZIZ = abstractC82618Wbe;
    }

    @Override // X.AbstractC82618Wbe
    public final T LIZIZ(C82622Wbi c82622Wbi) {
        T t = this.LIZJ;
        if (t != null) {
            return t;
        }
        T LIZIZ = this.LIZIZ.LIZIZ(c82622Wbi);
        this.LIZJ = LIZIZ;
        return LIZIZ;
    }

    @Override // X.AbstractC82618Wbe
    public final void LIZ(T t, C82622Wbi c82622Wbi) {
        if (this.LIZLLL) {
            return;
        }
        this.LIZLLL = true;
        super.LIZ(t, c82622Wbi);
    }
}
