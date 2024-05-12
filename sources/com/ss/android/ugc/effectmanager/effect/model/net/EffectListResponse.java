package com.ss.android.ugc.effectmanager.effect.model.net;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class EffectListResponse extends EffectListResponseTemplate implements Serializable {
    public final transient com.ss.ugc.effectplatform.model.net.EffectListResponse kEffectList;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectListResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate
    public List<Effect> getBindEffects() {
        return super.getBindEffects();
    }

    @Override // com.ss.ugc.effectplatform.model.net.EffectListResponse
    public List<com.ss.ugc.effectplatform.model.Effect> getBind_effects() {
        List<com.ss.ugc.effectplatform.model.Effect> bind_effects;
        com.ss.ugc.effectplatform.model.net.EffectListResponse kEffectList = getKEffectList();
        if (kEffectList != null && (bind_effects = kEffectList.getBind_effects()) != null) {
            return bind_effects;
        }
        return super.getBind_effects();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate
    public List<Effect> getCollection() {
        return super.getCollection();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate
    public List<Effect> getData() {
        return super.getData();
    }

    @Override // com.ss.ugc.effectplatform.model.net.EffectListResponse
    public String getMessage() {
        String message;
        com.ss.ugc.effectplatform.model.net.EffectListResponse kEffectList = getKEffectList();
        if (kEffectList != null && (message = kEffectList.getMessage()) != null) {
            return message;
        }
        return super.getMessage();
    }

    @Override // com.ss.ugc.effectplatform.model.net.EffectListResponse
    public int getStatus_code() {
        com.ss.ugc.effectplatform.model.net.EffectListResponse kEffectList = getKEffectList();
        if (kEffectList != null) {
            return kEffectList.getStatus_code();
        }
        return super.getStatus_code();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate
    public List<String> getUrlPrefix() {
        return super.getUrlPrefix();
    }

    @Override // com.ss.ugc.effectplatform.model.net.EffectListResponse
    public List<String> getUrl_prefix() {
        List<String> url_prefix;
        com.ss.ugc.effectplatform.model.net.EffectListResponse kEffectList = getKEffectList();
        if (kEffectList != null && (url_prefix = kEffectList.getUrl_prefix()) != null) {
            return url_prefix;
        }
        return super.getUrl_prefix();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate
    public com.ss.ugc.effectplatform.model.net.EffectListResponse getKEffectList() {
        return this.kEffectList;
    }

    public EffectListResponse(com.ss.ugc.effectplatform.model.net.EffectListResponse effectListResponse) {
        super(effectListResponse);
        this.kEffectList = effectListResponse;
        com.ss.ugc.effectplatform.model.net.EffectListResponse kEffectList = getKEffectList();
        if (kEffectList != null) {
            List<com.ss.ugc.effectplatform.model.Effect> bind_effects = kEffectList.getBind_effects();
            if (bind_effects != null) {
                super.setBind_effects(bind_effects);
            }
            List<com.ss.ugc.effectplatform.model.Effect> collection_list = kEffectList.getCollection_list();
            if (collection_list != null) {
                setCollection_list(collection_list);
            }
            List<com.ss.ugc.effectplatform.model.Effect> effect_list = kEffectList.getEffect_list();
            if (effect_list != null) {
                setEffect_list(effect_list);
            }
            String message = kEffectList.getMessage();
            if (message != null) {
                super.setMessage(message);
            }
            super.setStatus_code(kEffectList.getStatus_code());
            List<String> url_prefix = kEffectList.getUrl_prefix();
            if (url_prefix != null) {
                super.setUrl_prefix(url_prefix);
            }
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate
    public void setBindEffects(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        super.setBindEffects(value);
    }

    @Override // com.ss.ugc.effectplatform.model.net.EffectListResponse
    public void setBind_effects(List<? extends com.ss.ugc.effectplatform.model.Effect> value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.net.EffectListResponse kEffectList = getKEffectList();
        if (kEffectList != null) {
            kEffectList.setBind_effects(value);
        }
        super.setBind_effects(value);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate
    public void setCollection(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        super.setCollection(value);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate
    public void setData(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        super.setData(value);
    }

    @Override // com.ss.ugc.effectplatform.model.net.EffectListResponse
    public void setMessage(String str) {
        com.ss.ugc.effectplatform.model.net.EffectListResponse kEffectList = getKEffectList();
        if (kEffectList != null) {
            kEffectList.setMessage(str);
        }
        super.setMessage(str);
    }

    @Override // com.ss.ugc.effectplatform.model.net.EffectListResponse
    public void setStatus_code(int i) {
        com.ss.ugc.effectplatform.model.net.EffectListResponse kEffectList = getKEffectList();
        if (kEffectList != null) {
            kEffectList.setStatus_code(i);
        }
        super.setStatus_code(i);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate
    public void setUrlPrefix(List<String> value) {
        o.LJIIJ(value, "value");
        super.setUrlPrefix(value);
    }

    @Override // com.ss.ugc.effectplatform.model.net.EffectListResponse
    public void setUrl_prefix(List<String> value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.net.EffectListResponse kEffectList = getKEffectList();
        if (kEffectList != null) {
            kEffectList.setUrl_prefix(value);
        }
        super.setUrl_prefix(value);
    }

    public /* synthetic */ EffectListResponse(com.ss.ugc.effectplatform.model.net.EffectListResponse effectListResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : effectListResponse);
    }
}
