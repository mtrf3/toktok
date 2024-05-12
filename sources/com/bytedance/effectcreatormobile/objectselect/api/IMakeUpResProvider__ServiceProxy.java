package com.bytedance.effectcreatormobile.objectselect.api;

import com.bytedance.effectcreatormobile.resource.ep.impl.MakeupLibResProvider;
import com.bytedance.news.common.service.manager.IServiceProxy;
import java.util.Map;

/* loaded from: classes34.dex */
public class IMakeUpResProvider__ServiceProxy implements IServiceProxy<IMakeUpResProvider> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IMakeUpResProvider newInstance() {
        return new MakeupLibResProvider();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.objectselect.api.IMakeUpResProvider", "com.bytedance.effectcreatormobile.resource.ep.impl.MakeupLibResProvider");
    }
}
