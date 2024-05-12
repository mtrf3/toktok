package com.bytedance.effectcreatormobile.objectselect.api;

import com.bytedance.effectcreatormobile.resource.ep.impl.FilterPanelResProvider;
import com.bytedance.news.common.service.manager.IServiceProxy;
import java.util.Map;

/* loaded from: classes34.dex */
public class IFilterPanelResProvider__ServiceProxy implements IServiceProxy<IFilterPanelResProvider> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IFilterPanelResProvider newInstance() {
        return new FilterPanelResProvider();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.objectselect.api.IFilterPanelResProvider", "com.bytedance.effectcreatormobile.resource.ep.impl.FilterPanelResProvider");
    }
}
