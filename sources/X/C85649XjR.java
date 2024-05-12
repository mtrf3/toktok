package X;

import kotlin.jvm.internal.o;

/* renamed from: X.XjR, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85649XjR {
    public static void LIZ(boolean z, String enterMethod, String platform, int i, String str, int i2) {
        if ((i2 & 4) != 0) {
            platform = "phone";
        }
        if ((i2 & 8) != 0) {
            i = 0;
        }
        if ((i2 & 16) != 0) {
            str = null;
        }
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(platform, "platform");
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("platform", platform);
        c35936E8m.LIZLLL("enter_method", enterMethod);
        c35936E8m.LIZ(z ? 1 : 0, "is_success");
        c35936E8m.LIZ(0, "is_register");
        c35936E8m.LIZLLL("error_code", String.valueOf(i));
        if (str == null) {
            str = "";
        }
        c35936E8m.LIZLLL("enter_from", str);
        c35936E8m.LIZLLL("carrier", C85579XiJ.LIZ());
        FMX.LJIIL("login_click_next_result", c35936E8m.LIZ);
    }
}
