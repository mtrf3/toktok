package X;

/* renamed from: X.4LK, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4LK<T> implements C4G1<T> {
    public static final Object LIZJ = new Object();
    public volatile C4G1<T> LIZ;
    public volatile Object LIZIZ = LIZJ;

    @Override // X.C4G1
    public final T get() {
        T t = (T) this.LIZIZ;
        if (t == LIZJ) {
            C4G1<T> c4g1 = this.LIZ;
            if (c4g1 == null) {
                return (T) this.LIZIZ;
            }
            T t2 = c4g1.get();
            this.LIZIZ = t2;
            this.LIZ = null;
            return t2;
        }
        return t;
    }

    public C4LK(C4G1<T> c4g1) {
        this.LIZ = c4g1;
    }

    public static <P extends C4G1<T>, T> C4G1<T> LIZ(P p) {
        if ((p instanceof C4LK) || (p instanceof C253079wV)) {
            return p;
        }
        return new C4LK(p);
    }
}
