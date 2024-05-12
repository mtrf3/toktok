package com.ss.android.ugc.aweme.ml.impl;

import X.C10K;
import X.C48050ItS;
import X.C48051ItT;
import X.C48553J3t;
import X.C72242sW;
import X.FR7;
import X.IFF;
import X.J3U;
import X.J49;
import X.ORZ;
import Y.ACallableS111S0100000_8;
import Y.ARunnableS27S0200000_8;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUIModel;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUIPlayTime;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUIStrategyConfig;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUITasks;
import com.ss.android.ugc.aweme.feed.model.commercialize.PlanConfig;
import com.ss.android.ugc.aweme.feed.model.commercialize.UrlPackage;
import com.ss.android.ugc.aweme.ml.ab.CommerceSmartUIModelV2;
import com.ss.android.ugc.aweme.ml.ab.OnePlaytimePredictConfig;
import com.ss.android.ugc.aweme.ml.ab.OnePlaytimePredictRealConfig;
import com.ss.android.ugc.aweme.ml.ab.OneSmartDataTrackConfig;
import com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService;
import com.ss.android.ugc.aweme.ml.infra.FeaturePlayTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.MlSdkConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartClassifySceneConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService;
import com.ss.android.ugc.aweme.ml.infra.SmartSdkConfig;
import java.util.List;

