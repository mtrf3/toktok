package com.ss.android.ugc.effectmanager.effect.repository.newrepo;

import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;

/* loaded from: classes16.dex */
public final class EffectListStore {
    public EffectChannelResponse currentEffectList;

    public final EffectChannelResponse getCurrentEffectList() {
        EffectChannelResponse effectChannelResponse = this.currentEffectList;
        if (effectChannelResponse != null) {
            return effectChannelResponse;
        }
        return new EffectChannelResponse(null, 1, null);
    }

    public final void setCurrentEffectList(EffectChannelResponse effectChannelResponse) {
        this.currentEffectList = effectChannelResponse;
    }
}
