package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4aw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C112304aw {
    public static void LIZ(C107724Kq c107724Kq) {
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        if (c107724Kq == null) {
            return;
        }
        C112294av c112294av = new C112294av(c107724Kq);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        EnumC112364b2 enumC112364b2 = c112294av.LIZ;
        if (enumC112364b2 != null) {
            linkedHashMap.put("position", enumC112364b2.getValue());
        }
        String str = c112294av.LIZIZ;
        if (str != null) {
            linkedHashMap.put("to_user_id", str);
        }
        Integer num = c112294av.LJ;
        if (num != null) {
            num.intValue();
            linkedHashMap.put("rank_index", c112294av.LJ.toString());
        }
        onEventV3.LIZIZ("activity_status_show", linkedHashMap);
    }
}
