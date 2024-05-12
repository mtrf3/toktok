package com.bytedance.effectcreatormobile.ckeapi.api.foundation.pagestatus;

import com.bytedance.news.common.service.manager.IServiceProxy;
import com.ugc.effectcreator.foundation.pagestatus.StatusPageProviderImpl;
import java.util.Map;

/* loaded from: classes34.dex */
public class IStatusPageProvider__ServiceProxy implements IServiceProxy<IStatusPageProvider> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IStatusPageProvider newInstance() {
        return new StatusPageProviderImpl();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.ckeapi.api.foundation.pagestatus.IStatusPageProvider", "com.ugc.effectcreator.foundation.pagestatus.StatusPageProviderImpl");
    }
}
