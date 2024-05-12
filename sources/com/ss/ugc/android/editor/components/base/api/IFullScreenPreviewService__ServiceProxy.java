package com.ss.ugc.android.editor.components.base.api;

import com.bytedance.news.common.service.manager.IServiceProxy;
import com.ss.ugc.android.editor.components.fullscreenpreview.DefaultFullScreenPreviewService;
import java.util.Map;

/* loaded from: classes3.dex */
public class IFullScreenPreviewService__ServiceProxy implements IServiceProxy<IFullScreenPreviewService> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IFullScreenPreviewService newInstance() {
        return new DefaultFullScreenPreviewService();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.ss.ugc.android.editor.components.base.api.IFullScreenPreviewService", "com.ss.ugc.android.editor.components.fullscreenpreview.DefaultFullScreenPreviewService");
    }
}
