package X;

/* renamed from: X.EHb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36159EHb extends AbstractC36160EHc implements EG0 {
    public long LIZ;

    @Override // X.AbstractC36160EHc
    public final void LIZIZ() {
    }

    @Override // X.EG0
    public final boolean LIZ(Thread thread, Throwable th) {
        return LIZLLL(thread, th);
    }

    @Override // X.AbstractC36160EHc
    public final int LIZJ(Thread thread, Throwable th) {
        return LIZLLL(thread, th) ? 1 : 0;
    }

    public final boolean LIZLLL(Thread thread, Throwable th) {
        if (C16880lQ.LLJJJJ().getThread() == thread || System.currentTimeMillis() - this.LIZ < 10000) {
            return false;
        }
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (stackTraceElement.toString().startsWith("java.util.concurrent.ThreadPoolExecutor$Worker.run")) {
                this.LIZ = System.currentTimeMillis();
                return true;
            }
        }
        return false;
    }
}
