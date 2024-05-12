package com.ss.android.ugc.aweme.services;

import X.C58096Mr6;
import X.C88546Yp4;
import android.app.Activity;
import com.ss.android.ugc.aweme.PerformanceMainService;
import com.ss.android.ugc.aweme.wiki.AddWikiActivity;

/* loaded from: classes11.dex */
public final class PerformanceMainServiceImpl implements PerformanceMainService {
    public static final int $stable = 0;

    @Override // com.ss.android.ugc.aweme.PerformanceMainService
    public Activity newAddWikiActivity() {
        return new AddWikiActivity();
    }

    @Override // com.ss.android.ugc.aweme.PerformanceMainService
    public void preloadPushSettingsManager() {
        C88546Yp4.LIZIZ.preloadPushSettingsManager();
    }

    public static PerformanceMainService createPerformanceMainServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(PerformanceMainService.class, z);
        if (LIZ != null) {
            return (PerformanceMainService) LIZ;
        }
        if (C58096Mr6.X5 == null) {
            synchronized (PerformanceMainService.class) {
                if (C58096Mr6.X5 == null) {
                    C58096Mr6.X5 = new PerformanceMainServiceImpl();
                }
            }
        }
        return C58096Mr6.X5;
    }
}
