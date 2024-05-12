package com.bytedance.effectcreatormobile.modelselect.api;

import com.bytedance.effectcreatormobile.resource.ep.impl.ModelResourceProvider;
import com.bytedance.news.common.service.manager.IServiceProxy;
import java.util.Map;

/* loaded from: classes34.dex */
public class IModelResProvider__ServiceProxy implements IServiceProxy<IModelResProvider> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IModelResProvider newInstance() {
        return new ModelResourceProvider();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.modelselect.api.IModelResProvider", "com.bytedance.effectcreatormobile.resource.ep.impl.ModelResourceProvider");
    }
}
