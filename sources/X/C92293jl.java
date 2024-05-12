package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3jl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92293jl {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String enterFrom, int i, int i2, int i3) {
        C85323Wm onEventV3;
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        if ((i3 & 8) != 0) {
            onEventV3 = C772831o.LIZ();
        } else {
            onEventV3 = null;
        }
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        c1hq.put("enter_from", enterFrom);
        c1hq.put(WM7.SCENE_SERVICE, "prompt_dm_upgrade");
        c1hq.put("action_type", String.valueOf(i));
        if (i == 3) {
            c1hq.put("dm_everyone_toggle", String.valueOf(i2));
        }
        c1hq.put("banner_type", "everyone_permission");
        onEventV3.LIZIZ("click_expanded_dm_permission_pop_up", c1hq);
    }
}
