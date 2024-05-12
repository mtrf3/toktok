package com.bytedance.effectcreatormobile.objectselect.api;

import com.bytedance.effectcreatormobile.resource.ep.impl.EffectDataResProvider;
import com.bytedance.news.common.service.manager.IServiceProxy;
import java.util.Map;

/* loaded from: classes34.dex */
public class IEffectDataResProvider__ServiceProxy implements IServiceProxy<IEffectDataResProvider> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IEffectDataResProvider newInstance() {
        return new EffectDataResProvider();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.objectselect.api.IEffectDataResProvider", "com.bytedance.effectcreatormobile.resource.ep.impl.EffectDataResProvider");
    }
}
