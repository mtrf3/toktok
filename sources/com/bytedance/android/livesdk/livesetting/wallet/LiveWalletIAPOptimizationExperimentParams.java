package com.bytedance.android.livesdk.livesetting.wallet;

import X.C113554cx;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.LinkedHashMap;
import java.util.Map;

@SettingsKey("wallet_iap_optimization_experiment_params")
/* loaded from: classes6.dex */
public final class LiveWalletIAPOptimizationExperimentParams {
    public static final LiveWalletIAPOptimizationExperimentParams INSTANCE = new LiveWalletIAPOptimizationExperimentParams();

    @Group(isDefault = true, value = "default group")
    public static final Map<String, Object> DEFAULT = C113554cx.LJJJLIIL();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    public final Map<String, Object> getAdsExperimentValue() {
        Map<String, Object> map = (Map) SettingsManager.INSTANCE.getValueSafely(LiveWalletIAPOptimizationExperimentParams.class);
        if (map == null) {
            map = DEFAULT;
        }
        Map<String, Object> LJJLIL = C113554cx.LJJLIL(map);
        boolean iapBillingVersion = LiveIapAdsFreeExperiment.INSTANCE.getIapBillingVersion();
        ?? r5 = iapBillingVersion;
        if (LJJLIL.containsKey("iap_exp_google_billing_new")) {
            Object obj = ((LinkedHashMap) LJJLIL).get("iap_exp_google_billing_new");
            r5 = iapBillingVersion;
            if (obj != null) {
                r5 = iapBillingVersion;
                if (obj.equals(Double.valueOf(1.0d))) {
                    r5 = 1;
                }
            }
        }
        LJJLIL.put("iap_exp_google_billing_new", Integer.valueOf((int) r5));
        return LJJLIL;
    }

    public final Map<String, Object> getValue() {
        Map<String, Object> map = (Map) SettingsManager.INSTANCE.getValueSafely(LiveWalletIAPOptimizationExperimentParams.class);
        if (map == null) {
            return DEFAULT;
        }
        return map;
    }
}
