package com.bytedance.effectcreatormobile.ckeapi.api;

import com.bytedance.news.common.service.manager.IServiceProxy;
import com.ugc.effectcreator.effectcore.sdk.model.EditorModelImpl;
import java.util.Map;

/* loaded from: classes34.dex */
public class IEditorModel__ServiceProxy implements IServiceProxy<IEditorModel> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IEditorModel newInstance() {
        return new EditorModelImpl();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.ckeapi.api.IEditorModel", "com.ugc.effectcreator.effectcore.sdk.model.EditorModelImpl");
    }
}
