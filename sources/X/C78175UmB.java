package X;

/* renamed from: X.UmB, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78175UmB implements CHX {
    public final /* synthetic */ C78174UmA LIZ;

    public C78175UmB(C78174UmA c78174UmA) {
        this.LIZ = c78174UmA;
    }

    @Override // X.CHX
    public final void LIZLLL(double d) {
        this.LIZ.LIZIZ = Double.valueOf(d);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fps = ");
        LIZ.append(d);
        C32444CoK.LIZ(null, X1D.LIZIZ(LIZ));
        C32257ClJ.LIZ.post(new RunnableC78177UmD(this.LIZ, d));
    }
}
