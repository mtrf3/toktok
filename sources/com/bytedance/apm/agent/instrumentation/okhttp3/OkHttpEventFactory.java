package com.bytedance.apm.agent.instrumentation.okhttp3;

import X.AbstractC64590PWo;
import X.InterfaceC48133Iun;
import X.PXC;

/* loaded from: classes.dex */
public class OkHttpEventFactory implements PXC {
    public PXC originFactory;

    public OkHttpEventFactory(PXC pxc) {
        this.originFactory = pxc;
    }

    @Override // X.PXC
    public AbstractC64590PWo create(InterfaceC48133Iun interfaceC48133Iun) {
        AbstractC64590PWo abstractC64590PWo;
        PXC pxc = this.originFactory;
        if (pxc != null) {
            abstractC64590PWo = pxc.create(interfaceC48133Iun);
        } else {
            abstractC64590PWo = null;
        }
        return new OkHttpEventListener(abstractC64590PWo);
    }
}
