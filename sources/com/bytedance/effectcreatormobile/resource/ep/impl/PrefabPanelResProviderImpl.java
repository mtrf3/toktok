package com.bytedance.effectcreatormobile.resource.ep.impl;

import X.C78555UsJ;
import X.C93726aVW;
import X.C94110abi;
import X.C94636akC;
import X.InterfaceC67352kd;
import X.XKS;
import com.bytedance.effectcreatormobile.objectselect.api.AssetsLibData;
import com.bytedance.effectcreatormobile.objectselect.api.PrefabPanelResProvider;

/* loaded from: classes34.dex */
public final class PrefabPanelResProviderImpl implements PrefabPanelResProvider {
    @Override // com.bytedance.effectcreatormobile.objectselect.api.PrefabPanelResProvider
    public Object getAllResourceList(String str, InterfaceC67352kd<? super AssetsLibData> interfaceC67352kd) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        C93726aVW.LIZ().panelFetch(str, new C94636akC(), new C94110abi(xks));
        return xks.LJIIJJI();
    }
}
