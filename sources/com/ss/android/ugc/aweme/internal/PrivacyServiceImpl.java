package com.ss.android.ugc.aweme.internal;

import X.AV1;
import X.C58096Mr6;
import X.HG3;

/* loaded from: classes8.dex */
public final class PrivacyServiceImpl implements IPrivacyService {
    public static IPrivacyService LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(IPrivacyService.class, false);
        if (LIZ != null) {
            return (IPrivacyService) LIZ;
        }
        if (C58096Mr6.C1 == null) {
            synchronized (IPrivacyService.class) {
                if (C58096Mr6.C1 == null) {
                    C58096Mr6.C1 = new PrivacyServiceImpl();
                }
            }
        }
        return C58096Mr6.C1;
    }

    @Override // com.ss.android.ugc.aweme.internal.IPrivacyService
    public final boolean LIZ() {
        return HG3.LJIILL().getCurUser().isAccuratePrivateAccount();
    }

    @Override // com.ss.android.ugc.aweme.internal.IPrivacyService
    public final boolean isChildrenMode() {
        return AV1.LJIIJJI();
    }
}
