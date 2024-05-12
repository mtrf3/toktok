package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.IQn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46597IQn {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C46596IQm.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(IR2.LJLIL);

    public static Keva LIZ() {
        String str;
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if (curUser == null || (str = curUser.getUid()) == null) {
            str = "";
        }
        StringBuilder LIZ2 = X1D.LIZ();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("inbox_collapse_");
        LIZ3.append(C46604IQu.LIZ());
        LIZ3.append('_');
        LIZ2.append(X1D.LIZIZ(LIZ3));
        LIZ2.append(str);
        Keva repo = Keva.getRepo(X1D.LIZIZ(LIZ2));
        o.LJIIIIZZ(repo, "getRepo(REPO_PREFIX + uid)");
        return repo;
    }
}
