package X;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public final class PFH {
    public static volatile boolean LJFF = true;
    public long LIZ;
    public long LIZIZ;
    public final ConcurrentHashMap<String, PFK> LIZJ = new ConcurrentHashMap<>(4);
    public final String LIZLLL = "start_trace";
    public final String LJ = "launch_stats";

    public final boolean LIZ() {
        return "start_trace".equals(this.LIZLLL);
    }
}
