package com.ss.android.ugc.aweme.requesttask.idle.experment;

import X.InterfaceC65349Pkn;
import com.bytedance.ies.abmock.SettingsManager;

/* loaded from: classes7.dex */
public final class GeckoHighGroupBackgroundSettings {
    public static final GeckoHighGroupBackgroundModel LIZ;

    /* loaded from: classes7.dex */
    public static class GeckoHighGroupBackgroundModel {

        @InterfaceC65349Pkn("delay_time")
        public long delayTime;

        @InterfaceC65349Pkn("trigger_foreground_download")
        public boolean triggerForegroundDownload;
    }

    static {
        GeckoHighGroupBackgroundModel geckoHighGroupBackgroundModel = new GeckoHighGroupBackgroundModel();
        LIZ = geckoHighGroupBackgroundModel;
        geckoHighGroupBackgroundModel.delayTime = 5000L;
        geckoHighGroupBackgroundModel.triggerForegroundDownload = false;
    }

    public static GeckoHighGroupBackgroundModel LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        GeckoHighGroupBackgroundModel geckoHighGroupBackgroundModel = LIZ;
        GeckoHighGroupBackgroundModel geckoHighGroupBackgroundModel2 = (GeckoHighGroupBackgroundModel) LIZLLL.LJIIIIZZ("gecko_high_group_background", GeckoHighGroupBackgroundModel.class, geckoHighGroupBackgroundModel);
        if (geckoHighGroupBackgroundModel2 != null) {
            return geckoHighGroupBackgroundModel2;
        }
        return geckoHighGroupBackgroundModel;
    }
}
