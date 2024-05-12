package X;

import java.io.PrintStream;
import java.lang.Thread;

/* loaded from: classes7.dex */
public final class EK7 implements Thread.UncaughtExceptionHandler {
    public final Thread.UncaughtExceptionHandler LIZ;
    public final long LIZIZ = C16880lQ.LLJJJJ().getThread().getId();

    public EK7(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.LIZ = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        PrintStream printStream = System.err;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("currentActivity=");
        LIZ.append(C84763XOl.LJIIIIZZ());
        printStream.println(X1D.LIZIZ(LIZ));
        PrintStream printStream2 = System.err;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("uncaughtException=");
        LIZ2.append(android.util.Log.getStackTraceString(th));
        printStream2.println(X1D.LIZIZ(LIZ2));
        if ((th instanceof IllegalStateException) && thread != null && thread.getId() != this.LIZIZ && th.getMessage() != null && "Results have already been set".equals(th.getMessage().trim())) {
            FUA.LIZJ("gms_crash_results_have_already_been_set", null);
            return;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.LIZ;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
