package X;

/* loaded from: classes7.dex */
public final class G1B implements R5Y {
    public final /* synthetic */ G17 LIZ;
    public final /* synthetic */ boolean LIZIZ;

    @Override // X.R5Y
    public final void onFailure() {
        this.LIZ.LJFF();
        if (this.LIZIZ) {
            C19N.LIZJ(this.LIZ.LJ, "failure_count", 0, 1, "failure_count");
        }
        this.LIZ.LIZLLL();
    }

    @Override // X.R5Y
    public final void onSuccess() {
        this.LIZ.LJFF();
        G1T g1t = (G1T) this.LIZ.LIZ.LIZ(G1T.class);
        if (g1t != null) {
            g1t.Ys0(true);
        }
        this.LIZ.LIZLLL();
    }

    public G1B(G17 g17, boolean z) {
        this.LIZ = g17;
        this.LIZIZ = z;
    }
}
