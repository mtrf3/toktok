package com.ss.android.ugc.aweme.services;

import X.C58096Mr6;
import X.FKM;
import android.app.Application;
import com.bytedance.ies.powerlist.IPowerContext;

/* loaded from: classes4.dex */
public final class PowerContextImpl implements IPowerContext {
    @Override // com.bytedance.ies.powerlist.IPowerContext
    public Application getApplication() {
        return FKM.LIZ();
    }

    public static IPowerContext createIPowerContextbyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IPowerContext.class, z);
        if (LIZ != null) {
            return (IPowerContext) LIZ;
        }
        if (C58096Mr6.Y5 == null) {
            synchronized (IPowerContext.class) {
                if (C58096Mr6.Y5 == null) {
                    C58096Mr6.Y5 = new PowerContextImpl();
                }
            }
        }
        return C58096Mr6.Y5;
    }
}
