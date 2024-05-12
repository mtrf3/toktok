package com.bytedance.effectcreatormobile.resource.ep.impl;

import X.C93726aVW;
import X.C93842aXO;
import X.C93843aXP;
import X.C94411agZ;
import X.C94642akI;
import X.InterfaceC93663aUV;
import com.bytedance.effectcreatormobile.objectselect.api.IEffectDataResProvider;
import com.bytedance.effectcreatormobile.resource.ep.api.IEffectPlatformResourceProvider;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class EffectDataResProvider implements IEffectDataResProvider {
    public final C93842aXO config = C93843aXP.LIZ().getEffectPlatformConfig();

    @Override // com.bytedance.effectcreatormobile.objectselect.api.IEffectDataResProvider
    public void getResourceList(InterfaceC93663aUV<? super C94411agZ> listener) {
        o.LJIIIZ(listener, "listener");
        IEffectPlatformResourceProvider LIZ = C93726aVW.LIZ();
        this.config.getClass();
        LIZ.panelFetch("effecttoolobject", new C94642akI(), listener);
    }

    @Override // com.bytedance.effectcreatormobile.objectselect.api.IEffectDataResProvider
    public void downloadRes(String extra, InterfaceC93663aUV<? super String> resultListener) {
        o.LJIIIZ(extra, "extra");
        o.LJIIIZ(resultListener, "resultListener");
        C93726aVW.LIZ().downloadRes(extra, resultListener);
    }
}
