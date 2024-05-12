package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public abstract class JFP<T> {
    public volatile T LIZ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    public abstract T LIZ(Object... objArr);

    public final T LIZIZ(Object... objArr) {
        if (!this.LIZIZ.get() && this.LIZ == null) {
            synchronized (this) {
                if (!this.LIZIZ.get() && this.LIZ == null) {
                    this.LIZ = LIZ(objArr);
                    this.LIZIZ.set(true);
                }
            }
        }
        return this.LIZ;
    }
}
