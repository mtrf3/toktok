package com.bytedance.android.livesdk.livesetting.rank;

import X.C221108m2;
import X.C28352BAu;
import X.C5H3;
import X.EnumC221088m0;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SettingsKey("online_audience_gift_guide_setting")
/* loaded from: classes6.dex */
public final class OnlineAudienceGiftGuideSetting {
    public static final OnlineAudienceGiftGuideSetting INSTANCE = new OnlineAudienceGiftGuideSetting();

    @Group(isDefault = true, value = "default group")
    public static final Config DEFAULT = new Config(true, 5655);
    public static final C5H3 configValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, C28352BAu.LJLIL);

    private final Config getConfigValue() {
        return (Config) configValue$delegate.getValue();
    }

    public final Config getValue() {
        return getConfigValue();
    }

    /* loaded from: classes6.dex */
    public static final class Config {

        @InterfaceC65349Pkn("online_audience_gift_guide_available")
        public boolean giftGuideAvailable;

        @InterfaceC65349Pkn("online_audience_gift_guide_gift_id")
        public long giftId;

        public Config() {
            this(false, 0L, 3, null);
        }

        public Config(boolean z, long j) {
            this.giftGuideAvailable = z;
            this.giftId = j;
        }

        public /* synthetic */ Config(boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? 5655L : j);
        }
    }
}
