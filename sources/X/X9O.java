package X;

/* loaded from: classes16.dex */
public final class X9O extends X9P {
    public final Runnable LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            try {
                this.LJLJI.run();
                this.LJLILLLLZI.LJIILIIL();
            } catch (Throwable th) {
                this.LJLILLLLZI.LJIILIIL();
                throw th;
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Task[");
        LIZ.append(C16880lQ.LJLLJ(this.LJLJI.getClass()));
        LIZ.append('@');
        LIZ.append(C65314PkE.LJI(this.LJLJI));
        LIZ.append(", ");
        LIZ.append(this.LJLIL);
        LIZ.append(", ");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(']');
        return X1D.LIZIZ(LIZ);
    }

    public X9O(Runnable runnable, long j, X9R x9r) {
        super(j, x9r);
        this.LJLJI = runnable;
    }
}
