package com.bytedance.effectcreatormobile.draft.pipeline;

import X.C47261Igj;
import X.C93829aXB;
import X.C94034aaU;
import X.X1D;
import com.bytedance.effectcreatormobile.ckeapi.api.eventTracking.ISubmissionProccessor;
import com.bytedance.ies.effectcreator.swig.EffectSubmissionDataJson;
import com.bytedance.ies.effectcreator.swig.FeatureType;
import com.bytedance.ies.effectcreator.swig.Project;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class DefaultSubmissionProccessor implements ISubmissionProccessor {
    public final List<FeatureType> FEATURE_ONLY = C47261Igj.LJJIJIIJI(FeatureType.FeatureType_Makeup, FeatureType.FeatureType_Filter, FeatureType.FeatureType_FaceDistortion);

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.eventTracking.ISubmissionProccessor
    public void removeAll() {
    }

    private final EffectSubmissionDataJson getEffectSubmissionDataJson() {
        C93829aXB LJI = CKEffectEditorContext.LJI();
        if (LJI != null) {
            return LJI.LIZJ.getEffectSubmissionDataPtr();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:241:0x037e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void calculateElementQuality(java.lang.ref.WeakReference<com.bytedance.ies.effectcreator.swig.Project> r14) {
        /*
            Method dump skipped, instructions count: 927
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.effectcreatormobile.draft.pipeline.DefaultSubmissionProccessor.calculateElementQuality(java.lang.ref.WeakReference):void");
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.eventTracking.ISubmissionProccessor
    public Integer getInt(String key) {
        o.LJIIIZ(key, "key");
        EffectSubmissionDataJson effectSubmissionDataJson = getEffectSubmissionDataJson();
        int i = 0;
        if (effectSubmissionDataJson != null && effectSubmissionDataJson.isKeyExist(key)) {
            EffectSubmissionDataJson effectSubmissionDataJson2 = getEffectSubmissionDataJson();
            if (effectSubmissionDataJson2 != null) {
                i = effectSubmissionDataJson2.getValueAsInt(key);
            }
            return Integer.valueOf(i);
        }
        return 0;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.eventTracking.ISubmissionProccessor
    public String getString(String key) {
        EffectSubmissionDataJson effectSubmissionDataJson;
        o.LJIIIZ(key, "key");
        EffectSubmissionDataJson effectSubmissionDataJson2 = getEffectSubmissionDataJson();
        if (effectSubmissionDataJson2 == null || !effectSubmissionDataJson2.isKeyExist(key) || (effectSubmissionDataJson = getEffectSubmissionDataJson()) == null) {
            return null;
        }
        return effectSubmissionDataJson.getValueAsString(key);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.eventTracking.ISubmissionProccessor
    public void remove(String key) {
        o.LJIIIZ(key, "key");
        EffectSubmissionDataJson effectSubmissionDataJson = getEffectSubmissionDataJson();
        if (effectSubmissionDataJson != null) {
            effectSubmissionDataJson.removeKey(key);
        }
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.eventTracking.ISubmissionProccessor
    public void onSubmissionExtra(Object obj, String draftPath) {
        o.LJIIIZ(draftPath, "draftPath");
        if (obj != null) {
            try {
                if (!(obj instanceof WeakReference)) {
                    obj = null;
                }
                WeakReference<Project> weakReference = (WeakReference) obj;
                if (weakReference != null) {
                    calculateElementQuality(weakReference);
                }
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onSubmissionExtra error ");
                LIZ.append(e.getMessage());
                C94034aaU.LIZ("CKE-editor", X1D.LIZIZ(LIZ));
            }
        }
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.eventTracking.ISubmissionProccessor
    public void putInt(String key, int i) {
        o.LJIIIZ(key, "key");
        EffectSubmissionDataJson effectSubmissionDataJson = getEffectSubmissionDataJson();
        if (effectSubmissionDataJson != null) {
            effectSubmissionDataJson.setValue(key, i);
        }
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.eventTracking.ISubmissionProccessor
    public void putString(String key, String value) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
        EffectSubmissionDataJson effectSubmissionDataJson = getEffectSubmissionDataJson();
        if (effectSubmissionDataJson != null) {
            effectSubmissionDataJson.setValue(key, value);
        }
    }
}
