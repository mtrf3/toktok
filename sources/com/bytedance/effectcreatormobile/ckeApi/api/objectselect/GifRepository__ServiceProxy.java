package com.bytedance.effectcreatormobile.ckeapi.api.objectselect;

import com.bytedance.effectcreatormobile.resource.ep.impl.GifRepositoryImpl;
import com.bytedance.news.common.service.manager.IServiceProxy;
import java.util.Map;

/* loaded from: classes34.dex */
public class GifRepository__ServiceProxy implements IServiceProxy<GifRepository> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public GifRepository newInstance() {
        return new GifRepositoryImpl();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.ckeapi.api.objectselect.GifRepository", "com.bytedance.effectcreatormobile.resource.ep.impl.GifRepositoryImpl");
    }
}
