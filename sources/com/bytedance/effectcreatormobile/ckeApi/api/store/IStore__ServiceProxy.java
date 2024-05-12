package com.bytedance.effectcreatormobile.ckeapi.api.store;

import com.bytedance.news.common.service.manager.IServiceProxy;
import com.bytedance.ugc.effectcreator.main.KVStore;
import java.util.Map;

/* loaded from: classes34.dex */
public class IStore__ServiceProxy implements IServiceProxy<IStore> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IStore newInstance() {
        return new KVStore();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.ckeapi.api.store.IStore", "com.bytedance.ugc.effectcreator.main.KVStore");
    }
}
