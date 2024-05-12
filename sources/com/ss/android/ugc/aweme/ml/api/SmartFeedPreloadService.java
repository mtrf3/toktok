package com.ss.android.ugc.aweme.ml.api;

import X.IWA;
import X.IWB;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.model.PreloadStrategyV2Config;
import com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class SmartFeedPreloadService implements ISmartFeedPreloadService {
    public static final IWA Companion = new IWA();
    public static final boolean debug = false;

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public abstract /* synthetic */ void addResultListener(ISmartFeedPreloadResultListener iSmartFeedPreloadResultListener);

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public abstract /* synthetic */ void checkAndInit();

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public abstract /* synthetic */ boolean enable();

    public abstract /* synthetic */ void ensureEvaluatorAvailable();

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public abstract /* synthetic */ PreloadStrategyConfig getCurrentSmartPreloadStrategyConfig();

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public abstract /* synthetic */ String getPredictLabelResult();

    public abstract /* synthetic */ float getPredictProbabilityResult();

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public abstract /* synthetic */ List<PreloadStrategyConfig> getSmartPreloadStrategyExperimentValue();

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public abstract /* synthetic */ String getSmartPreloadStrategyV2ExperimentJsonString();

    public abstract /* synthetic */ PreloadStrategyV2Config getSmartPreloadStrategyV2ExperimentValue();

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public abstract /* synthetic */ int obtainAiFastSlowPredict();

    public abstract /* synthetic */ void removeResultListener(ISmartFeedPreloadResultListener iSmartFeedPreloadResultListener);

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public abstract /* synthetic */ void startSmartPreloadV2Judge(Aweme aweme);

    public static final boolean getDebug() {
        Companion.getClass();
        return debug;
    }

    public static final ISmartFeedPreloadService instance() {
        Companion.getClass();
        return IWB.LIZ;
    }
}
