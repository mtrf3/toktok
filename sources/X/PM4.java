package X;

import android.os.Process;
import java.lang.Thread;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes12.dex */
public final class PM4 implements Thread.UncaughtExceptionHandler {
    public static final PM5 LIZJ = new PM5();
    public final CopyOnWriteArraySet<PM6> LIZ = new CopyOnWriteArraySet<>();
    public final Thread.UncaughtExceptionHandler LIZIZ = Thread.getDefaultUncaughtExceptionHandler();

    public PM4() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Iterator<PM6> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.LIZIZ;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        try {
            Process.killProcess(Process.myPid());
            System.exit(10);
        } catch (Throwable unused) {
        }
    }
}
