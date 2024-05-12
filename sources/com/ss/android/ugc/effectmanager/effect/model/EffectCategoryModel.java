package com.ss.android.ugc.effectmanager.effect.model;

import com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryModelTemplate;
import com.ss.ugc.effectplatform.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class EffectCategoryModel extends EffectCategoryModelTemplate implements Serializable {
    public final transient com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectCategoryModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public List<String> getEffects() {
        List<String> effects;
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel = getKCategoryModel();
        if (kCategoryModel != null && (effects = kCategoryModel.getEffects()) != null) {
            return effects;
        }
        return super.getEffects();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public String getExtra() {
        String extra;
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel = getKCategoryModel();
        if (kCategoryModel != null && (extra = kCategoryModel.getExtra()) != null) {
            return extra;
        }
        return super.getExtra();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public UrlModel getIcon() {
        UrlModel icon;
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel = getKCategoryModel();
        if (kCategoryModel != null && (icon = kCategoryModel.getIcon()) != null) {
            return icon;
        }
        return super.getIcon();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public UrlModel getIcon_selected() {
        UrlModel icon_selected;
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel = getKCategoryModel();
        if (kCategoryModel != null && (icon_selected = kCategoryModel.getIcon_selected()) != null) {
            return icon_selected;
        }
        return super.getIcon_selected();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public String getId() {
        String id;
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel = getKCategoryModel();
        if (kCategoryModel != null && (id = kCategoryModel.getId()) != null) {
            return id;
        }
        return super.getId();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public String getKey() {
        String key;
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel = getKCategoryModel();
        if (kCategoryModel != null && (key = kCategoryModel.getKey()) != null) {
            return key;
        }
        return super.getKey();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public String getName() {
        String name;
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel = getKCategoryModel();
        if (kCategoryModel != null && (name = kCategoryModel.getName()) != null) {
            return name;
        }
        return super.getName();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public List<String> getTags() {
        List<String> tags;
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel = getKCategoryModel();
        if (kCategoryModel != null && (tags = kCategoryModel.getTags()) != null) {
            return tags;
        }
        return super.getTags();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryModelTemplate
    public String getTagsUpdateTime() {
        return super.getTagsUpdateTime();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public String getTags_updated_at() {
        String tags_updated_at;
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel = getKCategoryModel();
        if (kCategoryModel != null && (tags_updated_at = kCategoryModel.getTags_updated_at()) != null) {
            return tags_updated_at;
        }
        return super.getTags_updated_at();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryModelTemplate
    public boolean isDefault() {
        return super.isDefault();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public boolean is_default() {
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel = getKCategoryModel();
        if (kCategoryModel != null) {
            return kCategoryModel.is_default();
        }
        return super.is_default();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryModelTemplate
    public com.ss.ugc.effectplatform.model.EffectCategoryModel getKCategoryModel() {
        return this.kCategoryModel;
    }

    public EffectCategoryModel(com.ss.ugc.effectplatform.model.EffectCategoryModel effectCategoryModel) {
        super(effectCategoryModel);
        this.kCategoryModel = effectCategoryModel;
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel = getKCategoryModel();
        if (kCategoryModel != null) {
            List<String> effects = kCategoryModel.getEffects();
            if (effects != null) {
                super.setEffects(effects);
            }
            String extra = kCategoryModel.getExtra();
            if (extra != null) {
                super.setExtra(extra);
            }
            UrlModel icon = kCategoryModel.getIcon();
            if (icon != null) {
                super.setIcon(icon);
            }
            UrlModel icon_selected = kCategoryModel.getIcon_selected();
            if (icon_selected != null) {
                super.setIcon_selected(icon_selected);
            }
            String id = kCategoryModel.getId();
            if (id != null) {
                super.setId(id);
            }
            super.set_default(kCategoryModel.is_default());
            String key = kCategoryModel.getKey();
            if (key != null) {
                super.setKey(key);
            }
            String name = kCategoryModel.getName();
            if (name != null) {
                super.setName(name);
            }
            List<String> tags = kCategoryModel.getTags();
            if (tags != null) {
                super.setTags(tags);
            }
            String tags_updated_at = kCategoryModel.getTags_updated_at();
            if (tags_updated_at != null) {
                super.setTags_updated_at(tags_updated_at);
            }
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryModelTemplate
    public void setDefault(boolean z) {
        super.setDefault(z);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public void setEffects(List<String> value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel = getKCategoryModel();
        if (kCategoryModel != null) {
            kCategoryModel.setEffects(value);
        }
        super.setEffects(value);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public void setExtra(String str) {
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel = getKCategoryModel();
        if (kCategoryModel != null) {
            kCategoryModel.setExtra(str);
        }
        super.setExtra(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public void setIcon(UrlModel urlModel) {
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel = getKCategoryModel();
        if (kCategoryModel != null) {
            kCategoryModel.setIcon(urlModel);
        }
        super.setIcon(urlModel);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public void setIcon_selected(UrlModel urlModel) {
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel = getKCategoryModel();
        if (kCategoryModel != null) {
            kCategoryModel.setIcon_selected(urlModel);
        }
        super.setIcon_selected(urlModel);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public void setId(String value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel = getKCategoryModel();
        if (kCategoryModel != null) {
            kCategoryModel.setId(value);
        }
        super.setId(value);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryModelTemplate
    public void setIsDefault(boolean z) {
        super.setIsDefault(z);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public void setKey(String value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel = getKCategoryModel();
        if (kCategoryModel != null) {
            kCategoryModel.setKey(value);
        }
        super.setKey(value);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public void setName(String value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel = getKCategoryModel();
        if (kCategoryModel != null) {
            kCategoryModel.setName(value);
        }
        super.setName(value);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public void setTags(List<String> value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel = getKCategoryModel();
        if (kCategoryModel != null) {
            kCategoryModel.setTags(value);
        }
        super.setTags(value);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryModelTemplate
    public void setTagsUpdateTime(String str) {
        super.setTagsUpdateTime(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public void setTags_updated_at(String str) {
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel = getKCategoryModel();
        if (kCategoryModel != null) {
            kCategoryModel.setTags_updated_at(str);
        }
        super.setTags_updated_at(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public void set_default(boolean z) {
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel = getKCategoryModel();
        if (kCategoryModel != null) {
            kCategoryModel.set_default(z);
        }
        super.set_default(z);
    }

    public /* synthetic */ EffectCategoryModel(com.ss.ugc.effectplatform.model.EffectCategoryModel effectCategoryModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : effectCategoryModel);
    }
}
