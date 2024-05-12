package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N68 {
    public final String LIZ;
    public long LIZIZ;
    public int LIZJ;
    public Runnable LIZLLL;
    public boolean LJ;
    public boolean LJFF;

    public final C59324NQa LIZ() {
        long j = this.LIZIZ;
        int i = this.LIZJ;
        Runnable runnable = this.LIZLLL;
        if (runnable != null) {
            return new C59324NQa(j, i, runnable, this.LJ, this.LJFF, this.LIZ);
        }
        o.LJIJI("callback");
        throw null;
    }

    public N68(String taskName) {
        o.LJIIIZ(taskName, "taskName");
        this.LIZ = taskName;
        this.LIZIZ = 1L;
    }

    public final void LIZIZ(long j) {
        if (j <= 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("taskName", this.LIZ);
            C78983UzD.LJIILLIIL("VideoPlayTaskInfo videoDuration <= 0 ", linkedHashMap);
            j = 1;
        }
        this.LIZIZ = j;
    }
}
