package com.bytedance.android.livesdk.livesetting.rank;

import X.C221108m2;
import X.C5H3;
import X.CYI;
import X.EnumC221088m0;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SettingsKey("online_audience_display_strategy_setting")
/* loaded from: classes6.dex */
public final class OnlineAudienceDisplayStrategySetting {
    public static final OnlineAudienceDisplayStrategySetting INSTANCE = new OnlineAudienceDisplayStrategySetting();

    @Group(isDefault = true, value = "default group")
    public static final Config DEFAULT = new Config(true, 4);
    public static final C5H3 configValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, CYI.LJLIL);

    private final Config getConfigValue() {
        return (Config) configValue$delegate.getValue();
    }

    public final Config getValue() {
        return getConfigValue();
    }

    public final Config getDefaultValue() {
        return DEFAULT;
    }

    /* loaded from: classes6.dex */
    public static final class Config {

        @InterfaceC65349Pkn("online_audience_display_number")
        public int displayNumberN;

        @InterfaceC65349Pkn("online_audience_display_strategy_on")
        public boolean useOnlineDisplayStrategy;

        /* JADX WARN: Multi-variable type inference failed */
        public Config() {
            this(false, 0 == true ? 1 : 0, 3, null);
        }

        public Config(boolean z, int i) {
            this.useOnlineDisplayStrategy = z;
            this.displayNumberN = i;
        }

        public /* synthetic */ Config(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? 4 : i);
        }
    }
}
