package com.bytedance.effectcreatormobile.ckeapi.api.objectselect;

import X.InterfaceC67352kd;
import com.bytedance.news.common.service.manager.IService;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;

/* loaded from: classes34.dex */
public interface GifRepository extends IService {
    Object downloadGif(ProviderEffect providerEffect, InterfaceC67352kd<? super ProviderEffect> interfaceC67352kd);

    String getBackgroundGifSource();

    String getNoBackgroundGifSource();

    Object isAvailable(InterfaceC67352kd<? super Boolean> interfaceC67352kd);

    Object searchGifs(String str, String str2, int i, int i2, InterfaceC67352kd<? super ProviderEffectModel> interfaceC67352kd);

    Object trendGifs(String str, int i, int i2, InterfaceC67352kd<? super ProviderEffectModel> interfaceC67352kd);
}
