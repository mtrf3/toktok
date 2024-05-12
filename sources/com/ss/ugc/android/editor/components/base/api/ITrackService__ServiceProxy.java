package com.ss.ugc.android.editor.components.base.api;

import com.bytedance.news.common.service.manager.IServiceProxy;
import com.ss.ugc.android.editor.components.base.impl.TrackServiceImpl;
import java.util.Map;

/* loaded from: classes3.dex */
public class ITrackService__ServiceProxy implements IServiceProxy<ITrackService> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public ITrackService newInstance() {
        return new TrackServiceImpl();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.ss.ugc.android.editor.components.base.api.ITrackService", "com.ss.ugc.android.editor.components.base.impl.TrackServiceImpl");
    }
}
