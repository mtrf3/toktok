package com.bytedance.effectcreatormobile.ckeapi.api.main;

import com.bytedance.news.common.service.manager.IServiceProxy;
import com.bytedance.ugc.effectcreator.main.model.AutoChangeModel;
import java.util.Map;

/* loaded from: classes34.dex */
public class IAutoChangeModel__ServiceProxy implements IServiceProxy<IAutoChangeModel> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IAutoChangeModel newInstance() {
        return new AutoChangeModel();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.ckeapi.api.main.IAutoChangeModel", "com.bytedance.ugc.effectcreator.main.model.AutoChangeModel");
    }
}
