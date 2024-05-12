package com.ss.android.ugc.aweme.utils;

import X.C58096Mr6;
import X.C61017Nx7;
import X.EF7;
import X.M59;
import X.M5A;
import com.ss.android.ugc.aweme.notice.api.helper.WSHelper;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class WSHelperImpl implements WSHelper {
    public static WSHelper LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(WSHelper.class, false);
        if (LIZ != null) {
            return (WSHelper) LIZ;
        }
        if (C58096Mr6.Y7 == null) {
            synchronized (WSHelper.class) {
                if (C58096Mr6.Y7 == null) {
                    C58096Mr6.Y7 = new WSHelperImpl();
                }
            }
        }
        return C58096Mr6.Y7;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.WSHelper
    public final int getAppVersionCode() {
        return (int) EF7.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.WSHelper
    public final boolean isAppBackground() {
        return C61017Nx7.LIZ().LIZ.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.WSHelper
    public final void LIZ(M5A observer) {
        o.LJIIIZ(observer, "observer");
        M59.LIZIZ().LIZJ(observer);
    }
}
