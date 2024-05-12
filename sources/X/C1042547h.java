package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;

/* renamed from: X.47h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1042547h {
    public static final C1042547h LIZ = new C1042547h();

    public static void LIZ(C99033ud c99033ud) {
        String str;
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        if (c99033ud != null) {
            C1HQ c1hq = new C1HQ();
            if (c99033ud.isGroupChat()) {
                str = "group";
            } else {
                str = "private";
            }
            c1hq.put("chat_type", str);
            c1hq.put("conversation_id", c99033ud.getConversationId());
            onEventV3.LIZIZ("click_share_card", c1hq);
        }
    }

    public static void LJFF(C109544Rq c109544Rq) {
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        if (c109544Rq == null) {
            return;
        }
        XKX.LIZLLL(C780334l.LJLIL, null, null, new C84873Ut(c109544Rq, onEventV3, null), 3);
    }

    public static void LJIIJJI(C109544Rq c109544Rq) {
        String str;
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        if (c109544Rq == null) {
            return;
        }
        C1HQ LIZIZ = C48339Iy7.LIZIZ("enter_from", "chat");
        int conversationType = c109544Rq.getConversationType();
        if (conversationType == AbstractC63505Ow9.LIZIZ) {
            str = "group";
        } else if (conversationType == AbstractC63505Ow9.LIZ) {
            str = "private";
        } else {
            str = "";
        }
        LIZIZ.put("chat_type", str);
        String conversationId = c109544Rq.getConversationId();
        conversationId.toString();
        LIZIZ.put("conversation_id", conversationId);
        LIZIZ.put("message_type", C106674Gp.LJFF(c109544Rq, null));
        onEventV3.LIZIZ("show_reply_button", LIZIZ);
    }

    public static void LIZJ(String str, String str2) {
        C85323Wm LIZ2 = C772831o.LIZ();
        C1HQ LIZ3 = C111074Xn.LIZ(LIZ2, "onEventV3", "enter_from", "chat", "enter_method", "chat_click");
        LIZ3.put("playlist_id", str);
        LIZ3.put("previous_page", "chat");
        LIZ3.put("author_id", str2);
        LIZ2.LIZIZ("enter_playlist_detail", LIZ3);
    }

    public static void LJ(String str, String str2) {
        C85323Wm LIZ2 = C772831o.LIZ();
        C1HQ LIZ3 = C111074Xn.LIZ(LIZ2, "onEventV3", "author_id", str, "message_id", str2);
        LIZ3.put("message_type", "picture");
        LIZ2.LIZIZ("click_in_message", LIZ3);
    }

    public static void LJIIIIZZ(C109544Rq c109544Rq, String str) {
        String LIZ2;
        String str2;
        C85323Wm LIZ3 = C772831o.LIZ();
        C1HQ LIZ4 = C111074Xn.LIZ(LIZ3, "onEventV3", "enter_from", "chat", "action_type", str);
        String conversationId = c109544Rq.getConversationId();
        conversationId.toString();
        LIZ4.put("conversation_id", conversationId);
        LIZ4.put("message_type", C106674Gp.LJFF(c109544Rq, null));
        boolean isSelf = c109544Rq.isSelf();
        LIZ4.put("from_user_id", String.valueOf(c109544Rq.getSender()));
        if (isSelf) {
            LIZ2 = String.valueOf(C81273Gx.LIZLLL(c109544Rq.getConversationId()));
        } else {
            LIZ2 = C80763Ey.LIZ(false);
            LIZ2.toString();
        }
        LIZ4.put("to_user_id", LIZ2);
        if (isSelf) {
            str2 = "sender";
        } else {
            str2 = "receiver";
        }
        LIZ4.put("user_status", str2);
        LIZ3.LIZIZ("external_video_message", LIZ4);
    }

    public static void LIZIZ(String str, String str2, boolean z) {
        String str3;
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C1HQ LIZJ = HXX.LIZJ("enter_from", "chat", "live_event_id", str);
        if (z) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str3 = "1";
        }
        LIZJ.put("is_free_event", str3);
        LIZJ.put("live_event_cnt", String.valueOf(1));
        LIZJ.put("action_type", str2);
        onEventV3.LIZIZ("livesdk_live_event_card", LIZJ);
        C188727au.LJIIJJI();
    }

    public static void LJI(IMUser iMUser, String enterFrom, int i) {
        C85323Wm onEventV3;
        if ((i & 4) != 0) {
            enterFrom = "chat";
        }
        if ((i & 8) != 0) {
            onEventV3 = C772831o.LIZ();
        } else {
            onEventV3 = null;
        }
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        if (iMUser != null) {
            c1hq.put("author_id", iMUser.getUid());
            c1hq.put("rec_type", iMUser.getRecType());
            c1hq.put("relation_tag", String.valueOf(iMUser.getFollowStatus()));
        }
        c1hq.put("object_type", "im");
        c1hq.put("enter_method", "click_share_button");
        c1hq.put("enter_from", enterFrom);
        onEventV3.LIZIZ("click_report", c1hq);
    }

    public static void LJIIJ(String str, String str2, String str3) {
        C85323Wm LIZ2 = C772831o.LIZ();
        C1HQ LIZ3 = C111074Xn.LIZ(LIZ2, "onEventV3", "enter_from", str, "rec_type", str2);
        LIZ3.put("relation_tag", str3);
        LIZ2.LIZIZ("show_profile_avatar", LIZ3);
    }

    public static void LIZLLL(String str, String str2, String str3, String str4) {
        C85323Wm LIZ2 = C772831o.LIZ();
        C1HQ LIZ3 = C111074Xn.LIZ(LIZ2, "onEventV3", "to_user_id", str2, "conversation_id", str3);
        LIZ3.put("enter_from", "chat");
        LIZ3.put("tag_id", str);
        LIZ3.put("process_id", str4);
        LIZ2.LIZIZ("enter_tag_detail", LIZ3);
    }

    public static void LJII(String str, String str2, String enterFrom, String str3, int i) {
        if ((i & 4) != 0) {
            enterFrom = "chat";
        }
        C85323Wm onEventV3 = null;
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            onEventV3 = C772831o.LIZ();
        }
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        c1hq.put("author_id", str);
        c1hq.put("object_type", "im");
        c1hq.put("enter_method", str2);
        c1hq.put("enter_from", enterFrom);
        if (str3 != null && str3.length() != 0) {
            c1hq.put("chat_type", str3);
        }
        onEventV3.LIZIZ("click_report", c1hq);
    }

    public static void LJIIIZ(String str, boolean z, boolean z2, int i, boolean z3) {
        Object obj;
        Object obj2;
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        c1hq.put("enter_from", str);
        String str2 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c1hq.put("is_video_cache", obj);
        if (z2) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        c1hq.put("has_aweme", obj2);
        c1hq.put("tag_type", String.valueOf(i));
        if (!z3) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c1hq.put("is_requesting", str2);
        onEventV3.LIZIZ("im_open_aweme_video", c1hq);
    }
}
