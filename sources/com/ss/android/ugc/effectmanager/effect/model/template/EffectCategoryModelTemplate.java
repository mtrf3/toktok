package com.ss.android.ugc.effectmanager.effect.model.template;

import com.ss.ugc.effectplatform.model.EffectCategoryModel;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public class EffectCategoryModelTemplate extends EffectCategoryModel {
    public boolean isDefault;
    public final transient EffectCategoryModel kCategoryModel;
    public String tagsUpdateTime;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectCategoryModelTemplate() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public String getTagsUpdateTime() {
        String tags_updated_at;
        EffectCategoryModel kCategoryModel = getKCategoryModel();
        if (kCategoryModel != null && (tags_updated_at = kCategoryModel.getTags_updated_at()) != null) {
            return tags_updated_at;
        }
        return super.getTags_updated_at();
    }

    public boolean isDefault() {
        EffectCategoryModel kCategoryModel = getKCategoryModel();
        if (kCategoryModel != null) {
            return kCategoryModel.is_default();
        }
        return super.is_default();
    }

    public EffectCategoryModel getKCategoryModel() {
        return this.kCategoryModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EffectCategoryModelTemplate(EffectCategoryModel effectCategoryModel) {
        super(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 1023, 0 == true ? 1 : 0);
        this.kCategoryModel = effectCategoryModel;
    }

    public void setDefault(boolean z) {
        this.isDefault = z;
        EffectCategoryModel kCategoryModel = getKCategoryModel();
        if (kCategoryModel != null) {
            kCategoryModel.set_default(z);
        }
        super.set_default(z);
    }

    public void setIsDefault(boolean z) {
        EffectCategoryModel kCategoryModel = getKCategoryModel();
        if (kCategoryModel != null) {
            kCategoryModel.set_default(is_default());
        }
        super.set_default(is_default());
    }

    public void setTagsUpdateTime(String str) {
        this.tagsUpdateTime = str;
        EffectCategoryModel kCategoryModel = getKCategoryModel();
        if (kCategoryModel != null) {
            kCategoryModel.setTags_updated_at(str);
        }
        super.setTags_updated_at(str);
    }

    public /* synthetic */ EffectCategoryModelTemplate(EffectCategoryModel effectCategoryModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : effectCategoryModel);
    }
}
