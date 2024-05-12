package X;

/* loaded from: classes15.dex */
public class W74 extends W90<W8X, W8X> {
    public final InterfaceC81770W7i LIZJ;
    public final /* synthetic */ W75 LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.W90, X.AbstractC81756W6u
    public final void LJI(Throwable th) {
        this.LIZLLL.LIZIZ.LIZIZ(this.LIZIZ, this.LIZJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC81756W6u
    public final void LJII(int i, Object obj) {
        W8X w8x = (W8X) obj;
        W5O LJ = this.LIZJ.LJ();
        boolean LIZLLL = AbstractC81756W6u.LIZLLL(i);
        boolean LJJIJ = C78926UyI.LJJIJ(w8x, LJ.LJIIIIZZ);
        if (w8x != null && (LJJIJ || LJ.LJI)) {
            if (LIZLLL && LJJIJ) {
                this.LIZIZ.LIZIZ(i, w8x);
                return;
            } else {
                this.LIZIZ.LIZIZ(i & (-2), w8x);
            }
        }
        if (!LIZLLL || LJJIJ) {
            return;
        }
        W8X.LIZIZ(w8x);
        this.LIZLLL.LIZIZ.LIZIZ(this.LIZIZ, this.LIZJ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W74(W75 w75, W7F w7f, InterfaceC81770W7i interfaceC81770W7i) {
        super(w7f);
        this.LIZLLL = w75;
        this.LIZJ = interfaceC81770W7i;
    }
}
