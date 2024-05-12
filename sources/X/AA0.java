package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AA0 {
    public static String LIZIZ = ((RBX) HG3.LJIILL()).getCurUserId();
    public static AA0 LIZJ;
    public final Keva LIZ;

    public AA0() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("i18n_recommmend_user_");
        LIZ.append(LIZIZ);
        Keva repo = Keva.getRepo(X1D.LIZIZ(LIZ));
        o.LJIIIIZZ(repo, "getRepo(PREFIX_REPO_NAME + uid)");
        this.LIZ = repo;
    }
}
