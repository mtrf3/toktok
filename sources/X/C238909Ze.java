package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9Ze, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C238909Ze {
    public static final /* synthetic */ int LIZ = 0;

    public static String LJIIIIZZ(int i) {
        switch (i) {
            case 1:
                return "save_success";
            case 2:
                return "cancel_save";
            case 3:
                return "discard_edit";
            case 4:
                return "cancel_discard";
            case 5:
                return "submit_success";
            case 6:
                return "cancel_submit";
            case 7:
                return "delete_keyword";
            case 8:
                return "cancel_delete";
            default:
                return "";
        }
    }

    public static void LJFF() {
        C238969Zk eventSender = C238969Zk.LJLIL;
        o.LJIIIZ(eventSender, "eventSender");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "automsg_setting");
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "newBuilder()\n           …m)\n            .builder()");
        eventSender.invoke("ttelite_BA_automsg_faq", map);
    }

    public static void LIZ(String str) {
        C238919Zf eventSender = C238919Zf.LJLIL;
        o.LJIIIZ(eventSender, "eventSender");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "newBuilder()\n           …m)\n            .builder()");
        eventSender.invoke("ttelite_BA_automsg_cancel", map);
    }

    public static void LIZIZ(String str) {
        C238929Zg eventSender = C238929Zg.LJLIL;
        o.LJIIIZ(eventSender, "eventSender");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "newBuilder()\n           …m)\n            .builder()");
        eventSender.invoke("ttelite_BA_automsg_discard", map);
    }

    public static void LIZJ(String str) {
        C238939Zh eventSender = C238939Zh.LJLIL;
        o.LJIIIZ(eventSender, "eventSender");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "newBuilder()\n           …m)\n            .builder()");
        eventSender.invoke("ttelite_BA_automsg_exit", map);
    }

    public static void LIZLLL(int i) {
        C238949Zi eventSender = C238949Zi.LJLIL;
        o.LJIIIZ(eventSender, "eventSender");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("status", LJIIIIZZ(i));
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "newBuilder()\n           …))\n            .builder()");
        eventSender.invoke("edit_auto_reply_keyword", map);
    }

    public static void LJ(int i) {
        C238959Zj eventSender = C238959Zj.LJLIL;
        o.LJIIIZ(eventSender, "eventSender");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("status", LJIIIIZZ(i));
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "newBuilder()\n           …))\n            .builder()");
        eventSender.invoke("edit_welcome_message", map);
    }

    public static void LJII(int i, boolean z) {
        String str;
        String str2;
        C238989Zm eventSender = C238989Zm.LJLIL;
        o.LJIIIZ(eventSender, "eventSender");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "business_message_setting_page");
        if (i != 1) {
            if (i != 2) {
                return;
            } else {
                str = "auto_reply";
            }
        } else {
            str = "welcome_message";
        }
        c188727au.LJIIIZ("target", str);
        if (z) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        c188727au.LJIIIZ("status", str2);
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "newBuilder()\n           …F)\n            .builder()");
        eventSender.invoke("switch_business_message_button", map);
    }

    public static void LJI(String str, int i, Integer num, int i2) {
        String str2;
        C238979Zl eventSender = null;
        if ((i2 & 4) != 0) {
            num = null;
        }
        if ((i2 & 8) != 0) {
            eventSender = C238979Zl.LJLIL;
        }
        o.LJIIIZ(eventSender, "eventSender");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        if (i != 1) {
            if (i != 2) {
                return;
            } else {
                str2 = "business_auto_reply";
            }
        } else {
            str2 = "business_welcome_message";
        }
        c188727au.LJIIIZ("target", str2);
        if (num != null) {
            c188727au.LIZLLL(num.intValue(), "msg_status");
        }
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "newBuilder()\n           … }\n            .builder()");
        eventSender.invoke("enter_business_message_edit", map);
    }
}
