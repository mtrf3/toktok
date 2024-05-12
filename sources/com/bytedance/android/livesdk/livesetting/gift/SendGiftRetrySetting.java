package com.bytedance.android.livesdk.livesetting.gift;

import X.C221108m2;
import X.C5H3;
import X.CEH;
import X.EnumC221088m0;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SettingsKey("gift_send_request_need_retry_info")
/* loaded from: classes6.dex */
public final class SendGiftRetrySetting {
    public static final SendGiftRetrySetting INSTANCE = new SendGiftRetrySetting();

    @Group(isDefault = true, value = "default group")
    public static final SettingParams DEFAULT = new SettingParams(false, 0 == true ? 1 : 0, 3, null);
    public static final C5H3 settingValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, CEH.LJLIL);

    private final SettingParams getSettingValue() {
        return (SettingParams) settingValue$delegate.getValue();
    }

    public final int getRetryCount() {
        SettingParams settingValue;
        if (!isEnable() || (settingValue = getSettingValue()) == null) {
            return 0;
        }
        return settingValue.retryCount;
    }

    public final boolean isEnable() {
        SettingParams settingValue = getSettingValue();
        if (settingValue != null) {
            return settingValue.enable;
        }
        return false;
    }

    /* loaded from: classes6.dex */
    public static final class SettingParams {

        @InterfaceC65349Pkn("enable")
        public boolean enable;

        @InterfaceC65349Pkn("retry_count")
        public int retryCount;

        /* JADX WARN: Multi-variable type inference failed */
        public SettingParams() {
            this(false, 0 == true ? 1 : 0, 3, null);
        }

        public SettingParams(boolean z, int i) {
            this.enable = z;
            this.retryCount = i;
        }

        public /* synthetic */ SettingParams(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i);
        }
    }
}
