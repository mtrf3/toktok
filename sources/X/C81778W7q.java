package X;

/* renamed from: X.W7q, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81778W7q extends W90<W8X, W8X> {
    public C81778W7q(W7F w7f) {
        super(w7f);
    }

    @Override // X.AbstractC81756W6u
    public final void LJII(int i, Object obj) {
        W8X w8x = (W8X) obj;
        if (w8x == null) {
            this.LIZIZ.LIZIZ(i, null);
            return;
        }
        if (w8x.LJLJJI < 0 || w8x.LJLJJLL < 0 || w8x.LJLJL < 0) {
            w8x.LJIIL();
        }
        this.LIZIZ.LIZIZ(i, w8x);
    }
}
