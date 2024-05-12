package X;

/* renamed from: X.9wV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C253079wV<T> implements C4G1<T>, InterfaceC252839w7<T> {
    public static final Object LIZJ = new Object();
    public volatile C4G1<T> LIZ;
    public volatile Object LIZIZ = LIZJ;

    @Override // X.C4G1
    public final T get() {
        boolean z;
        T t = (T) this.LIZIZ;
        Object obj = LIZJ;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.LIZIZ;
                if (t == obj) {
                    t = this.LIZ.get();
                    Object obj2 = this.LIZIZ;
                    if (obj2 != obj) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && obj2 != t) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Scoped provider was invoked recursively returning different results: ");
                        LIZ.append(obj2);
                        LIZ.append(" & ");
                        LIZ.append(t);
                        LIZ.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(X1D.LIZIZ(LIZ));
                    }
                    this.LIZIZ = t;
                    this.LIZ = null;
                }
            }
        }
        return t;
    }

    public C253079wV(C4G1<T> c4g1) {
        this.LIZ = c4g1;
    }

    public static <P extends C4G1<T>, T> C4G1<T> LIZ(P p) {
        if (p instanceof C253079wV) {
            return p;
        }
        return new C253079wV(p);
    }
}
