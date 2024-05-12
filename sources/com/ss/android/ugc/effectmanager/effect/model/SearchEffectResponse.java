package com.ss.android.ugc.effectmanager.effect.model;

import com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectResponseTemplate;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class SearchEffectResponse extends SearchEffectResponseTemplate implements Serializable {
    public final transient com.ss.ugc.effectplatform.model.net.SearchEffectResponse kSearchEffect;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchEffectResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectResponseTemplate
    public List<Effect> getBindEffects() {
        return super.getBindEffects();
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectResponse
    public List<com.ss.ugc.effectplatform.model.Effect> getBind_effects() {
        List<com.ss.ugc.effectplatform.model.Effect> bind_effects;
        com.ss.ugc.effectplatform.model.net.SearchEffectResponse kSearchEffect = getKSearchEffect();
        if (kSearchEffect != null && (bind_effects = kSearchEffect.getBind_effects()) != null) {
            return bind_effects;
        }
        return super.getBind_effects();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectResponseTemplate
    public List<Effect> getCollection() {
        return super.getCollection();
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectResponse
    public int getCursor() {
        com.ss.ugc.effectplatform.model.net.SearchEffectResponse kSearchEffect = getKSearchEffect();
        if (kSearchEffect != null) {
            return kSearchEffect.getCursor();
        }
        return super.getCursor();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectResponseTemplate
    public List<Effect> getEffects() {
        return super.getEffects();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectResponseTemplate
    public boolean getHasMore() {
        return super.getHasMore();
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectResponse
    public boolean getHas_more() {
        com.ss.ugc.effectplatform.model.net.SearchEffectResponse kSearchEffect = getKSearchEffect();
        if (kSearchEffect != null) {
            return kSearchEffect.getHas_more();
        }
        return super.getHas_more();
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectResponse
    public String getMessage() {
        String message;
        com.ss.ugc.effectplatform.model.net.SearchEffectResponse kSearchEffect = getKSearchEffect();
        if (kSearchEffect != null && (message = kSearchEffect.getMessage()) != null) {
            return message;
        }
        return super.getMessage();
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectResponse
    public int getStatus_code() {
        com.ss.ugc.effectplatform.model.net.SearchEffectResponse kSearchEffect = getKSearchEffect();
        if (kSearchEffect != null) {
            return kSearchEffect.getStatus_code();
        }
        return super.getStatus_code();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectResponseTemplate
    public com.ss.ugc.effectplatform.model.net.SearchEffectResponse getKSearchEffect() {
        return this.kSearchEffect;
    }

    public SearchEffectResponse(com.ss.ugc.effectplatform.model.net.SearchEffectResponse searchEffectResponse) {
        super(searchEffectResponse);
        this.kSearchEffect = searchEffectResponse;
        com.ss.ugc.effectplatform.model.net.SearchEffectResponse kSearchEffect = getKSearchEffect();
        if (kSearchEffect != null) {
            List<com.ss.ugc.effectplatform.model.Effect> bind_effects = kSearchEffect.getBind_effects();
            if (bind_effects != null) {
                super.setBind_effects(bind_effects);
            }
            List<com.ss.ugc.effectplatform.model.Effect> collection_list = kSearchEffect.getCollection_list();
            if (collection_list != null) {
                setCollection_list(collection_list);
            }
            super.setCursor(kSearchEffect.getCursor());
            List<com.ss.ugc.effectplatform.model.Effect> effect_list = kSearchEffect.getEffect_list();
            if (effect_list != null) {
                setEffect_list(effect_list);
            }
            super.setHas_more(kSearchEffect.getHas_more());
            String message = kSearchEffect.getMessage();
            if (message != null) {
                super.setMessage(message);
            }
            super.setStatus_code(kSearchEffect.getStatus_code());
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectResponseTemplate
    public void setBindEffects(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        super.setBindEffects(value);
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectResponse
    public void setBind_effects(List<? extends com.ss.ugc.effectplatform.model.Effect> value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.net.SearchEffectResponse kSearchEffect = getKSearchEffect();
        if (kSearchEffect != null) {
            kSearchEffect.setBind_effects(value);
        }
        super.setBind_effects(value);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectResponseTemplate
    public void setCollection(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        super.setCollection(value);
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectResponse
    public void setCursor(int i) {
        com.ss.ugc.effectplatform.model.net.SearchEffectResponse kSearchEffect = getKSearchEffect();
        if (kSearchEffect != null) {
            kSearchEffect.setCursor(i);
        }
        super.setCursor(i);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectResponseTemplate
    public void setEffects(List<? extends Effect> effects) {
        o.LJIIJ(effects, "effects");
        super.setEffects(effects);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectResponseTemplate
    public void setHasMore(boolean z) {
        super.setHasMore(z);
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectResponse
    public void setHas_more(boolean z) {
        com.ss.ugc.effectplatform.model.net.SearchEffectResponse kSearchEffect = getKSearchEffect();
        if (kSearchEffect != null) {
            kSearchEffect.setHas_more(z);
        }
        super.setHas_more(z);
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectResponse
    public void setMessage(String str) {
        com.ss.ugc.effectplatform.model.net.SearchEffectResponse kSearchEffect = getKSearchEffect();
        if (kSearchEffect != null) {
            kSearchEffect.setMessage(str);
        }
        super.setMessage(str);
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectResponse
    public void setStatus_code(int i) {
        com.ss.ugc.effectplatform.model.net.SearchEffectResponse kSearchEffect = getKSearchEffect();
        if (kSearchEffect != null) {
            kSearchEffect.setStatus_code(i);
        }
        super.setStatus_code(i);
    }

    public /* synthetic */ SearchEffectResponse(com.ss.ugc.effectplatform.model.net.SearchEffectResponse searchEffectResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : searchEffectResponse);
    }
}
