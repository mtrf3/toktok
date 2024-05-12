package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ml.process.bl.MLConfigModel;
import com.ss.android.ugc.aweme.ml.ab.SmartPreloadCommentV2Experiment$PreloadCommentMLModel;
import com.ss.android.ugc.aweme.ml.api.SmartPreloadCommentV2Service;
import com.ss.android.ugc.aweme.ml.infra.FeaturePlayTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartDataCenterApiService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.J4f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48565J4f {
    public static final /* synthetic */ int LIZJ = 0;
    public final C47545IlJ LIZ;
    public final SmartPreloadCommentV2Experiment$PreloadCommentMLModel LIZIZ;

    public C48565J4f() {
        int i;
        SmartPreloadCommentV2Experiment$PreloadCommentMLModel LIZJ2 = C79012Uzg.LIZJ();
        this.LIZIZ = LIZJ2;
        if (LIZJ2 != null) {
            this.LIZ = new C47545IlJ(new C47512Ikm(LIZJ2));
            InputFeaturesConfig inputFeaturesConfig = new InputFeaturesConfig();
            FeaturePlayTypeConfig featurePlayTypeConfig = new FeaturePlayTypeConfig();
            featurePlayTypeConfig.setEnable(true);
            int[] iArr = LIZJ2.params;
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
        SmartPreloadCommentV2Service.Companion.getClass();
    }

    public final void LIZ(java.util.Map map, java.util.Map outputMap) {
        float f;
        o.LJIIIZ(outputMap, "outputMap");
        C47545IlJ c47545IlJ = this.LIZ;
        if (c47545IlJ != null) {
            try {
                if (!c47545IlJ.LIZJ() || map == null || map.isEmpty() || !c47545IlJ.LIZLLL()) {
                    SmartPreloadCommentV2Service.Companion.getClass();
                    return;
                }
                SmartPreloadCommentV2Service.Companion.getClass();
                if (SmartPreloadCommentV2Service.debug) {
                    for (String str : map.keySet()) {
                    }
                }
                HashMap hashMap = new HashMap();
                H2L h2l = c47545IlJ.LIZJ;
                List<? extends J5M> LJ = c47545IlJ.LJ();
                MLConfigModel mLConfigModel = c47545IlJ.LJFF;
                List<String> LIZJ2 = ((J32) h2l).LIZJ(map, LJ, mLConfigModel.output, mLConfigModel.feature_list, hashMap);
                SmartPreloadCommentV2Service.Companion.getClass();
                if (SmartPreloadCommentV2Service.debug) {
                    for (String str2 : hashMap.keySet()) {
                    }
                }
                if (((ArrayList) LIZJ2).size() > 0) {
                    String str3 = (String) ListProtector.get(LIZJ2, 0);
                    boolean equals = TextUtils.equals(str3, "leave");
                    Float f2 = (Float) hashMap.get(str3);
                    Object obj = ListProtector.get(LIZJ2, 0);
                    o.LJIIIIZZ(obj, "label[0]");
                    outputMap.put("label", obj);
                    if (f2 != null) {
                        if (!equals) {
                            f = f2.floatValue();
                        } else {
                            f = 1 - f2.floatValue();
                        }
                    } else {
                        f = -1.0f;
                    }
                    outputMap.put("probability", Float.valueOf(f));
                }
            } catch (Exception e) {
                PEH.LIZJ(e);
            }
        }
    }
}
