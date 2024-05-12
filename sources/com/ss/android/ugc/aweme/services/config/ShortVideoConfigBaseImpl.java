package com.ss.android.ugc.aweme.services.config;

import X.C19N;
import X.C44172HVg;
import X.C45275Hpn;
import X.C78934UyQ;
import X.EF7;
import X.HLZ;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.service.CommonFeedApiService;
import com.ss.android.ugc.aweme.services.IShortVideoConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public abstract class ShortVideoConfigBaseImpl implements IShortVideoConfig {
    @Override // com.ss.android.ugc.aweme.services.IShortVideoConfig
    public long extendedDuetOrStitchTime() {
        return 600500L;
    }

    @Override // com.ss.android.ugc.aweme.services.IShortVideoConfig
    public boolean isHookLibrary() {
        return C45275Hpn.LIZ.getBoolean("key_ve_hook_switch", false);
    }

    @Override // com.ss.android.ugc.aweme.services.IShortVideoConfig
    public long maxConsumerDuetOrStitchVideoTime() {
        C78934UyQ.LJLIL.LIZLLL().getClass();
        if (CommonFeedApiService.LIZ().LJIILL()) {
            return 600500L;
        }
        return 180500L;
    }

    @Override // com.ss.android.ugc.aweme.services.IShortVideoConfig
    public long maxCreatorDuetOrStitchVideoTime() {
        if (C19N.LJ("allow_3m_to_10m_video_duet_and_stitch_creator", true)) {
            return 600500L;
        }
        return 180500L;
    }

    @Override // com.ss.android.ugc.aweme.services.IShortVideoConfig
    public boolean getUsingOnline() {
        return o.LJ(HLZ.LIZ(), "");
    }

    @Override // com.ss.android.ugc.aweme.services.IShortVideoConfig
    public boolean isRecording() {
        return C44172HVg.LJ();
    }

    @Override // com.ss.android.ugc.aweme.services.IShortVideoConfig
    public void enableHookLibrary(boolean z) {
        C45275Hpn.LIZ.storeBoolean("key_ve_hook_switch", z);
        if (z) {
            C45275Hpn.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IShortVideoConfig
    public String getErrorHintWhenDisableDuetOrStitch(int i) {
        int maxCreatorDuetOrStitchVideoTime = (int) AVExternalServiceImpl.LIZ().configService().shortVideoConfig().maxCreatorDuetOrStitchVideoTime();
        if (i != 1) {
            if (i != 2) {
                return "";
            }
            return EF7.LIZIZ().getString(R.string.e7o, Integer.valueOf(maxCreatorDuetOrStitchVideoTime / 60000));
        }
        return EF7.LIZIZ().getString(R.string.e2p, Integer.valueOf(maxCreatorDuetOrStitchVideoTime / 60000));
    }
}
