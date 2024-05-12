package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.MWu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56952MWu {
    public static void LIZ(User user, String enterFrom) {
        o.LJIIIZ(user, "user");
        o.LJIIIZ(enterFrom, "enterFrom");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("to_user_id", user.getUid());
        c188727au.LJIIIZ("enter_from", enterFrom);
        c188727au.LJIIIZ("previous_page", "notification_page");
        c188727au.LIZLLL(user.isSecret() ? 1 : 0, "is_private");
        c188727au.LJIIIZ("follow_type", "mutual");
        FMX.LJIIL("follow", c188727au.LIZ);
    }

    public static void LIZIZ(User user, boolean z, String enterFrom) {
        o.LJIIIZ(user, "user");
        o.LJIIIZ(enterFrom, "enterFrom");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("to_user_id", user.getUid());
        c188727au.LJIIIZ("enter_from", enterFrom);
        c188727au.LJIIIZ("previous_page", "notification_page");
        c188727au.LIZLLL(user.isSecret() ? 1 : 0, "is_private");
        c188727au.LIZLLL(!z ? 1 : 0, "cancel_type");
        c188727au.LJIIIZ("follow_type", "mutual");
        FMX.LJIIL("follow_cancel", c188727au.LIZ);
    }
}
