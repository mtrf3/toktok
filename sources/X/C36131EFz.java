package X;

import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.EFz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36131EFz implements Thread.UncaughtExceptionHandler {
    public static C36131EFz LIZJ;
    public Thread.UncaughtExceptionHandler LIZ;
    public final ArrayList<EG0> LIZIZ = new ArrayList<>();

    public C36131EFz() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != this) {
            this.LIZ = defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (this.LIZ != null) {
            synchronized (this) {
                try {
                    Iterator<EG0> it = this.LIZIZ.iterator();
                    while (it.hasNext()) {
                        if (it.next().LIZ(thread, th)) {
                            return;
                        }
                    }
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.LIZ;
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                    }
                } catch (Throwable th2) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.LIZ;
                    if (uncaughtExceptionHandler2 == null) {
                        return;
                    }
                    uncaughtExceptionHandler2.uncaughtException(thread, th2);
                }
            }
        }
    }
}
