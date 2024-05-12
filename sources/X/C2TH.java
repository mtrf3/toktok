package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.2TH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2TH {
    public static final /* synthetic */ int LIZ = 0;

    public static Keva LIZ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("rec_user_card_maf_filter_");
        LIZ2.append(((RBX) HG3.LJIILL()).getCurUserId());
        Keva repo = Keva.getRepo(X1D.LIZIZ(LIZ2));
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME_PREFIX….userService().curUserId)");
        return repo;
    }
}
