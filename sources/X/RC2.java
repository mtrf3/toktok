package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class RC2 {
    public static void LIZ(Integer num, String enterMethod, String platform) {
        int i;
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(platform, "platform");
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("platform", platform);
        c35936E8m.LIZLLL("enter_method", enterMethod);
        if (num == null || num.intValue() != 0) {
            i = 0;
        } else {
            i = 1;
        }
        c35936E8m.LIZ(i, "is_success");
        c35936E8m.LIZ(1, "is_register");
        c35936E8m.LIZLLL("carrier", C85579XiJ.LIZ());
        if (num == null) {
            c35936E8m.LIZJ("error_code", "");
        } else {
            c35936E8m.LIZ(num.intValue(), "error_code");
        }
        FMX.LJIIL("register_click_next_result", c35936E8m.LIZ);
    }
}
