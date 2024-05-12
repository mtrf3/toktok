package X;

import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.count.FeedPlayNumModel;
import com.ss.android.ugc.aweme.feed.count.UserPlayNum;
import java.util.Calendar;

/* loaded from: classes9.dex */
public final class JCF {
    public static final JCG LIZ;
    public static final IAccountService LIZIZ;
    public static UserPlayNum LIZJ;

    static {
        JCG jcg = new JCG();
        LIZ = jcg;
        IAccountService LJIJ = AccountService.LJIJ();
        LIZIZ = LJIJ;
        LIZJ = jcg.LIZ(LJIJ.LJFF().getCurUserId());
    }

    public static void LIZ() {
        int i = Calendar.getInstance().get(6);
        if (LIZJ.getModel().getDate() != i) {
            FeedPlayNumModel model = LIZJ.getModel();
            model.setPlayNum(0);
            model.setBatchNum(0);
            model.setRecommendPlayNum(0);
            model.setRecommendBatchNum(0);
            model.setPlayTimeBefore(0L);
            model.setDate(i);
        }
    }
}
