package X;

/* renamed from: X.FTk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39028FTk<T> {
    public volatile T LIZ;

    public abstract Object LIZ();

    public final T LIZIZ(Object... objArr) {
        if (this.LIZ == null) {
            synchronized (this) {
                if (this.LIZ == null) {
                    this.LIZ = (T) LIZ();
                }
            }
        }
        return this.LIZ;
    }
}
