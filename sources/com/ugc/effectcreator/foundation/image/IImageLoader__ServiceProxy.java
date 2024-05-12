package com.ugc.effectcreator.foundation.image;

import com.bytedance.news.common.service.manager.IServiceProxy;
import java.util.Map;

/* loaded from: classes34.dex */
public class IImageLoader__ServiceProxy implements IServiceProxy<IImageLoader> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IImageLoader newInstance() {
        return new ImageLoader();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.ugc.effectcreator.foundation.image.IImageLoader", "com.ugc.effectcreator.foundation.image.ImageLoader");
    }
}
