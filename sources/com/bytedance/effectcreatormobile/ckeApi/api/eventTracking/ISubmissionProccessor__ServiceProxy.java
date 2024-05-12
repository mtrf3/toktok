package com.bytedance.effectcreatormobile.ckeapi.api.eventTracking;

import com.bytedance.effectcreatormobile.draft.pipeline.DefaultSubmissionProccessor;
import com.bytedance.news.common.service.manager.IServiceProxy;
import java.util.Map;

/* loaded from: classes34.dex */
public class ISubmissionProccessor__ServiceProxy implements IServiceProxy<ISubmissionProccessor> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public ISubmissionProccessor newInstance() {
        return new DefaultSubmissionProccessor();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.ckeapi.api.eventTracking.ISubmissionProccessor", "com.bytedance.effectcreatormobile.draft.pipeline.DefaultSubmissionProccessor");
    }
}
