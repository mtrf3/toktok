package X;

import android.content.Context;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.experiment.InterestGroupSetting;
import com.ss.android.ugc.aweme.feed.interest.viewmodel.InterestViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LAL {
    public static volatile String LIZ;
    public static final Keva LIZIZ = Keva.getRepo("interest_select");
    public static final InterestGroupSetting LIZJ;
    public static final C62822Ol8 LIZLLL;
    public static final C62822Ol8 LJ;
    public static int LJFF;
    public static boolean LJI;
    public static volatile boolean LJII;
    public static volatile Aweme LJIIIIZZ;

    static {
        FFL.LJIIIZ().getClass();
        FFL.LJ(31744, "user_interest_show_strategy_android_mock", true, false);
        FFL.LJIIIZ().getClass();
        String LJIILJJIL = FFL.LJIILJJIL(31744, "user_interest_show_strategy", "", false);
        InterestGroupSetting interestGroupSetting = (InterestGroupSetting) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), LJIILJJIL, InterestGroupSetting.class);
        C36922EeM.LIZLLL(4, "InterestSelectExperiment", "get experiment,raw:" + LJIILJJIL + ",end:" + interestGroupSetting);
        LIZJ = interestGroupSetting;
        LIZLLL = C221108m2.LIZIZ(LAM.LJLIL);
        LJ = C221108m2.LIZIZ(C53822LAk.LJLIL);
        LJI = true;
    }

    public static void LIZ(Context context) {
        String str;
        if ((context instanceof ActivityC45651qj) && LJIIIIZZ != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "homepage_hot");
            RBY LJFF2 = AccountService.LJIJ().LJFF();
            if (LJFF2 != null) {
                str = LJFF2.getCurUserId();
            } else {
                str = null;
            }
            c188727au.LJIIIZ("user_id", str);
            FMX.LJIIL("enable_interest_lable", c188727au.LIZ);
            Aweme aweme = LJIIIIZZ;
            if (aweme != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("insert aid:");
                LIZ2.append(aweme.getAid());
                C36922EeM.LIZLLL(4, "InterestSelectExperiment", X1D.LIZIZ(LIZ2));
                ActivityC45651qj activity = (ActivityC45651qj) context;
                o.LJIIIZ(activity, "activity");
                ((InterestViewModel) ViewModelProviders.of(activity).get(InterestViewModel.class)).LJLIL.postValue(aweme);
                return;
            }
            return;
        }
        C36922EeM.LIZLLL(4, "InterestSelectExperiment", "not insert cause aweme is null or other reason,just ignore");
    }
}
