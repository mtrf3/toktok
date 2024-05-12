package com.bytedance.android.livesdk.livesetting.watchlive;

import X.B68;
import X.C221108m2;
import X.C5H3;
import X.CN1;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.livesdk.dataChannel.LeftBottomECSlotWidgetShow;
import com.bytedance.android.livesdkapi.host.IHostCommerce;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

@SettingsKey("live_preload_interaction_layer")
/* loaded from: classes6.dex */
public final class LivePreloadInteractionLayerSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LivePreloadInteractionLayerSetting INSTANCE = new LivePreloadInteractionLayerSetting();
    public static final C5H3 setting$delegate = C221108m2.LIZIZ(B68.LJLIL);

    @Group("v1 , enable preload for ec")
    public static final int v1 = 1;

    @Group("v2 , enable preload all room")
    public static final int v2 = 2;

    private final int getSetting() {
        return ((Number) setting$delegate.getValue()).intValue();
    }

    public final boolean isEnableFeedRoomParse() {
        if (getSetting() == 2 || getSetting() == 1 || ((IHostCommerce) CN1.LIZ(IHostCommerce.class)).q4()) {
            return true;
        }
        return false;
    }

    public final boolean isDisablePreload(DataChannel dataChannel) {
        return !isEnablePreload(dataChannel);
    }

    public final boolean isECEnablePreload(DataChannel dataChannel) {
        if (!((IHostCommerce) CN1.LIZ(IHostCommerce.class)).q4() || dataChannel == null || !o.LJ(dataChannel.kv0(LeftBottomECSlotWidgetShow.class), Boolean.TRUE)) {
            return false;
        }
        return true;
    }

    public final boolean isEnablePreload(DataChannel dataChannel) {
        if (getSetting() == 2) {
            return true;
        }
        if (getSetting() == 1 && dataChannel != null && o.LJ(dataChannel.kv0(LeftBottomECSlotWidgetShow.class), Boolean.TRUE)) {
            return true;
        }
        if (((IHostCommerce) CN1.LIZ(IHostCommerce.class)).q4() && dataChannel != null && o.LJ(dataChannel.kv0(LeftBottomECSlotWidgetShow.class), Boolean.TRUE)) {
            return true;
        }
        return false;
    }
}
