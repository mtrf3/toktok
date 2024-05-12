package com.ss.android.ugc.aweme.experiment;

import X.DXK;
import com.bytedance.ies.dmt.ui.spi.DoubleColorBallAnimationViewExperimentService;

/* loaded from: classes7.dex */
public final class DoubleColorBallAnimationViewExperimentServiceImpl implements DoubleColorBallAnimationViewExperimentService {
    @Override // com.bytedance.ies.dmt.ui.spi.DoubleColorBallAnimationViewExperimentService
    public final boolean LIZ() {
        int intValue = ((Number) DXK.LIZJ.getValue()).intValue();
        if (intValue == 1) {
            return true;
        }
        if (intValue != 2) {
            return false;
        }
        return DXK.LIZ;
    }
}
