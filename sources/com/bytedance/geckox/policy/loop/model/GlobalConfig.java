package com.bytedance.geckox.policy.loop.model;

import X.InterfaceC65349Pkn;
import java.util.Map;

/* loaded from: classes11.dex */
public class GlobalConfig {

    @InterfaceC65349Pkn("check_update")
    public Map<String, LoopInterval> checkUpdate;

    public GlobalConfig() {
    }

    public Map<String, LoopInterval> getCheckUpdate() {
        return this.checkUpdate;
    }

    public GlobalConfig(Map<String, LoopInterval> map) {
        this.checkUpdate = map;
    }
}
