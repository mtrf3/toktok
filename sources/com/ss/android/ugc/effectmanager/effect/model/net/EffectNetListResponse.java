package com.ss.android.ugc.effectmanager.effect.model.net;

import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelModel;

/* loaded from: classes16.dex */
public class EffectNetListResponse extends BaseNetResponse {
    public EffectChannelModel data;

    @Override // com.ss.android.ugc.effectmanager.common.model.BaseNetResponse
    public boolean checkValue() {
        EffectChannelModel effectChannelModel = this.data;
        if (effectChannelModel != null && effectChannelModel.checkValued()) {
            return true;
        }
        return false;
    }

    public EffectChannelModel getData() {
        return this.data;
    }

    public void setData(EffectChannelModel effectChannelModel) {
        this.data = effectChannelModel;
    }
}
