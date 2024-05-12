package X;

import android.system.Os;
import android.system.OsConstants;

/* loaded from: classes12.dex */
public class PLY {
    public static long LIZ = -1;

    public static long LIZ() {
        if (C64300PLk.LIZ == -1) {
            long j = LIZ;
            if (j <= 0) {
                j = Os.sysconf(OsConstants._SC_CLK_TCK);
                if (j <= 0) {
                    j = 100;
                }
                LIZ = j;
            }
            C64300PLk.LIZ = 1000 / j;
        }
        return C64300PLk.LIZ;
    }
}
