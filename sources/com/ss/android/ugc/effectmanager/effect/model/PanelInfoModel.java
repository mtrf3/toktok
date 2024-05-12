package com.ss.android.ugc.effectmanager.effect.model;

import com.ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate;
import com.ss.ugc.effectplatform.model.PanelInfoModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class PanelInfoModel extends PanelInfoModelTemplate implements Serializable {
    public final transient com.ss.ugc.effectplatform.model.PanelInfoModel kPanelModel;

    /* JADX WARN: Multi-variable type inference failed */
    public PanelInfoModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate
    public CategoryEffectModel getCategoryEffectModel() {
        return super.getCategoryEffectModel();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate
    public List<EffectCategoryModel> getCategoryList() {
        return super.getCategoryList();
    }

    @Override // com.ss.ugc.effectplatform.model.PanelInfoModel
    public com.ss.ugc.effectplatform.model.CategoryEffectModel getCategory_effects() {
        com.ss.ugc.effectplatform.model.CategoryEffectModel category_effects;
        com.ss.ugc.effectplatform.model.PanelInfoModel kPanelModel = getKPanelModel();
        if (kPanelModel != null && (category_effects = kPanelModel.getCategory_effects()) != null) {
            return category_effects;
        }
        return super.getCategory_effects();
    }

    @Override // com.ss.ugc.effectplatform.model.PanelInfoModel
    public List<com.ss.ugc.effectplatform.model.EffectCategoryModel> getCategory_list() {
        List<com.ss.ugc.effectplatform.model.EffectCategoryModel> category_list;
        com.ss.ugc.effectplatform.model.PanelInfoModel kPanelModel = getKPanelModel();
        if (kPanelModel != null && (category_list = kPanelModel.getCategory_list()) != null) {
            return category_list;
        }
        return super.getCategory_list();
    }

    @Override // com.ss.ugc.effectplatform.model.PanelInfoModel
    public String getFront_effect_id() {
        String front_effect_id;
        com.ss.ugc.effectplatform.model.PanelInfoModel kPanelModel = getKPanelModel();
        if (kPanelModel != null && (front_effect_id = kPanelModel.getFront_effect_id()) != null) {
            return front_effect_id;
        }
        return super.getFront_effect_id();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate
    public EffectPanelModel getPanel() {
        return super.getPanel();
    }

    @Override // com.ss.ugc.effectplatform.model.PanelInfoModel
    public String getRear_effect_id() {
        String rear_effect_id;
        com.ss.ugc.effectplatform.model.PanelInfoModel kPanelModel = getKPanelModel();
        if (kPanelModel != null && (rear_effect_id = kPanelModel.getRear_effect_id()) != null) {
            return rear_effect_id;
        }
        return super.getRear_effect_id();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate
    public String getRecID() {
        return super.getRecID();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate
    public List<String> getUrlPrefix() {
        return super.getUrlPrefix();
    }

    @Override // com.ss.ugc.effectplatform.model.PanelInfoModel
    public List<String> getUrl_prefix() {
        List<String> url_prefix;
        com.ss.ugc.effectplatform.model.PanelInfoModel kPanelModel = getKPanelModel();
        if (kPanelModel != null && (url_prefix = kPanelModel.getUrl_prefix()) != null) {
            return url_prefix;
        }
        return super.getUrl_prefix();
    }

    @Override // com.ss.ugc.effectplatform.model.PanelInfoModel
    public String getVersion() {
        String version;
        com.ss.ugc.effectplatform.model.PanelInfoModel kPanelModel = getKPanelModel();
        if (kPanelModel != null && (version = kPanelModel.getVersion()) != null) {
            return version;
        }
        return super.getVersion();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate
    public com.ss.ugc.effectplatform.model.PanelInfoModel getKPanelModel() {
        return this.kPanelModel;
    }

    public PanelInfoModel(com.ss.ugc.effectplatform.model.PanelInfoModel panelInfoModel) {
        super(panelInfoModel);
        this.kPanelModel = panelInfoModel;
        com.ss.ugc.effectplatform.model.PanelInfoModel kPanelModel = getKPanelModel();
        if (kPanelModel != null) {
            com.ss.ugc.effectplatform.model.CategoryEffectModel category_effects = kPanelModel.getCategory_effects();
            if (category_effects != null) {
                super.setCategory_effects(category_effects);
            }
            List<com.ss.ugc.effectplatform.model.EffectCategoryModel> category_list = kPanelModel.getCategory_list();
            if (category_list != null) {
                super.setCategory_list(category_list);
            }
            com.ss.ugc.effectplatform.model.EffectPanelModel effect_panel = kPanelModel.getEffect_panel();
            if (effect_panel != null) {
                setEffect_panel(effect_panel);
            }
            PanelInfoModel.Extra extra = kPanelModel.getExtra();
            if (extra != null) {
                setExtra(extra);
            }
            String front_effect_id = kPanelModel.getFront_effect_id();
            if (front_effect_id != null) {
                super.setFront_effect_id(front_effect_id);
            }
            String rear_effect_id = kPanelModel.getRear_effect_id();
            if (rear_effect_id != null) {
                super.setRear_effect_id(rear_effect_id);
            }
            List<String> url_prefix = kPanelModel.getUrl_prefix();
            if (url_prefix != null) {
                super.setUrl_prefix(url_prefix);
            }
            String version = kPanelModel.getVersion();
            if (version != null) {
                super.setVersion(version);
            }
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate
    public void setCategoryEffectModel(CategoryEffectModel categoryEffectModel) {
        super.setCategoryEffectModel(categoryEffectModel);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate
    public void setCategoryList(List<EffectCategoryModel> value) {
        o.LJIIJ(value, "value");
        super.setCategoryList(value);
    }

    @Override // com.ss.ugc.effectplatform.model.PanelInfoModel
    public void setCategory_effects(com.ss.ugc.effectplatform.model.CategoryEffectModel categoryEffectModel) {
        com.ss.ugc.effectplatform.model.PanelInfoModel kPanelModel = getKPanelModel();
        if (kPanelModel != null) {
            kPanelModel.setCategory_effects(categoryEffectModel);
        }
        super.setCategory_effects(categoryEffectModel);
    }

    @Override // com.ss.ugc.effectplatform.model.PanelInfoModel
    public void setCategory_list(List<? extends com.ss.ugc.effectplatform.model.EffectCategoryModel> value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.PanelInfoModel kPanelModel = getKPanelModel();
        if (kPanelModel != null) {
            kPanelModel.setCategory_list(value);
        }
        super.setCategory_list(value);
    }

    @Override // com.ss.ugc.effectplatform.model.PanelInfoModel
    public void setFront_effect_id(String str) {
        com.ss.ugc.effectplatform.model.PanelInfoModel kPanelModel = getKPanelModel();
        if (kPanelModel != null) {
            kPanelModel.setFront_effect_id(str);
        }
        super.setFront_effect_id(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate
    public void setPanel(EffectPanelModel effectPanelModel) {
        super.setPanel(effectPanelModel);
    }

    @Override // com.ss.ugc.effectplatform.model.PanelInfoModel
    public void setRear_effect_id(String str) {
        com.ss.ugc.effectplatform.model.PanelInfoModel kPanelModel = getKPanelModel();
        if (kPanelModel != null) {
            kPanelModel.setRear_effect_id(str);
        }
        super.setRear_effect_id(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate
    public void setUrlPrefix(List<String> value) {
        o.LJIIJ(value, "value");
        super.setUrlPrefix(value);
    }

    @Override // com.ss.ugc.effectplatform.model.PanelInfoModel
    public void setUrl_prefix(List<String> value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.PanelInfoModel kPanelModel = getKPanelModel();
        if (kPanelModel != null) {
            kPanelModel.setUrl_prefix(value);
        }
        super.setUrl_prefix(value);
    }

    @Override // com.ss.ugc.effectplatform.model.PanelInfoModel
    public void setVersion(String value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.PanelInfoModel kPanelModel = getKPanelModel();
        if (kPanelModel != null) {
            kPanelModel.setVersion(value);
        }
        super.setVersion(value);
    }

    public /* synthetic */ PanelInfoModel(com.ss.ugc.effectplatform.model.PanelInfoModel panelInfoModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : panelInfoModel);
    }
}
