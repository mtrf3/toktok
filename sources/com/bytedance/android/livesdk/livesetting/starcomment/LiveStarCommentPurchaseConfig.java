package com.bytedance.android.livesdk.livesetting.starcomment;

import X.C221108m2;
import X.C5H3;
import X.CEK;
import X.EnumC221088m0;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SettingsKey("live_star_comment_client_config")
/* loaded from: classes6.dex */
public final class LiveStarCommentPurchaseConfig {
    public static final LiveStarCommentPurchaseConfig INSTANCE = new LiveStarCommentPurchaseConfig();

    @Group(isDefault = true, value = "default group")
    public static final Config DEFAULT = new Config(2);
    public static final C5H3 settingValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, CEK.LJLIL);

    public final Config getSettingValue() {
        return (Config) settingValue$delegate.getValue();
    }

    /* loaded from: classes6.dex */
    public static final class Config {

        @InterfaceC65349Pkn("purchase_page_refresh_time")
        public int refreshTime;

        public Config() {
            this(0, 1, null);
        }

        public Config(int i) {
            this.refreshTime = i;
        }

        public /* synthetic */ Config(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 2 : i);
        }
    }
}
