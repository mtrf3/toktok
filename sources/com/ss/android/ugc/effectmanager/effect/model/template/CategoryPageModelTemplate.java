package com.ss.android.ugc.effectmanager.effect.model.template;

import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.ugc.effectplatform.model.CategoryPageModel;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public class CategoryPageModelTemplate extends CategoryPageModel {
    public CategoryEffectModel categoryEffects;
    public final transient CategoryPageModel kCategoryPageModel;

    /* JADX WARN: Multi-variable type inference failed */
    public CategoryPageModelTemplate() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public CategoryEffectModel getCategoryEffects() {
        com.ss.ugc.effectplatform.model.CategoryEffectModel category_effects;
        CategoryPageModel kCategoryPageModel = getKCategoryPageModel();
        if (kCategoryPageModel == null || (category_effects = kCategoryPageModel.getCategory_effects()) == null) {
            category_effects = super.getCategory_effects();
        }
        return new CategoryEffectModel(category_effects);
    }

    public String getRecId() {
        CategoryPageModel.Extra extra = getExtra();
        if (extra != null) {
            return extra.getRec_id();
        }
        return null;
    }

    public CategoryPageModel getKCategoryPageModel() {
        return this.kCategoryPageModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CategoryPageModelTemplate(CategoryPageModel categoryPageModel) {
        super(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        this.kCategoryPageModel = categoryPageModel;
    }

    public void setCategoryEffects(CategoryEffectModel categoryEffectModel) {
        this.categoryEffects = categoryEffectModel;
        CategoryPageModel kCategoryPageModel = getKCategoryPageModel();
        if (kCategoryPageModel != null) {
            kCategoryPageModel.setCategory_effects(categoryEffectModel);
        }
        super.setCategory_effects(categoryEffectModel);
    }

    public /* synthetic */ CategoryPageModelTemplate(CategoryPageModel categoryPageModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : categoryPageModel);
    }
}
