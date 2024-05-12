package X;

/* loaded from: classes7.dex */
public class EHG<T> {
    public volatile boolean LIZ;
    public volatile boolean LIZIZ;
    public volatile T LIZJ;

    public T LIZIZ() {
        throw null;
    }

    public final T LIZ() {
        T t;
        if (this.LIZJ != null || this.LIZ) {
            return this.LIZJ;
        }
        if (this.LIZIZ) {
            return this.LIZJ;
        }
        synchronized (this) {
            if (this.LIZIZ) {
                t = this.LIZJ;
            } else {
                this.LIZJ = LIZIZ();
                this.LIZIZ = true;
                t = this.LIZJ;
            }
        }
        return t;
    }

    public final void LIZJ(T t) {
        this.LIZJ = t;
        this.LIZ = true;
    }
}
