package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService;
import com.ss.android.ugc.aweme.ml.infra.MlSdkConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartClassifySceneConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartClassifyService;
import com.ss.android.ugc.aweme.ml.infra.SmartSdkConfig;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class J41 extends J5U {
    public final String LIZJ;
    public boolean LIZLLL;

    @Override // X.J5U
    public final void LIZLLL() {
    }

    public final void LJ() {
        MlSdkConfig mlSdkConfig;
        if (this.LIZLLL) {
            return;
        }
        this.LIZLLL = true;
        SmartClassifySceneConfig smartClassifySceneConfig = new SmartClassifySceneConfig();
        smartClassifySceneConfig.setScene("ohr_android");
        smartClassifySceneConfig.setFeatures(null);
        smartClassifySceneConfig.setDisableMonitor(true);
        smartClassifySceneConfig.setSdkConfig(new SmartSdkConfig());
        SmartSdkConfig sdkConfig = smartClassifySceneConfig.getSdkConfig();
        if (sdkConfig != null) {
            sdkConfig.setMlSdkConfig(new MlSdkConfig());
        }
        SmartSdkConfig sdkConfig2 = smartClassifySceneConfig.getSdkConfig();
        if (sdkConfig2 != null && (mlSdkConfig = sdkConfig2.getMlSdkConfig()) != null) {
            mlSdkConfig.setPackageUrl(this.LIZJ);
        }
        J4E j4e = SmartClassifyService.Companion;
        j4e.getClass();
        ISmartClassifyService iSmartClassifyService = J44.LIZ;
        iSmartClassifyService.configSceneModel("ohr_android", smartClassifySceneConfig);
        j4e.getClass();
        iSmartClassifyService.ensureEnvAvailable("ohr_android");
    }

    @Override // X.J5U
    public final void LIZJ() {
        LJ();
    }

    public J41(String str) {
        this.LIZJ = str;
    }

    @Override // X.J5U
    public final void LIZIZ(C11030bz c11030bz) {
        Object obj = c11030bz.LIZ;
        LJ();
        SmartClassifyService.Companion.getClass();
        ISmartClassifyService iSmartClassifyService = J44.LIZ;
        if (!iSmartClassifyService.enable("ohr_android")) {
            if (!iSmartClassifyService.isEnvReady("ohr_android")) {
                iSmartClassifyService.ensureEnvAvailable("ohr_android");
                return;
            }
            return;
        }
        C72242sW c72242sW = new C72242sW();
        c72242sW.element = SystemClock.uptimeMillis();
        IFF iff = new IFF();
        HashMap hashMap = new HashMap();
        hashMap.put("ohr-inputs", obj);
        iff.LIZJ = hashMap;
        iSmartClassifyService.classify("ohr_android", iff, null, new J5P(c72242sW, this));
    }
}
