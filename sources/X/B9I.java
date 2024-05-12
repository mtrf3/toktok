package X;

/* loaded from: classes6.dex */
public final class B9I implements VCA {
    public final /* synthetic */ B9S LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ int LJ;

    public B9I(B9S b9s, int i, String str, String str2, int i2) {
        this.LIZ = b9s;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = i2;
    }

    @Override // X.VCA
    public final void LIZ(boolean z) {
        B9S b9s = this.LIZ;
        b9s.LJLJLJ.post(new B9H(z, b9s, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ));
    }
}
