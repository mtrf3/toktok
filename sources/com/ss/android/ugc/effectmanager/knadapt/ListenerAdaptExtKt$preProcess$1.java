package com.ss.android.ugc.effectmanager.knadapt;

import X.AbstractC65781Prl;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.ugc.effectplatform.model.EffectChannelResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ListenerAdaptExtKt$preProcess$1 extends AbstractC65781Prl implements InterfaceC88472Yns<EffectChannelResponse, com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse> {
    public static final ListenerAdaptExtKt$preProcess$1 INSTANCE = new ListenerAdaptExtKt$preProcess$1();

    public ListenerAdaptExtKt$preProcess$1() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse invoke(EffectChannelResponse it) {
        o.LJIIJ(it, "it");
        com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse effectChannelResponse = new com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse(it);
        ListenerAdaptExtKt.preProcess(effectChannelResponse.getAllCategoryEffects());
        ListenerAdaptExtKt.preProcess(effectChannelResponse.getCollections());
        for (EffectCategoryResponse effectCategoryResponse : effectChannelResponse.getCategoryResponseList()) {
            ListenerAdaptExtKt.preProcess(effectCategoryResponse.getCollectionEffect());
            ListenerAdaptExtKt.preProcess(effectCategoryResponse.getTotalEffects());
        }
        return effectChannelResponse;
    }
}
