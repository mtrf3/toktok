package com.ss.android.ugc.aweme.ml.ab;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;

/* loaded from: classes9.dex */
public final class FeedLoadMorePlan {

    @InterfaceC65349Pkn("delay")
    public int delay;

    @InterfaceC65349Pkn("preload")
    public boolean preload;

    @InterfaceC65349Pkn("preload_duration")
    public int preloadDuration;

    @InterfaceC65349Pkn("preload_plan")
    public PreloadStrategyConfig preloadPlan;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("(preload=");
        LIZ.append(this.preload);
        LIZ.append(", delay=");
        LIZ.append(this.delay);
        LIZ.append(" preloadDuration=");
        LIZ.append(this.preloadDuration);
        LIZ.append(" preloadPlan=");
        LIZ.append(this.preloadPlan);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int getDelay() {
        return this.delay;
    }

    public final boolean getPreload() {
        return this.preload;
    }

    public final int getPreloadDuration() {
        return this.preloadDuration;
    }

    public final PreloadStrategyConfig getPreloadPlan() {
        return this.preloadPlan;
    }

    public final void setDelay(int i) {
        this.delay = i;
    }

    public final void setPreload(boolean z) {
        this.preload = z;
    }

    public final void setPreloadDuration(int i) {
        this.preloadDuration = i;
    }

    public final void setPreloadPlan(PreloadStrategyConfig preloadStrategyConfig) {
        this.preloadPlan = preloadStrategyConfig;
    }
}
