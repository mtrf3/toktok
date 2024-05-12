package com.bytedance.effectcreatormobile.ckeapi.api.foundation.loading;

import com.bytedance.news.common.service.manager.IServiceProxy;
import com.ugc.effectcreator.foundation.loading.PageLoadingProviderImpl;
import java.util.Map;

/* loaded from: classes34.dex */
public class IPageLoadingProvider__ServiceProxy implements IServiceProxy<IPageLoadingProvider> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IPageLoadingProvider newInstance() {
        return new PageLoadingProviderImpl();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.ckeapi.api.foundation.loading.IPageLoadingProvider", "com.ugc.effectcreator.foundation.loading.PageLoadingProviderImpl");
    }
}
