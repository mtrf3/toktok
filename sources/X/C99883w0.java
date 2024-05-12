package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.3w0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99883w0 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(boolean z) {
        if (z) {
            if (INB.LIZIZ()) {
                return "notification_page_tikbot";
            }
            return "chat_list_tikbot";
        }
        if (INB.LIZIZ()) {
            return "notification_page";
        }
        return "chat_list";
    }

    public static java.util.Map LIZJ(C99033ud c99033ud) {
        if (c99033ud == null) {
            return new LinkedHashMap();
        }
        java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("enter_from", c99033ud.getEnterFromForMob()), new OSZ("enter_method", c99033ud.getEnterMethod()), new OSZ("conversation_id", c99033ud.getConversationId()), new OSZ("process_id", C3Y4.LIZJ));
        if (C1GE.LJIIL(c99033ud.getSearchId())) {
            String searchId = c99033ud.getSearchId();
            if (searchId == null) {
                searchId = "";
            }
            LJJLIIIIJ.put("search_id", searchId);
        }
        return LJJLIIIIJ;
    }

    public static String LIZLLL(C109544Rq c109544Rq) {
        Integer num;
        java.util.Map<String, String> localExt;
        String str;
        if (c109544Rq != null && (localExt = c109544Rq.getLocalExt()) != null && (str = localExt.get("tako_card_type")) != null) {
            num = Integer.valueOf(CastIntegerProtector.parseInt(str));
        } else {
            num = null;
        }
        EnumC99903w2 enumC99903w2 = EnumC99903w2.GUIDE;
        int value = enumC99903w2.getValue();
        if (num == null || num.intValue() != value) {
            EnumC99903w2 enumC99903w22 = EnumC99903w2.KNOWLEDGE;
            int value2 = enumC99903w22.getValue();
            if (num == null || num.intValue() != value2) {
                EnumC99903w2 enumC99903w23 = EnumC99903w2.KNOWLEDGE_B;
                int value3 = enumC99903w23.getValue();
                if (num == null || num.intValue() != value3) {
                    EnumC99903w2 enumC99903w24 = EnumC99903w2.REUNION;
                    int value4 = enumC99903w24.getValue();
                    if (num == null || num.intValue() != value4) {
                        EnumC99903w2 enumC99903w25 = EnumC99903w2.RETAIN;
                        int value5 = enumC99903w25.getValue();
                        if (num == null || num.intValue() != value5) {
                            return "";
                        }
                        return enumC99903w25.getMobSourceValue();
                    }
                    return enumC99903w24.getMobSourceValue();
                }
                return enumC99903w23.getMobSourceValue();
            }
            return enumC99903w22.getMobSourceValue();
        }
        return enumC99903w2.getMobSourceValue();
    }

    public static java.util.Map LIZ(C109544Rq c109544Rq, C99033ud c99033ud) {
        String str;
        String str2;
        if (c109544Rq == null) {
            return C113554cx.LJJJLIIL();
        }
        OSZ[] oszArr = new OSZ[5];
        String str3 = "";
        if (c99033ud == null || (str = c99033ud.getEnterFromForMob()) == null) {
            str = "";
        }
        oszArr[0] = new OSZ("enter_from", str);
        if (c99033ud == null || (str2 = c99033ud.getEnterMethod()) == null) {
            str2 = "";
        }
        oszArr[1] = new OSZ("enter_method", str2);
        oszArr[2] = new OSZ("process_id", C3Y4.LIZJ);
        oszArr[3] = new OSZ("message_type", C106674Gp.LJFF(c109544Rq, null));
        String uuid = c109544Rq.getUuid();
        if (uuid != null) {
            str3 = uuid;
        }
        oszArr[4] = new OSZ("message_id", str3);
        return C113554cx.LJJL(oszArr);
    }

    public static void LJ(String textContent, java.util.Map map, boolean z, C99033ud c99033ud, C109544Rq c109544Rq) {
        Object obj;
        String str;
        o.LJIIIZ(textContent, "textContent");
        if (c99033ud == null) {
            return;
        }
        String enterFromForMob = c99033ud.getEnterFromForMob();
        String enterMethod = c99033ud.getEnterMethod();
        String searchId = c99033ud.getSearchId();
        String conversationId = c99033ud.getConversationId();
        String LIZLLL = LIZLLL(c109544Rq);
        if (map != null) {
            obj = map.get("rank");
        } else {
            obj = null;
        }
        String valueOf = String.valueOf(obj);
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C97113rX.LIZ(enterFromForMob, enterMethod, searchId, conversationId, textContent, LIZLLL, valueOf, str, null);
    }

    public static void LJFF(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C85323Wm LIZJ = C05040Hs.LIZJ(str6, "action", "onEventV3");
        C1HQ LIZJ2 = HXX.LIZJ("enter_from", str, "enter_method", str2);
        LIZJ2.put("group_id", str3);
        LIZJ2.put("conversation_id", str4);
        LIZJ2.put("search_id", str5);
        LIZJ2.put("action", str6);
        LIZJ2.put("process_id", C3Y4.LIZJ);
        LIZJ2.put("is_fullscreen", str7);
        LIZJ.LIZIZ("tikbot_disclaimer_response", LIZJ2);
    }
}
