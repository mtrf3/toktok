package com.bytedance.android.livesdk.livesetting.gift;

import X.C221108m2;
import X.C31000CEq;
import X.C5H3;
import X.EnumC221088m0;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SettingsKey("live_gift_match_anchor_point_z_axis_optimization")
/* loaded from: classes6.dex */
public final class LiveGiftTrayMatchPointsSetting {

    @Group(isDefault = true, value = "default group")
    public static final GiftTrayMatchPointsConfig DEFAULT;
    public static final LiveGiftTrayMatchPointsSetting INSTANCE = new LiveGiftTrayMatchPointsSetting();
    public static final C5H3 settingValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, C31000CEq.LJLIL);

    static {
        boolean z = false;
        DEFAULT = new GiftTrayMatchPointsConfig(z, z, 3, null);
    }

    private final GiftTrayMatchPointsConfig getSettingValue() {
        return (GiftTrayMatchPointsConfig) settingValue$delegate.getValue();
    }

    public final GiftTrayMatchPointsConfig getValue() {
        GiftTrayMatchPointsConfig settingValue = getSettingValue();
        if (settingValue == null) {
            boolean z = false;
            return new GiftTrayMatchPointsConfig(z, z, 3, null);
        }
        return settingValue;
    }

    /* loaded from: classes6.dex */
    public static final class GiftTrayMatchPointsConfig {

        @InterfaceC65349Pkn("live_gift_match_point_enabled")
        public boolean matchPointLabelEnabled;

        @InterfaceC65349Pkn("live_gift_z_axis_enabled")
        public boolean zAxisEnabled;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public GiftTrayMatchPointsConfig() {
            /*
                r3 = this;
                r2 = 3
                r1 = 0
                r0 = 0
                r3.<init>(r0, r0, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayMatchPointsSetting.GiftTrayMatchPointsConfig.<init>():void");
        }

        public GiftTrayMatchPointsConfig(boolean z, boolean z2) {
            this.matchPointLabelEnabled = z;
            this.zAxisEnabled = z2;
        }

        public /* synthetic */ GiftTrayMatchPointsConfig(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
        }
    }
}
