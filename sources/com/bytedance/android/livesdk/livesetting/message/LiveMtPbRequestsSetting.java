package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live.network.model.RequestPb;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.o;

@SettingsKey("live_mt_pb_requests")
/* loaded from: classes6.dex */
public final class LiveMtPbRequestsSetting {

    @Group(isDefault = true, value = "default group")
    public static final RequestPb DEFAULT;
    public static final LiveMtPbRequestsSetting INSTANCE = new LiveMtPbRequestsSetting();

    static {
        RequestPb defaultInstance = RequestPb.defaultInstance();
        o.LJIIIIZZ(defaultInstance, "defaultInstance()");
        DEFAULT = defaultInstance;
    }

    public final RequestPb getValue() {
        RequestPb requestPb = (RequestPb) SettingsManager.INSTANCE.getValueSafely(LiveMtPbRequestsSetting.class);
        if (requestPb == null) {
            return DEFAULT;
        }
        return requestPb;
    }
}
