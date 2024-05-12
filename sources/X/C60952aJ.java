package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.2aJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60952aJ {
    public static Keva LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("insert_rec_user_card_into_rec_feed_");
        LIZ.append(((RBX) HG3.LJIILL()).getCurUserId());
        Keva repo = Keva.getRepo(X1D.LIZIZ(LIZ));
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME_PREFIX….userService().curUserId)");
        return repo;
    }

    public static void LIZIZ() {
        int i = LIZ().getInt("count_of_card_impression", 0) + 1;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("increaseBigCardImpressionCount = ");
        LIZ.append(i);
        C221018lt.LJFF("TTRecUserBigCardFypKeva", X1D.LIZIZ(LIZ));
        LIZ().storeInt("count_of_card_impression", i);
    }
}
