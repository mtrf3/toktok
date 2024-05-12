package X;

import java.lang.Thread;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.EdU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36868EdU {
    public static final List<CoroutineExceptionHandler> LIZ = OJ4.LJJLIIIIJ(OJ6.LJJIJLIJ(ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator()));

    public static final void LIZ(MBA mba, Throwable th) {
        Throwable runtimeException;
        Iterator<CoroutineExceptionHandler> it = LIZ.iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(mba, th);
            } catch (Throwable th2) {
                Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = LLLLIIIILLL.getUncaughtExceptionHandler();
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    V0N.LJFF(runtimeException, th);
                }
                uncaughtExceptionHandler.uncaughtException(LLLLIIIILLL, runtimeException);
            }
        }
        Thread LLLLIIIILLL2 = C16880lQ.LLLLIIIILLL();
        LLLLIIIILLL2.getUncaughtExceptionHandler().uncaughtException(LLLLIIIILLL2, th);
    }
}
