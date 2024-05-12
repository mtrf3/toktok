package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;

/* renamed from: X.Eig, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37190Eig {
    public static final Handler LIZ;
    public static final C37187Eid LIZIZ;

    static {
        HandlerThread handlerThread = new HandlerThread("AsyncInflateHandler");
        LIZIZ = new C37187Eid();
        handlerThread.start();
        LIZ = new Handler(handlerThread.getLooper());
        Process.setThreadPriority(handlerThread.getThreadId(), -20);
    }
}
