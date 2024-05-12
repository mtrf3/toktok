package com.ss.android.ugc.aweme.performanceopt.experiment.feed;

import X.InterfaceC65349Pkn;
import X.WM7;

/* loaded from: classes7.dex */
public final class FpsSceneRateConfig {

    @InterfaceC65349Pkn("sample")
    public float rate;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public String sceneName;

    public final float getRate() {
        return this.rate;
    }

    public final String getSceneName() {
        return this.sceneName;
    }

    public final void setRate(float f) {
        this.rate = f;
    }

    public final void setSceneName(String str) {
        this.sceneName = str;
    }
}
