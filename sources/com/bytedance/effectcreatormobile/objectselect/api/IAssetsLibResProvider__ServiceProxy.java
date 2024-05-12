package com.bytedance.effectcreatormobile.objectselect.api;

import com.bytedance.effectcreatormobile.resource.ep.impl.AssetsLibResProvider;
import com.bytedance.news.common.service.manager.IServiceProxy;
import java.util.Map;

/* loaded from: classes34.dex */
public class IAssetsLibResProvider__ServiceProxy implements IServiceProxy<IAssetsLibResProvider> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IAssetsLibResProvider newInstance() {
        return new AssetsLibResProvider();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.objectselect.api.IAssetsLibResProvider", "com.bytedance.effectcreatormobile.resource.ep.impl.AssetsLibResProvider");
    }
}
