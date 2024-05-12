package com.bytedance.android.livesdk.livesetting.goodybag;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.o;

@SettingsKey("live_goody_bag_router_config")
/* loaded from: classes6.dex */
public final class GoodyBagURLConfig {
    public static final GoodyBagURLConfig INSTANCE = new GoodyBagURLConfig();

    @Group(isDefault = true, value = "default group")
    public static GoodyBagUrls DEFAULT = new GoodyBagUrls();

    public final String getAnchorOpenUrl() {
        GoodyBagUrls goodyBagUrls = (GoodyBagUrls) SettingsManager.INSTANCE.getValueSafely(GoodyBagURLConfig.class);
        if (goodyBagUrls != null) {
            return goodyBagUrls.waitingOpenSchema;
        }
        return null;
    }

    public final String getAudienceOpenUrl() {
        GoodyBagUrls goodyBagUrls = (GoodyBagUrls) SettingsManager.INSTANCE.getValueSafely(GoodyBagURLConfig.class);
        if (goodyBagUrls != null) {
            return goodyBagUrls.openAudienceSchema;
        }
        return null;
    }

    public final String getFaqUrl() {
        GoodyBagUrls goodyBagUrls = (GoodyBagUrls) SettingsManager.INSTANCE.getValueSafely(GoodyBagURLConfig.class);
        if (goodyBagUrls != null) {
            return goodyBagUrls.goodyBagFaqSchema;
        }
        return null;
    }

    public final String getSendUrl() {
        GoodyBagUrls goodyBagUrls = (GoodyBagUrls) SettingsManager.INSTANCE.getValueSafely(GoodyBagURLConfig.class);
        if (goodyBagUrls != null) {
            return goodyBagUrls.sendUrl;
        }
        return null;
    }

    public final String getShortTouchUrl() {
        GoodyBagUrls goodyBagUrls = (GoodyBagUrls) SettingsManager.INSTANCE.getValueSafely(GoodyBagURLConfig.class);
        if (goodyBagUrls != null) {
            return goodyBagUrls.shortTouch;
        }
        return null;
    }

    public final GoodyBagUrls getDEFAULT() {
        return DEFAULT;
    }

    public final void setDEFAULT(GoodyBagUrls goodyBagUrls) {
        o.LJIIIZ(goodyBagUrls, "<set-?>");
        DEFAULT = goodyBagUrls;
    }
}
