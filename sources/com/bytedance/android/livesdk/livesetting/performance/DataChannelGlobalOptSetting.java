package com.bytedance.android.livesdk.livesetting.performance;

import X.BC2;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;

@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "enable_data_channel_global_opt")
/* loaded from: classes6.dex */
public final class DataChannelGlobalOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final DataChannelGlobalOptSetting INSTANCE = new DataChannelGlobalOptSetting();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(BC2.LJLIL);

    public static final boolean enableAutoUnregister() {
        DataChannelGlobalOptSetting dataChannelGlobalOptSetting = INSTANCE;
        if (dataChannelGlobalOptSetting.getEnable() == 1 || dataChannelGlobalOptSetting.getEnable() == 3) {
            return true;
        }
        return false;
    }

    public static final boolean enableUnregisterOnBaseClass() {
        DataChannelGlobalOptSetting dataChannelGlobalOptSetting = INSTANCE;
        if (dataChannelGlobalOptSetting.getEnable() == 2 || dataChannelGlobalOptSetting.getEnable() == 3) {
            return true;
        }
        return false;
    }

    private final int getEnable() {
        return ((Number) enable$delegate.getValue()).intValue();
    }

    public static final void initDataChannelGlobalConfig() {
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        boolean enableAutoUnregister = enableAutoUnregister();
        dataChannelGlobal.getClass();
        if (!DataChannelGlobal.LJLJLJ) {
            DataChannelGlobal.LJLJLJ = true;
            DataChannelGlobal.LJLJL = enableAutoUnregister;
        }
        if (enableAutoUnregister()) {
            dataChannelGlobal.kv0(LiveWidget.class);
            if (enableUnregisterOnBaseClass()) {
                dataChannelGlobal.kv0(LiveDialogFragment.class);
                dataChannelGlobal.kv0(BaseFragment.class);
            }
        }
    }
}
