package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3t4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98063t4 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Boolean bool) {
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        c1hq.put("enter_from", "chat");
        if (bool != null) {
            c1hq.put("if_draft", C98033t1.LIZ.get(bool));
        }
        onEventV3.LIZIZ("close_keyboard", c1hq);
    }

    public static void LIZIZ(String str) {
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        c1hq.put("enter_from", str);
        String str2 = C3Y4.LIZJ;
        if (str2 != null) {
            c1hq.put("process_id", str2);
        }
        onEventV3.LIZIZ("show_emoji_panel", c1hq);
    }

    public static void LIZJ(String str, String str2, Boolean bool, int i) {
        C85323Wm onEventV3 = null;
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        if ((i & 8) != 0) {
            onEventV3 = C772831o.LIZ();
        }
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        c1hq.put("enter_from", str);
        if (str2 != null && str2.length() > 0) {
            c1hq.put(WM7.SCENE_SERVICE, str2);
        }
        String str3 = C3Y4.LIZJ;
        if (str3 != null) {
            c1hq.put("process_id", str3);
        }
        if (bool != null) {
            c1hq.put("if_draft", C98033t1.LIZ.get(bool));
        }
        onEventV3.LIZIZ("show_keyboard", c1hq);
    }
}
