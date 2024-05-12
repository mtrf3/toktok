package com.bytedance.effectcreatormobile.resource.ep.impl;

import X.C93726aVW;
import X.C93842aXO;
import X.C93843aXP;
import X.C94636akC;
import X.InterfaceC93663aUV;
import com.bytedance.effectcreatormobile.objectselect.api.AssetsLibData;
import com.bytedance.effectcreatormobile.objectselect.api.IMakeUpResProvider;
import com.bytedance.effectcreatormobile.resource.ep.api.IEffectPlatformResourceProvider;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class MakeupLibResProvider implements IMakeUpResProvider {
    public final C93842aXO config = C93843aXP.LIZ().getEffectPlatformConfig();

    @Override // com.bytedance.effectcreatormobile.objectselect.api.IMakeUpResProvider
    public void getResourceList(InterfaceC93663aUV<? super AssetsLibData> listener) {
        o.LJIIIZ(listener, "listener");
        IEffectPlatformResourceProvider LIZ = C93726aVW.LIZ();
        this.config.getClass();
        LIZ.panelFetch("effecttoolmakeup", new C94636akC(), listener);
    }

    @Override // com.bytedance.effectcreatormobile.objectselect.api.IMakeUpResProvider
    public void downloadRes(String extra, InterfaceC93663aUV<? super String> resultListener) {
        o.LJIIIZ(extra, "extra");
        o.LJIIIZ(resultListener, "resultListener");
        C93726aVW.LIZ().downloadRes(extra, resultListener);
    }
}
