package com.bytedance.effectcreatormobile.ckeapi.api.behaviour;

import com.bytedance.news.common.service.manager.IServiceProxy;
import com.ugc.effectcreator.effectcore.sdk.behaviour.BehaviourEditorImpl;
import java.util.Map;

/* loaded from: classes34.dex */
public class IBehaviourEditor__ServiceProxy implements IServiceProxy<IBehaviourEditor> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IBehaviourEditor newInstance() {
        return new BehaviourEditorImpl();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.ckeapi.api.behaviour.IBehaviourEditor", "com.ugc.effectcreator.effectcore.sdk.behaviour.BehaviourEditorImpl");
    }
}
