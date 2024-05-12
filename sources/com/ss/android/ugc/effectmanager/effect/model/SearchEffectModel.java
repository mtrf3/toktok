package com.ss.android.ugc.effectmanager.effect.model;

import com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectModelTemplate;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class SearchEffectModel extends SearchEffectModelTemplate implements Serializable {
    public final transient com.ss.ugc.effectplatform.model.net.SearchEffectModel kSearchEffectModel;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchEffectModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectModelTemplate
    public List<Effect> getBindEffects() {
        return super.getBindEffects();
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectModel
    public List<com.ss.ugc.effectplatform.model.Effect> getBind_effects() {
        List<com.ss.ugc.effectplatform.model.Effect> bind_effects;
        com.ss.ugc.effectplatform.model.net.SearchEffectModel kSearchEffectModel = getKSearchEffectModel();
        if (kSearchEffectModel != null && (bind_effects = kSearchEffectModel.getBind_effects()) != null) {
            return bind_effects;
        }
        return super.getBind_effects();
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectModel
    public List<com.ss.ugc.effectplatform.model.Effect> getCollection() {
        List<com.ss.ugc.effectplatform.model.Effect> collection;
        com.ss.ugc.effectplatform.model.net.SearchEffectModel kSearchEffectModel = getKSearchEffectModel();
        if (kSearchEffectModel != null && (collection = kSearchEffectModel.getCollection()) != null) {
            return collection;
        }
        return super.getCollection();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectModelTemplate
    public List<Effect> getCollectionList() {
        return super.getCollectionList();
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectModel
    public int getCursor() {
        com.ss.ugc.effectplatform.model.net.SearchEffectModel kSearchEffectModel = getKSearchEffectModel();
        if (kSearchEffectModel != null) {
            return kSearchEffectModel.getCursor();
        }
        return super.getCursor();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectModelTemplate
    public List<Effect> getEffectList() {
        return super.getEffectList();
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectModel
    public List<com.ss.ugc.effectplatform.model.Effect> getEffects() {
        List<com.ss.ugc.effectplatform.model.Effect> effects;
        com.ss.ugc.effectplatform.model.net.SearchEffectModel kSearchEffectModel = getKSearchEffectModel();
        if (kSearchEffectModel != null && (effects = kSearchEffectModel.getEffects()) != null) {
            return effects;
        }
        return super.getEffects();
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectModel
    public boolean getHas_more() {
        com.ss.ugc.effectplatform.model.net.SearchEffectModel kSearchEffectModel = getKSearchEffectModel();
        if (kSearchEffectModel != null) {
            return kSearchEffectModel.getHas_more();
        }
        return super.getHas_more();
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectModel
    public String getSearch_id() {
        String search_id;
        com.ss.ugc.effectplatform.model.net.SearchEffectModel kSearchEffectModel = getKSearchEffectModel();
        if (kSearchEffectModel != null && (search_id = kSearchEffectModel.getSearch_id()) != null) {
            return search_id;
        }
        return super.getSearch_id();
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectModel
    public String getSearch_tips() {
        String search_tips;
        com.ss.ugc.effectplatform.model.net.SearchEffectModel kSearchEffectModel = getKSearchEffectModel();
        if (kSearchEffectModel != null && (search_tips = kSearchEffectModel.getSearch_tips()) != null) {
            return search_tips;
        }
        return super.getSearch_tips();
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectModel
    public Boolean getUse_hot() {
        Boolean use_hot;
        com.ss.ugc.effectplatform.model.net.SearchEffectModel kSearchEffectModel = getKSearchEffectModel();
        if (kSearchEffectModel != null && (use_hot = kSearchEffectModel.getUse_hot()) != null) {
            return use_hot;
        }
        return super.getUse_hot();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectModelTemplate
    public com.ss.ugc.effectplatform.model.net.SearchEffectModel getKSearchEffectModel() {
        return this.kSearchEffectModel;
    }

    public SearchEffectModel(com.ss.ugc.effectplatform.model.net.SearchEffectModel searchEffectModel) {
        super(searchEffectModel);
        this.kSearchEffectModel = searchEffectModel;
        com.ss.ugc.effectplatform.model.net.SearchEffectModel kSearchEffectModel = getKSearchEffectModel();
        if (kSearchEffectModel != null) {
            List<com.ss.ugc.effectplatform.model.Effect> bind_effects = kSearchEffectModel.getBind_effects();
            if (bind_effects != null) {
                super.setBind_effects(bind_effects);
            }
            List<com.ss.ugc.effectplatform.model.Effect> collection = kSearchEffectModel.getCollection();
            if (collection != null) {
                super.setCollection(collection);
            }
            super.setCursor(kSearchEffectModel.getCursor());
            List<com.ss.ugc.effectplatform.model.Effect> effects = kSearchEffectModel.getEffects();
            if (effects != null) {
                super.setEffects(effects);
            }
            super.setHas_more(kSearchEffectModel.getHas_more());
            String search_id = kSearchEffectModel.getSearch_id();
            if (search_id != null) {
                super.setSearch_id(search_id);
            }
            String search_tips = kSearchEffectModel.getSearch_tips();
            if (search_tips != null) {
                super.setSearch_tips(search_tips);
            }
            Boolean use_hot = kSearchEffectModel.getUse_hot();
            if (use_hot != null) {
                super.setUse_hot(Boolean.valueOf(use_hot.booleanValue()));
            }
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectModelTemplate
    public void setBindEffects(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        super.setBindEffects(value);
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectModel
    public void setBind_effects(List<? extends com.ss.ugc.effectplatform.model.Effect> list) {
        com.ss.ugc.effectplatform.model.net.SearchEffectModel kSearchEffectModel = getKSearchEffectModel();
        if (kSearchEffectModel != null) {
            kSearchEffectModel.setBind_effects(list);
        }
        super.setBind_effects(list);
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectModel
    public void setCollection(List<? extends com.ss.ugc.effectplatform.model.Effect> list) {
        com.ss.ugc.effectplatform.model.net.SearchEffectModel kSearchEffectModel = getKSearchEffectModel();
        if (kSearchEffectModel != null) {
            kSearchEffectModel.setCollection(list);
        }
        super.setCollection(list);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectModelTemplate
    public void setCollectionList(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        super.setCollectionList(value);
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectModel
    public void setCursor(int i) {
        com.ss.ugc.effectplatform.model.net.SearchEffectModel kSearchEffectModel = getKSearchEffectModel();
        if (kSearchEffectModel != null) {
            kSearchEffectModel.setCursor(i);
        }
        super.setCursor(i);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectModelTemplate
    public void setEffectList(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        super.setEffectList(value);
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectModel
    public void setEffects(List<? extends com.ss.ugc.effectplatform.model.Effect> list) {
        com.ss.ugc.effectplatform.model.net.SearchEffectModel kSearchEffectModel = getKSearchEffectModel();
        if (kSearchEffectModel != null) {
            kSearchEffectModel.setEffects(list);
        }
        super.setEffects(list);
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectModel
    public void setHas_more(boolean z) {
        com.ss.ugc.effectplatform.model.net.SearchEffectModel kSearchEffectModel = getKSearchEffectModel();
        if (kSearchEffectModel != null) {
            kSearchEffectModel.setHas_more(z);
        }
        super.setHas_more(z);
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectModel
    public void setSearch_id(String str) {
        com.ss.ugc.effectplatform.model.net.SearchEffectModel kSearchEffectModel = getKSearchEffectModel();
        if (kSearchEffectModel != null) {
            kSearchEffectModel.setSearch_id(str);
        }
        super.setSearch_id(str);
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectModel
    public void setSearch_tips(String str) {
        com.ss.ugc.effectplatform.model.net.SearchEffectModel kSearchEffectModel = getKSearchEffectModel();
        if (kSearchEffectModel != null) {
            kSearchEffectModel.setSearch_tips(str);
        }
        super.setSearch_tips(str);
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectModel
    public void setUse_hot(Boolean bool) {
        com.ss.ugc.effectplatform.model.net.SearchEffectModel kSearchEffectModel = getKSearchEffectModel();
        if (kSearchEffectModel != null) {
            kSearchEffectModel.setUse_hot(bool);
        }
        super.setUse_hot(bool);
    }

    public /* synthetic */ SearchEffectModel(com.ss.ugc.effectplatform.model.net.SearchEffectModel searchEffectModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : searchEffectModel);
    }
}
