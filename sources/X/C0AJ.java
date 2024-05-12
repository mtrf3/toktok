package X;

import java.util.concurrent.Executor;

/* renamed from: X.0AJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0AJ<T> {
    public static final Object LIZJ = new Object();
    public static Executor LIZLLL = null;
    public Executor LIZ;
    public final AbstractC03160Am<T> LIZIZ;

    public final C0AL<T> LIZ() {
        if (this.LIZ == null) {
            synchronized (LIZJ) {
                if (LIZLLL == null) {
                    LIZLLL = C16880lQ.LLLLZ(2);
                }
            }
            this.LIZ = LIZLLL;
        }
        return new C0AL<>(this.LIZIZ, this.LIZ);
    }

    public C0AJ(AbstractC03160Am<T> abstractC03160Am) {
        this.LIZIZ = abstractC03160Am;
    }
}
