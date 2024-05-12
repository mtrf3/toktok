package com.ss.android.ugc.aweme.ml.feature.pitaya;

import X.X1D;
import com.bytedance.pitaya.api.PTYNormalCallback;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.feature.store.PTYFeatureStoreInstance;
import com.ss.android.ugc.aweme.feature.pitaya.producer.IESBasicFeaturePTYProducer;
import com.ss.android.ugc.aweme.feature.pitaya.producer.PortraitFeaturePTYProducer;
import com.ss.android.ugc.aweme.ml.api.PitayaFeatureCenterService;
import com.ss.android.ugc.aweme.ml.feature.pitaya.group.AWEFeaturePTYGroup;
import defpackage.e1;
import java.util.List;

/* loaded from: classes15.dex */
public final class PitayaFeatureCenterServiceImpl extends PitayaFeatureCenterService {
    public static final /* synthetic */ int LIZLLL = 0;
    public boolean LIZ;
    public boolean LIZIZ;
    public int LIZJ;

    @Override // com.ss.android.ugc.aweme.ml.api.PitayaFeatureCenterService, com.ss.android.ugc.aweme.ml.api.IPitayaFeatureCenterService
    public final void checkAndInit() {
        if (this.LIZ) {
            return;
        }
        System.currentTimeMillis();
        this.LIZ = true;
        if (!e1.LIZ(31744, "feature_center_pitaya_switch", true, false)) {
            return;
        }
        PTYFeatureStoreInstance pTYFeatureStoreInstance = PTYFeatureStoreInstance.INSTANCE;
        pTYFeatureStoreInstance.getFeatureStore().registerFeatureProducer(IESBasicFeaturePTYProducer.INSTANCE, new PTYNormalCallback() { // from class: com.ss.android.ugc.aweme.ml.feature.pitaya.PitayaFeatureCenterServiceImpl$checkAndInit$1
            @Override // com.bytedance.pitaya.api.PTYNormalCallback
            public void onResult(boolean z, PTYError pTYError) {
                Integer num;
                Integer num2;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("basic onResult: success:");
                LIZ.append(z);
                LIZ.append(" error:");
                LIZ.append(pTYError);
                LIZ.append(" code-");
                List<String> list = null;
                if (pTYError != null) {
                    num = Integer.valueOf(pTYError.getCode());
                } else {
                    num = null;
                }
                LIZ.append(num);
                LIZ.append(" subCode-");
                if (pTYError != null) {
                    num2 = Integer.valueOf(pTYError.getSubCode());
                } else {
                    num2 = null;
                }
                LIZ.append(num2);
                LIZ.append(" stacks-");
                if (pTYError != null) {
                    list = pTYError.getStacks();
                }
                LIZ.append(list);
                X1D.LIZIZ(LIZ);
            }
        });
        pTYFeatureStoreInstance.getFeatureStore().registerFeatureProducer(PortraitFeaturePTYProducer.INSTANCE, new PTYNormalCallback() { // from class: com.ss.android.ugc.aweme.ml.feature.pitaya.PitayaFeatureCenterServiceImpl$checkAndInit$2
            @Override // com.bytedance.pitaya.api.PTYNormalCallback
            public void onResult(boolean z, PTYError pTYError) {
                Integer num;
                Integer num2;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("portrait onResult: success:");
                LIZ.append(z);
                LIZ.append(" error:");
                LIZ.append(pTYError);
                LIZ.append(" code-");
                List<String> list = null;
                if (pTYError != null) {
                    num = Integer.valueOf(pTYError.getCode());
                } else {
                    num = null;
                }
                LIZ.append(num);
                LIZ.append(" subCode-");
                if (pTYError != null) {
                    num2 = Integer.valueOf(pTYError.getSubCode());
                } else {
                    num2 = null;
                }
                LIZ.append(num2);
                LIZ.append(" stacks-");
                if (pTYError != null) {
                    list = pTYError.getStacks();
                }
                LIZ.append(list);
                X1D.LIZIZ(LIZ);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.ml.api.PitayaFeatureCenterService, com.ss.android.ugc.aweme.ml.api.IPitayaFeatureCenterService
    public final void onSlideSpeedUpdate(Float f, Float f2, Float f3) {
        int i;
        if (!this.LIZIZ && (i = this.LIZJ) < 32) {
            this.LIZJ = i + 1;
            PTYFeatureStoreInstance.INSTANCE.getFeatureStore().registerFeatureGroup(AWEFeaturePTYGroup.INSTANCE, new PTYNormalCallback() { // from class: com.ss.android.ugc.aweme.ml.feature.pitaya.PitayaFeatureCenterServiceImpl$onSlideSpeedUpdate$1
                @Override // com.bytedance.pitaya.api.PTYNormalCallback
                public void onResult(boolean z, PTYError pTYError) {
                    Integer num;
                    Integer num2;
                    PitayaFeatureCenterServiceImpl.this.LIZIZ = z;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("slide onResult: success:");
                    LIZ.append(z);
                    LIZ.append(" error:");
                    LIZ.append(pTYError);
                    LIZ.append(" code-");
                    List<String> list = null;
                    if (pTYError != null) {
                        num = Integer.valueOf(pTYError.getCode());
                    } else {
                        num = null;
                    }
                    LIZ.append(num);
                    LIZ.append(" subCode-");
                    if (pTYError != null) {
                        num2 = Integer.valueOf(pTYError.getSubCode());
                    } else {
                        num2 = null;
                    }
                    LIZ.append(num2);
                    LIZ.append(" stacks-");
                    if (pTYError != null) {
                        list = pTYError.getStacks();
                    }
                    LIZ.append(list);
                    X1D.LIZIZ(LIZ);
                }
            });
        }
        if (this.LIZIZ && f != null && f2 != null && f3 != null) {
            PTYFeatureStoreInstance pTYFeatureStoreInstance = PTYFeatureStoreInstance.INSTANCE;
            pTYFeatureStoreInstance.getFeatureStore().addFeature("sliding_velocity", f.floatValue(), "ies_pty");
            pTYFeatureStoreInstance.getFeatureStore().addFeature("sliding_velocity_x", f2.floatValue(), "ies_pty");
            pTYFeatureStoreInstance.getFeatureStore().addFeature("sliding_velocity_y", f3.floatValue(), "ies_pty");
        }
    }
}
