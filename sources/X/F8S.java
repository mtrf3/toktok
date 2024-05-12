package X;

import java.util.concurrent.TimeoutException;

/* loaded from: classes7.dex */
public final class F8S extends F8T {
    @Override // X.F8Y
    public final String LIZIZ() {
        return "FinalizeTimeoutPlugin";
    }

    @Override // X.F8T
    public final boolean LJFF() {
        return true;
    }

    @Override // X.F8T, X.F8Y
    public final void LIZLLL() {
        super.LIZLLL();
    }

    @Override // X.F8Z
    public final boolean LIZ(Thread thread, Throwable th) {
        if (thread != null && th != null && thread.getName().equals("FinalizerWatchdogDaemon") && (th instanceof TimeoutException)) {
            F8X.LIZ();
            return true;
        }
        return false;
    }
}
