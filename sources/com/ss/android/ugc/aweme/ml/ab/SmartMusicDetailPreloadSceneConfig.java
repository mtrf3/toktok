package com.ss.android.ugc.aweme.ml.ab;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;

/* loaded from: classes9.dex */
public final class SmartMusicDetailPreloadSceneConfig extends SmartSceneConfig {

    @InterfaceC65349Pkn("expire_time")
    public int expireTime;

    @InterfaceC65349Pkn("run_delay")
    public long runDelay;

    @InterfaceC65349Pkn("wait_count_for_real")
    public int waitCountForReal;

    public SmartMusicDetailPreloadSceneConfig() {
        setScene(SmartMusicDetailPreloadExperiment.SCENE);
        this.runDelay = 2000L;
        this.waitCountForReal = 2;
        this.expireTime = 15000;
    }
}
