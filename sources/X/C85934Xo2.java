package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Xo2, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85934Xo2 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String msg) {
        o.LJIIIZ(msg, "msg");
    }

    public static void LIZJ(String str) {
        C188727au LIZLLL = KNV.LIZLLL(str, "pageLabel");
        LIZLLL.LJIIIZ("label", str);
        FMX.LJIIL("enter_push_setting_detail", LIZLLL.LIZ);
    }

    public static void LIZIZ(int i, String label) {
        String str;
        o.LJIIIZ(label, "label");
        if (i == 1) {
            str = "on";
        } else {
            str = "off";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("label", label);
        c188727au.LJIIIZ("to_status", str);
        FMX.LJIIL("notification_switch", c188727au.LIZ);
    }
}
