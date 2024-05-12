package X;

import kotlin.jvm.internal.o;

/* renamed from: X.46W */
/* loaded from: classes2.dex */
public final class C46W {
    public static final C46W LIZ = new C46W();

    public static void LJ(String str, C109544Rq msg, String str2, String str3, String str4) {
        o.LJIIIZ(msg, "msg");
        String LIZ2 = C46U.LIZ(msg.getLocalExtValue("SUGGESTED_REPLIES"));
        if (LIZ2 == null) {
            if (str3 == null) {
                return;
            }
        } else {
            str3 = LIZ2;
        }
        String LIZ3 = C93793mB.LIZ(msg);
        String str5 = "";
        if (LIZ3 == null) {
            LIZ3 = "";
        }
        String valueOf = String.valueOf(msg.getSender());
        String localExtValue = msg.getLocalExtValue("content_understanding_tag");
        if (localExtValue != null) {
            str5 = localExtValue;
        }
        C85323Wm LIZ4 = C772831o.LIZ();
        C1HQ LIZJ = HXX.LIZJ("chat_type", str, "group_id", LIZ3);
        LIZJ.put("from_user_id", valueOf);
        LIZJ.put("message_type", "share_video");
        LIZJ.put("enter_from", "chat");
        LIZJ.put("display_style", str4);
        LIZJ.put("position", str2);
        LIZJ.put("content_understanding_tag", str5);
        LIZJ.put("reply_options_shown", str3);
        LIZ4.LIZIZ("dm_suggested_replies_show", LIZJ);
    }

    public static void LIZJ(String str, C109544Rq msg, String str2, String str3, String str4, String str5) {
        o.LJIIIZ(msg, "msg");
        String LIZ2 = C46U.LIZ(msg.getLocalExtValue("SUGGESTED_REPLIES"));
        if (LIZ2 == null) {
            if (str4 == null) {
                return;
            }
        } else {
            str4 = LIZ2;
        }
        String LIZ3 = C93793mB.LIZ(msg);
        String str6 = "";
        if (LIZ3 == null) {
            LIZ3 = "";
        }
        String valueOf = String.valueOf(msg.getSender());
        String localExtValue = msg.getLocalExtValue("content_understanding_tag");
        if (localExtValue != null) {
            str6 = localExtValue;
        }
        C85323Wm LIZ4 = C772831o.LIZ();
        C1HQ LIZJ = HXX.LIZJ("chat_type", str, "group_id", LIZ3);
        LIZJ.put("from_user_id", valueOf);
        LIZJ.put("message_type", "share_video");
        LIZJ.put("enter_from", "chat");
        LIZJ.put("display_style", str5);
        LIZJ.put("position", str2);
        LIZJ.put("content_understanding_tag", str6);
        LIZJ.put("reply_options_shown", str4);
        LIZJ.put("dismiss_reason", str3);
        LIZ4.LIZIZ("dm_suggested_replies_dismiss", LIZJ);
    }

    public final void LIZ(String str, C109544Rq c109544Rq, String str2, String str3, String str4, String str5) {
        String str6 = str4;
        String LIZ2 = C46U.LIZ(c109544Rq.getLocalExtValue("SUGGESTED_REPLIES"));
        if (LIZ2 == null) {
            if (str6 == null) {
                return;
            }
        } else {
            str6 = LIZ2;
        }
        if (o.LJ(str2, "action_bar")) {
            LIZIZ(this, str, c109544Rq, str2, str3, str6, null, 224);
            LIZLLL(this, str, c109544Rq, str2, "send_message", str6, 32);
        } else {
            if (!o.LJ(str2, "under_video")) {
                return;
            }
            LIZIZ(this, str, c109544Rq, str2, str3, str6, str5, 192);
        }
    }

    public static /* synthetic */ void LIZLLL(C46W c46w, String str, C109544Rq c109544Rq, String str2, String str3, String str4, int i) {
        String str5 = str4;
        if ((i & 16) != 0) {
            str5 = null;
        }
        c46w.getClass();
        LIZJ(str, c109544Rq, str2, str3, str5, null);
    }

    public static void LIZIZ(C46W c46w, String str, C109544Rq c109544Rq, String str2, String str3, String str4, String str5, int i) {
        String str6;
        C85323Wm c85323Wm = null;
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        if ((i & 64) != 0) {
            str6 = "chat";
        } else {
            str6 = null;
        }
        if ((i & 128) != 0) {
            c85323Wm = C772831o.LIZ();
        }
        c46w.getClass();
        String LIZ2 = C46U.LIZ(c109544Rq.getLocalExtValue("SUGGESTED_REPLIES"));
        if (LIZ2 == null) {
            if (str4 == null) {
                return;
            }
        } else {
            str4 = LIZ2;
        }
        C1HQ LIZIZ = C48339Iy7.LIZIZ("chat_type", str);
        String LIZ3 = C93793mB.LIZ(c109544Rq);
        if (LIZ3 == null) {
            LIZ3 = "";
        }
        LIZIZ.put("group_id", LIZ3);
        LIZIZ.put("from_user_id", String.valueOf(c109544Rq.getSender()));
        LIZIZ.put("message_type", "share_video");
        LIZIZ.put("enter_from", str6);
        LIZIZ.put("display_style", str5);
        LIZIZ.put("position", str2);
        String localExtValue = c109544Rq.getLocalExtValue("content_understanding_tag");
        if (localExtValue == null) {
            localExtValue = "";
        }
        LIZIZ.put("content_understanding_tag", localExtValue);
        LIZIZ.put("reply_options_shown", str4);
        if (str3 == null) {
            str3 = "";
        }
        LIZIZ.put("reply_options_clicked", str3);
        c85323Wm.LIZIZ("dm_suggested_replies_click", LIZIZ);
    }
}
