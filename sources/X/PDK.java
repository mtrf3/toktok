package X;

import com.ttnet.org.chromium.base.JavaHandlerThread;
import java.lang.Thread;

/* loaded from: classes12.dex */
public final class PDK implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ JavaHandlerThread LIZ;

    public PDK(JavaHandlerThread javaHandlerThread) {
        this.LIZ = javaHandlerThread;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        this.LIZ.LIZIZ = th;
    }
}
