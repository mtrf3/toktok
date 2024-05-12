package X;

import kotlin.jvm.internal.o;

/* renamed from: X.31B, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C31B {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(C31J c31j) {
        int i = C31I.LIZ[c31j.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "settings_page";
                }
                throw new C162476Zf();
            }
            return "report_banner";
        }
        return "block_banner";
    }

    public static void LIZ(C31J enterMethod, String str) {
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(onEventV3, "onEventV3");
        onEventV3.LIZIZ("click_dm_filtered_keyword_banner", C62814Ol0.LJFF(new OSZ("enter_method", LIZIZ(enterMethod)), new OSZ("action", str)));
    }
}
