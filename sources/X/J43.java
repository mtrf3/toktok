package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ml.ab.SmartHARExperiment;
import com.ss.android.ugc.aweme.ml.api.SmartHARService;
import com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService;
import com.ss.android.ugc.aweme.ml.infra.MlSdkConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartClassifySceneConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartClassifyService;
import com.ss.android.ugc.aweme.ml.infra.SmartSdkConfig;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class J43 implements J4O {
    public final SmartHARExperiment.SmartHarModel LIZ;
    public final boolean LIZIZ;

    @Override // X.J4O
    public final void unInit() {
    }

    @Override // X.J4O
    public final boolean isReady() {
        SmartClassifyService.Companion.getClass();
        return J44.LIZ.isEnvReady("har_service_android");
    }

    public J43(SmartHARExperiment.SmartHarModel smartHarModel) {
        this.LIZ = smartHarModel;
        SmartHARService.Companion.getClass();
        this.LIZIZ = SmartHARService.debug;
    }

    @Override // X.J4O
    public final void init(Context context) {
        MlSdkConfig mlSdkConfig;
        SmartClassifySceneConfig smartClassifySceneConfig = new SmartClassifySceneConfig();
        smartClassifySceneConfig.setScene("har_service_android");
        String str = null;
        smartClassifySceneConfig.setFeatures(null);
        smartClassifySceneConfig.setDisableMonitor(true);
        smartClassifySceneConfig.setSdkConfig(new SmartSdkConfig());
        SmartSdkConfig sdkConfig = smartClassifySceneConfig.getSdkConfig();
        if (sdkConfig != null) {
            sdkConfig.setMlSdkConfig(new MlSdkConfig());
        }
        SmartSdkConfig sdkConfig2 = smartClassifySceneConfig.getSdkConfig();
        if (sdkConfig2 != null && (mlSdkConfig = sdkConfig2.getMlSdkConfig()) != null) {
            SmartHARExperiment.SmartHarModel smartHarModel = this.LIZ;
            if (smartHarModel != null) {
                str = smartHarModel.getMlSdkPackageUrl();
            }
            mlSdkConfig.setPackageUrl(str);
        }
        SmartClassifyService.Companion.getClass();
        ISmartClassifyService iSmartClassifyService = J44.LIZ;
        iSmartClassifyService.configSceneModel("har_service_android", smartClassifySceneConfig);
        iSmartClassifyService.ensureEnvAvailable("har_service_android");
    }

    @Override // X.J4O
    public final void LIZ(float[] fArr, J4S j4s) {
        long j;
        if (this.LIZ == null || fArr == null) {
            return;
        }
        if (this.LIZIZ) {
            j = System.currentTimeMillis();
        } else {
            j = 0;
        }
        J4J j4j = J4V.LIZ;
        if (j4j.LIZIZ) {
            j4j.LJIIIZ.LIZ = System.currentTimeMillis();
        }
        IFF iff = new IFF();
        HashMap hashMap = new HashMap();
        hashMap.put("har-inputs", fArr);
        iff.LIZJ = hashMap;
        SmartClassifyService.Companion.getClass();
        J44.LIZ.classify("har_service_android", iff, null, new J4M(this, j, j4s));
    }
}
