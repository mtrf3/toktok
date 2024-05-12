package com.bytedance.effectcreatormobile.camera;

import X.C93745aVp;
import X.InterfaceC93663aUV;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class MainRes implements IMainRes {
    public static final MainRes INSTANCE = new MainRes();
    public final /* synthetic */ IMainRes $$delegate_0 = (IMainRes) C93745aVp.LIZ(IMainRes.class);

    @Override // com.bytedance.effectcreatormobile.camera.IMainRes
    public void ensureDraftModels(String draftPath, InterfaceC93663aUV<? super String> listener) {
        o.LJIIIZ(draftPath, "draftPath");
        o.LJIIIZ(listener, "listener");
        this.$$delegate_0.ensureDraftModels(draftPath, listener);
    }

    @Override // com.bytedance.effectcreatormobile.camera.IMainRes
    public void fetchMainDraftRes(boolean z, InterfaceC93663aUV<? super String> listener) {
        o.LJIIIZ(listener, "listener");
        this.$$delegate_0.fetchMainDraftRes(z, listener);
    }
}
