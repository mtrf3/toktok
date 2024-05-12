package com.ss.ugc.android.editor.components.base.api;

import com.bytedance.news.common.service.manager.IServiceProxy;
import com.ss.ugc.android.editor.components.base.impl.FunctionBarServiceImpl;
import java.util.Map;

/* loaded from: classes3.dex */
public class IFunctionBarService__ServiceProxy implements IServiceProxy<IFunctionBarService> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IFunctionBarService newInstance() {
        return new FunctionBarServiceImpl();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.ss.ugc.android.editor.components.base.api.IFunctionBarService", "com.ss.ugc.android.editor.components.base.impl.FunctionBarServiceImpl");
    }
}
