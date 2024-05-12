package com.bytedance.effectcreatormobile.ckeapi.api.objectselect;

import com.bytedance.effectcreatormobile.objectselect.impl.PrefabPanelImpl;
import com.bytedance.news.common.service.manager.IServiceProxy;
import java.util.Map;

/* loaded from: classes34.dex */
public class PrefabPanel__ServiceProxy implements IServiceProxy<PrefabPanel> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public PrefabPanel newInstance() {
        return new PrefabPanelImpl();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.ckeapi.api.objectselect.PrefabPanel", "com.bytedance.effectcreatormobile.objectselect.impl.PrefabPanelImpl");
    }
}
