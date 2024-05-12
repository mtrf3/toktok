package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.2aM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60982aM {
    public static int LIZIZ;
    public static XKQ LIZLLL;
    public static int LIZ = -1;
    public static String LIZJ = "";

    public static String LIZ() {
        String uid;
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if (curUser == null || (uid = curUser.getUid()) == null) {
            return "";
        }
        return uid;
    }

    public static void LIZIZ(String cacheUid) {
        Object LIZ2;
        o.LJIIIZ(cacheUid, "cacheUid");
        if (LIZ == LIZIZ || cacheUid.length() == 0 || !o.LJ(cacheUid, LIZ())) {
            return;
        }
        try {
            LIZ = LIZIZ;
            Keva repo = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
            o.LJIIIIZZ(repo, "getRepo(REPO_NAME_FORMAT)");
            String LLLZ = C16880lQ.LLLZ("%s_notice_num_count", Arrays.copyOf(new Object[]{LIZ()}, 1));
            o.LJIIIIZZ(LLLZ, "format(this, *args)");
            repo.storeInt(LLLZ, LIZ);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("cache, noticeCount: ");
            LIZ3.append(LIZ);
            C221018lt.LJFF("RedDotCacheHelper", X1D.LIZIZ(LIZ3));
            LIZ2 = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ2);
        if (m10exceptionOrNullimpl == null) {
            return;
        }
        C221018lt.LIZJ("RedDotCacheHelper", "updateCache", m10exceptionOrNullimpl);
    }
}
