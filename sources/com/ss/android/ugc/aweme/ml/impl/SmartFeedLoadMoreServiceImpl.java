package com.ss.android.ugc.aweme.ml.impl;

import X.C48045ItN;
import X.C48046ItO;
import X.C48553J3t;
import X.C76732zl;
import X.C79000UzU;
import X.C86797Y4r;
import X.FO1;
import X.IFF;
import X.InterfaceC48047ItP;
import android.os.Build;
import android.util.LruCache;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.ab.OnePlaytimePredictConfig;
import com.ss.android.ugc.aweme.ml.ab.OnePlaytimePredictRealConfig;
import com.ss.android.ugc.aweme.ml.ab.OneSmartDataTrackConfig;
import com.ss.android.ugc.aweme.ml.ab.SmartFeedLoadMoreExperiment$FeedLoadMoreMLModel;
import com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService;
import com.ss.android.ugc.aweme.ml.infra.FeaturePlayTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.MlSdkConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartClassifySceneConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService;
import com.ss.android.ugc.aweme.ml.infra.SmartSdkConfig;
import defpackage.i0;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class SmartFeedLoadMoreServiceImpl extends SmartFeedLoadMoreService {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public boolean LIZIZ;
    public boolean LIZLLL;
    public boolean LJ;
    public int LJFF;
    public boolean LJI;
    public SmartFeedLoadMoreExperiment$FeedLoadMoreMLModel LJII;
    public final int LIZ = 3;
    public final LruCache<String, C48046ItO> LIZJ = new LruCache<>(4);

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService, com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public final void checkAndInit() {
        InputFeaturesConfig inputFeaturesConfig;
        OneSmartDataTrackConfig oneSmartDataTrackConfig;
        MlSdkConfig mlSdkConfig;
        String str;
        SmartFeedLoadMoreExperiment$FeedLoadMoreMLModel smartFeedLoadMoreExperiment$FeedLoadMoreMLModel;
        if (this.LJI) {
            return;
        }
        this.LJI = true;
        OnePlaytimePredictRealConfig onePlaytimePredictRealConfig = null;
        int i = 0;
        if (!C79000UzU.LJLIL) {
            SmartFeedLoadMoreExperiment$FeedLoadMoreMLModel smartFeedLoadMoreExperiment$FeedLoadMoreMLModel2 = (SmartFeedLoadMoreExperiment$FeedLoadMoreMLModel) i0.LJ(true, "feed_load_more_ml", 31744, SmartFeedLoadMoreExperiment$FeedLoadMoreMLModel.class, null);
            C79000UzU.LJLILLLLZI = smartFeedLoadMoreExperiment$FeedLoadMoreMLModel2;
            if (smartFeedLoadMoreExperiment$FeedLoadMoreMLModel2 == null) {
                if (Build.VERSION.SDK_INT >= 23 && FO1.LIZ() && C86797Y4r.LIZIZ.contains(C86797Y4r.LIZ)) {
                    smartFeedLoadMoreExperiment$FeedLoadMoreMLModel = new SmartFeedLoadMoreExperiment$FeedLoadMoreMLModel();
                    smartFeedLoadMoreExperiment$FeedLoadMoreMLModel.scene = "feed_load_more_ml";
                    smartFeedLoadMoreExperiment$FeedLoadMoreMLModel.packageUrl = "https://sf16-va.tiktokcdn.com/obj/ml-obj/loadmore_540_v3.zip";
                    smartFeedLoadMoreExperiment$FeedLoadMoreMLModel.params = new int[]{10};
                    smartFeedLoadMoreExperiment$FeedLoadMoreMLModel.type = 3;
                    smartFeedLoadMoreExperiment$FeedLoadMoreMLModel.countWhenExecute = 5;
                    smartFeedLoadMoreExperiment$FeedLoadMoreMLModel.runDelay = 0;
                } else {
                    smartFeedLoadMoreExperiment$FeedLoadMoreMLModel = null;
                }
                C79000UzU.LJLILLLLZI = smartFeedLoadMoreExperiment$FeedLoadMoreMLModel;
            }
            SmartFeedLoadMoreExperiment$FeedLoadMoreMLModel smartFeedLoadMoreExperiment$FeedLoadMoreMLModel3 = C79000UzU.LJLILLLLZI;
            if (smartFeedLoadMoreExperiment$FeedLoadMoreMLModel3 != null) {
                int[] iArr = smartFeedLoadMoreExperiment$FeedLoadMoreMLModel3.params;
                if (iArr != null && iArr.length > 0) {
                    C79000UzU.LJLJI = iArr[0];
                }
                C79000UzU.LJLJJI = smartFeedLoadMoreExperiment$FeedLoadMoreMLModel3.countWhenExecute;
                C79000UzU.LJLJJL = smartFeedLoadMoreExperiment$FeedLoadMoreMLModel3.runDelay;
                C79000UzU.LJLJJLL = smartFeedLoadMoreExperiment$FeedLoadMoreMLModel3.loadModelBefore;
                C79000UzU.LJLJL = smartFeedLoadMoreExperiment$FeedLoadMoreMLModel3.skipCount;
                if (smartFeedLoadMoreExperiment$FeedLoadMoreMLModel3.features == null) {
                    InputFeaturesConfig inputFeaturesConfig2 = new InputFeaturesConfig();
                    FeaturePlayTypeConfig featurePlayTypeConfig = new FeaturePlayTypeConfig();
                    featurePlayTypeConfig.setEnable(true);
                    featurePlayTypeConfig.setRange(C79000UzU.LJLJI);
                    featurePlayTypeConfig.setSubType("");
                    inputFeaturesConfig2.setFTypePlay(featurePlayTypeConfig);
                    featurePlayTypeConfig.setRangeExcludeThis(true);
                    C79000UzU.LJLILLLLZI.features = inputFeaturesConfig2;
                }
            }
            C79000UzU.LJLIL = true;
        }
        SmartFeedLoadMoreExperiment$FeedLoadMoreMLModel smartFeedLoadMoreExperiment$FeedLoadMoreMLModel4 = C79000UzU.LJLILLLLZI;
        if (smartFeedLoadMoreExperiment$FeedLoadMoreMLModel4 == null) {
            return;
        }
        this.LJII = smartFeedLoadMoreExperiment$FeedLoadMoreMLModel4;
        OnePlaytimePredictConfig onePlaytimePredictConfig = new OnePlaytimePredictConfig();
        SmartClassifySceneConfig smartClassifySceneConfig = new SmartClassifySceneConfig();
        smartClassifySceneConfig.setScene("feed_load_more_ml");
        SmartFeedLoadMoreExperiment$FeedLoadMoreMLModel smartFeedLoadMoreExperiment$FeedLoadMoreMLModel5 = this.LJII;
        if (smartFeedLoadMoreExperiment$FeedLoadMoreMLModel5 != null) {
            inputFeaturesConfig = smartFeedLoadMoreExperiment$FeedLoadMoreMLModel5.features;
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
            SmartFeedLoadMoreExperiment$FeedLoadMoreMLModel smartFeedLoadMoreExperiment$FeedLoadMoreMLModel6 = this.LJII;
            if (smartFeedLoadMoreExperiment$FeedLoadMoreMLModel6 != null) {
                str = smartFeedLoadMoreExperiment$FeedLoadMoreMLModel6.packageUrl;
            } else {
                str = null;
            }
            mlSdkConfig.setPackageUrl(str);
        }
        SmartFeedLoadMoreExperiment$FeedLoadMoreMLModel smartFeedLoadMoreExperiment$FeedLoadMoreMLModel7 = this.LJII;
        if (smartFeedLoadMoreExperiment$FeedLoadMoreMLModel7 != null) {
            oneSmartDataTrackConfig = smartFeedLoadMoreExperiment$FeedLoadMoreMLModel7.track;
        } else {
            oneSmartDataTrackConfig = null;
        }
        smartClassifySceneConfig.setTrack(oneSmartDataTrackConfig);
        onePlaytimePredictConfig.setSceneConfig(smartClassifySceneConfig);
        SmartFeedLoadMoreExperiment$FeedLoadMoreMLModel smartFeedLoadMoreExperiment$FeedLoadMoreMLModel8 = this.LJII;
        if (smartFeedLoadMoreExperiment$FeedLoadMoreMLModel8 != null) {
            onePlaytimePredictRealConfig = smartFeedLoadMoreExperiment$FeedLoadMoreMLModel8.realConfig;
        }
        onePlaytimePredictConfig.setRealConfig(onePlaytimePredictRealConfig);
        onePlaytimePredictConfig.setTrigger(0);
        SmartFeedLoadMoreExperiment$FeedLoadMoreMLModel smartFeedLoadMoreExperiment$FeedLoadMoreMLModel9 = this.LJII;
        if (smartFeedLoadMoreExperiment$FeedLoadMoreMLModel9 != null) {
            i = smartFeedLoadMoreExperiment$FeedLoadMoreMLModel9.runDelay;
        }
        onePlaytimePredictConfig.setRunDelay(i);
        SmartPlaytimePredictService.Companion.getClass();
        C48553J3t.LIZ.configOneNewService(onePlaytimePredictConfig);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService
    public final boolean enable() {
        if (this.LJII != null) {
            SmartPlaytimePredictService.Companion.getClass();
            if (C48553J3t.LIZ.enable("feed_load_more_ml")) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService
    public final void ensureEvaluatorAvailable() {
        if (this.LJII != null) {
            SmartPlaytimePredictService.Companion.getClass();
            C48553J3t.LIZ.ensureEnvAvailable("feed_load_more_ml");
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService, com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public final boolean isSmartFeedLoadMoreScene(String str) {
        return o.LJ("homepage_hot", str);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService, com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public final void startSmartFeedLoadMoreJudge(Aweme aweme, InterfaceC48047ItP callback) {
        o.LJIIIZ(callback, "callback");
        if (aweme == null) {
            return;
        }
        SmartFeedLoadMoreService.Companion.getClass();
        if (enable()) {
            this.LIZIZ = true;
            this.LIZLLL = false;
            IFF iff = new IFF();
            iff.LJIIIIZZ = aweme;
            C76732zl c76732zl = new C76732zl();
            c76732zl.element = C79000UzU.LJLJJI;
            SmartPlaytimePredictService.Companion.getClass();
            C48553J3t.LIZ.predict("feed_load_more_ml", iff, null, new C48045ItN(this, aweme, callback, c76732zl));
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService, com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public final void addVideoPlayEndReportData(HashMap<String, Object> map, Aweme aweme, Integer num) {
        o.LJIIIZ(map, "map");
        if (aweme == null || num == null || !enable() || num.intValue() != 0 || aweme.getAid() == null) {
            return;
        }
        C48046ItO c48046ItO = this.LIZJ.get(aweme.getAid());
        if (c48046ItO != null) {
            float f = c48046ItO.LIZ;
            if (f >= 0.0f) {
                map.put("lp_predict", Float.valueOf(f));
            }
            String str = c48046ItO.LIZIZ;
            if (str != null) {
                map.put("lp_predictL", str);
            }
            int i = c48046ItO.LIZJ;
            if (i >= 0) {
                map.put("left_videos_cnt", Integer.valueOf(i));
            }
        }
        SmartFeedLoadMoreService.Companion.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
    
        if (r9.LIZ >= 0.0f) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e8, code lost:
    
        if (r7 > r11.LIZ) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService, com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean needCheckLoadMore(int r12, int r13, com.ss.android.ugc.aweme.feed.model.Aweme r14) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ml.impl.SmartFeedLoadMoreServiceImpl.needCheckLoadMore(int, int, com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService
    public final void addVideoPlayEndReportData(JSONObject jsonObject, Aweme aweme, Integer num) {
        o.LJIIIZ(jsonObject, "jsonObject");
        if (aweme == null || num == null || !enable() || num.intValue() != 0) {
            return;
        }
        C48046ItO c48046ItO = this.LIZJ.get(aweme.getAid());
        if (c48046ItO != null) {
            float f = c48046ItO.LIZ;
            if (f >= 0.0f) {
                jsonObject.put("lp_predict", Float.valueOf(f));
            }
            String str = c48046ItO.LIZIZ;
            if (str != null) {
                jsonObject.put("lp_predictL", str);
            }
            int i = c48046ItO.LIZJ;
            if (i >= 0) {
                jsonObject.put("left_videos_cnt", i);
            }
        }
        SmartFeedLoadMoreService.Companion.getClass();
    }
}
