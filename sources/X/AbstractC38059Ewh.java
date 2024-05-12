package X;

/* renamed from: X.Ewh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38059Ewh<T> {
    public volatile boolean LIZ;
    public volatile boolean LIZIZ;
    public T LIZJ;

    public abstract T LIZIZ();

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
                this.LIZIZ = true;
                this.LIZJ = LIZIZ();
                this.LIZIZ = true;
                t = this.LIZJ;
            }
        }
        return t;
    }
}
