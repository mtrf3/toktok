package X;

import Y.ACallableS104S0100000_1;
import Y.ACallableS53S0300000_1;
import Y.ARunnableS12S0300000_1;
import Y.ARunnableS2S0301000_1;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.3TV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3TV {
    public static final C3TV LIZ = new C3TV();
    public static final java.util.Map<String, java.util.Set<C3TW>> LIZIZ = new LinkedHashMap();
    public static final java.util.Set<String> LIZJ = new LinkedHashSet();

    public static String LIZ() {
        if (LFH.LIZIZ.LIZLLL().LJIIIIZZ().LIZLLL("bookmode_dm")) {
            return "1";
        }
        return "";
    }

    public static java.util.Map LIZIZ(C3L4 c3l4) {
        String str;
        String str2;
        String str3;
        String str4;
        OSZ[] oszArr = new OSZ[6];
        if (c3l4.LJLLLLLL == 25) {
            str = "tcm";
        } else {
            str = "private";
        }
        oszArr[0] = new OSZ("chat_type", str);
        oszArr[1] = new OSZ("conversation_id", c3l4.LJFF());
        if (c3l4 instanceof C3LK) {
            if (c3l4.LLI && C3U8.LIZ()) {
                str2 = "filtered_message_request";
            } else {
                str2 = "non_filtered_message_request";
            }
        } else if (INB.LIZIZ()) {
            str2 = "notification_page";
        } else {
            str2 = "chat_list";
        }
        oszArr[2] = new OSZ("enter_from", str2);
        if (c3l4.LJLLLL) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[3] = new OSZ("is_top", str3);
        oszArr[4] = new OSZ("unread_cnt", String.valueOf(c3l4.LJLLILLLL));
        AbstractC82843My LJFF = C82473Ln.LJFF(c3l4);
        if (LJFF instanceof C82493Lp) {
            str4 = "number_dot";
        } else if (LJFF instanceof C82483Lo) {
            str4 = "yellow_dot";
        } else {
            str4 = "report_null";
        }
        oszArr[5] = new OSZ("notice_type", str4);
        return C113554cx.LJJLIIIIJ(oszArr);
    }

    public static void LJFF(C3TV c3tv, C3L4 c3l4) {
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C4WC c4wc = C4WC.LIZIZ;
        AbstractC73946T0k LIZ2 = T16.LIZ();
        o.LJIIIIZZ(LIZ2, "io()");
        C85323Wm onEventV3 = C772831o.LIZ();
        c3tv.getClass();
        o.LJIIIZ(onEventV3, "onEventV3");
        if (c3l4.LJFF() == null) {
            return;
        }
        java.util.Map<String, java.util.Set<C3TW>> map = LIZIZ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        java.util.Set set = (java.util.Set) linkedHashMap.get(c3l4.LJFF());
        if (set != null && set.contains(C3TW.CHAT_SHOW)) {
            return;
        }
        java.util.Set<C3TW> set2 = (java.util.Set) linkedHashMap.get(c3l4.LJFF());
        if (set2 == null) {
            set2 = new LinkedHashSet<>();
            String LJFF = c3l4.LJFF();
            o.LJIIIIZZ(LJFF, "baseSession.sessionID");
            map.put(LJFF, set2);
        }
        set2.add(C3TW.CHAT_SHOW);
        AbstractC73547Stj.LJI(new ACallableS53S0300000_1(c4wc, onEventV3, c3l4, 0)).LJIILIIL(LIZ2).LJIIJJI();
    }

    public static void LIZJ(C3TV c3tv, String str, int i) {
        String str2;
        C85323Wm onEventV3 = C772831o.LIZ();
        c3tv.getClass();
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        if (i == 1) {
            str2 = "message_box";
        } else {
            str2 = "message";
        }
        c1hq.put("enter_from", str2);
        c1hq.put("target", str);
        c1hq.put("chat_type", C3Y4.LIZIZ(i));
        onEventV3.LIZIZ("chat_list_delete_confirm", c1hq);
    }

    public static void LJ(C3Q9 c3q9, InterfaceC75532xp interfaceC75532xp, C3L4 c3l4) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        String str3;
        IMUser LJIJI;
        if (c3l4.LJLJLLL == 15) {
            z = true;
        } else {
            z = false;
        }
        if (c3l4.LJLLI != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c3l4.LJLLLLLL == 25) {
            str = "tcm";
        } else {
            C82223Ko c82223Ko = C99033ud.Companion;
            String LJFF = c3l4.LJFF();
            c82223Ko.getClass();
            if (C82223Ko.LIZ(LJFF)) {
                str = "tikbot";
            } else {
                str = "private";
            }
        }
        C63120Opw LIZ2 = c3q9.LIZ(c3l4.LJFF());
        if (LIZ2 != null) {
            LIZ.getClass();
            java.util.Map<String, String> LIZIZ2 = LIZIZ(c3l4);
            LIZIZ2.put("to_user_id", C79004UzY.LJIILL(LIZ2));
            LIZIZ2.put("active_status", String.valueOf(c3l4.LJLJJLL.LJLILLLLZI.getValue()));
            String str4 = "1";
            if (z) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZIZ2.put("is_new_chat", str2);
            if (C3UE.LIZ() && (c3l4 instanceof C3L3) && (LJIJI = ((C3L3) c3l4).LJIJI()) != null) {
                String recType = LJIJI.getRecType();
                if (recType == null) {
                    recType = "";
                }
                LIZIZ2.put("rec_type", recType);
                LIZIZ2.put("relation_tag", String.valueOf(LJIJI.getFollowStatus()));
            }
            LIZIZ2.put("chat_type", str);
            if (!z2) {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZIZ2.put("is_recommended_chat", str4);
            if (C55888Lwa.LIZIZ.LJJI(true)) {
                C3L5 c3l5 = (C3L5) c3l4;
                if (c3l5 instanceof C3LK) {
                    str3 = "request";
                } else if (c3l5.LLIIII == EnumC96103pu.USER_SET_CONVERSATION_CATEGORY_PRIMARY) {
                    str3 = "primary";
                } else {
                    str3 = "secondary";
                }
                LIZIZ2.put("tab_name", str3);
            }
            interfaceC75532xp.LIZIZ("chat_show", LIZIZ2);
            C82223Ko c82223Ko2 = C99033ud.Companion;
            String LJFF2 = c3l4.LJFF();
            c82223Ko2.getClass();
            if (C82223Ko.LIZ(LJFF2)) {
                String LIZIZ3 = C99883w0.LIZIZ(false);
                C85323Wm LIZ3 = C772831o.LIZ();
                C1HQ LIZJ2 = HXX.LIZJ("enter_from", LIZIZ3, "entrance_type", "message_cell");
                LIZJ2.put("group_id", null);
                LIZJ2.put("search_id", null);
                LIZ3.LIZIZ("tikbot_entrance_show", LIZJ2);
            }
        }
    }

    public static void LIZLLL(C3TV c3tv, String str, int i, int i2) {
        String str2;
        String LIZIZ2;
        C85323Wm onEventV3 = C772831o.LIZ();
        c3tv.getClass();
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        if (i == 1) {
            str2 = "message_box";
        } else {
            str2 = "message";
        }
        c1hq.put("enter_from", str2);
        c1hq.put("target", str);
        if (o.LJ(str, "primary")) {
            c1hq.put("tab_name", "secondary");
        } else if (o.LJ(str, "secondary")) {
            c1hq.put("tab_name", "primary");
        }
        if (i2 == 25) {
            LIZIZ2 = "tcm";
        } else {
            LIZIZ2 = C3Y4.LIZIZ(i);
        }
        c1hq.put("chat_type", LIZIZ2);
        onEventV3.LIZIZ("chat_list_feedback", c1hq);
    }

    public static void LJI(C3TV c3tv, C3L4 baseSession, boolean z, int i) {
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C4WC c4wc = C4WC.LIZIZ;
        AbstractC73946T0k LIZ2 = T16.LIZ();
        o.LJIIIIZZ(LIZ2, "io()");
        C85323Wm onEventV3 = C772831o.LIZ();
        c3tv.getClass();
        o.LJIIIZ(baseSession, "baseSession");
        o.LJIIIZ(onEventV3, "onEventV3");
        if (baseSession.LJFF() == null) {
            return;
        }
        java.util.Map<String, java.util.Set<C3TW>> map = LIZIZ;
        java.util.Set<C3TW> set = (java.util.Set) ((LinkedHashMap) map).get(baseSession.LJFF());
        if (set == null) {
            set = new LinkedHashSet<>();
            String LJFF = baseSession.LJFF();
            o.LJIIIIZZ(LJFF, "baseSession.sessionID");
            map.put(LJFF, set);
        }
        ArrayList arrayList = new ArrayList();
        C3TW c3tw = C3TW.CHAT_SHOW;
        if (!set.contains(c3tw)) {
            set.add(c3tw);
            arrayList.add(new ARunnableS12S0300000_1(baseSession, c4wc, onEventV3, 13));
        }
        if (z) {
            C3TW c3tw2 = C3TW.CAMERA_ICON_SHOW;
            if (!set.contains(c3tw2)) {
                set.add(c3tw2);
                arrayList.add(new ARunnableS2S0301000_1(c4wc, i, baseSession, onEventV3, 3));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        AbstractC73547Stj.LJI(new ACallableS104S0100000_1(arrayList, 11)).LJIILIIL(LIZ2).LJIIJJI();
    }

    public static void LJII(C3TV c3tv, int i, String str, String str2, int i2) {
        C85323Wm onEventV3 = C772831o.LIZ();
        c3tv.getClass();
        String LIZ2 = LIZ();
        c3tv.getClass();
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        c1hq.put("total_chat_cnt", String.valueOf(i));
        c1hq.put("enter_method", str2);
        c1hq.put("enter_from", str);
        c1hq.put("from_book_mode", LIZ2);
        if (i2 >= 0) {
            c1hq.put("show_chat_cnt", String.valueOf(i2));
        }
        onEventV3.LIZIZ("show_chat_list", c1hq);
    }
}
