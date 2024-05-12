package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes7.dex */
public final class AdSettingsModel implements Serializable {

    @InterfaceC65349Pkn("ads_only_switch")
    public final boolean adsOnlySwitch;

    @InterfaceC65349Pkn("spark_ads")
    public final SparkAdsModel sparkAds;

    public final boolean getAdsOnlySwitch() {
        return this.adsOnlySwitch;
    }

    public final SparkAdsModel getSparkAds() {
        return this.sparkAds;
    }
}
