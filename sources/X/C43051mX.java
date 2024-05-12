package X;

/* renamed from: X.1mX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43051mX<T> extends C1UB<T> {
    public final Object LIZJ;

    @Override // X.C1UB, X.InterfaceC15090iX
    public final T LIZIZ() {
        T t;
        synchronized (this.LIZJ) {
            t = (T) super.LIZIZ();
        }
        return t;
    }

    public C43051mX(int i) {
        super(i);
        this.LIZJ = new Object();
    }

    @Override // X.C1UB, X.InterfaceC15090iX
    public final boolean LIZ(T t) {
        boolean LIZ;
        synchronized (this.LIZJ) {
            LIZ = super.LIZ(t);
        }
        return LIZ;
    }
}
