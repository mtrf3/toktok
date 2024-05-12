package com.bytedance.effectcreatormobile.ckeapi.api.behaviour.res;

import com.bytedance.effectcreatormobile.resource.ep.impl.EffectHintGuideResProviderImpl;
import com.bytedance.news.common.service.manager.IServiceProxy;
import java.util.Map;

/* loaded from: classes34.dex */
public class IEffectHintResProvider__ServiceProxy implements IServiceProxy<IEffectHintResProvider> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IEffectHintResProvider newInstance() {
        return new EffectHintGuideResProviderImpl();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.ckeapi.api.behaviour.res.IEffectHintResProvider", "com.bytedance.effectcreatormobile.resource.ep.impl.EffectHintGuideResProviderImpl");
    }
}
