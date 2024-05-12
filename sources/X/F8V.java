package X;

import android.os.Looper;
import java.lang.Thread;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes7.dex */
public final class F8V implements Thread.UncaughtExceptionHandler {
    public boolean LIZ;
    public Thread.UncaughtExceptionHandler LIZIZ;
    public final List<F8Z> LIZJ = new LinkedList();

    public final boolean LIZ(Thread thread, Throwable th) {
        try {
            synchronized (this.LIZJ) {
                Iterator<F8Z> it = this.LIZJ.iterator();
                while (it.hasNext()) {
                    try {
                    } catch (Throwable th2) {
                        th2.toString();
                    }
                    if (it.next().LIZ(thread, th)) {
                        return true;
                    }
                }
                return false;
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        if (th != null) {
            Throwable th2 = th;
            int i = 0;
            while (true) {
                try {
                    if (th2 instanceof OutOfMemoryError) {
                        break;
                    }
                    if (i > 20) {
                        break;
                    }
                    i++;
                    th2 = th2.getCause();
                    if (th2 != null) {
                    }
                } catch (Throwable unused) {
                }
            }
        }
        try {
            if (LIZ(thread, th)) {
                if (thread != null && thread.getName().equals("main")) {
                    loop1: while (true) {
                        try {
                            Looper.loop();
                        } catch (Exception e) {
                            Throwable th3 = e;
                            int i2 = 0;
                            do {
                                try {
                                    if (th3 instanceof OutOfMemoryError) {
                                        break loop1;
                                    }
                                    if (i2 > 20) {
                                        break;
                                    }
                                    i2++;
                                    th3 = th3.getCause();
                                } catch (Throwable unused2) {
                                }
                            } while (th3 != null);
                            if (!LIZ(thread, e)) {
                                uncaughtExceptionHandler = this.LIZIZ;
                                if (uncaughtExceptionHandler == null) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                    uncaughtExceptionHandler = this.LIZIZ;
                    if (uncaughtExceptionHandler == null && uncaughtExceptionHandler != this) {
                        uncaughtExceptionHandler.uncaughtException(thread, e);
                        return;
                    }
                    return;
                }
                return;
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.LIZIZ;
            if (uncaughtExceptionHandler2 != null && uncaughtExceptionHandler2 != this) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
        } catch (Throwable th4) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.LIZIZ;
            if (uncaughtExceptionHandler3 != null && uncaughtExceptionHandler3 != this) {
                uncaughtExceptionHandler3.uncaughtException(thread, th4);
            }
        }
    }
}
