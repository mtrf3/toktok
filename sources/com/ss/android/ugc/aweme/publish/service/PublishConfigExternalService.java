package com.ss.android.ugc.aweme.publish.service;

import X.C41637GVt;
import X.C58096Mr6;
import X.GUW;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.services.publish.IPublishConfigExternalService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class PublishConfigExternalService implements IPublishConfigExternalService {
    public static IPublishConfigExternalService LIZ() {
        Object LIZ = C58096Mr6.LIZ(IPublishConfigExternalService.class, false);
        if (LIZ != null) {
            return (IPublishConfigExternalService) LIZ;
        }
        if (C58096Mr6.j4 == null) {
            synchronized (IPublishConfigExternalService.class) {
                if (C58096Mr6.j4 == null) {
                    C58096Mr6.j4 = new PublishConfigExternalService();
                }
            }
        }
        return C58096Mr6.j4;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IPublishConfigExternalService
    public final boolean shouldShowParallelGuideTooltip() {
        int intValue = ((Number) GUW.LIZ.getValue()).intValue();
        if (intValue == 2 || intValue == 4 || C41637GVt.LIZ()) {
            Keva repo = Keva.getRepo("TOOLS_PUBLISH_PARALLEL_REPO_NAME_V5");
            if (repo.getInt("PUBLISH_PARALLEL_PREVIOUS_SHOW_TIP_COUNT_V2", 0) >= 3) {
                return false;
            }
            if (TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis() - repo.getLong("PUBLISH_PARALLEL_PREVIOUS_SHOW_TIP_TIMESTAMP_V2", 0L)) >= 24) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IPublishConfigExternalService
    public final void updateParallelGuideTooltipShown() {
        Keva repo = Keva.getRepo("TOOLS_PUBLISH_PARALLEL_REPO_NAME_V5");
        int i = repo.getInt("PUBLISH_PARALLEL_PREVIOUS_SHOW_TIP_COUNT_V2", 0);
        if (TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis() - repo.getLong("PUBLISH_PARALLEL_PREVIOUS_SHOW_TIP_TIMESTAMP_V2", 0L)) >= 24) {
            repo.storeLong("PUBLISH_PARALLEL_PREVIOUS_SHOW_TIP_TIMESTAMP_V2", System.currentTimeMillis());
            repo.storeInt("PUBLISH_PARALLEL_PREVIOUS_SHOW_TIP_COUNT_V2", i + 1);
        }
    }
}
