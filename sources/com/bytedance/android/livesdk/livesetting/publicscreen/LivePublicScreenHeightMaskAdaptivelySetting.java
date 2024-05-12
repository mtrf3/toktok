package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.BCX;
import X.C29137Bc5;
import X.C29306Beo;
import X.C5H3;
import X.C78996UzQ;
import X.CTM;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

@SettingsKey(preciseExperiment = false, value = "live_public_screen_height_mask_adaptively_setting")
/* loaded from: classes6.dex */
public final class LivePublicScreenHeightMaskAdaptivelySetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LivePublicScreenHeightMaskAdaptivelySetting INSTANCE = new LivePublicScreenHeightMaskAdaptivelySetting();
    public static final C5H3 value$delegate = C78996UzQ.LJJIJIIJI(CTM.LJLIL);

    public final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }

    public static final boolean enableMaskAlpha(DataChannel dataChannel) {
        LiveMode liveMode;
        LivePublicScreenHeightMaskAdaptivelySetting livePublicScreenHeightMaskAdaptivelySetting = INSTANCE;
        if ((livePublicScreenHeightMaskAdaptivelySetting.getValue() == 1 || livePublicScreenHeightMaskAdaptivelySetting.getValue() == 3) && C29306Beo.LJIIL(dataChannel)) {
            if (dataChannel != null) {
                liveMode = (LiveMode) dataChannel.kv0(BCX.class);
            } else {
                liveMode = null;
            }
            if (!C29137Bc5.LIZ(liveMode)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean heightenWhenScroll(DataChannel dataChannel) {
        LiveMode liveMode;
        LivePublicScreenHeightMaskAdaptivelySetting livePublicScreenHeightMaskAdaptivelySetting = INSTANCE;
        if (livePublicScreenHeightMaskAdaptivelySetting.getValue() == 2 || livePublicScreenHeightMaskAdaptivelySetting.getValue() == 3) {
            if (dataChannel != null) {
                liveMode = (LiveMode) dataChannel.kv0(BCX.class);
            } else {
                liveMode = null;
            }
            if (!C29137Bc5.LIZ(liveMode)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean shortenWhenLowHeat(DataChannel dataChannel) {
        LiveMode liveMode;
        if (INSTANCE.getValue() == 4 && C29306Beo.LJIIL(dataChannel)) {
            if (dataChannel != null) {
                liveMode = (LiveMode) dataChannel.kv0(BCX.class);
            } else {
                liveMode = null;
            }
            if (!C29137Bc5.LIZ(liveMode)) {
                return true;
            }
        }
        return false;
    }
}
