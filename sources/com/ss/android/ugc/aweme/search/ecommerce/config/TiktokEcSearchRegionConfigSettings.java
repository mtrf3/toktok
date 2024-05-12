package com.ss.android.ugc.aweme.search.ecommerce.config;

import X.InterfaceC65349Pkn;
import com.bytedance.ies.abmock.SettingsManager;

/* loaded from: classes9.dex */
public final class TiktokEcSearchRegionConfigSettings {
    public static final TiktokEcSearchRegionConfigModel LIZ;

    /* loaded from: classes9.dex */
    public static final class TiktokEcSearchRegionConfigModel {

        @InterfaceC65349Pkn("disable_sug_from_mall")
        public boolean disableSugFromMall;

        @InterfaceC65349Pkn("disable_suggest_guide_from_mall")
        public boolean disableSuggestGuideFromMall;

        @InterfaceC65349Pkn("specify_history_from_mall")
        public boolean specifyHistoryFromMall;
    }

    static {
        TiktokEcSearchRegionConfigModel tiktokEcSearchRegionConfigModel = new TiktokEcSearchRegionConfigModel();
        tiktokEcSearchRegionConfigModel.disableSugFromMall = false;
        tiktokEcSearchRegionConfigModel.disableSuggestGuideFromMall = false;
        tiktokEcSearchRegionConfigModel.specifyHistoryFromMall = false;
        LIZ = tiktokEcSearchRegionConfigModel;
    }

    public static final TiktokEcSearchRegionConfigModel LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        TiktokEcSearchRegionConfigModel tiktokEcSearchRegionConfigModel = LIZ;
        TiktokEcSearchRegionConfigModel tiktokEcSearchRegionConfigModel2 = (TiktokEcSearchRegionConfigModel) LIZLLL.LJIIIIZZ("tiktok_ec_search_region_config", TiktokEcSearchRegionConfigModel.class, tiktokEcSearchRegionConfigModel);
        if (tiktokEcSearchRegionConfigModel2 == null) {
            return tiktokEcSearchRegionConfigModel;
        }
        return tiktokEcSearchRegionConfigModel2;
    }
}
