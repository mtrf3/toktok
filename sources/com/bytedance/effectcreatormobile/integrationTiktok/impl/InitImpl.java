package com.bytedance.effectcreatormobile.integrationTiktok.impl;

import X.C58096Mr6;
import com.bytedance.effectcreatormobile.ckeapi.api.IInit;
import com.bytedance.effectcreatormobile.integrationTiktok.api.IInitCaller;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class InitImpl implements IInit {
    @Override // com.bytedance.effectcreatormobile.ckeapi.api.IInit
    public void onInit() {
        IInitCaller iInitCaller;
        Object LIZ = C58096Mr6.LIZ(IInitCaller.class, false);
        if (LIZ != null) {
            iInitCaller = (IInitCaller) LIZ;
        } else {
            if (C58096Mr6.n0 == null) {
                synchronized (IInitCaller.class) {
                    if (C58096Mr6.n0 == null) {
                        C58096Mr6.n0 = new com.ss.android.ugc.aweme.effectcreator.services.InitImpl();
                    }
                }
            }
            iInitCaller = (com.ss.android.ugc.aweme.effectcreator.services.InitImpl) C58096Mr6.n0;
        }
        o.LJIIIIZZ(iInitCaller, "ServiceManager.get().get…(IInitCaller::class.java)");
        iInitCaller.onInit();
    }
}
