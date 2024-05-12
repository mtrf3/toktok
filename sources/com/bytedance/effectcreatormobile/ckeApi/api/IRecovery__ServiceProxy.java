package com.bytedance.effectcreatormobile.ckeapi.api;

import com.bytedance.news.common.service.manager.IServiceProxy;
import com.bytedance.ugc.effectcreator.main.recovery.RecoveryImpl;
import java.util.Map;

/* loaded from: classes34.dex */
public class IRecovery__ServiceProxy implements IServiceProxy<IRecovery> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IRecovery newInstance() {
        return new RecoveryImpl();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.ckeapi.api.IRecovery", "com.bytedance.ugc.effectcreator.main.recovery.RecoveryImpl");
    }
}
