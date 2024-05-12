package com.ss.android.ugc.aweme.experiment.newuser;

import X.InterfaceC65349Pkn;
import com.bytedance.ies.abmock.SettingsManager;

/* loaded from: classes7.dex */
public final class WeakNetCountryGeckoNormalOptSettings {
    public static final GeckoxWeakCountryChannelWhitelistModel LIZ = new GeckoxWeakCountryChannelWhitelistModel();

    /* loaded from: classes7.dex */
    public static class GeckoxWeakCountryChannelWhitelistModel {

        @InterfaceC65349Pkn("enable")
        public boolean enable;

        @InterfaceC65349Pkn("unloadDays")
        public long unloadDays = 5;

        @InterfaceC65349Pkn("whiteList")
        public String[] whiteList;
    }

    public static GeckoxWeakCountryChannelWhitelistModel LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        GeckoxWeakCountryChannelWhitelistModel geckoxWeakCountryChannelWhitelistModel = LIZ;
        GeckoxWeakCountryChannelWhitelistModel geckoxWeakCountryChannelWhitelistModel2 = (GeckoxWeakCountryChannelWhitelistModel) LIZLLL.LJIIIIZZ("geckox_weak_country_channel_whitelist", GeckoxWeakCountryChannelWhitelistModel.class, geckoxWeakCountryChannelWhitelistModel);
        if (geckoxWeakCountryChannelWhitelistModel2 != null) {
            return geckoxWeakCountryChannelWhitelistModel2;
        }
        return geckoxWeakCountryChannelWhitelistModel;
    }
}
