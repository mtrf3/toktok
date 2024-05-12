package com.bytedance.effectcreatormobile.ckeapi.api.behaviour;

import com.bytedance.effectcreatormobile.behaviour.BehaviourImpl;
import com.bytedance.news.common.service.manager.IServiceProxy;
import java.util.Map;

/* loaded from: classes34.dex */
public class IBehaviour__ServiceProxy implements IServiceProxy<IBehaviour> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IBehaviour newInstance() {
        return new BehaviourImpl();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.ckeapi.api.behaviour.IBehaviour", "com.bytedance.effectcreatormobile.behaviour.BehaviourImpl");
    }
}
