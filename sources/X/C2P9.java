package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.2P9, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2P9 {
    public static final /* synthetic */ int LIZ = 0;

    public static Keva LIZ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("insert_rec_user_big_card_into_following_feed_");
        LIZ2.append(((RBX) HG3.LJIILL()).getCurUserId());
        Keva repo = Keva.getRepo(X1D.LIZIZ(LIZ2));
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME + Acco….userService().curUserId)");
        return repo;
    }
}
