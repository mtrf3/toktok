package com.bytedance.effectcreatormobile.ckeapi.api;

import com.bytedance.effectcreatormobile.draft.pipeline.DefaultEffectPipeline;
import com.bytedance.news.common.service.manager.IServiceProxy;
import java.util.Map;

/* loaded from: classes34.dex */
public class IEffectCreatePipeline__ServiceProxy implements IServiceProxy<IEffectCreatePipeline> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IEffectCreatePipeline newInstance() {
        return new DefaultEffectPipeline();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.ckeapi.api.IEffectCreatePipeline", "com.bytedance.effectcreatormobile.draft.pipeline.DefaultEffectPipeline");
    }
}
