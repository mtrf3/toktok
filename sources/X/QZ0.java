package X;

/* loaded from: classes12.dex */
public final class QZ0<T> implements C6Y7<T> {
    public static final Object LIZJ = new Object();
    public volatile Object LIZ = LIZJ;
    public volatile C6Y7<T> LIZIZ;

    @Override // X.C6Y7
    public final T get() {
        T t = (T) this.LIZ;
        Object obj = LIZJ;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.LIZ;
                if (t == obj) {
                    t = this.LIZIZ.get();
                    this.LIZ = t;
                    this.LIZIZ = null;
                }
            }
        }
        return t;
    }

    public QZ0(C6Y7<T> c6y7) {
        this.LIZIZ = c6y7;
    }
}
