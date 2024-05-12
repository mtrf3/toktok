package X;

import android.app.Activity;
import ujb.o;

/* loaded from: classes9.dex */
public final class J1R {
    public static final java.util.Map<String, String> LIZ = C113554cx.LJJL(new OSZ("a2270.b0.c0.d0", ""), new OSZ("a2270.b6880.c0.d0", "general_search"), new OSZ("a2270.b7715.c0.d0", "music_favourite"), new OSZ("a2270.b7790.c0.d0", "music_daily"), new OSZ("a2270.b2981.c0.d0", "login_vcode"), new OSZ("a2270.b2863.c0.d0", "homepage_friends"), new OSZ("a2270.b2706.c0.d0", "profile_unlogin"), new OSZ("a2270.b3426.c0.d0", "inbox_unlogin"), new OSZ("a2270.b2878.c0.d0", "feed_detail"), new OSZ("a2270.b7200.c0.d0", "follow_detail"), new OSZ("a2270.b9018.c0.d0", "music_new_notification"), new OSZ("a2270.b8727.c0.d0", "personal_homepage"), new OSZ("a2270.b9081.c0.d0", "inbox_new"), new OSZ("a2270.b8003.c0.d0", "inbox_msg"), new OSZ("a2270.b5131.c0.d0", "discovery"), new OSZ("a2270.b5836.c0.d0", "profile_from_feed"), new OSZ("a2270.b2001.c0.d0", "homepage_hot"), new OSZ("a2270.b7464.c0.d0", "homepage_follow"), new OSZ("a2270.b0226.c0.d0", "new_user_journey"), new OSZ("a2270.b5346.c0.d0", "login_register"), new OSZ("a2270.b8778.c0.d0", "login_mail"), new OSZ("a2270.b2190.c0.d0", "login_phone"), new OSZ("a2270.b1865.c0.d0", "create_password"), new OSZ("a2270.b3144.c0.d0", "register_username"), new OSZ("a2270.b0442.c0.d0", "register_vcode"), new OSZ("a2270.b2325.c0.d0", "register_email"), new OSZ("a2270.b9472.c0.d0", "register_phone"), new OSZ("a2270.b4816.c0.d0", "register_birth"), new OSZ("a2270.b6234.c0.d0", "invite_friend"), new OSZ("a2270.b2474.c0.d0", "friend_address_book"), new OSZ("a2270.b2793.c0.d0", "friends_find"), new OSZ("a2270.b4771.c0.d0", "chat"), new OSZ("a2270.b8245.c0.d0", "video_shot"), new OSZ("a2270.b4180.c0.d0", "tt_live_play"), new OSZ("a2270.b2185.c0.d0", "video_publish"), new OSZ("a2270.b9224.c0.d0", "chat_group_detail"), new OSZ("a2270.b4519.c0.d0", "chat_page"), new OSZ("a2270.b3772.c0.d0", "my_qa"), new OSZ("a2270.b0022.c0.d0", "video_draft"), new OSZ("a2270.b1030.c0.d0", "sticker_detail"), new OSZ("a2270.b5171.c0.d0", "music_detail"), new OSZ("a2270.b1146.c0.d0", "question_detail"), new OSZ("a2270.b3953.c0.d0", "challenge_detail"), new OSZ("a2270.b5726.c0.d0", "video_editor"), new OSZ("a2270.b9734.c0.d0", "search_middle"));

    public static final String LIZ(String str) {
        String LJLLJ;
        String str2 = LIZ.get(str);
        if (str2 == null) {
            if (str == null) {
                str = "";
            }
        } else {
            str = str2;
        }
        if (o.LJJJJJL(str)) {
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ == null || (LJLLJ = C16880lQ.LJLLJ(LJIIIIZZ.getClass())) == null || LJLLJ.length() == 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("background:");
                LIZ2.append(C84763XOl.LJIIJJI);
                return X1D.LIZIZ(LIZ2);
            }
            return LJLLJ;
        }
        return str;
    }
}
