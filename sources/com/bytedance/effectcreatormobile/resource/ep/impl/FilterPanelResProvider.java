package com.bytedance.effectcreatormobile.resource.ep.impl;

import X.C93726aVW;
import X.C93842aXO;
import X.C93843aXP;
import X.C94636akC;
import X.C94637akD;
import X.InterfaceC93663aUV;
import com.bytedance.effectcreatormobile.objectselect.api.AssetsLibData;
import com.bytedance.effectcreatormobile.objectselect.api.IFilterPanelResProvider;
import com.bytedance.effectcreatormobile.resource.ep.api.IEffectPlatformResourceProvider;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class FilterPanelResProvider implements IFilterPanelResProvider {
    public final C93842aXO config = C93843aXP.LIZ().getEffectPlatformConfig();

    @Override // com.bytedance.effectcreatormobile.objectselect.api.IFilterPanelResProvider
    public void getAllResourceList(InterfaceC93663aUV<? super AssetsLibData> listener) {
        o.LJIIIZ(listener, "listener");
        IEffectPlatformResourceProvider LIZ = C93726aVW.LIZ();
        this.config.getClass();
        LIZ.panelFetch("effecttoolfilter", new C94636akC(), listener);
    }

    @Override // com.bytedance.effectcreatormobile.objectselect.api.IFilterPanelResProvider
    public void getResourceList(InterfaceC93663aUV<? super AssetsLibData> listener) {
        o.LJIIIZ(listener, "listener");
        IEffectPlatformResourceProvider LIZ = C93726aVW.LIZ();
        this.config.getClass();
        LIZ.panelFetch("effecttoolfilter", new C94637akD(null), listener);
    }

    @Override // com.bytedance.effectcreatormobile.objectselect.api.IFilterPanelResProvider
    public void downloadRes(String extra, InterfaceC93663aUV<? super String> resultListener) {
        o.LJIIIZ(extra, "extra");
        o.LJIIIZ(resultListener, "resultListener");
        C93726aVW.LIZ().downloadRes(extra, resultListener);
    }
}
