package X;

/* renamed from: X.1nu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43901nu extends AbstractC35381aA {
    public long LIZJ;

    @Override // X.InterfaceC23150vX
    public final void LIZIZ() {
        F9U.LIZ.LIZJ(new RunnableC23140vW(this, this.LIZ));
        this.LIZ = true;
    }

    @Override // X.InterfaceC23150vX
    public final void LJI() {
        F9U.LIZ.LIZJ(new RunnableC23140vW(this, this.LIZ));
        this.LIZ = false;
    }

    @Override // X.InterfaceC23150vX
    public final void LIZJ(C21270sV c21270sV, IRT irt) {
        if (irt.LIZIZ) {
            c21270sV.LIZJ += (long) ((irt.LJI / FQS.LIZLLL()) * 1000.0d);
        } else {
            c21270sV.LJII += (long) ((irt.LJI / FQS.LIZLLL()) * 1000.0d);
        }
    }
}
