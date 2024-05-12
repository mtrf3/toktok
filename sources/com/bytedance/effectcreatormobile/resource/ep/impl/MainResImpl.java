package com.bytedance.effectcreatormobile.resource.ep.impl;

import X.C93726aVW;
import X.C93842aXO;
import X.C93843aXP;
import X.C94107abf;
import X.C94644akK;
import X.InterfaceC93663aUV;
import com.bytedance.effectcreatormobile.camera.IMainRes;
import com.bytedance.effectcreatormobile.resource.ep.api.IEffectPlatformResourceProvider;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class MainResImpl implements IMainRes {
    public final C93842aXO config = C93843aXP.LIZ().getEffectPlatformConfig();

    @Override // com.bytedance.effectcreatormobile.camera.IMainRes
    public void ensureDraftModels(String draftPath, InterfaceC93663aUV<? super String> listener) {
        o.LJIIIZ(draftPath, "draftPath");
        o.LJIIIZ(listener, "listener");
        C93726aVW.LIZ().ensureRequiredModels(draftPath, listener);
    }

    @Override // com.bytedance.effectcreatormobile.camera.IMainRes
    public void fetchMainDraftRes(boolean z, InterfaceC93663aUV<? super String> listener) {
        o.LJIIIZ(listener, "listener");
        IEffectPlatformResourceProvider LIZ = C93726aVW.LIZ();
        this.config.getClass();
        this.config.getClass();
        LIZ.categoryFetch("effecttooldefault", "main_draft", z, new C94644akK(), new C94107abf(listener));
    }
}
