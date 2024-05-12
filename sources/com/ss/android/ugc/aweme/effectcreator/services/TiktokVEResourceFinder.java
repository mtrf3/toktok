package com.ss.android.ugc.aweme.effectcreator.services;

import X.C221108m2;
import X.C5H3;
import X.C94136ac8;
import X.C94560aiy;
import X.XAT;
import com.bef.effectsdk.ResourceFinder;
import com.bytedance.effectcreatormobile.resource.ep.api.IVERourceProvider;

/* loaded from: classes34.dex */
public final class TiktokVEResourceFinder implements IVERourceProvider<ResourceFinder, XAT> {
    public final C5H3 abtest$delegate = C221108m2.LIZIZ(C94560aiy.LJLIL);

    private final XAT getAbtest() {
        return (XAT) this.abtest$delegate.getValue();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.effectcreatormobile.resource.ep.api.IVERourceProvider
    public ResourceFinder getVEResourceFinder() {
        return new C94136ac8();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.effectcreatormobile.resource.ep.api.IVERourceProvider
    public XAT getEPABTest() {
        return getAbtest();
    }
}
