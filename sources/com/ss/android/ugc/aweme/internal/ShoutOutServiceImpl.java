package com.ss.android.ugc.aweme.internal;

import X.C2U8;
import X.C54214LPm;
import X.C58096Mr6;
import X.C9X3;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ShoutOutServiceImpl implements IShoutOutApiService {
    public static IShoutOutApiService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IShoutOutApiService.class, false);
        if (LIZ != null) {
            return (IShoutOutApiService) LIZ;
        }
        if (C58096Mr6.E1 == null) {
            synchronized (IShoutOutApiService.class) {
                if (C58096Mr6.E1 == null) {
                    C58096Mr6.E1 = new ShoutOutServiceImpl();
                }
            }
        }
        return C58096Mr6.E1;
    }

    @Override // com.ss.android.ugc.aweme.internal.IShoutOutApiService
    public final void LIZ() {
        C2U8.LIZ(new C54214LPm());
    }

    @Override // com.ss.android.ugc.aweme.internal.IShoutOutApiService
    public final void LIZIZ(long j, String key) {
        o.LJIIIZ(key, "key");
        C9X3.LIZ.LJ(key, String.valueOf(j));
    }
}
