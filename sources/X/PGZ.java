package X;

import com.ss.android.ugc.aweme.legoImp.task.MemoryMonitorTask;

/* loaded from: classes12.dex */
public final class PGZ implements PGO {
    public final /* synthetic */ MemoryMonitorTask LIZ;

    public PGZ(MemoryMonitorTask memoryMonitorTask) {
        this.LIZ = memoryMonitorTask;
    }

    @Override // X.PGO
    public final void LIZ(PGY pgy) {
        try {
            String LIZLLL = ((PG9) PGH.LIZ(PG9.class)).LIZLLL();
            if (LIZLLL == null || LIZLLL.isEmpty()) {
                return;
            }
            this.LIZ.getClass();
            C76W c76w = new C76W();
            c76w.LIZ("memory_scene", LIZLLL);
            c76w.LIZ("gc_count", String.valueOf(pgy.LIZ));
            c76w.LIZ("gc_time", String.valueOf(pgy.LIZIZ));
            c76w.LIZ("blocking_gc_count", String.valueOf(pgy.LIZJ));
            c76w.LIZ("blocking_gc_time", String.valueOf(pgy.LIZLLL));
            c76w.LIZ("total_pss", String.valueOf(pgy.LJI));
            c76w.LIZ("native_pss", String.valueOf(pgy.LJFF));
            c76w.LIZ("graphics", String.valueOf(pgy.LJIIIZ));
            c76w.LIZ("java_used_memory", String.valueOf(pgy.LJII));
            c76w.LIZ("dalvik_used_size", String.valueOf(pgy.LJIIIIZZ));
            c76w.LIZ("vm_size", String.valueOf(pgy.LJIIJ));
            c76w.LIZ("is_memory_reach_top", String.valueOf(pgy.LJIIJJI));
            FMX.LJIILJJIL("prf_memory_monitor_with_scene_info", c76w.LIZIZ());
        } catch (Exception unused) {
        }
    }
}
