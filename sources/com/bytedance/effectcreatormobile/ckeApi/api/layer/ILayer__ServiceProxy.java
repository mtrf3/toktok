package com.bytedance.effectcreatormobile.ckeapi.api.layer;

import com.bytedance.news.common.service.manager.IServiceProxy;
import com.ugc.effectcreator.layer.LayerImpl;
import java.util.Map;

/* loaded from: classes34.dex */
public class ILayer__ServiceProxy implements IServiceProxy<ILayer> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public ILayer newInstance() {
        return new LayerImpl();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.ckeapi.api.layer.ILayer", "com.ugc.effectcreator.layer.LayerImpl");
    }
}
