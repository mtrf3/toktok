package com.bytedance.effectcreatormobile.ckeapi.api.objectselect;

import com.bytedance.effectcreatormobile.objectselect.impl.ObjectSelectImpl;
import com.bytedance.news.common.service.manager.IServiceProxy;
import java.util.Map;

/* loaded from: classes34.dex */
public class IObjectSelect__ServiceProxy implements IServiceProxy<IObjectSelect> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IObjectSelect newInstance() {
        return new ObjectSelectImpl();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.ckeapi.api.objectselect.IObjectSelect", "com.bytedance.effectcreatormobile.objectselect.impl.ObjectSelectImpl");
    }
}
