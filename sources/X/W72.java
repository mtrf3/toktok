package X;

/* loaded from: classes15.dex */
public class W72 extends W90<W8X, W8X> {
    public final InterfaceC81770W7i LIZJ;
    public final int LIZLLL;
    public final C79238V7y LJ;
    public final /* synthetic */ W71 LJFF;

    @Override // X.W90, X.AbstractC81756W6u
    public final void LJI(Throwable th) {
        if (!this.LJFF.LIZJ(this.LIZLLL + 1, this.LIZIZ, this.LIZJ)) {
            this.LIZIZ.onFailure(th);
        }
    }

    @Override // X.AbstractC81756W6u
    public final void LJII(int i, Object obj) {
        W8X w8x = (W8X) obj;
        if (w8x != null && (AbstractC81756W6u.LJ(i) || C78926UyI.LJJIJ(w8x, this.LJ))) {
            this.LIZIZ.LIZIZ(i, w8x);
        } else {
            if (!AbstractC81756W6u.LIZLLL(i)) {
                return;
            }
            W8X.LIZIZ(w8x);
            if (this.LJFF.LIZJ(this.LIZLLL + 1, this.LIZIZ, this.LIZJ)) {
                return;
            }
            this.LIZIZ.LIZIZ(1, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W72(W71 w71, W7F<W8X> w7f, InterfaceC81770W7i interfaceC81770W7i, int i) {
        super(w7f);
        this.LJFF = w71;
        this.LIZJ = interfaceC81770W7i;
        this.LIZLLL = i;
        this.LJ = interfaceC81770W7i.LJ().LJIIIIZZ;
    }
}
