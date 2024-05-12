package X;

import android.app.ActivityManager;
import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.Iy8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48340Iy8 {
    public static final long LIZ(Context c) {
        o.LJIIIZ(c, "c");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        Object LLILL = C16880lQ.LLILL(c, "activity");
        o.LJII(LLILL, "null cannot be cast to non-null type android.app.ActivityManager");
        ((ActivityManager) LLILL).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }
}
