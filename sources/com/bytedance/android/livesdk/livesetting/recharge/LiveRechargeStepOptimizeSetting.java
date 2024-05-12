package com.bytedance.android.livesdk.livesetting.recharge;

import X.C113554cx;
import X.OSZ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

@SettingsKey("live_recharge_step_optimize_setting")
/* loaded from: classes6.dex */
public final class LiveRechargeStepOptimizeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveRechargeStepOptimizeSetting INSTANCE = new LiveRechargeStepOptimizeSetting();
    public static final Map<Integer, String> URL_MAP = C113554cx.LJJLIIIIJ(new OSZ(1, "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf19-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_wallet%2Fwallet%2Fpages%2Frecharge%2Fcustom_recharge.js&height=1050rpx&radius=8&gravity=bottom&transition_animation=right&loading_bg_color=FFFFFF&container_bg_color=FFFFFF&mask_bg_color=00000050&show_mask=1"), new OSZ(2, LiveGuideWebRechargeUrl.INSTANCE.getGuideWebRechargeUrl()));

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveRechargeStepOptimizeSetting.class);
    }

    public final Map<Integer, String> getURL_MAP() {
        return URL_MAP;
    }
}
