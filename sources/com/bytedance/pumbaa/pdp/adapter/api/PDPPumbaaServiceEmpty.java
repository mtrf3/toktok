package com.bytedance.pumbaa.pdp.adapter.api;

import X.C65935PuF;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class PDPPumbaaServiceEmpty implements IPDPPumbaaService {
    @Override // com.bytedance.pumbaa.pdp.adapter.api.IPDPPumbaaService, com.bytedance.pumbaa.base.ICommonService
    public final void updateSettings() {
    }

    @Override // com.bytedance.pumbaa.pdp.adapter.api.IPDPPumbaaService, com.bytedance.pumbaa.base.ICommonService
    public final void init(C65935PuF appInfo, Object proxy, Object obj, Object obj2) {
        o.LJIIIZ(appInfo, "appInfo");
        o.LJIIIZ(proxy, "proxy");
    }
}
