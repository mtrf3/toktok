package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.EventLoopImplBase;

/* loaded from: classes16.dex */
public final class XJE extends EventLoopImplBase implements Runnable {
    public static final XJE LJLIL;
    public static final long LJLILLLLZI;
    public static volatile Thread _thread;
    public static volatile int debugStatus;

    public final synchronized void LJJIJIL() {
        int i = debugStatus;
        if (i != 2 && i != 3) {
            return;
        }
        debugStatus = 3;
        resetAll();
        notifyAll();
    }

    static {
        Long l;
        XJE xje = new XJE();
        LJLIL = xje;
        AbstractC78624UtQ.incrementUseCount$default(xje, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        LJLILLLLZI = timeUnit.toNanos(l.longValue());
    }

    public final void LJJIZ() {
        boolean isEmpty;
        XJG.LIZ.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i != 2 && i != 3) {
                    debugStatus = 1;
                    notifyAll();
                    long j = Long.MAX_VALUE;
                    while (true) {
                        Thread.interrupted();
                        long processNextEvent = processNextEvent();
                        if (processNextEvent == Long.MAX_VALUE) {
                            long nanoTime = System.nanoTime();
                            if (j == Long.MAX_VALUE) {
                                j = LJLILLLLZI + nanoTime;
                            }
                            long j2 = j - nanoTime;
                            if (j2 <= 0) {
                                _thread = null;
                                LJJIJIL();
                                if (!isEmpty()) {
                                    getThread();
                                    return;
                                }
                                return;
                            }
                            if (processNextEvent > j2) {
                                processNextEvent = j2;
                            }
                        } else {
                            j = Long.MAX_VALUE;
                        }
                        if (processNextEvent > 0) {
                            int i2 = debugStatus;
                            if (i2 == 2 || i2 == 3) {
                                break;
                            } else {
                                LockSupport.parkNanos(this, processNextEvent);
                            }
                        }
                    }
                    if (!isEmpty) {
                        return;
                    } else {
                        return;
                    }
                }
                _thread = null;
                LJJIJIL();
                if (!isEmpty()) {
                    getThread();
                }
            }
        } finally {
            _thread = null;
            LJJIJIL();
            if (!isEmpty()) {
                getThread();
            }
        }
    }

    @Override // X.XJF
    public final Thread getThread() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LJJIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    @Override // kotlinx.coroutines.EventLoopImplBase, X.InterfaceC74210TAo
    public final T2N invokeOnTimeout(long j, Runnable runnable, MBA mba) {
        return scheduleInvokeOnTimeout(j, runnable);
    }
}
