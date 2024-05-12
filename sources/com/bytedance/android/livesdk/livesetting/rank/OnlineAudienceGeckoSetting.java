package com.bytedance.android.livesdk.livesetting.rank;

import X.C221108m2;
import X.C30995CEl;
import X.C5H3;
import X.EnumC221088m0;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

@SettingsKey("live_audience_ranking_gecko")
/* loaded from: classes6.dex */
public final class OnlineAudienceGeckoSetting {
    public static final OnlineAudienceGeckoSetting INSTANCE = new OnlineAudienceGeckoSetting();

    @Group(isDefault = true, value = "default group")
    public static final Config DEFAULT = new Config(false, "revenue_client_audience_ranking_lynx");
    public static final C5H3 settingValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, C30995CEl.LJLIL);

    private final Config getSettingValue() {
        return (Config) settingValue$delegate.getValue();
    }

    public final Config getValue() {
        return getSettingValue();
    }

    /* loaded from: classes6.dex */
    public static final class Config {

        @InterfaceC65349Pkn("audience_list_gecko_channel")
        public String audienceListGeckoChannel;

        @InterfaceC65349Pkn("is_audience_list_gecko_setting_on")
        public boolean isAudienceListGeckoSettingOn;

        /* JADX WARN: Multi-variable type inference failed */
        public Config() {
            this(false, null, 3, 0 == true ? 1 : 0);
        }

        public Config(boolean z, String audienceListGeckoChannel) {
            o.LJIIIZ(audienceListGeckoChannel, "audienceListGeckoChannel");
            this.isAudienceListGeckoSettingOn = z;
            this.audienceListGeckoChannel = audienceListGeckoChannel;
        }

        public /* synthetic */ Config(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "revenue_client_audience_ranking_lynx" : str);
        }
    }
}
