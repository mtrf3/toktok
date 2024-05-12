package X;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.o;

/* renamed from: X.DyC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35604DyC {
    public static final Handler LIZ = new Handler(C16880lQ.LLJJJJ());

    public static final void LIZ(Runnable runnable) {
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            runnable.run();
        } else {
            LIZ.post(runnable);
        }
    }
}
