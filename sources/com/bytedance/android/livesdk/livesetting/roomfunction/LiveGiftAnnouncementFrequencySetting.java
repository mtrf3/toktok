package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C221108m2;
import X.C5H3;
import X.CK9;
import X.EnumC221088m0;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SettingsKey("live_gift_site_wide_announcement_frequency_config")
/* loaded from: classes6.dex */
public final class LiveGiftAnnouncementFrequencySetting {
    public static final LiveGiftAnnouncementFrequencySetting INSTANCE = new LiveGiftAnnouncementFrequencySetting();

    @Group(isDefault = true, value = "default group")
    public static final AnnouncementFrequencyConfig DEFAULT = new AnnouncementFrequencyConfig(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0.0f, 63, null);
    public static final C5H3 settingValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, CK9.LJLIL);

    private final AnnouncementFrequencyConfig getSettingValue() {
        return (AnnouncementFrequencyConfig) settingValue$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AnnouncementFrequencyConfig getValue() {
        AnnouncementFrequencyConfig settingValue = getSettingValue();
        if (settingValue == null) {
            return new AnnouncementFrequencyConfig(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0.0f, 63, null);
        }
        return settingValue;
    }

    /* loaded from: classes6.dex */
    public static final class AnnouncementFrequencyConfig {

        @InterfaceC65349Pkn("live_close_toggle_enabled")
        public boolean closeToggleEnabled;

        @InterfaceC65349Pkn("live_disable_min_count")
        public int disableMinCount;

        @InterfaceC65349Pkn("live_disable_ratio")
        public float disableRatio;

        @InterfaceC65349Pkn("live_frequency_control_enabled")
        public boolean frequencyControlEnabled;

        @InterfaceC65349Pkn("live_frequency_count")
        public int frequencyCount;

        @InterfaceC65349Pkn("live_frequency_duration")
        public int frequencyDuration;

        /* JADX WARN: Multi-variable type inference failed */
        public AnnouncementFrequencyConfig() {
            this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0.0f, 63, null);
        }

        public AnnouncementFrequencyConfig(boolean z, boolean z2, int i, int i2, int i3, float f) {
            this.closeToggleEnabled = z;
            this.frequencyControlEnabled = z2;
            this.frequencyCount = i;
            this.frequencyDuration = i2;
            this.disableMinCount = i3;
            this.disableRatio = f;
        }

        public /* synthetic */ AnnouncementFrequencyConfig(boolean z, boolean z2, int i, int i2, int i3, float f, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? false : z, (i4 & 2) == 0 ? z2 : false, (i4 & 4) != 0 ? 1 : i, (i4 & 8) != 0 ? 1 : i2, (i4 & 16) != 0 ? 50 : i3, (i4 & 32) != 0 ? 0.8f : f);
        }
    }
}
