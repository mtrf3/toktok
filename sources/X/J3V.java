package X;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes9.dex */
public class J3V {
    public static boolean LIZ;

    public static ScheduledExecutorService LIZ() {
        if (J3Y.LIZ && !LIZ) {
            LIZ = true;
            J3Y.LIZJ("ml#task", "use Default ScheduledExecutorService!", new Throwable("for debug!!"));
        }
        return J3W.LIZ;
    }
}
