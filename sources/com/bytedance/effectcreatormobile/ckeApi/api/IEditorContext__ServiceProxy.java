package com.bytedance.effectcreatormobile.ckeapi.api;

import com.bytedance.news.common.service.manager.IServiceProxy;
import com.ugc.effectcreator.effectcore.sdk.context.EditorContextImpl;
import java.util.Map;

/* loaded from: classes34.dex */
public class IEditorContext__ServiceProxy implements IServiceProxy<IEditorContext> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IEditorContext newInstance() {
        return new EditorContextImpl();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.ckeapi.api.IEditorContext", "com.ugc.effectcreator.effectcore.sdk.context.EditorContextImpl");
    }
}
