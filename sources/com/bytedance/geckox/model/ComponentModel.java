package com.bytedance.geckox.model;

import X.InterfaceC65349Pkn;
import com.bytedance.geckox.policy.loop.model.GlobalConfig;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public class ComponentModel {

    @InterfaceC65349Pkn("global_config")
    public GlobalConfig globalConfig = new GlobalConfig();

    @InterfaceC65349Pkn("packages")
    public Map<String, List<UpdatePackage>> packages;

    @InterfaceC65349Pkn("universal_strategies")
    public Map<String, CleanPolicyModel> universalStrategies;

    public GlobalConfig getGlobalConfig() {
        return this.globalConfig;
    }

    public Map<String, List<UpdatePackage>> getPackages() {
        return this.packages;
    }

    public Map<String, CleanPolicyModel> getUniversalStrategies() {
        return this.universalStrategies;
    }
}
