package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;

/* loaded from: classes12.dex */
public final class PU8 extends PthreadThread {
    public PU8() {
        super("Okio Watchdog");
        setDaemon(true);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        PUA LIZ;
        while (true) {
            try {
                synchronized (PUA.class) {
                    LIZ = PU9.LIZ();
                    if (LIZ == PUA.LJIIIZ) {
                        PUA.LJIIIZ = null;
                        return;
                    }
                }
                if (LIZ != null) {
                    LIZ.LJIILIIL();
                }
            } catch (InterruptedException unused) {
                continue;
            } catch (Throwable th) {
                if (C39223FaN.LIZ(th)) {
                    return;
                } else {
                    throw th;
                }
            }
        }
    }
}
