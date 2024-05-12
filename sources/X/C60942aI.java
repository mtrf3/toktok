package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.2aI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60942aI {
    public static final /* synthetic */ int LIZ = 0;

    public static Keva LIZ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("insert_rec_user_card_into_friends_tab_");
        LIZ2.append(((RBX) HG3.LJIILL()).getCurUserId());
        Keva repo = Keva.getRepo(X1D.LIZIZ(LIZ2));
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME + Acco….userService().curUserId)");
        return repo;
    }

    public static void LIZIZ() {
        int i = LIZ().getInt("count_of_card_impression", 0) + 1;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("increaseBigCardImpressionCount = ");
        LIZ2.append(i);
        C221018lt.LJFF("TTRecUserBigCardFriendsTab", X1D.LIZIZ(LIZ2));
        LIZ().storeInt("count_of_card_impression", i);
    }
}
