package com.ss.android.ugc.effectmanager.effect.model;

import com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate;
import com.ss.ugc.effectplatform.model.EffectChannelModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class EffectChannelModel extends EffectChannelModelTemplate implements Serializable {
    public final transient com.ss.ugc.effectplatform.model.EffectChannelModel kChannelModel;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectChannelModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate
    public List<EffectCategoryModel> getCategory() {
        return super.getCategory();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate
    public List<Effect> getCollection() {
        return super.getCollection();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate
    public List<Effect> getEffects() {
        return super.getEffects();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelModel
    public String getFront_effect_id() {
        String front_effect_id;
        com.ss.ugc.effectplatform.model.EffectChannelModel kChannelModel = getKChannelModel();
        if (kChannelModel != null && (front_effect_id = kChannelModel.getFront_effect_id()) != null) {
            return front_effect_id;
        }
        return super.getFront_effect_id();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate
    public EffectPanelModel getPanel() {
        return super.getPanel();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelModel
    public String getRear_effect_id() {
        String rear_effect_id;
        com.ss.ugc.effectplatform.model.EffectChannelModel kChannelModel = getKChannelModel();
        if (kChannelModel != null && (rear_effect_id = kChannelModel.getRear_effect_id()) != null) {
            return rear_effect_id;
        }
        return super.getRear_effect_id();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate
    public List<String> getUrlPrefix() {
        return super.getUrlPrefix();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelModel
    public List<String> getUrl_prefix() {
        List<String> url_prefix;
        com.ss.ugc.effectplatform.model.EffectChannelModel kChannelModel = getKChannelModel();
        if (kChannelModel != null && (url_prefix = kChannelModel.getUrl_prefix()) != null) {
            return url_prefix;
        }
        return super.getUrl_prefix();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelModel
    public String getVersion() {
        String version;
        com.ss.ugc.effectplatform.model.EffectChannelModel kChannelModel = getKChannelModel();
        if (kChannelModel != null && (version = kChannelModel.getVersion()) != null) {
            return version;
        }
        return super.getVersion();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate
    public com.ss.ugc.effectplatform.model.EffectChannelModel getKChannelModel() {
        return this.kChannelModel;
    }

    public EffectChannelModel(com.ss.ugc.effectplatform.model.EffectChannelModel effectChannelModel) {
        super(effectChannelModel);
        this.kChannelModel = effectChannelModel;
        com.ss.ugc.effectplatform.model.EffectChannelModel kChannelModel = getKChannelModel();
        if (kChannelModel != null) {
            List<com.ss.ugc.effectplatform.model.EffectCategoryModel> category_list = kChannelModel.getCategory_list();
            if (category_list != null) {
                setCategory_list(category_list);
            }
            List<com.ss.ugc.effectplatform.model.Effect> collection_list = kChannelModel.getCollection_list();
            if (collection_list != null) {
                setCollection_list(collection_list);
            }
            List<com.ss.ugc.effectplatform.model.Effect> effect_list = kChannelModel.getEffect_list();
            if (effect_list != null) {
                setEffect_list(effect_list);
            }
            EffectChannelModel.Extra extra = kChannelModel.getExtra();
            if (extra != null) {
                setExtra(extra);
            }
            String front_effect_id = kChannelModel.getFront_effect_id();
            if (front_effect_id != null) {
                super.setFront_effect_id(front_effect_id);
            }
            com.ss.ugc.effectplatform.model.EffectPanelModel panel_model = kChannelModel.getPanel_model();
            if (panel_model != null) {
                setPanel_model(panel_model);
            }
            String rear_effect_id = kChannelModel.getRear_effect_id();
            if (rear_effect_id != null) {
                super.setRear_effect_id(rear_effect_id);
            }
            List<String> url_prefix = kChannelModel.getUrl_prefix();
            if (url_prefix != null) {
                super.setUrl_prefix(url_prefix);
            }
            String version = kChannelModel.getVersion();
            if (version != null) {
                super.setVersion(version);
            }
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate
    public void setCategory(List<EffectCategoryModel> value) {
        o.LJIIJ(value, "value");
        super.setCategory(value);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate
    public void setCollection(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        super.setCollection(value);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate
    public void setEffects(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        super.setEffects(value);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelModel
    public void setFront_effect_id(String str) {
        com.ss.ugc.effectplatform.model.EffectChannelModel kChannelModel = getKChannelModel();
        if (kChannelModel != null) {
            kChannelModel.setFront_effect_id(str);
        }
        super.setFront_effect_id(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate
    public void setPanel(EffectPanelModel value) {
        o.LJIIJ(value, "value");
        super.setPanel(value);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelModel
    public void setRear_effect_id(String str) {
        com.ss.ugc.effectplatform.model.EffectChannelModel kChannelModel = getKChannelModel();
        if (kChannelModel != null) {
            kChannelModel.setRear_effect_id(str);
        }
        super.setRear_effect_id(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate
    public void setUrlPrefix(List<String> value) {
        o.LJIIJ(value, "value");
        super.setUrlPrefix(value);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelModel
    public void setUrl_prefix(List<String> value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.EffectChannelModel kChannelModel = getKChannelModel();
        if (kChannelModel != null) {
            kChannelModel.setUrl_prefix(value);
        }
        super.setUrl_prefix(value);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelModel
    public void setVersion(String str) {
        com.ss.ugc.effectplatform.model.EffectChannelModel kChannelModel = getKChannelModel();
        if (kChannelModel != null) {
            kChannelModel.setVersion(str);
        }
        super.setVersion(str);
    }

    public /* synthetic */ EffectChannelModel(com.ss.ugc.effectplatform.model.EffectChannelModel effectChannelModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : effectChannelModel);
    }
}
