package X;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.o;

/* renamed from: X.CCo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30946CCo {
    public static final void LIZ(Runnable runnable) {
        Handler LIZ = B73.LIZ();
        o.LJIIIIZZ(LIZ, "getMainHandler()");
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            runnable.run();
        } else {
            LIZ.post(runnable);
        }
    }
}
