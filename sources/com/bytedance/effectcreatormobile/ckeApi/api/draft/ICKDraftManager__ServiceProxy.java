package com.bytedance.effectcreatormobile.ckeapi.api.draft;

import com.bytedance.effectcreatormobile.draft.DraftImpl;
import com.bytedance.news.common.service.manager.IServiceProxy;
import java.util.Map;

/* loaded from: classes34.dex */
public class ICKDraftManager__ServiceProxy implements IServiceProxy<ICKDraftManager> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public ICKDraftManager newInstance() {
        return new DraftImpl();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.ckeapi.api.draft.ICKDraftManager", "com.bytedance.effectcreatormobile.draft.DraftImpl");
    }
}
