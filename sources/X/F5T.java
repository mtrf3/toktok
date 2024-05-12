package X;

import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class F5T {
    public static final long LIZ;
    public static final long LIZIZ;
    public static final long LIZJ;
    public static final boolean LIZLLL;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        LIZ = timeUnit.toMillis(15L);
        LIZIZ = timeUnit.toMillis(1L);
        LIZJ = timeUnit.toMillis(1L);
        LIZLLL = C19N.LJ("aab_plugin_aggressive_download_mode", true);
    }
}
