package X;

/* loaded from: classes15.dex */
public abstract class W90<I, O> extends AbstractC81756W6u<I> {
    public final W7F<O> LIZIZ;

    @Override // X.AbstractC81756W6u
    public void LJFF() {
        this.LIZIZ.LIZJ();
    }

    public W90(W7F<O> w7f) {
        this.LIZIZ = w7f;
    }

    @Override // X.AbstractC81756W6u
    public void LJI(Throwable th) {
        this.LIZIZ.onFailure(th);
    }

    @Override // X.AbstractC81756W6u
    public void LJIIIIZZ(float f) {
        this.LIZIZ.LIZ(f);
    }
}
