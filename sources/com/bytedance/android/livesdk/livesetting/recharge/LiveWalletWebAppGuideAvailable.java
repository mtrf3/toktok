package com.bytedance.android.livesdk.livesetting.recharge;

import X.C113554cx;
import X.OSZ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

@SettingsKey("live_wallet_web_app_guide_available")
/* loaded from: classes6.dex */
public final class LiveWalletWebAppGuideAvailable {

    @Group(isDefault = true, value = "default group")
    public static final HashMap<String, Boolean> DEFAULT;
    public static final LiveWalletWebAppGuideAvailable INSTANCE = new LiveWalletWebAppGuideAvailable();

    static {
        Boolean bool = Boolean.TRUE;
        DEFAULT = C113554cx.LJJJLZIJ(new OSZ("live_buy", bool), new OSZ("panel_guide", bool));
    }

    private final Map<String, Boolean> getValue() {
        Map<String, Boolean> map = (Map) SettingsManager.INSTANCE.getValueSafely(LiveWalletWebAppGuideAvailable.class);
        if (map == null) {
            return DEFAULT;
        }
        return map;
    }

    public final boolean isBuyAvailable() {
        return o.LJ(getValue().get("live_buy"), Boolean.TRUE);
    }

    public final boolean isPanelAvailable() {
        return o.LJ(getValue().get("panel_guide"), Boolean.TRUE);
    }
}
