package com.ss.android.ugc.aweme.utils.gecko;

import X.InterfaceC65349Pkn;

/* loaded from: classes11.dex */
public final class GeckoExperimentsType {

    @InterfaceC65349Pkn("use_gecko_settings")
    public final boolean useGeckoSettings = true;

    @InterfaceC65349Pkn("available_storage_full")
    public final int availableStorageFull = 150;

    @InterfaceC65349Pkn("available_storage_patch")
    public final int availableStoragePatch = 100;

    @InterfaceC65349Pkn("enable_cdn_statistic")
    public final boolean enableCDNStatistic = true;

    public final int getAvailableStorageFull() {
        return this.availableStorageFull;
    }

    public final int getAvailableStoragePatch() {
        return this.availableStoragePatch;
    }

    public final boolean getEnableCDNStatistic() {
        return this.enableCDNStatistic;
    }

    public final boolean getUseGeckoSettings() {
        return this.useGeckoSettings;
    }
}
