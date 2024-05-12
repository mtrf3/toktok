package com.ss.android.ugc.effectmanager.effect.model;

import com.ss.android.ugc.effectmanager.effect.model.template.CategoryPageModelTemplate;
import com.ss.ugc.effectplatform.model.CategoryPageModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class CategoryPageModel extends CategoryPageModelTemplate implements Serializable {
    public final transient com.ss.ugc.effectplatform.model.CategoryPageModel kCategoryPageModel;

    /* JADX WARN: Multi-variable type inference failed */
    public CategoryPageModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryPageModelTemplate
    public CategoryEffectModel getCategoryEffects() {
        return super.getCategoryEffects();
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryPageModel
    public com.ss.ugc.effectplatform.model.CategoryEffectModel getCategory_effects() {
        com.ss.ugc.effectplatform.model.CategoryEffectModel category_effects;
        com.ss.ugc.effectplatform.model.CategoryPageModel kCategoryPageModel = getKCategoryPageModel();
        if (kCategoryPageModel != null && (category_effects = kCategoryPageModel.getCategory_effects()) != null) {
            return category_effects;
        }
        return super.getCategory_effects();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryPageModelTemplate
    public String getRecId() {
        return super.getRecId();
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryPageModel
    public List<String> getUrl_prefix() {
        List<String> url_prefix;
        com.ss.ugc.effectplatform.model.CategoryPageModel kCategoryPageModel = getKCategoryPageModel();
        if (kCategoryPageModel != null && (url_prefix = kCategoryPageModel.getUrl_prefix()) != null) {
            return url_prefix;
        }
        return super.getUrl_prefix();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryPageModelTemplate
    public com.ss.ugc.effectplatform.model.CategoryPageModel getKCategoryPageModel() {
        return this.kCategoryPageModel;
    }

    public CategoryPageModel(com.ss.ugc.effectplatform.model.CategoryPageModel categoryPageModel) {
        super(categoryPageModel);
        this.kCategoryPageModel = categoryPageModel;
        com.ss.ugc.effectplatform.model.CategoryPageModel kCategoryPageModel = getKCategoryPageModel();
        if (kCategoryPageModel != null) {
            com.ss.ugc.effectplatform.model.CategoryEffectModel category_effects = kCategoryPageModel.getCategory_effects();
            if (category_effects != null) {
                super.setCategory_effects(category_effects);
            }
            CategoryPageModel.Extra extra = kCategoryPageModel.getExtra();
            if (extra != null) {
                setExtra(extra);
            }
            setCache(kCategoryPageModel.isCache());
            List<String> url_prefix = kCategoryPageModel.getUrl_prefix();
            if (url_prefix != null) {
                super.setUrl_prefix(url_prefix);
            }
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryPageModelTemplate
    public void setCategoryEffects(CategoryEffectModel categoryEffectModel) {
        super.setCategoryEffects(categoryEffectModel);
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryPageModel
    public void setCategory_effects(com.ss.ugc.effectplatform.model.CategoryEffectModel categoryEffectModel) {
        com.ss.ugc.effectplatform.model.CategoryPageModel kCategoryPageModel = getKCategoryPageModel();
        if (kCategoryPageModel != null) {
            kCategoryPageModel.setCategory_effects(categoryEffectModel);
        }
        super.setCategory_effects(categoryEffectModel);
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryPageModel
    public void setUrl_prefix(List<String> value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.CategoryPageModel kCategoryPageModel = getKCategoryPageModel();
        if (kCategoryPageModel != null) {
            kCategoryPageModel.setUrl_prefix(value);
        }
        super.setUrl_prefix(value);
    }

    public /* synthetic */ CategoryPageModel(com.ss.ugc.effectplatform.model.CategoryPageModel categoryPageModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : categoryPageModel);
    }
}
