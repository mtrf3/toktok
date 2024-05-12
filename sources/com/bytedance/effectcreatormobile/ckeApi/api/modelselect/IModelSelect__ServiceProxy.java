package com.bytedance.effectcreatormobile.ckeapi.api.modelselect;

import com.bytedance.effectcreatormobile.modelselect.impl.ModelSelectImpl;
import com.bytedance.news.common.service.manager.IServiceProxy;
import java.util.Map;

/* loaded from: classes34.dex */
public class IModelSelect__ServiceProxy implements IServiceProxy<IModelSelect> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IModelSelect newInstance() {
        return new ModelSelectImpl();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.ckeapi.api.modelselect.IModelSelect", "com.bytedance.effectcreatormobile.modelselect.impl.ModelSelectImpl");
    }
}
