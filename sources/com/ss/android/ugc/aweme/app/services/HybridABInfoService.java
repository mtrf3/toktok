package com.ss.android.ugc.aweme.app.services;

import X.C58096Mr6;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class HybridABInfoService implements IHybridABInfoService {
    public Boolean LIZ;

    public static IHybridABInfoService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IHybridABInfoService.class, false);
        if (LIZ != null) {
            return (IHybridABInfoService) LIZ;
        }
        if (C58096Mr6.LLILIL == null) {
            synchronized (IHybridABInfoService.class) {
                if (C58096Mr6.LLILIL == null) {
                    C58096Mr6.LLILIL = new HybridABInfoService();
                }
            }
        }
        return C58096Mr6.LLILIL;
    }

    @Override // com.ss.android.ugc.aweme.app.services.IHybridABInfoService
    public final Integer LIZIZ() {
        Boolean bool = this.LIZ;
        if (o.LJ(bool, Boolean.TRUE)) {
            return 1;
        }
        if (o.LJ(bool, Boolean.FALSE)) {
            return 0;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.app.services.IHybridABInfoService
    public final void LIZ(boolean z) {
        this.LIZ = Boolean.valueOf(z);
    }
}
