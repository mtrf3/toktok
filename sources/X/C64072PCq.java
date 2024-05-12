package X;

import java.lang.reflect.Method;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: X.PCq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64072PCq {
    public static final Method LIZ;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        LIZ = method;
    }
}
