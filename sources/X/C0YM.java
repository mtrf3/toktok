package X;

/* renamed from: X.0YM, reason: invalid class name */
/* loaded from: classes.dex */
public class C0YM<T> {
    public volatile boolean LIZ = false;
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
            if (!this.LIZ) {
                this.LIZIZ = LIZIZ();
                this.LIZ = true;
            }
            t = this.LIZIZ;
        }
        return t;
    }
}
