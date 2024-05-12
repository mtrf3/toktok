package com.bytedance.effectcreatormobile.ckeapi.api;

import com.bytedance.effectcreatormobile.camera.impl.CameraRenderImpl;
import com.bytedance.news.common.service.manager.IServiceProxy;
import java.util.Map;

/* loaded from: classes34.dex */
public class ICameraRender__ServiceProxy implements IServiceProxy<ICameraRender> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public ICameraRender newInstance() {
        return new CameraRenderImpl();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.ckeapi.api.ICameraRender", "com.bytedance.effectcreatormobile.camera.impl.CameraRenderImpl");
    }
}
