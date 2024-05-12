package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.3Tw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84643Tw {
    public static final /* synthetic */ int LIZ = 0;

    public static void LJFF(C98523to sessionInfo) {
        String str;
        String str2;
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(sessionInfo, "sessionInfo");
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        if (sessionInfo.isFiltered()) {
            str = "filtered_message_request";
        } else {
            str = "non_filtered_message_request";
        }
        c1hq.put("enter_from", str);
        c1hq.put("chat_type", LIZ(sessionInfo, true));
        if (sessionInfo.isFiltered()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c1hq.put("is_filtered", str2);
        onEventV3.LIZIZ("receive_message_request_show", c1hq);
    }

    public static String LIZ(C99033ud c99033ud, boolean z) {
        C98523to c98523to;
        if (z && (c99033ud instanceof C98523to) && (c98523to = (C98523to) c99033ud) != null && c98523to.isTCM()) {
            return "tcm";
        }
        if (c99033ud == null) {
            return "";
        }
        return C3Y4.LIZIZ(c99033ud.getChatType());
    }

    public static void LIZIZ(String conversationId, String str, InterfaceC75532xp onEventV3) {
        o.LJIIIZ(conversationId, "conversationId");
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        c1hq.put("conversation_id", conversationId);
        c1hq.put("to_user_id", str);
        c1hq.put("chat_type", "private");
        onEventV3.LIZIZ("chat_setting_click", c1hq);
    }

    public static void LJ(C98523to sessionInfo, String str, EnumC96103pu enumC96103pu, int i) {
        String str2;
        String str3;
        C85323Wm onEventV3 = null;
        if ((i & 4) != 0) {
            enumC96103pu = null;
        }
        if ((i & 8) != 0) {
            onEventV3 = C772831o.LIZ();
        }
        o.LJIIIZ(sessionInfo, "sessionInfo");
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        if (sessionInfo.isFiltered()) {
            str2 = "filtered_message_request";
        } else {
            str2 = "non_filtered_message_request";
        }
        c1hq.put("enter_from", str2);
        if (sessionInfo.isFiltered()) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c1hq.put("is_filtered", str3);
        c1hq.put("chat_type", LIZ(sessionInfo, true));
        c1hq.put("action", str);
        if (enumC96103pu == EnumC96103pu.USER_SET_CONVERSATION_CATEGORY_PRIMARY) {
            c1hq.put("accept_type", "primary");
        } else if (enumC96103pu == EnumC96103pu.USER_SET_CONVERSATION_CATEGORY_SECONDARY) {
            c1hq.put("accept_type", "secondary");
        }
        onEventV3.LIZIZ("receive_message_request_response", c1hq);
    }

    public static final void LIZJ(String str, String str2, String str3, Integer num, InterfaceC75532xp onEventV3) {
        String num2;
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        c1hq.put("to_user_id", str);
        c1hq.put("enter_from", str2);
        c1hq.put("enter_method", str3);
        if (num != null && (num2 = num.toString()) != null) {
            c1hq.put("follow_status", num2);
        }
        onEventV3.LIZIZ("enter_personal_detail", c1hq);
    }

    public static void LIZLLL(String str, String str2, String str3, Integer num, int i) {
        C85323Wm c85323Wm = null;
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            c85323Wm = C772831o.LIZ();
        }
        LIZJ(str, str2, str3, num, c85323Wm);
    }
}
