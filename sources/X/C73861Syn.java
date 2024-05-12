package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Syn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73861Syn extends AtomicReference<Throwable> {
    public static final long serialVersionUID = 3949248817947090603L;

    public final Throwable LIZIZ() {
        Throwable th = get();
        C73862Syo c73862Syo = C73865Syr.LIZ;
        if (th != c73862Syo) {
            return getAndSet(c73862Syo);
        }
        return th;
    }

    public final boolean LIZ(Throwable th) {
        Throwable c63756P0m;
        while (true) {
            Throwable th2 = get();
            if (th2 == C73865Syr.LIZ) {
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
