package com.ss.android.ugc.aweme.ml.ab;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;

/* loaded from: classes9.dex */
public final class SmartPrerenderConfig extends SmartSceneConfig {

    @InterfaceC65349Pkn("debug_force_result")
    public int debugForceResult;

    @InterfaceC65349Pkn("enable_monitor")
    public boolean enableMonitor;

    @InterfaceC65349Pkn("time_threshold")
    public long timeThreshold;

    @InterfaceC65349Pkn("wait_count_for_monitor")
    public int waitCountForMonitor;

    public SmartPrerenderConfig() {
        setScene(SmartPrerenderExperiment.SCENE);
        this.waitCountForMonitor = 3;
        this.timeThreshold = 2000L;
    }
}
