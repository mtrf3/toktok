package com.bytedance.effectcreatormobile.resource.ep.api;

import X.AbstractC94464ahQ;
import X.AbstractC94465ahR;
import X.InterfaceC67352kd;
import X.InterfaceC93663aUV;
import com.bytedance.news.common.service.manager.IService;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* loaded from: classes34.dex */
public interface IEffectPlatformResourceProvider extends IService {
    <T> void categoryFetch(String str, String str2, boolean z, AbstractC94464ahQ<T> abstractC94464ahQ, InterfaceC93663aUV<? super T> interfaceC93663aUV);

    Object downloadEffectById(String str, InterfaceC67352kd<? super Effect> interfaceC67352kd);

    void downloadRes(String str, InterfaceC93663aUV<? super String> interfaceC93663aUV);

    EffectManager effectManager();

    void ensureRequiredModels(String str, InterfaceC93663aUV<? super String> interfaceC93663aUV);

    <T> void panelFetch(String str, AbstractC94465ahR<T> abstractC94465ahR, InterfaceC93663aUV<? super T> interfaceC93663aUV);
}
