package com.ss.android.ugc.aweme.nows.feed.caption;

import X.C185167Om;
import com.ss.android.ugc.aweme.service.INowCaptionService;

/* loaded from: classes4.dex */
public final class NowCaptionService implements INowCaptionService {
    @Override // com.ss.android.ugc.aweme.service.INowCaptionService
    public final int LIZIZ() {
        return C185167Om.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.INowCaptionService
    public final boolean LIZ(int i) {
        if (i != 0 && i != 1 && i != 3 && i != 4) {
            return true;
        }
        return false;
    }
}
