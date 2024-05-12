package X;

/* renamed from: X.Q1f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66323Q1f extends Q20 {
    public final String LIZJ;

    @Override // X.Q20
    public final boolean LIZIZ(C66343Q1z c66343Q1z) {
        return false;
    }

    public C66323Q1f(String str) {
        this.LIZJ = str;
    }

    @Override // X.Q20
    public final void LIZJ(C66343Q1z c66343Q1z) {
        c66343Q1z.LIZJ = Math.min(c66343Q1z.LIZJ, this.LIZIZ);
        c66343Q1z.LJ.add(this);
    }
}
