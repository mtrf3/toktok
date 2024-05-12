package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AXU {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(AXV.LJLIL);
    public static final boolean LIZIZ;
    public static final boolean LIZJ;
    public static final boolean LIZLLL;
    public static final boolean LJ;

    static {
        boolean z;
        if (LIZ() > 0) {
            z = true;
        } else {
            z = false;
        }
        LIZIZ = z;
        LIZJ = C77275UUl.LJIIIIZZ(1, 4).contains(Integer.valueOf(LIZ()));
        LIZLLL = C77275UUl.LJIIIIZZ(2, 4).contains(Integer.valueOf(LIZ()));
        LJ = C77275UUl.LJIIIIZZ(3, 4).contains(Integer.valueOf(LIZ()));
    }

    public static int LIZ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static boolean LIZIZ(User user) {
        o.LJIIIZ(user, "<this>");
        if (LJ && user.getMatchedFriendStruct() != null) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(User user) {
        o.LJIIIZ(user, "<this>");
        if (LJ && user.getMatchedFriendStruct() != null) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(User user) {
        o.LJIIIZ(user, "<this>");
        if (LIZLLL && user.getMatchedFriendStruct() != null) {
            return true;
        }
        return false;
    }
}
