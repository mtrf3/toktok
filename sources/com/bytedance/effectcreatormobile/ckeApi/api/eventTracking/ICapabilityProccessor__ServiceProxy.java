package com.bytedance.effectcreatormobile.ckeapi.api.eventTracking;

import com.bytedance.effectcreatormobile.draft.pipeline.DefaultCapabilityProccessor;
import com.bytedance.news.common.service.manager.IServiceProxy;
import java.util.Map;

/* loaded from: classes34.dex */
public class ICapabilityProccessor__ServiceProxy implements IServiceProxy<ICapabilityProccessor> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public ICapabilityProccessor newInstance() {
        return new DefaultCapabilityProccessor();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.ckeapi.api.eventTracking.ICapabilityProccessor", "com.bytedance.effectcreatormobile.draft.pipeline.DefaultCapabilityProccessor");
    }
}
