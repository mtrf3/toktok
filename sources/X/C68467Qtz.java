package X;

/* renamed from: X.Qtz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68467Qtz {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, long j, long j2, String str, boolean z) {
        String str2;
        OSZ[] oszArr = new OSZ[5];
        oszArr[0] = new OSZ("task_id", str);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        str2 = "non_login";
                    }
                } else {
                    str2 = "do_notify";
                }
            } else {
                str2 = "pre_wake";
            }
            oszArr[1] = new OSZ("task_type", str2);
            oszArr[2] = new OSZ("wakeup_delay_in_ms", String.valueOf(j2));
            oszArr[3] = new OSZ("actual_timestamp", String.valueOf(j));
            oszArr[4] = new OSZ("launch_status", "succeed");
            FMX.LJIILIIL("work_manager_launch", C113554cx.LJJL(oszArr), z);
        }
        str2 = "silent";
        oszArr[1] = new OSZ("task_type", str2);
        oszArr[2] = new OSZ("wakeup_delay_in_ms", String.valueOf(j2));
        oszArr[3] = new OSZ("actual_timestamp", String.valueOf(j));
        oszArr[4] = new OSZ("launch_status", "succeed");
        FMX.LJIILIIL("work_manager_launch", C113554cx.LJJL(oszArr), z);
    }
}
