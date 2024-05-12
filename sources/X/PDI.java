package X;

import java.lang.Thread;

/* loaded from: classes12.dex */
public final class PDI implements Thread.UncaughtExceptionHandler {
    public final String LIZ;
    public final /* synthetic */ C67284Qau LIZIZ;

    public PDI(C67284Qau c67284Qau, String str) {
        this.LIZIZ = c67284Qau;
        this.LIZ = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.LIZIZ.LIZ.LIZJ().LJFF.LIZIZ(th, this.LIZ);
    }
}
