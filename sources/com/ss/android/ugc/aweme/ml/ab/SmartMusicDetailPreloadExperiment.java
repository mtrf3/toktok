package com.ss.android.ugc.aweme.ml.ab;

import X.FFL;

/* loaded from: classes9.dex */
public final class SmartMusicDetailPreloadExperiment {
    public static final SmartMusicDetailPreloadSceneConfig DEFAULT = null;
    public static final SmartMusicDetailPreloadExperiment INSTANCE = new SmartMusicDetailPreloadExperiment();
    public static final String SCENE = "smart_music_detail_preload";
    public static boolean hasInit;
    public static SmartMusicDetailPreloadSceneConfig smartMusicDetailPreloadSceneConfig;

    public final SmartMusicDetailPreloadSceneConfig getConfig() {
        if (!hasInit) {
            FFL LJIIIZ = FFL.LJIIIZ();
            SmartMusicDetailPreloadSceneConfig smartMusicDetailPreloadSceneConfig2 = DEFAULT;
            LJIIIZ.getClass();
            smartMusicDetailPreloadSceneConfig = (SmartMusicDetailPreloadSceneConfig) FFL.LJIJ(true, "smart_music_detail_preload_config", 31744, SmartMusicDetailPreloadSceneConfig.class, smartMusicDetailPreloadSceneConfig2);
            hasInit = true;
        }
        return smartMusicDetailPreloadSceneConfig;
    }

    public final Integer getExpireTime() {
        SmartMusicDetailPreloadSceneConfig smartMusicDetailPreloadSceneConfig2 = smartMusicDetailPreloadSceneConfig;
        if (smartMusicDetailPreloadSceneConfig2 != null) {
            return Integer.valueOf(smartMusicDetailPreloadSceneConfig2.expireTime);
        }
        return null;
    }

    public final boolean ifEnable() {
        if (smartMusicDetailPreloadSceneConfig != null) {
            return !r0.getDisable();
        }
        return false;
    }

    public final SmartMusicDetailPreloadSceneConfig getDEFAULT() {
        return DEFAULT;
    }

    public final boolean getHasInit() {
        return hasInit;
    }

    public final void setHasInit(boolean z) {
        hasInit = z;
    }
}
