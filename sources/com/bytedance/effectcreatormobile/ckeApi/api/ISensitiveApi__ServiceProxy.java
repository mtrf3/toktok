package com.bytedance.effectcreatormobile.ckeapi.api;

import com.bytedance.news.common.service.manager.IServiceProxy;
import com.ugc.effectcreator.foundation.view.DefaultSensitiveApiImpl;
import java.util.Map;

/* loaded from: classes34.dex */
public class ISensitiveApi__ServiceProxy implements IServiceProxy<ISensitiveApi> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public ISensitiveApi newInstance() {
        return new DefaultSensitiveApiImpl();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.ckeapi.api.ISensitiveApi", "com.ugc.effectcreator.foundation.view.DefaultSensitiveApiImpl");
    }
}
