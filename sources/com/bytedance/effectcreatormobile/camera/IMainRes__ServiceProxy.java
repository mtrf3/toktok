package com.bytedance.effectcreatormobile.camera;

import com.bytedance.effectcreatormobile.resource.ep.impl.MainResImpl;
import com.bytedance.news.common.service.manager.IServiceProxy;
import java.util.Map;

/* loaded from: classes34.dex */
public class IMainRes__ServiceProxy implements IServiceProxy<IMainRes> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IMainRes newInstance() {
        return new MainResImpl();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.camera.IMainRes", "com.bytedance.effectcreatormobile.resource.ep.impl.MainResImpl");
    }
}
