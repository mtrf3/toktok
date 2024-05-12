package com.bytedance.effectcreatormobile.ckeapi.api.assetEditor;

import com.bytedance.effectcreatormobile.assetEditor.AssetEditorImpl;
import com.bytedance.news.common.service.manager.IServiceProxy;
import java.util.Map;

/* loaded from: classes34.dex */
public class IAssetEditor__ServiceProxy implements IServiceProxy<IAssetEditor> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IAssetEditor newInstance() {
        return new AssetEditorImpl();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.ckeapi.api.assetEditor.IAssetEditor", "com.bytedance.effectcreatormobile.assetEditor.AssetEditorImpl");
    }
}
