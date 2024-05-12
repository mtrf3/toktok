package com.ss.android.ugc.aweme.ml.impl;

import X.C00F;
import X.C10K;
import X.C34864DmG;
import X.C40010Fn4;
import X.C48043ItL;
import X.C48553J3t;
import X.C48559J3z;
import X.C48583J4x;
import X.C61878OQg;
import X.C72242sW;
import X.C86797Y4r;
import X.DPI;
import X.FO0;
import X.IFF;
import X.IWE;
import X.J3U;
import X.ORY;
import Y.ACallableS111S0100000_8;
import Y.ARunnableS27S0200000_8;
import android.os.Build;
import android.text.TextUtils;
import android.util.LruCache;
import com.google.gson.m;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.impl.StrategyImpl;
import com.ss.android.ugc.aweme.ml.ab.OnePlaytimePredictConfig;
import com.ss.android.ugc.aweme.ml.ab.OnePlaytimePredictRealConfig;
import com.ss.android.ugc.aweme.ml.ab.OneSmartDataTrackConfig;
import com.ss.android.ugc.aweme.ml.ab.SmartPreloadExperiment$SmartPreloadModel;
import com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadResultListener;
import com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService;
import com.ss.android.ugc.aweme.ml.infra.FeatureFeedTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.FeaturePlayTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.MlSdkConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartClassifySceneConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService;
import com.ss.android.ugc.aweme.ml.infra.SmartSdkConfig;
import com.ss.android.ugc.aweme.ml.model.PreloadStrategyV2Config;
import com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;
import defpackage.i0;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes9.dex */
public final class SmartFeedPreloadServiceImpl extends SmartFeedPreloadService {
    public static final /* synthetic */ int LJIIJ = 0;
    public List<? extends PreloadStrategyConfig> LIZ;
    public int LIZIZ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public SmartPreloadExperiment$SmartPreloadModel LJI;
    public final LruCache<String, Boolean> LIZJ = new LruCache<>(8);
    public volatile String LJII = "";
    public float LJIIIIZZ = -1.0f;
    public final HashSet<ISmartFeedPreloadResultListener> LJIIIZ = new HashSet<>();

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService, com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final PreloadStrategyConfig getCurrentSmartPreloadStrategyConfig() {
        try {
            String predictLabelResult = getPredictLabelResult();
            if (!TextUtils.isEmpty(predictLabelResult)) {
                PreloadStrategyV2Config smartPreloadStrategyV2ExperimentValue = getSmartPreloadStrategyV2ExperimentValue();
                if (smartPreloadStrategyV2ExperimentValue == null || smartPreloadStrategyV2ExperimentValue.plans == null) {
                    return null;
                }
                PreloadStrategyConfig[] preloadStrategyConfigArr = smartPreloadStrategyV2ExperimentValue.plans;
                o.LJIIIIZZ(preloadStrategyConfigArr, "v2Config.plans");
                if (preloadStrategyConfigArr.length == 0) {
                    return null;
                }
                PreloadStrategyConfig[] preloadStrategyConfigArr2 = smartPreloadStrategyV2ExperimentValue.plans;
                int i = smartPreloadStrategyV2ExperimentValue.defaultIndex;
                List<String> list = smartPreloadStrategyV2ExperimentValue.lableIndexMapping;
                if (list != null && list.size() > 0 && list.contains(predictLabelResult) && list.indexOf(predictLabelResult) < preloadStrategyConfigArr2.length) {
                    i = list.indexOf(predictLabelResult);
                }
                PreloadStrategyConfig preloadStrategyConfig = preloadStrategyConfigArr2[i];
                SmartFeedPreloadService.Companion.getClass();
                return preloadStrategyConfig;
            }
            SmartFeedPreloadService.Companion.getClass();
            return null;
        } catch (Throwable th) {
            C10K.LIZJ(new ACallableS111S0100000_8(th, 6));
            SmartFeedPreloadService.Companion.getClass();
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService, com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final void checkAndInit() {
        InputFeaturesConfig inputFeaturesConfig;
        OneSmartDataTrackConfig oneSmartDataTrackConfig;
        int i;
        MlSdkConfig mlSdkConfig;
        String str;
        SmartPreloadExperiment$SmartPreloadModel smartPreloadExperiment$SmartPreloadModel;
        if (this.LJFF) {
            return;
        }
        this.LJFF = true;
        OnePlaytimePredictRealConfig onePlaytimePredictRealConfig = null;
        if (!C48559J3z.LIZ) {
            SmartPreloadExperiment$SmartPreloadModel smartPreloadExperiment$SmartPreloadModel2 = (SmartPreloadExperiment$SmartPreloadModel) i0.LJ(true, "playtime_ml", 31744, SmartPreloadExperiment$SmartPreloadModel.class, null);
            C48559J3z.LIZIZ = smartPreloadExperiment$SmartPreloadModel2;
            if (smartPreloadExperiment$SmartPreloadModel2 == null) {
                if (Build.VERSION.SDK_INT >= 23 && DPI.LIZ() && StrategyImpl.LIZIZ().LJJIJ() && ((StrategyImpl.LIZIZ().LJIILL() || FO0.LIZ() == 1 || FO0.LIZ() == 3) && C86797Y4r.LIZJ.contains(C86797Y4r.LIZ))) {
                    try {
                        smartPreloadExperiment$SmartPreloadModel = (SmartPreloadExperiment$SmartPreloadModel) C48583J4x.LIZ.LJI("{\"params\":[10],\"type\":3,\"scene\":\"playtime_ml\",\"package\":\"https://sf16-va.tiktokcdn.com/obj/ml-obj/global_10s_con_v3_70.zip?9205e03105620a400f1f0cfd6154f108\"}", SmartPreloadExperiment$SmartPreloadModel.class);
                    } catch (Exception unused) {
                    }
                    C48559J3z.LIZIZ = smartPreloadExperiment$SmartPreloadModel;
                }
                smartPreloadExperiment$SmartPreloadModel = null;
                C48559J3z.LIZIZ = smartPreloadExperiment$SmartPreloadModel;
            }
            SmartPreloadExperiment$SmartPreloadModel smartPreloadExperiment$SmartPreloadModel3 = C48559J3z.LIZIZ;
            if (smartPreloadExperiment$SmartPreloadModel3 != null) {
                int[] iArr = smartPreloadExperiment$SmartPreloadModel3.params;
                if (iArr != null && iArr.length > 0) {
                    C48559J3z.LIZJ = iArr[0];
                }
                C48559J3z.LIZLLL = smartPreloadExperiment$SmartPreloadModel3.embeddingRange;
                C48559J3z.LJ = smartPreloadExperiment$SmartPreloadModel3.skipCount;
                C48559J3z.LJFF = smartPreloadExperiment$SmartPreloadModel3.notRunWhenPause;
                C48559J3z.LJI = smartPreloadExperiment$SmartPreloadModel3.notRepeat;
                C48559J3z.LJII = smartPreloadExperiment$SmartPreloadModel3.runDelay;
                if (smartPreloadExperiment$SmartPreloadModel3.features == null) {
                    InputFeaturesConfig inputFeaturesConfig2 = new InputFeaturesConfig();
                    FeaturePlayTypeConfig featurePlayTypeConfig = new FeaturePlayTypeConfig();
                    featurePlayTypeConfig.setEnable(true);
                    featurePlayTypeConfig.setRange(C48559J3z.LIZJ);
                    featurePlayTypeConfig.setSubType("");
                    inputFeaturesConfig2.setFTypePlay(featurePlayTypeConfig);
                    featurePlayTypeConfig.setRangeExcludeThis(false);
                    if (C48559J3z.LIZLLL > 0) {
                        FeatureFeedTypeConfig featureFeedTypeConfig = new FeatureFeedTypeConfig();
                        featureFeedTypeConfig.setEnable(true);
                        featureFeedTypeConfig.setRange(C48559J3z.LIZLLL);
                        featureFeedTypeConfig.setSubType("embeddings");
                    }
                    C48559J3z.LIZIZ.features = inputFeaturesConfig2;
                }
            }
            C48559J3z.LIZ = true;
        }
        SmartPreloadExperiment$SmartPreloadModel smartPreloadExperiment$SmartPreloadModel4 = C48559J3z.LIZIZ;
        if (smartPreloadExperiment$SmartPreloadModel4 == null) {
            return;
        }
        this.LJI = smartPreloadExperiment$SmartPreloadModel4;
        OnePlaytimePredictConfig onePlaytimePredictConfig = new OnePlaytimePredictConfig();
        SmartClassifySceneConfig smartClassifySceneConfig = new SmartClassifySceneConfig();
        smartClassifySceneConfig.setScene("playtime_ml");
        SmartPreloadExperiment$SmartPreloadModel smartPreloadExperiment$SmartPreloadModel5 = this.LJI;
        if (smartPreloadExperiment$SmartPreloadModel5 != null) {
            inputFeaturesConfig = smartPreloadExperiment$SmartPreloadModel5.features;
        } else {
            inputFeaturesConfig = null;
        }
        smartClassifySceneConfig.setFeatures(inputFeaturesConfig);
        smartClassifySceneConfig.setSdkConfig(new SmartSdkConfig());
        SmartSdkConfig sdkConfig = smartClassifySceneConfig.getSdkConfig();
        if (sdkConfig != null) {
            sdkConfig.setMlSdkConfig(new MlSdkConfig());
        }
        SmartSdkConfig sdkConfig2 = smartClassifySceneConfig.getSdkConfig();
        if (sdkConfig2 != null && (mlSdkConfig = sdkConfig2.getMlSdkConfig()) != null) {
            SmartPreloadExperiment$SmartPreloadModel smartPreloadExperiment$SmartPreloadModel6 = this.LJI;
            if (smartPreloadExperiment$SmartPreloadModel6 != null) {
                str = smartPreloadExperiment$SmartPreloadModel6.packageUrl;
            } else {
                str = null;
            }
            mlSdkConfig.setPackageUrl(str);
        }
        SmartPreloadExperiment$SmartPreloadModel smartPreloadExperiment$SmartPreloadModel7 = this.LJI;
        if (smartPreloadExperiment$SmartPreloadModel7 != null) {
            oneSmartDataTrackConfig = smartPreloadExperiment$SmartPreloadModel7.track;
        } else {
            oneSmartDataTrackConfig = null;
        }
        smartClassifySceneConfig.setTrack(oneSmartDataTrackConfig);
        onePlaytimePredictConfig.setSceneConfig(smartClassifySceneConfig);
        SmartPreloadExperiment$SmartPreloadModel smartPreloadExperiment$SmartPreloadModel8 = this.LJI;
        if (smartPreloadExperiment$SmartPreloadModel8 != null) {
            i = smartPreloadExperiment$SmartPreloadModel8.runDelay;
        } else {
            i = 0;
        }
        onePlaytimePredictConfig.setRunDelay(i);
        onePlaytimePredictConfig.setTrigger(0);
        SmartPreloadExperiment$SmartPreloadModel smartPreloadExperiment$SmartPreloadModel9 = this.LJI;
        if (smartPreloadExperiment$SmartPreloadModel9 != null) {
            onePlaytimePredictRealConfig = smartPreloadExperiment$SmartPreloadModel9.realConfig;
        }
        onePlaytimePredictConfig.setRealConfig(onePlaytimePredictRealConfig);
        SmartPlaytimePredictService.Companion.getClass();
        C48553J3t.LIZ.configOneNewService(onePlaytimePredictConfig);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService, com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final boolean enable() {
        if (this.LJI != null) {
            SmartPlaytimePredictService.Companion.getClass();
            if (C48553J3t.LIZ.enable("playtime_ml")) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService
    public final void ensureEvaluatorAvailable() {
        if (this.LJI != null) {
            SmartPlaytimePredictService.Companion.getClass();
            C48553J3t.LIZ.ensureEnvAvailable("playtime_ml");
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService, com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final String getPredictLabelResult() {
        SmartFeedPreloadService.Companion.getClass();
        return this.LJII;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService, com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final List<PreloadStrategyConfig> getSmartPreloadStrategyExperimentValue() {
        if (this.LIZ == null) {
            try {
                PreloadStrategyConfig[] preloadStrategyConfigArr = IWE.LIZ;
                if (preloadStrategyConfigArr != null) {
                    this.LIZ = ORY.LJLIIIL(preloadStrategyConfigArr);
                }
            } catch (Throwable unused) {
                SmartFeedPreloadService.Companion.getClass();
            }
            if (this.LIZ == null) {
                this.LIZ = C61878OQg.INSTANCE;
            }
        }
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService, com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final String getSmartPreloadStrategyV2ExperimentJsonString() {
        C34864DmG.LIZ();
        if (C34864DmG.LIZJ == null) {
            return null;
        }
        m mVar = new m();
        mVar.LJJII("smart_preload_strategy_v2", C34864DmG.LIZJ);
        return mVar.toString();
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService
    public final PreloadStrategyV2Config getSmartPreloadStrategyV2ExperimentValue() {
        return C34864DmG.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService, com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final int obtainAiFastSlowPredict() {
        String predictLabelResult = getPredictLabelResult();
        if (predictLabelResult != null) {
            Locale locale = Locale.ROOT;
            String lowerCase = predictLabelResult.toLowerCase(locale);
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (!s.LJJJLZIJ(lowerCase, "gt", false)) {
                String lowerCase2 = predictLabelResult.toLowerCase(locale);
                o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (s.LJJJLZIJ(lowerCase2, "slow", false)) {
                    return 2;
                }
                String lowerCase3 = predictLabelResult.toLowerCase(locale);
                o.LJIIIIZZ(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (!s.LJJJLZIJ(lowerCase3, "lt", false)) {
                    String lowerCase4 = predictLabelResult.toLowerCase(locale);
                    o.LJIIIIZZ(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    if (s.LJJJLZIJ(lowerCase4, "fast", false)) {
                        return 1;
                    }
                    String lowerCase5 = predictLabelResult.toLowerCase();
                    o.LJIIIIZZ(lowerCase5, "this as java.lang.String).toLowerCase()");
                    if (s.LJJJLZIJ(lowerCase5, "nor", false)) {
                        return 3;
                    }
                } else {
                    return 1;
                }
            } else {
                return 2;
            }
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService
    public final float getPredictProbabilityResult() {
        return this.LJIIIIZZ;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService, com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final void addResultListener(ISmartFeedPreloadResultListener iSmartFeedPreloadResultListener) {
        if (iSmartFeedPreloadResultListener != null) {
            synchronized (this.LJIIIZ) {
                this.LJIIIZ.add(iSmartFeedPreloadResultListener);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService
    public final void removeResultListener(ISmartFeedPreloadResultListener iSmartFeedPreloadResultListener) {
        if (iSmartFeedPreloadResultListener != null) {
            synchronized (this.LJIIIZ) {
                this.LJIIIZ.remove(iSmartFeedPreloadResultListener);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService, com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final void startSmartPreloadV2Judge(Aweme aweme) {
        int i;
        if (aweme == null) {
            return;
        }
        SmartFeedPreloadService.Companion.getClass();
        if ((!C40010Fn4.LIZJ().LIZLLL() || C00F.LIZ(31744, 0, "power_mode_smart_preload_video_type", true) != 1) && enable()) {
            int i2 = C48559J3z.LJ;
            if (i2 > 0 && (i = this.LIZIZ) < i2) {
                int i3 = i + 1;
                this.LIZIZ = i3;
                if (i3 != i2 || this.LJ) {
                    return;
                }
                this.LJ = true;
                C72242sW c72242sW = new C72242sW();
                if (SmartFeedPreloadService.debug) {
                    c72242sW.element = System.currentTimeMillis();
                }
                J3U.LIZJ(C48559J3z.LJII, new ARunnableS27S0200000_8(c72242sW, this, 26));
                return;
            }
            if (C48559J3z.LJII > 0 && this.LIZLLL) {
                return;
            }
            if (C48559J3z.LJI) {
                String aid = aweme.getAid();
                if (this.LIZJ.get(aid) != null) {
                    return;
                } else {
                    this.LIZJ.put(aid, Boolean.TRUE);
                }
            }
            this.LIZLLL = true;
            IFF iff = new IFF();
            iff.LJIIIIZZ = aweme;
            SmartPlaytimePredictService.Companion.getClass();
            C48553J3t.LIZ.predict("playtime_ml", iff, null, new C48043ItL(this, aweme));
        }
    }
}
