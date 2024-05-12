package X;

import com.bytedance.keva.Keva;
import defpackage.i0;
import java.util.Calendar;
import kotlin.jvm.internal.o;

/* renamed from: X.Mj6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57600Mj6 {
    public static Keva LIZIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("feed_insert_recommend_user_card_common_");
        LIZ.append(((RBX) HG3.LJIILL()).getCurUserId());
        Keva repo = Keva.getRepo(X1D.LIZIZ(LIZ));
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME_PREFIX….userService().curUserId)");
        return repo;
    }

    public static boolean LIZ(String str) {
        if (System.currentTimeMillis() >= C78580Usi.LIZIZ("timestamp_of_update_insert_status", str, LIZIZ(), 0L) * 1000) {
            return true;
        }
        return false;
    }

    public static void LIZJ(String str) {
        Keva LIZIZ = LIZIZ();
        String LJFF = i0.LJFF("timestamp_of_update_insert_status", str);
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        long LJI = K72.LJI(C30581Hy.LJJJI(1, K74.DAYS), K74.SECONDS);
        LIZIZ.storeLong(LJFF, ((1 * LJI) + currentTimeMillis) - ((currentTimeMillis + Calendar.getInstance().getTimeZone().getRawOffset()) % LJI));
    }

    public static void LIZLLL(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[updateNegativeActionTimes] isNegative = ");
        LIZ.append(z);
        C221018lt.LIZ("TTRecUserCardCommonKeva", X1D.LIZIZ(LIZ));
        if (z) {
            int i = LIZIZ().getInt("negative_action_times", 0) + 1;
            if (i >= C57626MjW.LIZ().negativeBehaviorThreshold) {
                C221018lt.LIZ("TTRecUserCardCommonKeva", "[updateNegativeActionTimes] dislike this feature");
                XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C57692Mka(null), 2);
                LIZIZ().storeInt("negative_action_times", 0);
                return;
            }
            LIZIZ().storeInt("negative_action_times", i);
            return;
        }
        LIZIZ().storeInt("negative_action_times", 0);
    }
}
