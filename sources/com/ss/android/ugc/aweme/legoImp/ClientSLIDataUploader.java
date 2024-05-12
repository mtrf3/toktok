package com.ss.android.ugc.aweme.legoImp;

import X.InterfaceC65349Pkn;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import defpackage.i0;

/* loaded from: classes7.dex */
public final class ClientSLIDataUploader {

    /* loaded from: classes7.dex */
    public static class SLIDataConfig {

        @InterfaceC65349Pkn("enable")
        public boolean enable;

        @InterfaceC65349Pkn("use_app_log")
        public boolean useAppLog;
    }

    public static void LIZ() {
        SLIDataConfig sLIDataConfig = (SLIDataConfig) i0.LJ(true, "tiktok_sli_data_AB", 31744, SLIDataConfig.class, null);
        if (sLIDataConfig != null) {
            Keva repo = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
            repo.storeBoolean("is_sli_open", sLIDataConfig.enable);
            repo.storeBoolean("is_app_log_open", sLIDataConfig.useAppLog);
        }
    }
}
