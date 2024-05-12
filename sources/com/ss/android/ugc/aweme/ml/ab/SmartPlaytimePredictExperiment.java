package com.ss.android.ugc.aweme.ml.ab;

import X.FFL;

/* loaded from: classes9.dex */
public final class SmartPlaytimePredictExperiment {
    public static final SmartPlaytimePredictConfig DEFAULT = null;
    public static final SmartPlaytimePredictExperiment INSTANCE = new SmartPlaytimePredictExperiment();
    public static boolean hasInit;
    public static SmartPlaytimePredictConfig serviceConfig;

    public final SmartPlaytimePredictConfig getPlaytimePredictServiceConfig() {
        if (!hasInit) {
            FFL LJIIIZ = FFL.LJIIIZ();
            SmartPlaytimePredictConfig smartPlaytimePredictConfig = DEFAULT;
            LJIIIZ.getClass();
            SmartPlaytimePredictConfig smartPlaytimePredictConfig2 = (SmartPlaytimePredictConfig) FFL.LJIJ(true, "smart_playtime_predict_config", 31744, SmartPlaytimePredictConfig.class, smartPlaytimePredictConfig);
            if (smartPlaytimePredictConfig2 != null) {
                smartPlaytimePredictConfig = smartPlaytimePredictConfig2;
            }
            serviceConfig = smartPlaytimePredictConfig;
            hasInit = true;
        }
        return serviceConfig;
    }

    public final SmartPlaytimePredictConfig getDEFAULT() {
        return DEFAULT;
    }
}
