package com.ss.android.ugc.effectmanager.effect.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class EffectCategoryResponse extends EffectCategoryResponseTemplate implements Serializable, Parcelable {
    public final transient com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<EffectCategoryResponse> CREATOR = new Parcelable.Creator<EffectCategoryResponse>() { // from class: com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EffectCategoryResponse createFromParcel(Parcel parcel) {
            Object obj;
            o.LJIIJ(parcel, "parcel");
            com.ss.ugc.effectplatform.model.EffectCategoryResponse effectCategoryResponse = null;
            try {
                Object obj2 = com.ss.ugc.effectplatform.model.EffectCategoryResponse.class.getField("CREATOR").get(null);
                if (!(obj2 instanceof Parcelable.Creator)) {
                    obj2 = null;
                }
                Parcelable.Creator creator = (Parcelable.Creator) obj2;
                if (creator != null) {
                    obj = creator.createFromParcel(parcel);
                } else {
                    obj = null;
                }
                if (!(obj instanceof com.ss.ugc.effectplatform.model.EffectCategoryResponse)) {
                    obj = null;
                }
                effectCategoryResponse = (com.ss.ugc.effectplatform.model.EffectCategoryResponse) obj;
            } catch (Exception e) {
                EPLog.e("createFromParcel", "get creator failed!", e);
            }
            return new EffectCategoryResponse(effectCategoryResponse);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EffectCategoryResponse[] newArray(int i) {
            return new EffectCategoryResponse[i];
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public EffectCategoryResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public List<Effect> getCollectionEffect() {
        return super.getCollectionEffect();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public List<com.ss.ugc.effectplatform.model.Effect> getCollection_effect() {
        List<com.ss.ugc.effectplatform.model.Effect> collection_effect;
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
        if (kCategoryResponse != null && (collection_effect = kCategoryResponse.getCollection_effect()) != null) {
            return collection_effect;
        }
        return super.getCollection_effect();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public String getExtra() {
        String extra;
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
        if (kCategoryResponse != null && (extra = kCategoryResponse.getExtra()) != null) {
            return extra;
        }
        return super.getExtra();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public Effect getFrontEffect() {
        return super.getFrontEffect();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public com.ss.ugc.effectplatform.model.Effect getFront_effect() {
        com.ss.ugc.effectplatform.model.Effect front_effect;
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
        if (kCategoryResponse != null && (front_effect = kCategoryResponse.getFront_effect()) != null) {
            return front_effect;
        }
        return super.getFront_effect();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public String getIcon_normal_url() {
        String icon_normal_url;
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
        if (kCategoryResponse != null && (icon_normal_url = kCategoryResponse.getIcon_normal_url()) != null) {
            return icon_normal_url;
        }
        return super.getIcon_normal_url();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public String getIcon_selected_url() {
        String icon_selected_url;
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
        if (kCategoryResponse != null && (icon_selected_url = kCategoryResponse.getIcon_selected_url()) != null) {
            return icon_selected_url;
        }
        return super.getIcon_selected_url();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public String getId() {
        String id;
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
        if (kCategoryResponse != null && (id = kCategoryResponse.getId()) != null) {
            return id;
        }
        return super.getId();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public String getKey() {
        String key;
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
        if (kCategoryResponse != null && (key = kCategoryResponse.getKey()) != null) {
            return key;
        }
        return super.getKey();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public String getName() {
        String name;
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
        if (kCategoryResponse != null && (name = kCategoryResponse.getName()) != null) {
            return name;
        }
        return super.getName();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public Effect getRearEffect() {
        return super.getRearEffect();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public com.ss.ugc.effectplatform.model.Effect getRear_effect() {
        com.ss.ugc.effectplatform.model.Effect rear_effect;
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
        if (kCategoryResponse != null && (rear_effect = kCategoryResponse.getRear_effect()) != null) {
            return rear_effect;
        }
        return super.getRear_effect();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public List<String> getTags() {
        List<String> tags;
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
        if (kCategoryResponse != null && (tags = kCategoryResponse.getTags()) != null) {
            return tags;
        }
        return super.getTags();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public String getTagsUpdateTime() {
        return super.getTagsUpdateTime();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public String getTags_update_time() {
        String tags_update_time;
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
        if (kCategoryResponse != null && (tags_update_time = kCategoryResponse.getTags_update_time()) != null) {
            return tags_update_time;
        }
        return super.getTags_update_time();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public List<Effect> getTotalEffects() {
        return super.getTotalEffects();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public List<com.ss.ugc.effectplatform.model.Effect> getTotal_effects() {
        List<com.ss.ugc.effectplatform.model.Effect> total_effects;
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
        if (kCategoryResponse != null && (total_effects = kCategoryResponse.getTotal_effects()) != null) {
            return total_effects;
        }
        return super.getTotal_effects();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public boolean isDefault() {
        return super.isDefault();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public boolean is_default() {
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
        if (kCategoryResponse != null) {
            return kCategoryResponse.is_default();
        }
        return super.is_default();
    }

    /* loaded from: classes16.dex */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public com.ss.ugc.effectplatform.model.EffectCategoryResponse getKCategoryResponse() {
        return this.kCategoryResponse;
    }

    public EffectCategoryResponse(com.ss.ugc.effectplatform.model.EffectCategoryResponse effectCategoryResponse) {
        super(effectCategoryResponse);
        this.kCategoryResponse = effectCategoryResponse;
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
        if (kCategoryResponse != null) {
            List<com.ss.ugc.effectplatform.model.Effect> collection_effect = kCategoryResponse.getCollection_effect();
            if (collection_effect != null) {
                super.setCollection_effect(collection_effect);
            }
            String extra = kCategoryResponse.getExtra();
            if (extra != null) {
                super.setExtra(extra);
            }
            com.ss.ugc.effectplatform.model.Effect front_effect = kCategoryResponse.getFront_effect();
            if (front_effect != null) {
                super.setFront_effect(front_effect);
            }
            String icon_normal_url = kCategoryResponse.getIcon_normal_url();
            if (icon_normal_url != null) {
                super.setIcon_normal_url(icon_normal_url);
            }
            String icon_selected_url = kCategoryResponse.getIcon_selected_url();
            if (icon_selected_url != null) {
                super.setIcon_selected_url(icon_selected_url);
            }
            String id = kCategoryResponse.getId();
            if (id != null) {
                super.setId(id);
            }
            super.set_default(kCategoryResponse.is_default());
            String key = kCategoryResponse.getKey();
            if (key != null) {
                super.setKey(key);
            }
            String name = kCategoryResponse.getName();
            if (name != null) {
                super.setName(name);
            }
            com.ss.ugc.effectplatform.model.Effect rear_effect = kCategoryResponse.getRear_effect();
            if (rear_effect != null) {
                super.setRear_effect(rear_effect);
            }
            List<String> tags = kCategoryResponse.getTags();
            if (tags != null) {
                super.setTags(tags);
            }
            String tags_update_time = kCategoryResponse.getTags_update_time();
            if (tags_update_time != null) {
                super.setTags_update_time(tags_update_time);
            }
            List<com.ss.ugc.effectplatform.model.Effect> total_effects = kCategoryResponse.getTotal_effects();
            if (total_effects != null) {
                super.setTotal_effects(total_effects);
            }
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public void setCollectionEffect(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        super.setCollectionEffect(value);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public void setCollection_effect(List<? extends com.ss.ugc.effectplatform.model.Effect> value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
        if (kCategoryResponse != null) {
            kCategoryResponse.setCollection_effect(value);
        }
        super.setCollection_effect(value);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public void setDefault(boolean z) {
        super.setDefault(z);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public void setExtra(String str) {
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
        if (kCategoryResponse != null) {
            kCategoryResponse.setExtra(str);
        }
        super.setExtra(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public void setFrontEffect(Effect effect) {
        super.setFrontEffect(effect);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public void setFront_effect(com.ss.ugc.effectplatform.model.Effect effect) {
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
        if (kCategoryResponse != null) {
            kCategoryResponse.setFront_effect(effect);
        }
        super.setFront_effect(effect);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public void setIcon_normal_url(String str) {
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
        if (kCategoryResponse != null) {
            kCategoryResponse.setIcon_normal_url(str);
        }
        super.setIcon_normal_url(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public void setIcon_selected_url(String str) {
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
        if (kCategoryResponse != null) {
            kCategoryResponse.setIcon_selected_url(str);
        }
        super.setIcon_selected_url(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public void setId(String value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
        if (kCategoryResponse != null) {
            kCategoryResponse.setId(value);
        }
        super.setId(value);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public void setKey(String value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
        if (kCategoryResponse != null) {
            kCategoryResponse.setKey(value);
        }
        super.setKey(value);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public void setName(String value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
        if (kCategoryResponse != null) {
            kCategoryResponse.setName(value);
        }
        super.setName(value);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public void setRearEffect(Effect effect) {
        super.setRearEffect(effect);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public void setRear_effect(com.ss.ugc.effectplatform.model.Effect effect) {
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
        if (kCategoryResponse != null) {
            kCategoryResponse.setRear_effect(effect);
        }
        super.setRear_effect(effect);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public void setTags(List<String> value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
        if (kCategoryResponse != null) {
            kCategoryResponse.setTags(value);
        }
        super.setTags(value);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public void setTagsUpdateTime(String str) {
        super.setTagsUpdateTime(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public void setTags_update_time(String str) {
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
        if (kCategoryResponse != null) {
            kCategoryResponse.setTags_update_time(str);
        }
        super.setTags_update_time(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public void setTotalEffects(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        super.setTotalEffects(value);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public void setTotal_effects(List<? extends com.ss.ugc.effectplatform.model.Effect> value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
        if (kCategoryResponse != null) {
            kCategoryResponse.setTotal_effects(value);
        }
        super.setTotal_effects(value);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse
    public void set_default(boolean z) {
        com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
        if (kCategoryResponse != null) {
            kCategoryResponse.set_default(z);
        }
        super.set_default(z);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryResponse, android.os.Parcelable
    public void writeToParcel(Parcel dest, int i) {
        o.LJIIJ(dest, "dest");
        if (getKCategoryResponse() != null) {
            com.ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse = getKCategoryResponse();
            if (kCategoryResponse != null) {
                kCategoryResponse.writeToParcel(dest, i);
                return;
            }
            return;
        }
        super.writeToParcel(dest, i);
    }

    public /* synthetic */ EffectCategoryResponse(com.ss.ugc.effectplatform.model.EffectCategoryResponse effectCategoryResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : effectCategoryResponse);
    }
}
