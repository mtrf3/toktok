package X;

import android.os.Handler;
import kotlin.jvm.internal.o;

/* renamed from: X.3lh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93493lh {
    public static final Handler LIZ = new Handler(C16880lQ.LLJJJJ());

    public static final void LIZ(Runnable runnable) {
        o.LJIIIZ(runnable, "runnable");
        if (C16880lQ.LLJJJJ().getThread() == C16880lQ.LLLLIIIILLL()) {
            runnable.run();
        } else {
            LIZ.post(runnable);
        }
    }
}
