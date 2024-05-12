package com.bytedance.effectcreatormobile.ckeapi.api.foundation.dialog;

import com.bytedance.news.common.service.manager.IServiceProxy;
import com.ugc.effectcreator.foundation.dialog.DefaultDialog;
import java.util.Map;

/* loaded from: classes34.dex */
public class IDialog__ServiceProxy implements IServiceProxy<IDialog> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IDialog newInstance() {
        return new DefaultDialog();
    }

    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.effectcreatormobile.ckeapi.api.foundation.dialog.IDialog", "com.ugc.effectcreator.foundation.dialog.DefaultDialog");
    }
}
