package com.bytedance.effectcreatormobile.ckeapi.api.resource;

import com.bytedance.effectcreatormobile.resource.ep.impl.CommandResourceFetcherImpl;
import com.bytedance.news.common.service.manager.IServiceProxy;
import java.util.Map;

/* loaded from: classes34.dex */
public class ICommonResourceFetcher__ServiceProxy implements IServiceProxy<ICommonResourceFetcher> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public ICommonResourceFetcher newInstance() {
        return new CommandResourceFetcherImpl();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.ckeapi.api.resource.ICommonResourceFetcher", "com.bytedance.effectcreatormobile.resource.ep.impl.CommandResourceFetcherImpl");
    }
}
