package com.ss.android.ugc.aweme.homepage.experiment;

import X.C36093EEn;
import X.C36094EEo;
import X.C38874FNm;
import X.C53320KwG;
import X.C58096Mr6;
import X.EEY;
import X.EnumC36092EEm;
import X.FV6;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate;
import com.ss.android.ugc.aweme.homepage.ui.inflate.X2CActivityMain;
import com.ss.android.ugc.aweme.homepage.ui.inflate.X2CFragmentMain;
import com.ss.android.ugc.aweme.homepage.ui.inflate.X2CFragmentMainPage;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.X2CTabItem;
import com.ss.android.ugc.aweme.main.experiment.IHomepageExperimentService;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class HomepageExperimentServiceImpl implements IHomepageExperimentService {
    public static IHomepageExperimentService LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(IHomepageExperimentService.class, false);
        if (LIZ != null) {
            return (IHomepageExperimentService) LIZ;
        }
        return new HomepageExperimentServiceImpl();
    }

    @Override // com.ss.android.ugc.aweme.main.experiment.IHomepageExperimentService
    public final void initLegoInflate() {
        C36093EEn c36093EEn = C36093EEn.LIZ;
        c36093EEn.LIZ(X2CActivityMain.class, new X2CActivityMain());
        c36093EEn.LIZ(X2CFragmentMainPage.class, new X2CFragmentMainPage());
        c36093EEn.LIZ(X2CFragmentMain.class, new X2CFragmentMain());
        c36093EEn.LIZ(X2CTabItem.class, new X2CTabItem());
        c36093EEn.LIZ(PreDrawableInflate.class, new PreDrawableInflate());
        CommentService.LIZ.getClass();
        CommentServiceImpl.LJJL().LJJJJL();
        if (C38874FNm.LIZIZ()) {
            new C36094EEo().LIZJ();
            C36093EEn.LIZIZ(EnumC36092EEm.NEW_USER, false, FV6.LJLIL);
            return;
        }
        C36094EEo c36094EEo = new C36094EEo();
        Object newInstance = PreDrawableInflate.class.newInstance();
        o.LJIIIIZZ(newInstance, "name.newInstance()");
        c36094EEo.LIZIZ((EEY) newInstance, true);
        c36094EEo.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.main.experiment.IHomepageExperimentService
    public final boolean LIZ() {
        return C53320KwG.LIZIZ();
    }
}
