package com.ss.android.ugc.aweme.poi_api.experiment;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PoiCommonSettingsConfig {

    @InterfaceC65349Pkn("gecko_sync_channel")
    public final PoiGeckoSyncChannels geckoSyncChannels;

    /* JADX WARN: Multi-variable type inference failed */
    public PoiCommonSettingsConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PoiCommonSettingsConfig) && o.LJ(this.geckoSyncChannels, ((PoiCommonSettingsConfig) obj).geckoSyncChannels);
    }

    public final int hashCode() {
        PoiGeckoSyncChannels poiGeckoSyncChannels = this.geckoSyncChannels;
        if (poiGeckoSyncChannels == null) {
            return 0;
        }
        return poiGeckoSyncChannels.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PoiCommonSettingsConfig(geckoSyncChannels=");
        LIZ.append(this.geckoSyncChannels);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public PoiCommonSettingsConfig(PoiGeckoSyncChannels poiGeckoSyncChannels) {
        this.geckoSyncChannels = poiGeckoSyncChannels;
    }

    public /* synthetic */ PoiCommonSettingsConfig(PoiGeckoSyncChannels poiGeckoSyncChannels, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : poiGeckoSyncChannels);
    }
}
