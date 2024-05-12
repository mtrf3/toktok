package X;

/* renamed from: X.0NR, reason: invalid class name */
/* loaded from: classes.dex */
public enum C0NR {
    CPU_FREQ_MIN("CPU_FREQ_MIN", "cpu_freq_min"),
    CPU_FREQ_MAX("CPU_FREQ_MAX", "cpu_freq_max"),
    CPU_CORE_MIN("CPU_CORE_MIN", "cpu_core_min"),
    CPU_CORE_MAX("CPU_CORE_MAX", "cpu_core_max"),
    GPU_FREQ_MIN("GPU_FREQ_MIN", "gpu_freq_min"),
    GPU_FREQ_MAX("GPU_FREQ_MAX", "gpu_freq_max"),
    BUS_FREQ_MIN("BUS_FREQ_MIN", "bus_freq_min"),
    BUS_FREQ_MAX("BUS_FREQ_MAX", "bus_freq_max"),
    UFS_FREQ_MIN("UFS_FREQ_MIN", "ufs_freq_min"),
    UFS_FREQ_MAX("UFS_FREQ_MAX", "ufs_freq_max"),
    TASK_PRIORITY("TASK_PRIORITY", "task_priority"),
    CPU_AFFINITY("CPU_AFFINITY", "cpu_affinity"),
    IDLE_STATE("IDLE_STATE", "idle_state"),
    IO_PRELOAD("IO_PRELOAD", "io_preload"),
    NETWORK_ENHANCE("NETWORK_ENHANCE", "network_enhance"),
    PRESET_SCENE("PRESET_SCENE", "preset_scene"),
    THUMB_FETCH("THUMB_FETCH", "thumb_fetch"),
    VIBRATE_ENHANCE("VIBRATE_ENHANCE", "vibrate_enhance"),
    TYPE_MIN(CPU_FREQ_MIN),
    TYPE_MAX(VIBRATE_ENHANCE);

    public final String LJLIL;
    public final int LJLILLLLZI;

    C0NR(String str, String str2) {
        this.LJLIL = str2;
        this.LJLILLLLZI = r2;
    }

    C0NR(C0NR c0nr) {
        this.LJLIL = c0nr.LJLIL;
        this.LJLILLLLZI = c0nr.LJLILLLLZI;
    }

    public static C0NR valueOf(String str) {
        return (C0NR) V0N.LJJJ(C0NR.class, str);
    }

    public int getIndex() {
        return this.LJLILLLLZI;
    }

    public String getName() {
        return this.LJLIL;
    }

    public static C0NR valueOf(int i) {
        for (C0NR c0nr : values()) {
            if (i == c0nr.LJLILLLLZI) {
                return c0nr;
            }
        }
        throw new RuntimeException(KMP.LJ("Can't find enum type for index: ", i));
    }
}
