package com.ss.android.ugc.aweme.service;

import X.C34945DnZ;
import X.O3U;
import com.ss.android.ugc.aweme.utils.gecko.GeckoExperimentsType;

/* loaded from: classes11.dex */
public final class LingoCaptionServiceImpl implements LingoCaptionService {
    @Override // com.ss.android.ugc.aweme.service.LingoCaptionService
    public final int LIZ() {
        GeckoExperimentsType geckoExperimentsType = (GeckoExperimentsType) C34945DnZ.LIZIZ.getValue();
        if (geckoExperimentsType != null) {
            return geckoExperimentsType.getAvailableStorageFull();
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.service.LingoCaptionService
    public final boolean LIZIZ() {
        return O3U.LJIILL("tiktok_lingo_dictionary_panel");
    }
}
