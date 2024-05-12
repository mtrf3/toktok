package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3en, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89213en {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, EnumC89223eo messageType, int i) {
        C99033ud c99033ud;
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(messageType, "messageType");
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        if (str == null) {
            str = C3Y4.LIZJ("enter_from", null);
        }
        c1hq.put("enter_from", str);
        if (str2 == null && ((c99033ud = C3Y4.LIZLLL) == null || (str2 = c99033ud.getEnterMethod()) == null || str2.length() == 0)) {
            str2 = C3Y4.LIZJ("enter_method", null);
        }
        c1hq.put("enter_method", str2);
        c1hq.put("message_type", messageType.getLogValue());
        c1hq.put("relation_tag", String.valueOf(i));
        onEventV3.LIZIZ("dm_system_message_received", c1hq);
    }
}
