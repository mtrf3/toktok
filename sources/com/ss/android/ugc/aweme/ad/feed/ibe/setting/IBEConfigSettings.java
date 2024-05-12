package com.ss.android.ugc.aweme.ad.feed.ibe.setting;

import X.InterfaceC65349Pkn;
import com.bytedance.ies.abmock.SettingsManager;

/* loaded from: classes8.dex */
public final class IBEConfigSettings {
    public static final IbeConfigModel LIZ = new IbeConfigModel();

    /* loaded from: classes8.dex */
    public static final class IBEChannelConfig {

        @InterfaceC65349Pkn("channel")
        public String channel = "";
    }

    /* loaded from: classes8.dex */
    public static final class IbeConfigModel {

        @InterfaceC65349Pkn("ibe_list")
        public IBEChannelConfig[] ibeList = new IBEChannelConfig[0];

        @InterfaceC65349Pkn("ibe_show_time")
        public double ibeShowTime = 2.0d;

        @InterfaceC65349Pkn("ibe_hide_time")
        public double ibeHideTime = 6.0d;
    }

    public static IbeConfigModel LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        IbeConfigModel ibeConfigModel = LIZ;
        IbeConfigModel ibeConfigModel2 = (IbeConfigModel) LIZLLL.LJIIIIZZ("ibe_config", IbeConfigModel.class, ibeConfigModel);
        if (ibeConfigModel2 == null) {
            return ibeConfigModel;
        }
        return ibeConfigModel2;
    }
}
