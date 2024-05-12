package com.ss.android.ugc.aweme.homepage.spi;

import X.AbstractC53895LDf;
import X.ActivityC45651qj;
import X.C53765L8f;
import X.C58096Mr6;
import X.LGT;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.experiment.SlidePage;
import com.ss.android.ugc.aweme.experiment.SlidePageItem;
import com.ss.android.ugc.aweme.spi.HomePageCommonService;
import com.ss.android.ugc.aweme.unlogin.UnloginSignUpFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class HomePageCommonServiceImpl implements HomePageCommonService {
    @Override // com.ss.android.ugc.aweme.spi.HomePageCommonService
    public final Class<? extends Fragment> LIZIZ() {
        return UnloginSignUpFragment.class;
    }

    public static HomePageCommonService LJ() {
        Object LIZ = C58096Mr6.LIZ(HomePageCommonService.class, false);
        if (LIZ != null) {
            return (HomePageCommonService) LIZ;
        }
        if (C58096Mr6.c1 == null) {
            synchronized (HomePageCommonService.class) {
                if (C58096Mr6.c1 == null) {
                    C58096Mr6.c1 = new HomePageCommonServiceImpl();
                }
            }
        }
        return C58096Mr6.c1;
    }

    @Override // com.ss.android.ugc.aweme.spi.HomePageCommonService
    public final AbstractC53895LDf LIZ() {
        return LGT.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.spi.HomePageCommonService
    public final AbstractC53895LDf LIZJ() {
        return LGT.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.spi.HomePageCommonService
    public final AbstractC53895LDf LIZLLL(ActivityC45651qj activity) {
        SlidePageItem slidePageItem;
        o.LJIIIZ(activity, "activity");
        SlidePage LJII = C53765L8f.LJII();
        if (LJII != null && (slidePageItem = LJII.right) != null) {
            LGT.LIZIZ = LGT.LIZ(activity, slidePageItem.landingPage);
        }
        return LGT.LIZIZ;
    }
}
