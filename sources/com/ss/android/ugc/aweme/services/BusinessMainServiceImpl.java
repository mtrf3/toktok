package com.ss.android.ugc.aweme.services;

import X.C40406FtS;
import X.C40407FtT;
import X.C58096Mr6;
import X.FAB;
import X.R3A;
import android.view.View;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class BusinessMainServiceImpl implements IBusinessMainService {
    @Override // com.ss.android.ugc.aweme.services.IBusinessMainService
    public IInitialChooseLanguageManager getInitialChooseLanguageManager() {
        C40407FtT c40407FtT = C40406FtS.LIZ;
        o.LJIIIIZZ(c40407FtT, "ins()");
        return c40407FtT;
    }

    @Override // com.ss.android.ugc.aweme.services.IBusinessMainService
    public boolean isInActivity() {
        return R3A.LJII();
    }

    public static IBusinessMainService createIBusinessMainServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IBusinessMainService.class, z);
        if (LIZ != null) {
            return (IBusinessMainService) LIZ;
        }
        if (C58096Mr6.E5 == null) {
            synchronized (IBusinessMainService.class) {
                if (C58096Mr6.E5 == null) {
                    C58096Mr6.E5 = new BusinessMainServiceImpl();
                }
            }
        }
        return C58096Mr6.E5;
    }

    @Override // com.ss.android.ugc.aweme.services.IBusinessMainService
    public void updateRootViewAndState(View view) {
        MainLooperOptService LJIIJ = MainLooperOptService.LJIIJ(null);
        if (LJIIJ != null) {
            LJIIJ.LJIJJ(view);
            LJIIJ.LJIJJLI(FAB.WATCH_WINDOW_FOCUS_CHANGE);
        }
    }
}
