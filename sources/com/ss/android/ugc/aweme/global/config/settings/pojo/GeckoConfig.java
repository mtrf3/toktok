package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes7.dex */
public class GeckoConfig {

    @InterfaceC65349Pkn("dyc_channel")
    public List<String> dycChannel;

    @InterfaceC65349Pkn("initial_channel")
    public List<String> initialChannel;

    @InterfaceC65349Pkn("initial_high_priority_channel")
    public List<String> initialHighPriorityChannel;

    @InterfaceC65349Pkn("use_new_package_now")
    public boolean useNewPackageNow;

    public List<String> getDynamicChannel() {
        return this.dycChannel;
    }

    public List<String> getInitialChannel() {
        return this.initialChannel;
    }

    public List<String> getInitialHighPriorityChannel() {
        return this.initialHighPriorityChannel;
    }

    public boolean getUseNewPackageNow() {
        return this.useNewPackageNow;
    }
}
