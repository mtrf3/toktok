package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3h6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C90643h6 {
    public static final C90643h6 LIZ = new C90643h6();
    public static String LIZIZ = "";
    public static String LIZJ = "";
    public static String LIZLLL = "";
    public static int LJ;

    public static void LJ() {
        C85323Wm LIZ2 = C772831o.LIZ();
        C1HQ LIZ3 = C77800Ug8.LIZ(LIZ2, "eventSender");
        LIZ3.put("conversation_id", LIZLLL);
        LIZ3.put("is_master", String.valueOf(LJ));
        LIZ3.put("enter_method", LIZJ);
        LIZ2.LIZIZ("click_share_group_inv", LIZ3);
    }

    public static void LIZ(C63120Opw c63120Opw) {
        Long l;
        String conversationId = c63120Opw.getConversationId();
        o.LJIIIIZZ(conversationId, "conversation.conversationId");
        LIZLLL = conversationId;
        C63088OpQ coreInfo = c63120Opw.getCoreInfo();
        if (coreInfo != null) {
            l = Long.valueOf(coreInfo.getOwner());
        } else {
            l = null;
        }
        String valueOf = String.valueOf(l);
        String LIZ2 = C80763Ey.LIZ(false);
        LIZ2.toString();
        LJ = o.LJ(valueOf, LIZ2) ? 1 : 0;
    }

    public static String LIZIZ(List list) {
        String str = "";
        if (list != null) {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (i == 0) {
                    str = str2;
                } else {
                    str = C00F.LIZIZ(str, ',', str2);
                }
                i++;
            }
        }
        return str;
    }

    public static void LIZJ(boolean z) {
        String str;
        C1HQ c1hq = new C1HQ();
        c1hq.put("enter_from", LIZIZ);
        if (z) {
            int LIZ2 = C00F.LIZ(31744, 0, "im_group_chat_creation_inbox_page_optimization", false);
            if (LIZ2 != 0) {
                if (LIZ2 != 1) {
                    if (LIZ2 != 2) {
                        if (LIZ2 == 3) {
                            str = "3";
                        }
                    } else {
                        str = "2";
                    }
                } else {
                    str = "1";
                }
                c1hq.put("icon_version", str);
            }
            str = CardStruct.IStatusCode.DEFAULT;
            c1hq.put("icon_version", str);
        }
        FMX.LJIIL("click_create_group", c1hq);
    }

    public static void LJII(List list) {
        FMX.LJIILL("finish_create_group", new OSZ(LIZIZ(list), "to_user_id_set"), new OSZ(LIZIZ, "enter_from"));
    }

    public static void LJIIIIZZ(int i) {
        C85323Wm LIZ2 = C772831o.LIZ();
        C1HQ LIZ3 = C77800Ug8.LIZ(LIZ2, "onEventV3");
        LIZ3.put("conversation_id", LIZLLL);
        LIZ3.put("is_master", String.valueOf(LJ));
        LIZ3.put("member_number", String.valueOf(i));
        LIZ3.put("enter_from", LIZJ);
        LIZ2.LIZIZ("send_group_env", LIZ3);
    }

    public static void LJI(C90643h6 c90643h6, String str, OSZ[] oszArr) {
        C85323Wm onEventV3 = C772831o.LIZ();
        c90643h6.getClass();
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        c1hq.put("conversation_id", LIZLLL);
        c1hq.put("is_master", String.valueOf(LJ));
        for (OSZ osz : oszArr) {
            Object first = osz.getFirst();
            if (first != null) {
                c1hq.put(first.toString(), osz.getSecond());
            }
        }
        onEventV3.LIZIZ(str, c1hq);
    }

    public final void LIZLLL(String str, String objectId, String str2) {
        o.LJIIIZ(objectId, "objectId");
        LJI(this, "click_report", new OSZ[]{new OSZ(str, "enter_from"), new OSZ(objectId, "object_id"), new OSZ(str2, "object_type")});
    }

    public static void LJFF(int i, C63120Opw c63120Opw, String str, List list, String str2, String str3, String str4, int i2) {
        C85323Wm onEventV3;
        String str5;
        int i3;
        String str6 = null;
        if ((i2 & 32) != 0) {
            str3 = null;
        }
        if ((i2 & 64) != 0) {
            str4 = null;
        }
        if ((i2 & 128) != 0) {
            onEventV3 = C772831o.LIZ();
        } else {
            onEventV3 = null;
        }
        o.LJIIIZ(onEventV3, "onEventV3");
        if (list != null) {
            str5 = LIZIZ(list);
        } else {
            str5 = null;
        }
        if (c63120Opw != null) {
            i3 = c63120Opw.getMemberCount();
        } else {
            i3 = 0;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", LIZIZ);
        c188727au.LIZLLL(i3, "chat_num");
        c188727au.LJIIIZ("type", str);
        if (c63120Opw != null) {
            str6 = c63120Opw.getConversationId();
        }
        c188727au.LJIIIZ("conversation_id", str6);
        c188727au.LIZLLL(i, "error_code");
        c188727au.LJIIIZ("chat_type", str2);
        c188727au.LJIIIZ("version", str3);
        c188727au.LJIIIZ("enter_method", str4);
        if (str5 != null) {
            c188727au.LJI("to_user_id_set", str5);
        }
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "eventMapBuilder.builder()");
        onEventV3.LIZIZ("create_chat", map);
    }
}
