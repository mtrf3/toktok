package com.bytedance.ies.im.core.service;

import X.C108194Ml;
import X.C4TY;
import X.C4Z2;
import X.C58096Mr6;
import android.os.SystemClock;
import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;

/* loaded from: classes2.dex */
public final class IMCoreProxyService implements IIMCoreProxyService {
    public static final long LIZ = SystemClock.elapsedRealtime();
    public static final /* synthetic */ int LIZIZ = 0;

    public static IIMCoreProxyService LIZJ() {
        Object LIZ2 = C58096Mr6.LIZ(IIMCoreProxyService.class, false);
        if (LIZ2 != null) {
            return (IIMCoreProxyService) LIZ2;
        }
        if (C58096Mr6.LJIILL == null) {
            synchronized (IIMCoreProxyService.class) {
                if (C58096Mr6.LJIILL == null) {
                    C58096Mr6.LJIILL = new IMCoreProxyService();
                }
            }
        }
        return C58096Mr6.LJIILL;
    }

    @Override // com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService
    public final C108194Ml LIZ() {
        return (C108194Ml) C4TY.LIZ.getValue();
    }

    @Override // com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService
    public final C4Z2 LIZIZ() {
        return (C4Z2) C4TY.LIZIZ.getValue();
    }
}
