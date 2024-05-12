package com.bytedance.android.livesdk.livesetting.gift;

import X.C221108m2;
import X.C5H3;
import X.CM8;
import X.EnumC221088m0;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SettingsKey("live_fly_mic_downgrade_strategy")
/* loaded from: classes6.dex */
public final class LiveFlymicGiftDowngradeStrategy {

    @Group(isDefault = true, value = "default group")
    public static final SettingParams DEFAULT;
    public static final LiveFlymicGiftDowngradeStrategy INSTANCE = new LiveFlymicGiftDowngradeStrategy();
    public static final C5H3 settingValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, CM8.LJLIL);

    static {
        float f = 0.0f;
        int i = 0;
        DEFAULT = new SettingParams(f, i, f, i, 15, null);
    }

    private final SettingParams getSettingValue() {
        return (SettingParams) settingValue$delegate.getValue();
    }

    public final SettingParams getValue() {
        SettingParams settingValue = getSettingValue();
        if (settingValue == null) {
            float f = 0.0f;
            int i = 0;
            return new SettingParams(f, i, f, i, 15, null);
        }
        return settingValue;
    }

    /* loaded from: classes6.dex */
    public static final class SettingParams {

        @InterfaceC65349Pkn("downgrade_device_score_level_1")
        public float deviceScoreLevel1;

        @InterfaceC65349Pkn("downgrade_device_score_level_2")
        public float deviceScoreLevel2;

        @InterfaceC65349Pkn("downgrade_message_count_level_1")
        public int msgCountLevel1;

        @InterfaceC65349Pkn("downgrade_message_count_level_2")
        public int msgCountLevel2;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public SettingParams() {
            /*
                r7 = this;
                r1 = 0
                r2 = 0
                r5 = 15
                r6 = 0
                r0 = r7
                r3 = r1
                r4 = r2
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.gift.LiveFlymicGiftDowngradeStrategy.SettingParams.<init>():void");
        }

        public SettingParams(float f, int i, float f2, int i2) {
            this.deviceScoreLevel1 = f;
            this.msgCountLevel1 = i;
            this.deviceScoreLevel2 = f2;
            this.msgCountLevel2 = i2;
        }

        public /* synthetic */ SettingParams(float f, int i, float f2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0.0f : f, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0.0f : f2, (i3 & 8) != 0 ? 0 : i2);
        }
    }
}
