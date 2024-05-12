package com.ss.android.ugc.aweme.simkit.config;

import X.C47421IjJ;
import X.C47422IjK;
import com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig;
import com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfigInjectWrapper;

/* loaded from: classes9.dex */
public class SimPreloadConfigInjectWrapper implements IVideoPreloadConfigInjectWrapper {
    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfigInjectWrapper
    public IVideoPreloadConfig wrap(IVideoPreloadConfig iVideoPreloadConfig) {
        return new C47421IjJ(new C47422IjK(iVideoPreloadConfig));
    }
}
