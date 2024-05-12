package com.ss.android.ugc.effectmanager.effect.model;

import com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class CategoryEffectModel extends CategoryEffectModelTemplate implements Serializable {
    public final transient com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect;

    /* JADX WARN: Multi-variable type inference failed */
    public CategoryEffectModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public List<Effect> getBindEffects() {
        return super.getBindEffects();
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public List<com.ss.ugc.effectplatform.model.Effect> getBind_effects() {
        List<com.ss.ugc.effectplatform.model.Effect> bind_effects;
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect = getKCategoryEffect();
        if (kCategoryEffect != null && (bind_effects = kCategoryEffect.getBind_effects()) != null) {
            return bind_effects;
        }
        return super.getBind_effects();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public String getCategoryKey() {
        return super.getCategoryKey();
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public String getCategory_key() {
        String category_key;
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect = getKCategoryEffect();
        if (kCategoryEffect != null && (category_key = kCategoryEffect.getCategory_key()) != null) {
            return category_key;
        }
        return super.getCategory_key();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public List<Effect> getCollectEffects() {
        return super.getCollectEffects();
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public List<com.ss.ugc.effectplatform.model.Effect> getCollection() {
        List<com.ss.ugc.effectplatform.model.Effect> collection;
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect = getKCategoryEffect();
        if (kCategoryEffect != null && (collection = kCategoryEffect.getCollection()) != null) {
            return collection;
        }
        return super.getCollection();
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public int getCursor() {
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect = getKCategoryEffect();
        if (kCategoryEffect != null) {
            return kCategoryEffect.getCursor();
        }
        return super.getCursor();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public List<Effect> getEffects() {
        return super.getEffects();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public boolean getHasMore() {
        return super.getHasMore();
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public boolean getHas_more() {
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect = getKCategoryEffect();
        if (kCategoryEffect != null) {
            return kCategoryEffect.getHas_more();
        }
        return super.getHas_more();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public int getSortingPosition() {
        return super.getSortingPosition();
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public int getSorting_position() {
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect = getKCategoryEffect();
        if (kCategoryEffect != null) {
            return kCategoryEffect.getSorting_position();
        }
        return super.getSorting_position();
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public String getVersion() {
        String version;
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect = getKCategoryEffect();
        if (kCategoryEffect != null && (version = kCategoryEffect.getVersion()) != null) {
            return version;
        }
        return super.getVersion();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public boolean hasMore() {
        return super.hasMore();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public com.ss.ugc.effectplatform.model.CategoryEffectModel getKCategoryEffect() {
        return this.kCategoryEffect;
    }

    public CategoryEffectModel(com.ss.ugc.effectplatform.model.CategoryEffectModel categoryEffectModel) {
        super(categoryEffectModel);
        this.kCategoryEffect = categoryEffectModel;
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect = getKCategoryEffect();
        if (kCategoryEffect != null) {
            List<com.ss.ugc.effectplatform.model.Effect> bind_effects = kCategoryEffect.getBind_effects();
            if (bind_effects != null) {
                super.setBind_effects(bind_effects);
            }
            List<com.ss.ugc.effectplatform.model.Effect> category_effects = kCategoryEffect.getCategory_effects();
            if (category_effects != null) {
                setCategory_effects(category_effects);
            }
            String category_key = kCategoryEffect.getCategory_key();
            if (category_key != null) {
                super.setCategory_key(category_key);
            }
            List<com.ss.ugc.effectplatform.model.Effect> collection = kCategoryEffect.getCollection();
            if (collection != null) {
                super.setCollection(collection);
            }
            super.setCursor(kCategoryEffect.getCursor());
            super.setHas_more(kCategoryEffect.getHas_more());
            setCache(kCategoryEffect.isCache());
            super.setSorting_position(kCategoryEffect.getSorting_position());
            String version = kCategoryEffect.getVersion();
            if (version != null) {
                super.setVersion(version);
            }
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public void setBindEffects(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        super.setBindEffects(value);
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public void setBind_effects(List<? extends com.ss.ugc.effectplatform.model.Effect> value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect = getKCategoryEffect();
        if (kCategoryEffect != null) {
            kCategoryEffect.setBind_effects(value);
        }
        super.setBind_effects(value);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public void setCategoryKey(String value) {
        o.LJIIJ(value, "value");
        super.setCategoryKey(value);
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public void setCategory_key(String value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect = getKCategoryEffect();
        if (kCategoryEffect != null) {
            kCategoryEffect.setCategory_key(value);
        }
        super.setCategory_key(value);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public void setCollectEffects(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        super.setCollectEffects(value);
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public void setCollection(List<? extends com.ss.ugc.effectplatform.model.Effect> value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect = getKCategoryEffect();
        if (kCategoryEffect != null) {
            kCategoryEffect.setCollection(value);
        }
        super.setCollection(value);
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public void setCursor(int i) {
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect = getKCategoryEffect();
        if (kCategoryEffect != null) {
            kCategoryEffect.setCursor(i);
        }
        super.setCursor(i);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public void setEffects(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        super.setEffects(value);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public void setHasMore(boolean z) {
        super.setHasMore(z);
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public void setHas_more(boolean z) {
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect = getKCategoryEffect();
        if (kCategoryEffect != null) {
            kCategoryEffect.setHas_more(z);
        }
        super.setHas_more(z);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public void setSortingPosition(int i) {
        super.setSortingPosition(i);
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public void setSorting_position(int i) {
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect = getKCategoryEffect();
        if (kCategoryEffect != null) {
            kCategoryEffect.setSorting_position(i);
        }
        super.setSorting_position(i);
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public void setVersion(String value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect = getKCategoryEffect();
        if (kCategoryEffect != null) {
            kCategoryEffect.setVersion(value);
        }
        super.setVersion(value);
    }

    public /* synthetic */ CategoryEffectModel(com.ss.ugc.effectplatform.model.CategoryEffectModel categoryEffectModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : categoryEffectModel);
    }
}
