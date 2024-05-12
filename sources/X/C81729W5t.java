package X;

/* renamed from: X.W5t, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81729W5t<T> {
    public volatile boolean LIZ;
    public volatile T LIZIZ;

    public T LIZIZ() {
        throw null;
    }

    public final T LIZ() {
        T t;
        if (this.LIZIZ != null) {
            return this.LIZIZ;
        }
        if (this.LIZ) {
            return this.LIZIZ;
        }
        synchronized (this) {
            if (this.LIZ) {
                t = this.LIZIZ;
            } else {
                this.LIZIZ = LIZIZ();
                this.LIZ = true;
                t = this.LIZIZ;
            }
        }
        return t;
    }
}
