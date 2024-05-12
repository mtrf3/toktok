package com.bytedance.effectcreatormobile.ckeapi.api.foundation.loading;

import com.bytedance.news.common.service.manager.IServiceProxy;
import com.ugc.effectcreator.foundation.loading.ItemLoadingProviderImpl;
import java.util.Map;

/* loaded from: classes34.dex */
public class IItemLoadingProvider__ServiceProxy implements IServiceProxy<IItemLoadingProvider> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IItemLoadingProvider newInstance() {
        return new ItemLoadingProviderImpl();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.ckeapi.api.foundation.loading.IItemLoadingProvider", "com.ugc.effectcreator.foundation.loading.ItemLoadingProviderImpl");
    }
}
