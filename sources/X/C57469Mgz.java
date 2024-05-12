package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.Mgz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57469Mgz {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C53328KwO.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C57499MhT.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C57498MhS.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C57502MhW.LJLIL);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C57500MhU.LJLIL);
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(C57503MhX.LJLIL);
    public static final C62822Ol8 LJI = C221108m2.LIZIZ(C57501MhV.LJLIL);

    public static int LIZ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static boolean LIZIZ() {
        return ((Boolean) LIZJ.getValue()).booleanValue();
    }

    public static boolean LIZJ() {
        return ((Boolean) LIZIZ.getValue()).booleanValue();
    }

    public static boolean LJ() {
        return ((Boolean) LIZLLL.getValue()).booleanValue();
    }

    public static boolean LJFF() {
        return ((Boolean) LJFF.getValue()).booleanValue();
    }

    public static boolean LIZLLL(User user) {
        o.LJIIIZ(user, "user");
        if (LJI(user) && (LIZ() == 3 || LIZ() == 4 || LIZ() == 6)) {
            return true;
        }
        return false;
    }

    public static boolean LJI(User user) {
        o.LJIIIZ(user, "user");
        if (user.isShowMessageEntrance && LIZIZ()) {
            return true;
        }
        return false;
    }
}
