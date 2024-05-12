package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* loaded from: classes7.dex */
public final class MyEffectsResponse extends BaseResponse {

    @InterfaceC65349Pkn("effects")
    public final List<MobileEffectApiModel> effects;

    public MyEffectsResponse(List<MobileEffectApiModel> list) {
        this.effects = list;
    }
}
