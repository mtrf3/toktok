package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Su4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73568Su4 extends AtomicReference<Throwable> {
    public static final long serialVersionUID = 3949248817947090603L;

    public Throwable terminate() {
        Throwable th = get();
        C73863Syp c73863Syp = C73864Syq.LIZ;
        if (th != c73863Syp) {
            return getAndSet(c73863Syp);
        }
        return th;
    }

    public boolean isTerminated() {
        if (get() == C73864Syq.LIZ) {
            return true;
        }
        return false;
    }

    public boolean addThrowable(Throwable th) {
        Throwable c63756P0m;
        while (true) {
            Throwable th2 = get();
            if (th2 == C73864Syq.LIZ) {
                return false;
            }
            if (th2 == null) {
                c63756P0m = th;
            } else {
                c63756P0m = new C63756P0m(th2, th);
            }
            while (!compareAndSet(th2, c63756P0m)) {
                if (get() != th2) {
                    break;
                }
            }
            return true;
        }
    }
}
