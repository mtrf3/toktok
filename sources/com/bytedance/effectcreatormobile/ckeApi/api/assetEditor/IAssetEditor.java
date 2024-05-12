package com.bytedance.effectcreatormobile.ckeapi.api.assetEditor;

import X.EnumC93978aZa;
import X.InterfaceC70352pT;
import X.InterfaceC71762rk;
import X.InterfaceC93980aZc;
import com.bytedance.news.common.service.manager.IService;

/* loaded from: classes34.dex */
public interface IAssetEditor extends IService {
    InterfaceC70352pT<EnumC93978aZa> getEditorEvent();

    InterfaceC71762rk<Boolean> getFocusState();

    InterfaceC93980aZc queryHandler(long j, String str);
}
