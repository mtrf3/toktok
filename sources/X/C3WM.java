package X;

import android.util.ArrayMap;
import kotlin.jvm.internal.o;

/* renamed from: X.3WM, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3WM {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, C3WN c3wn) {
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        int i = 0;
        OSZ[] oszArr = {new OSZ("enter_from", "chat"), new OSZ("conversation_id", str), new OSZ("moderation_status", c3wn.LIZ), new OSZ("action", "view_details")};
        ArrayMap arrayMap = new ArrayMap();
        do {
            OSZ osz = oszArr[i];
            arrayMap.put(osz.getFirst(), osz.getSecond());
            i++;
        } while (i < 4);
        onEventV3.LIZIZ("click_group_moderation_banner", arrayMap);
    }

    public static void LIZIZ(String str, C3WN c3wn) {
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        int i = 0;
        OSZ[] oszArr = {new OSZ("enter_from", "chat"), new OSZ("conversation_id", str), new OSZ("moderation_status", c3wn.LIZ)};
        ArrayMap arrayMap = new ArrayMap();
        do {
            OSZ osz = oszArr[i];
            arrayMap.put(osz.getFirst(), osz.getSecond());
            i++;
        } while (i < 3);
        onEventV3.LIZIZ("show_group_moderation_banner", arrayMap);
    }
}
