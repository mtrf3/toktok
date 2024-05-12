package com.ss.android.ugc.effectmanager.effect.model;

import com.ss.android.ugc.effectmanager.effect.model.template.QueryRewardEffectsResponseTemplate;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class QueryRewardEffectsResponse extends QueryRewardEffectsResponseTemplate implements Serializable {
    public final transient com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse kQueryRewardEffectsResponse;

    /* JADX WARN: Multi-variable type inference failed */
    public QueryRewardEffectsResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse
    public boolean getHas_more() {
        com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse kQueryRewardEffectsResponse = getKQueryRewardEffectsResponse();
        if (kQueryRewardEffectsResponse != null) {
            return kQueryRewardEffectsResponse.getHas_more();
        }
        return super.getHas_more();
    }

    @Override // com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse
    public String getMessage() {
        String message;
        com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse kQueryRewardEffectsResponse = getKQueryRewardEffectsResponse();
        if (kQueryRewardEffectsResponse != null && (message = kQueryRewardEffectsResponse.getMessage()) != null) {
            return message;
        }
        return super.getMessage();
    }

    @Override // com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse
    public int getNext_cursor() {
        com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse kQueryRewardEffectsResponse = getKQueryRewardEffectsResponse();
        if (kQueryRewardEffectsResponse != null) {
            return kQueryRewardEffectsResponse.getNext_cursor();
        }
        return super.getNext_cursor();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.QueryRewardEffectsResponseTemplate
    public List<Effect> getRewardEffects() {
        return super.getRewardEffects();
    }

    @Override // com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse
    public List<com.ss.ugc.effectplatform.model.Effect> getReward_effects() {
        List<com.ss.ugc.effectplatform.model.Effect> reward_effects;
        com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse kQueryRewardEffectsResponse = getKQueryRewardEffectsResponse();
        if (kQueryRewardEffectsResponse != null && (reward_effects = kQueryRewardEffectsResponse.getReward_effects()) != null) {
            return reward_effects;
        }
        return super.getReward_effects();
    }

    @Override // com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse
    public int getStatus_code() {
        com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse kQueryRewardEffectsResponse = getKQueryRewardEffectsResponse();
        if (kQueryRewardEffectsResponse != null) {
            return kQueryRewardEffectsResponse.getStatus_code();
        }
        return super.getStatus_code();
    }

    @Override // com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse
    public List<String> getUrl_prefix() {
        List<String> url_prefix;
        com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse kQueryRewardEffectsResponse = getKQueryRewardEffectsResponse();
        if (kQueryRewardEffectsResponse != null && (url_prefix = kQueryRewardEffectsResponse.getUrl_prefix()) != null) {
            return url_prefix;
        }
        return super.getUrl_prefix();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.QueryRewardEffectsResponseTemplate
    public com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse getKQueryRewardEffectsResponse() {
        return this.kQueryRewardEffectsResponse;
    }

    public QueryRewardEffectsResponse(com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse queryRewardEffectsResponse) {
        super(queryRewardEffectsResponse);
        this.kQueryRewardEffectsResponse = queryRewardEffectsResponse;
        com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse kQueryRewardEffectsResponse = getKQueryRewardEffectsResponse();
        if (kQueryRewardEffectsResponse != null) {
            super.setHas_more(kQueryRewardEffectsResponse.getHas_more());
            String message = kQueryRewardEffectsResponse.getMessage();
            if (message != null) {
                super.setMessage(message);
            }
            super.setNext_cursor(kQueryRewardEffectsResponse.getNext_cursor());
            List<com.ss.ugc.effectplatform.model.Effect> reward_effects = kQueryRewardEffectsResponse.getReward_effects();
            if (reward_effects != null) {
                super.setReward_effects(reward_effects);
            }
            super.setStatus_code(kQueryRewardEffectsResponse.getStatus_code());
            List<String> url_prefix = kQueryRewardEffectsResponse.getUrl_prefix();
            if (url_prefix != null) {
                super.setUrl_prefix(url_prefix);
            }
        }
    }

    @Override // com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse
    public void setHas_more(boolean z) {
        com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse kQueryRewardEffectsResponse = getKQueryRewardEffectsResponse();
        if (kQueryRewardEffectsResponse != null) {
            kQueryRewardEffectsResponse.setHas_more(z);
        }
        super.setHas_more(z);
    }

    @Override // com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse
    public void setMessage(String str) {
        com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse kQueryRewardEffectsResponse = getKQueryRewardEffectsResponse();
        if (kQueryRewardEffectsResponse != null) {
            kQueryRewardEffectsResponse.setMessage(str);
        }
        super.setMessage(str);
    }

    @Override // com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse
    public void setNext_cursor(int i) {
        com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse kQueryRewardEffectsResponse = getKQueryRewardEffectsResponse();
        if (kQueryRewardEffectsResponse != null) {
            kQueryRewardEffectsResponse.setNext_cursor(i);
        }
        super.setNext_cursor(i);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.QueryRewardEffectsResponseTemplate
    public void setRewardEffects(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        super.setRewardEffects(value);
    }

    @Override // com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse
    public void setReward_effects(List<? extends com.ss.ugc.effectplatform.model.Effect> value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse kQueryRewardEffectsResponse = getKQueryRewardEffectsResponse();
        if (kQueryRewardEffectsResponse != null) {
            kQueryRewardEffectsResponse.setReward_effects(value);
        }
        super.setReward_effects(value);
    }

    @Override // com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse
    public void setStatus_code(int i) {
        com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse kQueryRewardEffectsResponse = getKQueryRewardEffectsResponse();
        if (kQueryRewardEffectsResponse != null) {
            kQueryRewardEffectsResponse.setStatus_code(i);
        }
        super.setStatus_code(i);
    }

    @Override // com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse
    public void setUrl_prefix(List<String> value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse kQueryRewardEffectsResponse = getKQueryRewardEffectsResponse();
        if (kQueryRewardEffectsResponse != null) {
            kQueryRewardEffectsResponse.setUrl_prefix(value);
        }
        super.setUrl_prefix(value);
    }

    public /* synthetic */ QueryRewardEffectsResponse(com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse queryRewardEffectsResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : queryRewardEffectsResponse);
    }
}
