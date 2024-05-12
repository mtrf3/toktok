package com.bytedance.effectcreatormobile.resource.ep.api;

import com.bytedance.effectcreatormobile.resource.ep.impl.DefaultResourceProvider;
import com.bytedance.news.common.service.manager.IServiceProxy;
import java.util.Map;

/* loaded from: classes34.dex */
public class IEffectPlatformResourceProvider__ServiceProxy implements IServiceProxy<IEffectPlatformResourceProvider> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IEffectPlatformResourceProvider newInstance() {
        return new DefaultResourceProvider();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.resource.ep.api.IEffectPlatformResourceProvider", "com.bytedance.effectcreatormobile.resource.ep.impl.DefaultResourceProvider");
    }
}
