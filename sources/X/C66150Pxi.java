package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Pxi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66150Pxi {
    public static final ConcurrentHashMap<String, C66120PxE> LIZ = new ConcurrentHashMap<>();

    public static void LIZ(String str, C66120PxE postEvent) {
        StackTraceElement[] stackTraceElementArr;
        Throwable th;
        o.LJIIIZ(postEvent, "postEvent");
        C66120PxE c66120PxE = LIZ.get(str);
        StackTraceElement[] stackTraceElementArr2 = null;
        if (c66120PxE != null && (th = c66120PxE.LJLJJLL) != null) {
            stackTraceElementArr = th.getStackTrace();
        } else {
            stackTraceElementArr = null;
        }
        Throwable th2 = postEvent.LJLJJLL;
        if (th2 != null) {
            stackTraceElementArr2 = th2.getStackTrace();
        }
        if (stackTraceElementArr == null || stackTraceElementArr2 == null) {
            return;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[stackTraceElementArr.length + stackTraceElementArr2.length];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, stackTraceElementArr2.length);
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr3, stackTraceElementArr2.length, stackTraceElementArr.length);
        Throwable th3 = postEvent.LJLJJLL;
        if (th3 != null) {
            th3.setStackTrace(stackTraceElementArr3);
        }
        postEvent.LIZLLL(postEvent.LJLJJLL);
    }
}
