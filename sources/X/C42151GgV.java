package X;

/* renamed from: X.GgV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42151GgV {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(long j, String str) {
        C188727au LIZLLL = KNV.LIZLLL(str, "checkerName");
        LIZLLL.LJIIIZ("checker_name", str);
        LIZLLL.LJ(System.currentTimeMillis() - j, "finish_time_from_start");
        FMX.LJIIL("tool_performance_publish_check_finish", LIZLLL.LIZ);
    }

    public static void LIZ(long j, String str, String str2, boolean z) {
        C188727au LIZ2 = C78928UyK.LIZ(str, "checkerName", str2, "checkName");
        LIZ2.LJIIIZ("checker_name", str);
        LIZ2.LJ(System.currentTimeMillis() - j, "cancel_time_from_start");
        LIZ2.LJIIIZ("check_name", str2);
        LIZ2.LJFF(Boolean.valueOf(z), "is_time_out");
        FMX.LJIIL("tool_performance_publish_check_cancel", LIZ2.LIZ);
    }
}
