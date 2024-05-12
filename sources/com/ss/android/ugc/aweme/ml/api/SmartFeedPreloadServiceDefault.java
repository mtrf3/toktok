package com.ss.android.ugc.aweme.ml.api;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.model.PreloadStrategyV2Config;
import com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;
import java.util.List;

/* loaded from: classes9.dex */
public final class SmartFeedPreloadServiceDefault extends SmartFeedPreloadService {
    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService, com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public void addResultListener(ISmartFeedPreloadResultListener iSmartFeedPreloadResultListener) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService, com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public void checkAndInit() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService, com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public boolean enable() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService
    public void ensureEvaluatorAvailable() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService, com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public PreloadStrategyConfig getCurrentSmartPreloadStrategyConfig() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService, com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public String getPredictLabelResult() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService
    public float getPredictProbabilityResult() {
        return -1.0f;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService, com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public List<PreloadStrategyConfig> getSmartPreloadStrategyExperimentValue() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService, com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public String getSmartPreloadStrategyV2ExperimentJsonString() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService
    public PreloadStrategyV2Config getSmartPreloadStrategyV2ExperimentValue() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService, com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public int obtainAiFastSlowPredict() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService
    public void removeResultListener(ISmartFeedPreloadResultListener iSmartFeedPreloadResultListener) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService, com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public void startSmartPreloadV2Judge(Aweme aweme) {
    }
}
