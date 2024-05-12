package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ml.process.bl.MLConfigModel;
import com.ss.android.ugc.aweme.ml.ab.SmartPreloadProfileV2Experiment$PreloadProfileMLModel;
import com.ss.android.ugc.aweme.ml.api.SmartPreloadProfileV2Service;
import com.ss.android.ugc.aweme.ml.infra.FeaturePlayTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartDataCenterApiService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.J4e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48564J4e {
    public static final /* synthetic */ int LIZJ = 0;
    public final C47546IlK LIZ;
    public final SmartPreloadProfileV2Experiment$PreloadProfileMLModel LIZIZ;

    public C48564J4e() {
        int i;
        SmartPreloadProfileV2Experiment$PreloadProfileMLModel LJIJI = C79004UzY.LJIJI();
        this.LIZIZ = LJIJI;
        if (LJIJI != null) {
            this.LIZ = new C47546IlK(new C47512Ikm(LJIJI));
            InputFeaturesConfig inputFeaturesConfig = new InputFeaturesConfig();
            FeaturePlayTypeConfig featurePlayTypeConfig = new FeaturePlayTypeConfig();
            featurePlayTypeConfig.setEnable(true);
            int[] iArr = LJIJI.params;
            if (iArr != null && iArr.length > 0) {
                i = iArr[0];
            } else {
                i = 5;
            }
            featurePlayTypeConfig.setRange(i);
            featurePlayTypeConfig.setSubType("");
            inputFeaturesConfig.setFTypePlay(featurePlayTypeConfig);
            SmartDataCenterApiService.Companion.getClass();
            C48568J4i.LIZ.addSceneModelConfig(inputFeaturesConfig);
        }
        SmartPreloadProfileV2Service.Companion.getClass();
    }

    public final void LIZ(java.util.Map map, java.util.Map map2) {
        float f;
        C47546IlK c47546IlK = this.LIZ;
        if (c47546IlK != null) {
            try {
                if (!c47546IlK.LIZJ() || map == null || map.isEmpty() || !c47546IlK.LIZLLL()) {
                    SmartPreloadProfileV2Service.Companion.getClass();
                    return;
                }
                SmartPreloadProfileV2Service.Companion.getClass();
                if (SmartPreloadProfileV2Service.debug) {
                    for (String str : map.keySet()) {
                    }
                }
                HashMap hashMap = new HashMap();
                H2L h2l = c47546IlK.LIZJ;
                List<? extends J5M> LJ = c47546IlK.LJ();
                MLConfigModel mLConfigModel = c47546IlK.LJFF;
                List<String> LIZJ2 = ((J32) h2l).LIZJ(map, LJ, mLConfigModel.output, mLConfigModel.feature_list, hashMap);
                SmartPreloadProfileV2Service.Companion.getClass();
                if (SmartPreloadProfileV2Service.debug) {
                    for (String str2 : hashMap.keySet()) {
                    }
                }
                if (map2 != null && ((ArrayList) LIZJ2).size() > 0) {
                    String str3 = (String) ListProtector.get(LIZJ2, 0);
                    boolean equals = TextUtils.equals(str3, "leave");
                    Float f2 = (Float) hashMap.get(str3);
                    Object obj = ListProtector.get(LIZJ2, 0);
                    o.LJIIIIZZ(obj, "label[0]");
                    map2.put("label", obj);
                    if (f2 != null) {
                        if (!equals) {
                            f = f2.floatValue();
                        } else {
                            f = 1 - f2.floatValue();
                        }
                    } else {
                        f = -1.0f;
                    }
                    map2.put("probability", Float.valueOf(f));
                }
            } catch (Exception e) {
                PEH.LIZJ(e);
            }
        }
    }
}
