package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.T1h, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73969T1h {
    public static final AbstractC73946T0k LIZ;

    static {
        try {
            AbstractC73946T0k abstractC73946T0k = (AbstractC73946T0k) new CallableC73971T1j().call();
            if (abstractC73946T0k != null) {
                LIZ = abstractC73946T0k;
                return;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw C73864Syq.LIZIZ(th);
        }
    }

    public static AbstractC73946T0k LIZIZ() {
        AbstractC73946T0k abstractC73946T0k = LIZ;
        if (abstractC73946T0k != null) {
            return abstractC73946T0k;
        }
        throw new NullPointerException("scheduler == null");
    }

    public static C73967T1f LIZ(Looper looper) {
        if (looper != null) {
            return new C73967T1f(new Handler(looper), false);
        }
        throw new NullPointerException("looper == null");
    }
}
