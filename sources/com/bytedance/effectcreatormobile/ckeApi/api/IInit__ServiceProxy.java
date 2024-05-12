package com.bytedance.effectcreatormobile.ckeapi.api;

import com.bytedance.effectcreatormobile.integrationTiktok.impl.InitImpl;
import com.bytedance.news.common.service.manager.IServiceProxy;
import java.util.Map;

/* loaded from: classes34.dex */
public class IInit__ServiceProxy implements IServiceProxy<IInit> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IInit newInstance() {
        return new InitImpl();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.ckeapi.api.IInit", "com.bytedance.effectcreatormobile.integrationTiktok.impl.InitImpl");
    }
}
