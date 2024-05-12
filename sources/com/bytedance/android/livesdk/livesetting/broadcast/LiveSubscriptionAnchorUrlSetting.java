package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C221108m2;
import X.C5H3;
import X.CEC;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_subscription_anchor_url")
/* loaded from: classes6.dex */
public final class LiveSubscriptionAnchorUrlSetting {
    public static final LiveSubscriptionAnchorUrlSetting INSTANCE = new LiveSubscriptionAnchorUrlSetting();

    @Group(isDefault = true, value = "default group")
    public static final LiveSubscriptionAnchorUrlConfig DEFAULT = new LiveSubscriptionAnchorUrlConfig(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    public static final C5H3 settingValue$delegate = C221108m2.LIZIZ(CEC.LJLIL);

    public static final String anchorSubscribeEntry() {
        return INSTANCE.getSettingValue().anchorSubscribeEntry;
    }

    public static final String anchorSubscriberList() {
        return INSTANCE.getSettingValue().anchorSubscriberList;
    }

    public static final String badgeManagement() {
        return INSTANCE.getSettingValue().badgeManagement;
    }

    public static final String c2cTransGuidePage() {
        return INSTANCE.getSettingValue().c2cTransGuidePage;
    }

    public static final String customPriceManagement() {
        return INSTANCE.getSettingValue().customPriceManagement;
    }

    public static final String emoteManagement() {
        return INSTANCE.getSettingValue().emoteManagement;
    }

    public static final String musicIntro() {
        return INSTANCE.getSettingValue().subOnlyMusicIntro;
    }

    public static final String payoutUnsupportedNoticePopup() {
        return INSTANCE.getSettingValue().payoutUnsupportedNoticePopup;
    }

    public static final String pinManagementIntro() {
        return INSTANCE.getSettingValue().pinManagementIntro;
    }

    public static final String pinManagementPage() {
        return INSTANCE.getSettingValue().pinManagementPage;
    }

    public static final String spotlightFaq() {
        return INSTANCE.getSettingValue().spotlightFaq;
    }

    public static final String spotlightIntro() {
        return INSTANCE.getSettingValue().spotlightIntro;
    }

    public final LiveSubscriptionAnchorUrlConfig getSettingValue() {
        return (LiveSubscriptionAnchorUrlConfig) settingValue$delegate.getValue();
    }
}
