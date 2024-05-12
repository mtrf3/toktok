package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C5H3;
import X.CH7;
import X.EnumC221088m0;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SettingsKey("live_gift_new_gifter_education_config")
/* loaded from: classes6.dex */
public final class LiveGiftNewGifterEducationSetting {
    public static final LiveGiftNewGifterEducationSetting INSTANCE = new LiveGiftNewGifterEducationSetting();

    @Group(isDefault = true, value = "default group")
    public static final NewGifterConfig DEFAULT = new NewGifterConfig(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, null);
    public static final C5H3 settingValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, CH7.LJLIL);

    private final NewGifterConfig getSettingValue() {
        return (NewGifterConfig) settingValue$delegate.getValue();
    }

    public final NewGifterConfig getValue() {
        return getSettingValue();
    }

    /* loaded from: classes6.dex */
    public static final class NewGifterConfig {

        @InterfaceC65349Pkn("gift_guide_popup_style")
        public int giftGuidePopupStyle;

        @InterfaceC65349Pkn("speed_gift_popup_logic_opt_enable")
        public boolean speedGiftPopupLogicOptEnable;

        @InterfaceC65349Pkn("speed_gift_popup_style")
        public int speedGiftPopupStyle;

        /* JADX WARN: Multi-variable type inference failed */
        public NewGifterConfig() {
            this(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, null);
        }

        public NewGifterConfig(int i, int i2, boolean z) {
            this.giftGuidePopupStyle = i;
            this.speedGiftPopupStyle = i2;
            this.speedGiftPopupLogicOptEnable = z;
        }

        public /* synthetic */ NewGifterConfig(int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? false : z);
        }
    }
}
