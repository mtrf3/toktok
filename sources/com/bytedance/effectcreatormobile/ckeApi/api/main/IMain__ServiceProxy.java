package com.bytedance.effectcreatormobile.ckeapi.api.main;

import com.bytedance.news.common.service.manager.IServiceProxy;
import com.bytedance.ugc.effectcreator.main.MainImpl;
import java.util.Map;

/* loaded from: classes34.dex */
public class IMain__ServiceProxy implements IServiceProxy<IMain> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IMain newInstance() {
        return new MainImpl();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.ckeapi.api.main.IMain", "com.bytedance.ugc.effectcreator.main.MainImpl");
    }
}
