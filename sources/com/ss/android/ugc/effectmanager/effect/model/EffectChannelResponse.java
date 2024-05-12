package com.ss.android.ugc.effectmanager.effect.model;

import com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class EffectChannelResponse extends EffectChannelResponseTemplate implements Serializable {
    public final transient com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectChannelResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public List<Effect> getAllCategoryEffects() {
        return super.getAllCategoryEffects();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public List<com.ss.ugc.effectplatform.model.Effect> getAll_category_effects() {
        List<com.ss.ugc.effectplatform.model.Effect> all_category_effects;
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse = getKChannelResponse();
        if (kChannelResponse != null && (all_category_effects = kChannelResponse.getAll_category_effects()) != null) {
            return all_category_effects;
        }
        return super.getAll_category_effects();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public List<EffectCategoryResponse> getCategoryResponseList() {
        return super.getCategoryResponseList();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public List<com.ss.ugc.effectplatform.model.EffectCategoryResponse> getCategory_responses() {
        List<com.ss.ugc.effectplatform.model.EffectCategoryResponse> category_responses;
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse = getKChannelResponse();
        if (kChannelResponse != null && (category_responses = kChannelResponse.getCategory_responses()) != null) {
            return category_responses;
        }
        return super.getCategory_responses();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public List<com.ss.ugc.effectplatform.model.Effect> getCollection_list() {
        List<com.ss.ugc.effectplatform.model.Effect> collection_list;
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse = getKChannelResponse();
        if (kChannelResponse != null && (collection_list = kChannelResponse.getCollection_list()) != null) {
            return collection_list;
        }
        return super.getCollection_list();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public List<Effect> getCollections() {
        return super.getCollections();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public Effect getFrontEffect() {
        return super.getFrontEffect();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public com.ss.ugc.effectplatform.model.Effect getFront_effect() {
        com.ss.ugc.effectplatform.model.Effect front_effect;
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse = getKChannelResponse();
        if (kChannelResponse != null && (front_effect = kChannelResponse.getFront_effect()) != null) {
            return front_effect;
        }
        return super.getFront_effect();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public String getPanel() {
        String panel;
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse = getKChannelResponse();
        if (kChannelResponse != null && (panel = kChannelResponse.getPanel()) != null) {
            return panel;
        }
        return super.getPanel();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public EffectPanelModel getPanelModel() {
        return super.getPanelModel();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public com.ss.ugc.effectplatform.model.EffectPanelModel getPanel_model() {
        com.ss.ugc.effectplatform.model.EffectPanelModel panel_model;
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse = getKChannelResponse();
        if (kChannelResponse != null && (panel_model = kChannelResponse.getPanel_model()) != null) {
            return panel_model;
        }
        return super.getPanel_model();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public Effect getRearEffect() {
        return super.getRearEffect();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public com.ss.ugc.effectplatform.model.Effect getRear_effect() {
        com.ss.ugc.effectplatform.model.Effect rear_effect;
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse = getKChannelResponse();
        if (kChannelResponse != null && (rear_effect = kChannelResponse.getRear_effect()) != null) {
            return rear_effect;
        }
        return super.getRear_effect();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public List<String> getUrlPrefix() {
        return super.getUrlPrefix();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public List<String> getUrl_prefix() {
        List<String> url_prefix;
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse = getKChannelResponse();
        if (kChannelResponse != null && (url_prefix = kChannelResponse.getUrl_prefix()) != null) {
            return url_prefix;
        }
        return super.getUrl_prefix();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public String getVersion() {
        String version;
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse = getKChannelResponse();
        if (kChannelResponse != null && (version = kChannelResponse.getVersion()) != null) {
            return version;
        }
        return super.getVersion();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public com.ss.ugc.effectplatform.model.EffectChannelResponse getKChannelResponse() {
        return this.kChannelResponse;
    }

    public EffectChannelResponse(com.ss.ugc.effectplatform.model.EffectChannelResponse effectChannelResponse) {
        super(effectChannelResponse);
        this.kChannelResponse = effectChannelResponse;
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse = getKChannelResponse();
        if (kChannelResponse != null) {
            List<com.ss.ugc.effectplatform.model.Effect> all_category_effects = kChannelResponse.getAll_category_effects();
            if (all_category_effects != null) {
                super.setAll_category_effects(all_category_effects);
            }
            List<com.ss.ugc.effectplatform.model.EffectCategoryResponse> category_responses = kChannelResponse.getCategory_responses();
            if (category_responses != null) {
                super.setCategory_responses(category_responses);
            }
            List<com.ss.ugc.effectplatform.model.Effect> collection_list = kChannelResponse.getCollection_list();
            if (collection_list != null) {
                super.setCollection_list(collection_list);
            }
            com.ss.ugc.effectplatform.model.Effect front_effect = kChannelResponse.getFront_effect();
            if (front_effect != null) {
                super.setFront_effect(front_effect);
            }
            String panel = kChannelResponse.getPanel();
            if (panel != null) {
                super.setPanel(panel);
            }
            com.ss.ugc.effectplatform.model.EffectPanelModel panel_model = kChannelResponse.getPanel_model();
            if (panel_model != null) {
                super.setPanel_model(panel_model);
            }
            com.ss.ugc.effectplatform.model.Effect rear_effect = kChannelResponse.getRear_effect();
            if (rear_effect != null) {
                super.setRear_effect(rear_effect);
            }
            List<String> url_prefix = kChannelResponse.getUrl_prefix();
            if (url_prefix != null) {
                super.setUrl_prefix(url_prefix);
            }
            String version = kChannelResponse.getVersion();
            if (version != null) {
                super.setVersion(version);
            }
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public void setAllCategoryEffects(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        super.setAllCategoryEffects(value);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public void setAll_category_effects(List<? extends com.ss.ugc.effectplatform.model.Effect> value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse = getKChannelResponse();
        if (kChannelResponse != null) {
            kChannelResponse.setAll_category_effects(value);
        }
        super.setAll_category_effects(value);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public void setCategoryResponseList(List<EffectCategoryResponse> value) {
        o.LJIIJ(value, "value");
        super.setCategoryResponseList(value);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public void setCategory_responses(List<? extends com.ss.ugc.effectplatform.model.EffectCategoryResponse> value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse = getKChannelResponse();
        if (kChannelResponse != null) {
            kChannelResponse.setCategory_responses(value);
        }
        super.setCategory_responses(value);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public void setCollection_list(List<? extends com.ss.ugc.effectplatform.model.Effect> value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse = getKChannelResponse();
        if (kChannelResponse != null) {
            kChannelResponse.setCollection_list(value);
        }
        super.setCollection_list(value);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public void setCollections(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        super.setCollections(value);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public void setFrontEffect(Effect effect) {
        super.setFrontEffect(effect);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public void setFront_effect(com.ss.ugc.effectplatform.model.Effect effect) {
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse = getKChannelResponse();
        if (kChannelResponse != null) {
            kChannelResponse.setFront_effect(effect);
        }
        super.setFront_effect(effect);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public void setPanel(String str) {
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse = getKChannelResponse();
        if (kChannelResponse != null) {
            kChannelResponse.setPanel(str);
        }
        super.setPanel(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public void setPanelModel(EffectPanelModel value) {
        o.LJIIJ(value, "value");
        super.setPanelModel(value);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public void setPanel_model(com.ss.ugc.effectplatform.model.EffectPanelModel value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse = getKChannelResponse();
        if (kChannelResponse != null) {
            kChannelResponse.setPanel_model(value);
        }
        super.setPanel_model(value);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public void setRearEffect(Effect effect) {
        super.setRearEffect(effect);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public void setRear_effect(com.ss.ugc.effectplatform.model.Effect effect) {
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse = getKChannelResponse();
        if (kChannelResponse != null) {
            kChannelResponse.setRear_effect(effect);
        }
        super.setRear_effect(effect);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public void setUrlPrefix(List<String> value) {
        o.LJIIJ(value, "value");
        super.setUrlPrefix(value);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public void setUrl_prefix(List<String> value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse = getKChannelResponse();
        if (kChannelResponse != null) {
            kChannelResponse.setUrl_prefix(value);
        }
        super.setUrl_prefix(value);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public void setVersion(String str) {
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse = getKChannelResponse();
        if (kChannelResponse != null) {
            kChannelResponse.setVersion(str);
        }
        super.setVersion(str);
    }

    public /* synthetic */ EffectChannelResponse(com.ss.ugc.effectplatform.model.EffectChannelResponse effectChannelResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : effectChannelResponse);
    }
}
