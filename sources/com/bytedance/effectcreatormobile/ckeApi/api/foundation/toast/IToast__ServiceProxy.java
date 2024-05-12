package com.bytedance.effectcreatormobile.ckeapi.api.foundation.toast;

import com.bytedance.news.common.service.manager.IServiceProxy;
import com.ugc.effectcreator.foundation.toast.DefaultToast;
import java.util.Map;

/* loaded from: classes34.dex */
public class IToast__ServiceProxy implements IServiceProxy<IToast> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IToast newInstance() {
        return new DefaultToast();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.ckeapi.api.foundation.toast.IToast", "com.ugc.effectcreator.foundation.toast.DefaultToast");
    }
}
