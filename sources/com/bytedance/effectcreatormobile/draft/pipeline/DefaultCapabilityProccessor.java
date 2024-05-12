package com.bytedance.effectcreatormobile.draft.pipeline;

import X.C93677aUj;
import X.C93829aXB;
import X.C94034aaU;
import X.EnumC94025aaL;
import X.X1D;
import com.bytedance.effectcreatormobile.ckeapi.api.eventTracking.ICapabilityProccessor;
import com.bytedance.ies.effectcreator.swig.EffectCapabilitiesJson;
import com.bytedance.ies.effectcreator.swig.Project;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class DefaultCapabilityProccessor implements ICapabilityProccessor {
    private final EffectCapabilitiesJson getEffectCapabilitiesJson() {
        C93829aXB LJI = CKEffectEditorContext.LJI();
        if (LJI != null) {
            return LJI.LIZJ.getEffectCapabilitiesJsonPtr();
        }
        return null;
    }

    private final void calculateElementCapability(WeakReference<Project> weakReference) {
        Project project;
        long j;
        if (weakReference != null && (project = weakReference.get()) != null) {
            C93677aUj.LJII(0);
            Long LIZIZ = C93677aUj.LIZIZ(0);
            if (LIZIZ != null) {
                j = LIZIZ.longValue();
            } else {
                j = 0;
            }
            project.getEffectCapabilitiesJsonPtr().setValueInAMEExtraCreation(EnumC94025aaL.CAPABILITY_CREATE_DURATION.toString(), (int) j);
            C93677aUj.LJI(0);
        }
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.eventTracking.ICapabilityProccessor
    public Boolean getBoolFromAMEExtraCreation(String key) {
        boolean z;
        o.LJIIIZ(key, "key");
        EffectCapabilitiesJson effectCapabilitiesJson = getEffectCapabilitiesJson();
        if (effectCapabilitiesJson != null && effectCapabilitiesJson.isKeyExistInAMEExtraCreation(key)) {
            EffectCapabilitiesJson effectCapabilitiesJson2 = getEffectCapabilitiesJson();
            if (effectCapabilitiesJson2 != null) {
                z = effectCapabilitiesJson2.getValueAsBoolInAMEExtraCreation(key);
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return Boolean.FALSE;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.eventTracking.ICapabilityProccessor
    public Integer getIntFromAMEExtraCreation(String key) {
        o.LJIIIZ(key, "key");
        EffectCapabilitiesJson effectCapabilitiesJson = getEffectCapabilitiesJson();
        int i = 0;
        if (effectCapabilitiesJson != null && effectCapabilitiesJson.isKeyExistInAMEExtraCreation(key)) {
            EffectCapabilitiesJson effectCapabilitiesJson2 = getEffectCapabilitiesJson();
            if (effectCapabilitiesJson2 != null) {
                i = effectCapabilitiesJson2.getValueAsIntInAMEExtraCreation(key);
            }
            return Integer.valueOf(i);
        }
        return 0;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.eventTracking.ICapabilityProccessor
    public String getStringFromAMEExtraCreation(String key) {
        EffectCapabilitiesJson effectCapabilitiesJson;
        o.LJIIIZ(key, "key");
        EffectCapabilitiesJson effectCapabilitiesJson2 = getEffectCapabilitiesJson();
        if (effectCapabilitiesJson2 == null || !effectCapabilitiesJson2.isKeyExistInAMEExtraCreation(key) || (effectCapabilitiesJson = getEffectCapabilitiesJson()) == null) {
            return null;
        }
        return effectCapabilitiesJson.getValueAsStringInAMEExtraCreation(key);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.eventTracking.ICapabilityProccessor
    public void remove(String key) {
        o.LJIIIZ(key, "key");
        EffectCapabilitiesJson effectCapabilitiesJson = getEffectCapabilitiesJson();
        if (effectCapabilitiesJson != null) {
            effectCapabilitiesJson.removeKeyInAMEExtraCreation(key);
        }
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.eventTracking.ICapabilityProccessor
    public void onCapability(Object obj, String draftPath) {
        o.LJIIIZ(draftPath, "draftPath");
        if (obj != null) {
            try {
                if (!(obj instanceof WeakReference)) {
                    obj = null;
                }
                WeakReference<Project> weakReference = (WeakReference) obj;
                if (weakReference != null) {
                    calculateElementCapability(weakReference);
                }
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onSubmissionExtra error ");
                LIZ.append(e.getMessage());
                C94034aaU.LIZ("CKE-editor", X1D.LIZIZ(LIZ));
            }
        }
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.eventTracking.ICapabilityProccessor
    public void putBoolInAMEExtraCreation(String key, boolean z) {
        o.LJIIIZ(key, "key");
        EffectCapabilitiesJson effectCapabilitiesJson = getEffectCapabilitiesJson();
        if (effectCapabilitiesJson != null) {
            effectCapabilitiesJson.setValueInAMEExtraCreation(key, z);
        }
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.eventTracking.ICapabilityProccessor
    public void putIntInAMEExtraCreation(String key, int i) {
        o.LJIIIZ(key, "key");
        EffectCapabilitiesJson effectCapabilitiesJson = getEffectCapabilitiesJson();
        if (effectCapabilitiesJson != null) {
            effectCapabilitiesJson.setValueInAMEExtraCreation(key, i);
        }
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.eventTracking.ICapabilityProccessor
    public void putStringInAMEExtraCreation(String key, String value) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
        EffectCapabilitiesJson effectCapabilitiesJson = getEffectCapabilitiesJson();
        if (effectCapabilitiesJson != null) {
            effectCapabilitiesJson.setValueInAMEExtraCreation(key, value);
        }
    }
}
