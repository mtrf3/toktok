package X;

import kotlin.jvm.internal.o;

/* renamed from: X.36d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C784736d {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(String str) {
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        c1hq.put("enter_from", "chat_list_page");
        c1hq.put("target", str);
        onEventV3.LIZIZ("block_warning_click", c1hq);
    }

    public static void LIZJ(String str, boolean z) {
        String str2;
        C85323Wm LIZJ = C05040Hs.LIZJ(str, "origin", "onEventV3");
        C1HQ LIZIZ = C48339Iy7.LIZIZ("enter_from", str);
        if (z) {
            str2 = "unblock";
        } else {
            str2 = "cancel";
        }
        LIZIZ.put("target", str2);
        LIZJ.LIZIZ("unblock_confirm", LIZIZ);
    }

    public static void LIZ(String str, String str2, String str3) {
        C85323Wm LIZJ = C05040Hs.LIZJ(str, "origin", "onEventV3");
        C1HQ LIZJ2 = HXX.LIZJ("enter_from", str, "target", "block");
        LIZJ2.put("to_user_id", str2);
        if (str3 != null && str3.length() != 0) {
            LIZJ2.put("chat_type", str3);
        }
        LIZJ.LIZIZ("block_confirm", LIZJ2);
    }
}
