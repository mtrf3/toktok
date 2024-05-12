package com.ss.android.ugc.effectmanager.effect.model;

import com.ss.android.ugc.effectmanager.effect.model.template.CustomizedEffectsResponseTemplate;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public final class CustomizedEffectsResponse extends CustomizedEffectsResponseTemplate implements Serializable {
    public final transient com.ss.ugc.effectplatform.model.net.CustomizedEffectsResponse kCustomizedEffectsResponse;

    /* JADX WARN: Multi-variable type inference failed */
    public CustomizedEffectsResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CustomizedEffectsResponseTemplate
    public List<Effect> getCustomEffects() {
        return super.getCustomEffects();
    }

    @Override // com.ss.ugc.effectplatform.model.net.CustomizedEffectsResponse
    public List<com.ss.ugc.effectplatform.model.Effect> getCustom_effects() {
        List<com.ss.ugc.effectplatform.model.Effect> custom_effects;
        com.ss.ugc.effectplatform.model.net.CustomizedEffectsResponse kCustomizedEffectsResponse = getKCustomizedEffectsResponse();
        if (kCustomizedEffectsResponse != null && (custom_effects = kCustomizedEffectsResponse.getCustom_effects()) != null) {
            return custom_effects;
        }
        return super.getCustom_effects();
    }

    @Override // com.ss.ugc.effectplatform.model.net.CustomizedEffectsResponse
    public String getMessage() {
        String message;
        com.ss.ugc.effectplatform.model.net.CustomizedEffectsResponse kCustomizedEffectsResponse = getKCustomizedEffectsResponse();
        if (kCustomizedEffectsResponse != null && (message = kCustomizedEffectsResponse.getMessage()) != null) {
            return message;
        }
        return super.getMessage();
    }

    @Override // com.ss.ugc.effectplatform.model.net.CustomizedEffectsResponse
    public int getStatus_code() {
        com.ss.ugc.effectplatform.model.net.CustomizedEffectsResponse kCustomizedEffectsResponse = getKCustomizedEffectsResponse();
        if (kCustomizedEffectsResponse != null) {
            return kCustomizedEffectsResponse.getStatus_code();
        }
        return super.getStatus_code();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CustomizedEffectsResponseTemplate
    public List<Effect> getTemplateEffects() {
        return super.getTemplateEffects();
    }

    @Override // com.ss.ugc.effectplatform.model.net.CustomizedEffectsResponse
    public List<com.ss.ugc.effectplatform.model.Effect> getTemplate_effects() {
        List<com.ss.ugc.effectplatform.model.Effect> template_effects;
        com.ss.ugc.effectplatform.model.net.CustomizedEffectsResponse kCustomizedEffectsResponse = getKCustomizedEffectsResponse();
        if (kCustomizedEffectsResponse != null && (template_effects = kCustomizedEffectsResponse.getTemplate_effects()) != null) {
            return template_effects;
        }
        return super.getTemplate_effects();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CustomizedEffectsResponseTemplate
    public com.ss.ugc.effectplatform.model.net.CustomizedEffectsResponse getKCustomizedEffectsResponse() {
        return this.kCustomizedEffectsResponse;
    }

    public CustomizedEffectsResponse(com.ss.ugc.effectplatform.model.net.CustomizedEffectsResponse customizedEffectsResponse) {
        super(customizedEffectsResponse);
        this.kCustomizedEffectsResponse = customizedEffectsResponse;
        com.ss.ugc.effectplatform.model.net.CustomizedEffectsResponse kCustomizedEffectsResponse = getKCustomizedEffectsResponse();
        if (kCustomizedEffectsResponse != null) {
            List<com.ss.ugc.effectplatform.model.Effect> custom_effects = kCustomizedEffectsResponse.getCustom_effects();
            if (custom_effects != null) {
                super.setCustom_effects(custom_effects);
            }
            String message = kCustomizedEffectsResponse.getMessage();
            if (message != null) {
                super.setMessage(message);
            }
            super.setStatus_code(kCustomizedEffectsResponse.getStatus_code());
            List<com.ss.ugc.effectplatform.model.Effect> template_effects = kCustomizedEffectsResponse.getTemplate_effects();
            if (template_effects != null) {
                super.setTemplate_effects(template_effects);
            }
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CustomizedEffectsResponseTemplate
    public void setCustomEffects(List<? extends Effect> list) {
        super.setCustomEffects(list);
    }

    @Override // com.ss.ugc.effectplatform.model.net.CustomizedEffectsResponse
    public void setCustom_effects(List<? extends com.ss.ugc.effectplatform.model.Effect> list) {
        com.ss.ugc.effectplatform.model.net.CustomizedEffectsResponse kCustomizedEffectsResponse = getKCustomizedEffectsResponse();
        if (kCustomizedEffectsResponse != null) {
            kCustomizedEffectsResponse.setCustom_effects(list);
        }
        super.setCustom_effects(list);
    }

    @Override // com.ss.ugc.effectplatform.model.net.CustomizedEffectsResponse
    public void setMessage(String str) {
        com.ss.ugc.effectplatform.model.net.CustomizedEffectsResponse kCustomizedEffectsResponse = getKCustomizedEffectsResponse();
        if (kCustomizedEffectsResponse != null) {
            kCustomizedEffectsResponse.setMessage(str);
        }
        super.setMessage(str);
    }

    @Override // com.ss.ugc.effectplatform.model.net.CustomizedEffectsResponse
    public void setStatus_code(int i) {
        com.ss.ugc.effectplatform.model.net.CustomizedEffectsResponse kCustomizedEffectsResponse = getKCustomizedEffectsResponse();
        if (kCustomizedEffectsResponse != null) {
            kCustomizedEffectsResponse.setStatus_code(i);
        }
        super.setStatus_code(i);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CustomizedEffectsResponseTemplate
    public void setTemplateEffects(List<? extends Effect> list) {
        super.setTemplateEffects(list);
    }

    @Override // com.ss.ugc.effectplatform.model.net.CustomizedEffectsResponse
    public void setTemplate_effects(List<? extends com.ss.ugc.effectplatform.model.Effect> list) {
        com.ss.ugc.effectplatform.model.net.CustomizedEffectsResponse kCustomizedEffectsResponse = getKCustomizedEffectsResponse();
        if (kCustomizedEffectsResponse != null) {
            kCustomizedEffectsResponse.setTemplate_effects(list);
        }
        super.setTemplate_effects(list);
    }

    public /* synthetic */ CustomizedEffectsResponse(com.ss.ugc.effectplatform.model.net.CustomizedEffectsResponse customizedEffectsResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : customizedEffectsResponse);
    }
}
