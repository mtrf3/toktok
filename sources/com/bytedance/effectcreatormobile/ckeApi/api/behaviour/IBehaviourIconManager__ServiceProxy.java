package com.bytedance.effectcreatormobile.ckeapi.api.behaviour;

import com.bytedance.news.common.service.manager.IServiceProxy;
import com.ugc.effectcreator.effectcore.sdk.behaviour.BehaviourIconManager;
import java.util.Map;

/* loaded from: classes34.dex */
public class IBehaviourIconManager__ServiceProxy implements IServiceProxy<IBehaviourIconManager> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IBehaviourIconManager newInstance() {
        return new BehaviourIconManager();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.ckeapi.api.behaviour.IBehaviourIconManager", "com.ugc.effectcreator.effectcore.sdk.behaviour.BehaviourIconManager");
    }
}
