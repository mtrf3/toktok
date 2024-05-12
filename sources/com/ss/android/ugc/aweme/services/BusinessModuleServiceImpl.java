package com.ss.android.ugc.aweme.services;

import X.C36093EEn;
import X.C58096Mr6;
import X.FAB;
import X.O5Y;
import android.view.Choreographer;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class BusinessModuleServiceImpl implements BusinessModuleService {
    @Override // com.ss.android.ugc.aweme.services.BusinessModuleService
    public void getMainLooperOptServiceAndUpdateWatchMainFrame() {
        MainLooperOptService LJIIJ = MainLooperOptService.LJIIJ(FAB.WATCH_MAIN_FRAME);
        if (LJIIJ != null) {
            LJIIJ.LJIJI();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.BusinessModuleService
    public void getMainLooperOptServiceAndUpdateWatchUIFrame() {
        MainLooperOptService LJIIJ = MainLooperOptService.LJIIJ(FAB.WATCH_UI_FRAME);
        if (LJIIJ != null) {
            LJIIJ.LJIJI();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.BusinessModuleService
    public void resetWatchState() {
        C36093EEn.LIZ.getClass();
        MainLooperOptService mainLooperOptService = (MainLooperOptService) C36093EEn.LJII(MainLooperOptService.class);
        mainLooperOptService.getClass();
        for (FAB fab : FAB.values()) {
            ((HashMap) mainLooperOptService.LJLIL).put(fab, Boolean.FALSE);
        }
    }

    public static BusinessModuleService createBusinessModuleServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(BusinessModuleService.class, z);
        if (LIZ != null) {
            return (BusinessModuleService) LIZ;
        }
        if (C58096Mr6.F5 == null) {
            synchronized (BusinessModuleService.class) {
                if (C58096Mr6.F5 == null) {
                    C58096Mr6.F5 = new BusinessModuleServiceImpl();
                }
            }
        }
        return C58096Mr6.F5;
    }

    @Override // com.ss.android.ugc.aweme.services.BusinessModuleService
    public void notifyFeedCacheCallback(Lock lock) {
        o.LJIIIZ(lock, "lock");
        O5Y.LJJJJZI(lock);
    }

    @Override // com.ss.android.ugc.aweme.services.BusinessModuleService
    public void setMainLooperOptServiceEnable(boolean z) {
        MainLooperOptService.LLFFF = z;
    }

    @Override // com.ss.android.ugc.aweme.services.BusinessModuleService
    public boolean doAtTheEndOfMeasure(Choreographer choreographer, Runnable runnable) {
        o.LJIIIZ(choreographer, "choreographer");
        o.LJIIIZ(runnable, "runnable");
        return MainLooperOptService.LJ(choreographer, runnable);
    }
}
