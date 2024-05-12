package X;

import com.bytedance.keva.Keva;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.J9c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48692J9c {
    public static final Keva LIZ;

    static {
        Keva repo = Keva.getRepo("ags_warning_info");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        LIZ = repo;
    }

    public static int LIZ() {
        return i0.LIZJ("last_shown_item_warning_level_", ((RBX) HG3.LJIILL()).getCurUserId(), LIZ, 0);
    }

    public static void LIZIZ(int i) {
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        Keva keva = LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("last_shown_item_warning_level_");
        LIZ2.append(curUserId);
        keva.storeInt(X1D.LIZIZ(LIZ2), i);
    }
}
