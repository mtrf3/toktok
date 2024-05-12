package com.bytedance.effectcreatormobile.ckeapi.api.foundation.log;

import com.bytedance.news.common.service.manager.IServiceProxy;
import com.ugc.effectcreator.foundation.log.ECLogImpl;
import java.util.Map;

/* loaded from: classes34.dex */
public class ILog__ServiceProxy implements IServiceProxy<ILog> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public ILog newInstance() {
        return new ECLogImpl();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.ckeapi.api.foundation.log.ILog", "com.ugc.effectcreator.foundation.log.ECLogImpl");
    }
}
