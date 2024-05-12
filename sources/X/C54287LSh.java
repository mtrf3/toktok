package X;

import com.ss.android.common.applog.AppLog;
import kotlin.jvm.internal.o;

/* renamed from: X.LSh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54287LSh {
    public static boolean LIZ;
    public static boolean LIZIZ;

    public static C54288LSi LIZ() {
        if (C54288LSi.LIZJ == null || !o.LJ(C54288LSi.LIZIZ, AppLog.getServerDeviceId())) {
            synchronized (C54288LSi.class) {
                C54288LSi.LIZIZ = AppLog.getServerDeviceId();
                C54288LSi.LIZJ = new C54288LSi();
            }
        }
        return C54288LSi.LIZJ;
    }
}
