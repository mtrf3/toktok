package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2vt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74332vt {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(boolean z, Integer num, long j, String str, Integer num2) {
        String str2;
        String str3;
        if (!z) {
            str2 = "fail";
        } else {
            str2 = "success";
        }
        if (num == null) {
            str3 = "unknown";
        } else if (num.intValue() == 0) {
            str3 = "unfollow";
        } else {
            str3 = "follow";
        }
        long j2 = -1;
        if (j != 0) {
            long currentTimeMillis = System.currentTimeMillis() - j;
            if (currentTimeMillis >= -1) {
                j2 = currentTimeMillis;
            }
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("type", str3);
        c188727au.LJIIIZ("result", str2);
        c188727au.LJ(j2, "duration");
        c188727au.LJIIIZ("event_type", str);
        if (o.LJ(str2, "fail")) {
            c188727au.LJFF(num2, "error_code");
        }
        FMX.LJIIL("follow_result", c188727au.LIZ);
    }
}
