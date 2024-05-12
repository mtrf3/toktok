package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3j3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C91853j3 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(boolean z, String str) {
        String str2;
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        if (z) {
            str2 = "group";
        } else {
            str2 = "private";
        }
        C1HQ LIZJ = HXX.LIZJ("enter_from", "chat", "chat_type", str2);
        LIZJ.put("target", str);
        onEventV3.LIZIZ("message_long_press_feedback", LIZJ);
    }

    public static void LIZJ(String str, boolean z, String str2, String str3) {
        String str4;
        C85323Wm LIZJ = C05040Hs.LIZJ(str2, "messageType", "onEventV3");
        if (z) {
            str4 = "group";
        } else {
            str4 = "private";
        }
        C1HQ LIZJ2 = HXX.LIZJ("enter_from", "chat", "chat_type", str4);
        LIZJ2.put("message_type", str2);
        LIZJ2.put("icon_type", str);
        LIZJ2.put("event_type", str3);
        LIZJ.LIZIZ("message_long_press", LIZJ2);
    }

    public static void LIZLLL(C109544Rq message, boolean z, String messageType, String enterMethod, boolean z2) {
        String str;
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(message, "message");
        o.LJIIIZ(messageType, "messageType");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(onEventV3, "onEventV3");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("conversation_id", message.getConversationId());
        if (z) {
            str = "group";
        } else {
            str = "private";
        }
        c188727au.LJIIIZ("chat_type", str);
        c188727au.LJ(message.getSender(), "quote_user_id");
        c188727au.LIZLLL(message.isSelf() ? 1 : 0, "is_self");
        c188727au.LJIIIZ("message_type", messageType);
        c188727au.LJIIIZ("enter_method", enterMethod);
        c188727au.LIZLLL(z2 ? 1 : 0, "is_quick_reply");
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "newBuilder()\n           …0)\n            .builder()");
        onEventV3.LIZIZ("quote_message", map);
    }

    public static void LIZIZ(String str, String str2, String str3, String str4, String str5, String str6) {
        String str7 = C3Y4.LIZJ;
        C85323Wm LIZ2 = C772831o.LIZ();
        C1HQ LIZ3 = C111074Xn.LIZ(LIZ2, "onEventV3", "chat_type", "tikbot", "enter_from", str);
        LIZ3.put("enter_method", str2);
        LIZ3.put("search_id", str3);
        LIZ3.put("message_id", str4);
        LIZ3.put("conversation_id", str5);
        LIZ3.put("target", str6);
        LIZ3.put("process_id", str7);
        LIZ2.LIZIZ("message_long_press_feedback", LIZ3);
    }
}