/* loaded from: classes9.dex */
public final class SmartFeedAdUIServiceImpl extends SmartFeedAdUIService {
    public static final /* synthetic */ int LJFF = 0;
    public boolean LIZ;
    public boolean LIZIZ;
    public CommerceSmartUIModelV2 LIZJ;
    public String LIZLLL = "";
    public float LJ = -1.0f;

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService, com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public final CommerceSmartUITasks getPredictTaskIndex() {
        CommerceSmartUIModelV2 commerceSmartUIModelV2;
        CommerceSmartUIStrategyConfig uiStrategy;
        PlanConfig[] plans;
        Integer num;
        PlanConfig planConfig;
        List<CommerceSmartUITasks> task;
        List<String> lableIndexMapping;
        CommerceSmartUITasks commerceSmartUITasks = null;
        try {
            String predictLabelResult = getPredictLabelResult();
            if (predictLabelResult == null) {
                return null;
            }
            SmartFeedAdUIService.Companion.getClass();
            if (!TextUtils.isEmpty(predictLabelResult) && (commerceSmartUIModelV2 = J49.LIZ) != null && (uiStrategy = commerceSmartUIModelV2.getUiStrategy()) != null && (plans = uiStrategy.getPlans()) != null && plans.length != 0) {
                CommerceSmartUIStrategyConfig uiStrategy2 = commerceSmartUIModelV2.getUiStrategy();
                if (uiStrategy2 != null) {
                    num = Integer.valueOf(uiStrategy2.getDefaultIndex());
                } else {
                    num = null;
                }
                CommerceSmartUIStrategyConfig uiStrategy3 = commerceSmartUIModelV2.getUiStrategy();
                if (uiStrategy3 != null && (lableIndexMapping = uiStrategy3.getLableIndexMapping()) != null && (true ^ lableIndexMapping.isEmpty()) && ORZ.LJLJJI(predictLabelResult, lableIndexMapping) && lableIndexMapping.indexOf(predictLabelResult) < plans.length) {
                    num = Integer.valueOf(lableIndexMapping.indexOf(predictLabelResult));
                }
                if (num == null || (planConfig = plans[num.intValue()]) == null || (task = planConfig.getTask()) == null) {
                    return null;
                }
                commerceSmartUITasks = (CommerceSmartUITasks) ListProtector.get(task, 0);
                return commerceSmartUITasks;
            }
            return null;
        } catch (Throwable th) {
            C10K.LIZJ(new ACallableS111S0100000_8(th, 4));
            SmartFeedAdUIService.Companion.getClass();
            return commerceSmartUITasks;
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService, com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public final void checkAndInit() {
        InputFeaturesConfig inputFeaturesConfig;
        CommerceSmartUIPlayTime playTime;
        List<Integer> params;
        int intValue;
        OneSmartDataTrackConfig oneSmartDataTrackConfig;
        MlSdkConfig mlSdkConfig;
        String str;
        CommerceSmartUIPlayTime playTime2;
        UrlPackage packageUrl;
        InputFeaturesConfig inputFeaturesConfig2;
        if (this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        CommerceSmartUIModelV2 commerceSmartUIModelV2 = J49.LIZ;
        if (commerceSmartUIModelV2 == null) {
            return;
        }
        this.LIZJ = commerceSmartUIModelV2;
        OnePlaytimePredictConfig onePlaytimePredictConfig = new OnePlaytimePredictConfig();
        SmartClassifySceneConfig smartClassifySceneConfig = new SmartClassifySceneConfig();
        smartClassifySceneConfig.setScene("commerce_ml_ui_model");
        CommerceSmartUIModelV2 commerceSmartUIModelV22 = this.LIZJ;
        OnePlaytimePredictRealConfig onePlaytimePredictRealConfig = null;
        if (commerceSmartUIModelV22 != null) {
            inputFeaturesConfig = commerceSmartUIModelV22.getFeatures();
        } else {
            inputFeaturesConfig = null;
        }
        if (inputFeaturesConfig != null) {
            CommerceSmartUIModelV2 commerceSmartUIModelV23 = this.LIZJ;
            if (commerceSmartUIModelV23 != null) {
                inputFeaturesConfig2 = commerceSmartUIModelV23.getFeatures();
            } else {
                inputFeaturesConfig2 = null;
            }
            smartClassifySceneConfig.setFeatures(inputFeaturesConfig2);
        } else {
            CommerceSmartUIModelV2 commerceSmartUIModelV24 = this.LIZJ;
            if (commerceSmartUIModelV24 == null || (playTime = commerceSmartUIModelV24.getPlayTime()) == null || (params = playTime.getParams()) == null || !(!params.isEmpty()) || (intValue = ((Number) ListProtector.get(params, 0)).intValue()) <= 0) {
                return;
            }
            InputFeaturesConfig inputFeaturesConfig3 = new InputFeaturesConfig();
            FeaturePlayTypeConfig featurePlayTypeConfig = new FeaturePlayTypeConfig();
            featurePlayTypeConfig.setEnable(true);
            featurePlayTypeConfig.setRange(intValue);
            featurePlayTypeConfig.setSubType("");
            inputFeaturesConfig3.setFTypePlay(featurePlayTypeConfig);
            smartClassifySceneConfig.setFeatures(inputFeaturesConfig3);
        }
        smartClassifySceneConfig.setSdkConfig(new SmartSdkConfig());
        SmartSdkConfig sdkConfig = smartClassifySceneConfig.getSdkConfig();
        if (sdkConfig != null) {
            sdkConfig.setMlSdkConfig(new MlSdkConfig());
        }
        SmartSdkConfig sdkConfig2 = smartClassifySceneConfig.getSdkConfig();
        if (sdkConfig2 != null && (mlSdkConfig = sdkConfig2.getMlSdkConfig()) != null) {
            CommerceSmartUIModelV2 commerceSmartUIModelV25 = this.LIZJ;
            if (commerceSmartUIModelV25 != null && (playTime2 = commerceSmartUIModelV25.getPlayTime()) != null && (packageUrl = playTime2.getPackageUrl()) != null) {
                str = packageUrl.getAndroidUrl();
            } else {
                str = null;
            }
            mlSdkConfig.setPackageUrl(str);
        }
        CommerceSmartUIModelV2 commerceSmartUIModelV26 = this.LIZJ;
        if (commerceSmartUIModelV26 != null) {
            oneSmartDataTrackConfig = commerceSmartUIModelV26.getTrack();
        } else {
            oneSmartDataTrackConfig = null;
        }
        smartClassifySceneConfig.setTrack(oneSmartDataTrackConfig);
        onePlaytimePredictConfig.setSceneConfig(smartClassifySceneConfig);
        CommerceSmartUIModelV2 commerceSmartUIModelV27 = this.LIZJ;
        if (commerceSmartUIModelV27 != null) {
            onePlaytimePredictRealConfig = commerceSmartUIModelV27.getRealConfig();
        }
        onePlaytimePredictConfig.setRealConfig(onePlaytimePredictRealConfig);
        onePlaytimePredictConfig.setTrigger(0);
        SmartPlaytimePredictService.Companion.getClass();
        C48553J3t.LIZ.configOneNewService(onePlaytimePredictConfig);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService, com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public final boolean enable() {
        if (this.LIZJ != null) {
            SmartPlaytimePredictService.Companion.getClass();
            if (C48553J3t.LIZ.enable("commerce_ml_ui_model")) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService
    public final void ensureEvaluatorAvailable() {
        if (this.LIZJ != null) {
            SmartPlaytimePredictService.Companion.getClass();
            C48553J3t.LIZ.ensureEnvAvailable("commerce_ml_ui_model");
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService, com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public final String getPredictLabelResult() {
        SmartFeedAdUIService.Companion.getClass();
        if (this.LIZJ != null && TextUtils.isEmpty(this.LIZLLL)) {
            return FR7.LIZIZ("use_last_predict_label");
        }
        return this.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService, com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public final CommerceSmartUIModel getSmartAdUIExperimentValue() {
        return J49.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService, com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public final void startSmartAdUIJudge(Aweme aweme) {
        if (aweme == null) {
            return;
        }
        C48051ItT c48051ItT = SmartFeedAdUIService.Companion;
        c48051ItT.getClass();
        if (enable()) {
            if (!this.LIZ) {
                this.LIZ = true;
                C72242sW c72242sW = new C72242sW();
                c48051ItT.getClass();
                if (SmartFeedAdUIService.debug) {
                    c72242sW.element = System.currentTimeMillis();
                }
                J3U.LIZIZ(new ARunnableS27S0200000_8(c72242sW, this, 24));
            }
            IFF iff = new IFF();
            iff.LJIIIIZZ = aweme;
            SmartPlaytimePredictService.Companion.getClass();
            C48553J3t.LIZ.predict("commerce_ml_ui_model", iff, null, new C48050ItS(this, aweme));
        }
    }
}
