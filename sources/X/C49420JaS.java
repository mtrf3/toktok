package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.JaS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49420JaS {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(User user) {
        int followStatus = user.getFollowStatus();
        if (followStatus != 0) {
            if (followStatus != 1) {
                if (followStatus != 2) {
                    if (followStatus != 4) {
                        return "";
                    }
                } else if (!C49421JaT.LIZLLL(user)) {
                    return "click_message";
                }
            }
            return "click_cancel_follow";
        }
        if (user.isPrivateAccount()) {
            return "click_request";
        }
        return "click_follow_button";
    }

    public static final C49458Jb4 LIZIZ(String str, JQA jqa, User user) {
        String str2;
        C49458Jb4 c49458Jb4 = new C49458Jb4(str);
        c49458Jb4.LJIIZILJ("search_id", jqa.LJII);
        c49458Jb4.LJIJ("search_result_id", user.getUid());
        c49458Jb4.LJIIZILJ("search_keyword", jqa.LJ);
        c49458Jb4.LJIIZILJ("impr_id", jqa.LJIIIIZZ);
        c49458Jb4.LJIJI(jqa.LJFF);
        c49458Jb4.LJIIZILJ("to_user_id", user.getUid());
        boolean LIZLLL = C49421JaT.LIZLLL(user);
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (!LIZLLL) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c49458Jb4.LJIIZILJ("can_message", str2);
        if (user.getFollowStatus() == 4) {
            str3 = "1";
        }
        c49458Jb4.LJIIZILJ("is_requested", str3);
        return c49458Jb4;
    }
}
