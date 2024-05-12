package X;

import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class F8P implements InterfaceC38474F8c {
    @Override // X.InterfaceC38474F8c
    public final void registerCondition() {
    }

    @Override // X.InterfaceC38474F8c
    public final boolean LIZ(Object obj, Throwable th) {
        StackTraceElement[] stackTrace;
        String message;
        Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
        if (obj != null && th != null && LLLLIIIILLL != null && (stackTrace = LLLLIIIILLL.getStackTrace()) != null && stackTrace.length != 0) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (stackTraceElement != null && o.LJ("android.app.ActivityThread", stackTraceElement.getClassName()) && (message = th.getMessage()) != null && s.LJJJLZIJ(message, "android.os.DeadSystemException", false) && (o.LJ("handleCreateService", stackTraceElement.getMethodName()) || o.LJ("handleStopService", stackTraceElement.getMethodName()) || o.LJ("handleBindService", stackTraceElement.getMethodName()) || o.LJ("handleUnbindService", stackTraceElement.getMethodName()) || o.LJ("handleServiceArgs", stackTraceElement.getMethodName()))) {
                    PEH.LIZLLL(th, "binderlog");
                    return true;
                }
            }
        }
        return false;
    }
}
