package X;

import com.ss.android.ugc.aweme.profile.model.AvatarDecoration;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.8sv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C225378sv {
    public static Long LIZ(User user) {
        AvatarDecoration LIZIZ;
        if (user != null && (LIZIZ = LIZIZ(user)) != null) {
            return Long.valueOf(LIZIZ.getId());
        }
        return null;
    }

    public static AvatarDecoration LIZIZ(User user) {
        HG3.LJIIL();
        User curUser = HG3.LJLJL.LJFF().getCurUser();
        if (o.LJ(user.getUid(), curUser.getUid())) {
            user = curUser;
        }
        return user.getAvatarDecoration();
    }
}
