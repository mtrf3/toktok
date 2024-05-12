package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.social.experiment.FollowingListFreqParams;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N2Y {
    public static final N2Y LIZ = new N2Y();
    public static final FollowingListFreqParams LIZIZ;
    public static final C58701N2b LIZJ;
    public static String LIZLLL;
    public static boolean LJ;

    static {
        C58701N2b c58701N2b = C58701N2b.LIZ;
        c58701N2b.getClass();
        FollowingListFreqParams followingListFreqParams = (FollowingListFreqParams) C58701N2b.LIZJ.getValue();
        o.LJIIIIZZ(followingListFreqParams, "FollowingListRecommendExperiment.value");
        LIZIZ = followingListFreqParams;
        LIZJ = c58701N2b;
        LIZLLL = "";
    }

    public static Keva LIZ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("f_recommend_prefix_");
        LIZ2.append(((RBX) HG3.LJIILL()).getCurUserId());
        Keva repo = Keva.getRepo(X1D.LIZIZ(LIZ2));
        o.LJIIIIZZ(repo, "getRepo(KEVA_REPO_NAME_PRE + curUserId)");
        return repo;
    }
}
