package com.bytedance.effectcreatormobile.objectselect.api;

import com.bytedance.effectcreatormobile.resource.ep.impl.PrefabPanelResProviderImpl;
import com.bytedance.news.common.service.manager.IServiceProxy;
import java.util.Map;

/* loaded from: classes34.dex */
public class PrefabPanelResProvider__ServiceProxy implements IServiceProxy<PrefabPanelResProvider> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public PrefabPanelResProvider newInstance() {
        return new PrefabPanelResProviderImpl();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.objectselect.api.PrefabPanelResProvider", "com.bytedance.effectcreatormobile.resource.ep.impl.PrefabPanelResProviderImpl");
    }
}
