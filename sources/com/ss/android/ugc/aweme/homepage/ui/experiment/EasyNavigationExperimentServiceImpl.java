package com.ss.android.ugc.aweme.homepage.ui.experiment;

import X.ActivityC45651qj;
import X.C53320KwG;
import X.C58096Mr6;
import com.ss.android.ugc.aweme.experiment.EasyNavigationExperimentService;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;

/* loaded from: classes10.dex */
public final class EasyNavigationExperimentServiceImpl implements EasyNavigationExperimentService {
    public static EasyNavigationExperimentService LJFF() {
        Object LIZ = C58096Mr6.LIZ(EasyNavigationExperimentService.class, false);
        if (LIZ != null) {
            return (EasyNavigationExperimentService) LIZ;
        }
        if (C58096Mr6.d1 == null) {
            synchronized (EasyNavigationExperimentService.class) {
                if (C58096Mr6.d1 == null) {
                    C58096Mr6.d1 = new EasyNavigationExperimentServiceImpl();
                }
            }
        }
        return C58096Mr6.d1;
    }

    @Override // com.ss.android.ugc.aweme.experiment.EasyNavigationExperimentService
    public final boolean LIZIZ() {
        if (C53320KwG.LIZ() == 3 || C53320KwG.LIZ() == 4 || C53320KwG.LIZ() == 5 || C53320KwG.LIZ() == 6) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.experiment.EasyNavigationExperimentService
    public final boolean LIZLLL() {
        if (C53320KwG.LIZ() == 2 || C53320KwG.LIZ() == 4 || C53320KwG.LIZ() == 6) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.experiment.EasyNavigationExperimentService
    public final boolean LJ() {
        return C53320KwG.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.experiment.EasyNavigationExperimentService
    public final boolean LIZ(ActivityC45651qj activityC45651qj) {
        return HomeTabViewModel.LJLJLLL.LIZ(activityC45651qj).LJLJL;
    }

    @Override // com.ss.android.ugc.aweme.experiment.EasyNavigationExperimentService
    public final void LIZJ(ActivityC45651qj activityC45651qj) {
        HomeTabViewModel.LJLJLLL.LIZ(activityC45651qj).LJLJJL = false;
    }
}
