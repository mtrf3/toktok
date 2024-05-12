package X;

/* renamed from: X.Wbm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC82626Wbm<T> {
    public volatile T LIZ;

    public abstract T LIZ();

    public final T LIZIZ() {
        if (this.LIZ == null) {
            synchronized (this) {
                if (this.LIZ == null) {
                    this.LIZ = LIZ();
                }
            }
        }
        return this.LIZ;
    }
}
