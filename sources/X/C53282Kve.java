package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.Kve, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53282Kve {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C53017KrN.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C53069KsD.LJLIL);
    public static boolean LIZJ = true;

    public static boolean LIZ() {
        User curUser;
        if (!((Boolean) LIZIZ.getValue()).booleanValue()) {
            return false;
        }
        RBX rbx = (RBX) HG3.LJIILL();
        if (!rbx.isLogin() || (curUser = rbx.getCurUser()) == null || !(!curUser.isAccuratePrivateAccount())) {
            return false;
        }
        return true;
    }
}
