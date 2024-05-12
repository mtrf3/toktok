package com.ss.android.ugc.effectmanager.effect.model;

import com.ss.android.ugc.effectmanager.effect.model.template.EffectPanelModelTemplate;
import com.ss.ugc.effectplatform.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class EffectPanelModel extends EffectPanelModelTemplate implements Serializable {
    public final transient com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectPanelModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectPanelModel
    public String getExtra() {
        String extra;
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel = getKPanelModel();
        if (kPanelModel != null && (extra = kPanelModel.getExtra()) != null) {
            return extra;
        }
        return super.getExtra();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectPanelModel
    public UrlModel getIcon() {
        UrlModel icon;
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel = getKPanelModel();
        if (kPanelModel != null && (icon = kPanelModel.getIcon()) != null) {
            return icon;
        }
        return super.getIcon();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectPanelModel
    public String getId() {
        String id;
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel = getKPanelModel();
        if (kPanelModel != null && (id = kPanelModel.getId()) != null) {
            return id;
        }
        return super.getId();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectPanelModel
    public List<String> getTags() {
        List<String> tags;
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel = getKPanelModel();
        if (kPanelModel != null && (tags = kPanelModel.getTags()) != null) {
            return tags;
        }
        return super.getTags();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectPanelModel
    public String getTags_updated_at() {
        String tags_updated_at;
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel = getKPanelModel();
        if (kPanelModel != null && (tags_updated_at = kPanelModel.getTags_updated_at()) != null) {
            return tags_updated_at;
        }
        return super.getTags_updated_at();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectPanelModel
    public String getText() {
        String text;
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel = getKPanelModel();
        if (kPanelModel != null && (text = kPanelModel.getText()) != null) {
            return text;
        }
        return super.getText();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectPanelModelTemplate
    public com.ss.ugc.effectplatform.model.EffectPanelModel getKPanelModel() {
        return this.kPanelModel;
    }

    public EffectPanelModel(com.ss.ugc.effectplatform.model.EffectPanelModel effectPanelModel) {
        super(effectPanelModel);
        this.kPanelModel = effectPanelModel;
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel = getKPanelModel();
        if (kPanelModel != null) {
            String extra = kPanelModel.getExtra();
            if (extra != null) {
                super.setExtra(extra);
            }
            UrlModel icon = kPanelModel.getIcon();
            if (icon != null) {
                super.setIcon(icon);
            }
            String id = kPanelModel.getId();
            if (id != null) {
                super.setId(id);
            }
            List<String> tags = kPanelModel.getTags();
            if (tags != null) {
                super.setTags(tags);
            }
            String tags_updated_at = kPanelModel.getTags_updated_at();
            if (tags_updated_at != null) {
                super.setTags_updated_at(tags_updated_at);
            }
            String text = kPanelModel.getText();
            if (text != null) {
                super.setText(text);
            }
        }
    }

    @Override // com.ss.ugc.effectplatform.model.EffectPanelModel
    public void setExtra(String str) {
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel = getKPanelModel();
        if (kPanelModel != null) {
            kPanelModel.setExtra(str);
        }
        super.setExtra(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectPanelModel
    public void setIcon(UrlModel urlModel) {
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel = getKPanelModel();
        if (kPanelModel != null) {
            kPanelModel.setIcon(urlModel);
        }
        super.setIcon(urlModel);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectPanelModel
    public void setId(String str) {
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel = getKPanelModel();
        if (kPanelModel != null) {
            kPanelModel.setId(str);
        }
        super.setId(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectPanelModel
    public void setTags(List<String> value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel = getKPanelModel();
        if (kPanelModel != null) {
            kPanelModel.setTags(value);
        }
        super.setTags(value);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectPanelModel
    public void setTags_updated_at(String str) {
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel = getKPanelModel();
        if (kPanelModel != null) {
            kPanelModel.setTags_updated_at(str);
        }
        super.setTags_updated_at(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectPanelModel
    public void setText(String str) {
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel = getKPanelModel();
        if (kPanelModel != null) {
            kPanelModel.setText(str);
        }
        super.setText(str);
    }

    public /* synthetic */ EffectPanelModel(com.ss.ugc.effectplatform.model.EffectPanelModel effectPanelModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : effectPanelModel);
    }
}
