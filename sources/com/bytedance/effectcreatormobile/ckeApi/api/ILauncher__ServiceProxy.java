package com.bytedance.effectcreatormobile.ckeapi.api;

import com.bytedance.news.common.service.manager.IServiceProxy;
import com.bytedance.ugc.effectcreator.main.launcher.impl.Launcher;
import java.util.Map;

/* loaded from: classes34.dex */
public class ILauncher__ServiceProxy implements IServiceProxy<ILauncher> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public ILauncher newInstance() {
        return new Launcher();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.ckeapi.api.ILauncher", "com.bytedance.ugc.effectcreator.main.launcher.impl.Launcher");
    }
}
