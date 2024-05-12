package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.Kvf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53283Kvf {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C53179Ktz.LJLIL);

    public static int LIZ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static boolean LIZIZ() {
        if (LIZ() == 0) {
            return false;
        }
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if (LIZ() == 1 || LIZ() == 2) {
            if (curUser.getFollowingCount() > 0) {
                return false;
            }
            return true;
        }
        if (LIZ() != 3 || curUser.getFriendCount() > 0) {
            return false;
        }
        return true;
    }
}
