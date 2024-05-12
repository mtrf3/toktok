package com.ss.android.ugc.aweme.simkit.config;

import X.IXZ;
import com.ss.android.ugc.aweme.video.config.ISimPlayerConfig;
import com.ss.android.ugc.aweme.video.config.ISimPlayerConfigInjectWrapper;

/* loaded from: classes9.dex */
public class SimPlayerConfigInjectWrapper implements ISimPlayerConfigInjectWrapper {
    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfigInjectWrapper
    public ISimPlayerConfig wrap(ISimPlayerConfig iSimPlayerConfig) {
        return new IXZ(iSimPlayerConfig);
    }
}
