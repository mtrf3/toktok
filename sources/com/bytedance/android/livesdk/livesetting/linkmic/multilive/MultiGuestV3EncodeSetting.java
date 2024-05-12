package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.CN1;
import X.UPJ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

@SettingsKey("multi_linkmic_enc")
/* loaded from: classes6.dex */
public final class MultiGuestV3EncodeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("h265 sw")
    public static final int GROUP_FOUR = 4;

    @Group("h264 hw")
    public static final int GROUP_ONE = 1;

    @Group("h265 hw")
    public static final int GROUP_THREE = 3;

    @Group("h264 sw")
    public static final int GROUP_TWO = 2;
    public static final MultiGuestV3EncodeSetting INSTANCE = new MultiGuestV3EncodeSetting();

    public final int getValue() {
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isOffline() || ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLiveInhouse()) {
            return SettingsManager.INSTANCE.getIntValue(MultiGuestV3EncodeSetting.class);
        }
        return 0;
    }

    public final String getParams() {
        int value = getValue();
        if (value == 0) {
            return "";
        }
        if (value != 1) {
            if (value != 2) {
                if (value != 3) {
                    if (value != 4) {
                        return "";
                    }
                    return fill("bytevc1", "software");
                }
                return fill("bytevc1", "hardware");
            }
            return fill("h264", "software");
        }
        return fill("h264", "hardware");
    }

    private final String fill(String str, String str2) {
        return UPJ.LIZIZ("{\"rtc.enable_realx_log_file\":true,\"rtc.video_encoder\":{\"codec_name\":\"", str, "\",\"codec_mode\":\"", str2, "\"}}");
    }
}
