package com.bytedance.effectcreatormobile.ckeapi.api.behaviour.res;

import com.bytedance.effectcreatormobile.resource.ep.impl.BehaviourResProviderImpl;
import com.bytedance.news.common.service.manager.IServiceProxy;
import java.util.Map;

/* loaded from: classes34.dex */
public class IBehaviourResProvider__ServiceProxy implements IServiceProxy<IBehaviourResProvider> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IBehaviourResProvider newInstance() {
        return new BehaviourResProviderImpl();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.ckeapi.api.behaviour.res.IBehaviourResProvider", "com.bytedance.effectcreatormobile.resource.ep.impl.BehaviourResProviderImpl");
    }
}
