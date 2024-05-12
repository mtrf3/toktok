package com.bytedance.effectcreatormobile.ckeapi.api.icanvas;

import com.bytedance.news.common.service.manager.IServiceProxy;
import com.ugc.effectcreator.canvas.CanvasImpl;
import java.util.Map;

/* loaded from: classes34.dex */
public class ICanvas__ServiceProxy implements IServiceProxy<ICanvas> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public ICanvas newInstance() {
        return new CanvasImpl();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.ckeapi.api.icanvas.ICanvas", "com.ugc.effectcreator.canvas.CanvasImpl");
    }
}
