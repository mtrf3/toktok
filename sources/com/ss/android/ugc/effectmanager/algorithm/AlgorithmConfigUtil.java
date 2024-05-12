package com.ss.android.ugc.effectmanager.algorithm;

import com.ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.utils.EffectRequestUtil;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class AlgorithmConfigUtil {
    public static final AlgorithmConfigUtil INSTANCE = new AlgorithmConfigUtil();

    public static final boolean isOnlineEnv(DownloadableModelConfig config) {
        o.LJIIJ(config, "config");
        EffectConfiguration effectConfiguration = config.getEffectConfiguration();
        if (effectConfiguration != null && effectConfiguration.getChannel() != null) {
            return EffectRequestUtil.isOnlineEnv(effectConfiguration);
        }
        if (config.getModelFileEnv() == DownloadableModelConfig.ModelFileEnv.ONLINE) {
            return true;
        }
        return false;
    }
}
