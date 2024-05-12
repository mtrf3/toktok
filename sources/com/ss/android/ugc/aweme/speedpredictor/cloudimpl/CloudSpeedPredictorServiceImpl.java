package com.ss.android.ugc.aweme.speedpredictor.cloudimpl;

import X.C47491IkR;
import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator;
import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedPredictorService;

/* loaded from: classes9.dex */
public class CloudSpeedPredictorServiceImpl implements ISpeedPredictorService {
    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedPredictorService
    public ISpeedCalculator build() {
        return new C47491IkR();
    }
}
