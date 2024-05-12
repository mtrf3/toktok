package com.ss.android.ugc.aweme.utils;

import X.C42453GlN;
import X.C58096Mr6;
import X.C62905OmT;
import X.C62906OmU;
import X.DialogInterfaceOnClickListenerC42454GlO;
import Y.IDCListenerS79S0000000_7;
import android.app.Activity;
import com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper;
import com.zhiliaoapp.musically.R;

/* loaded from: classes8.dex */
public final class NotificationClickHelperImpl implements NotificationClickHelper {
    public static NotificationClickHelper LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(NotificationClickHelper.class, false);
        if (LIZ != null) {
            return (NotificationClickHelper) LIZ;
        }
        if (C58096Mr6.W7 == null) {
            synchronized (NotificationClickHelper.class) {
                if (C58096Mr6.W7 == null) {
                    C58096Mr6.W7 = new NotificationClickHelperImpl();
                }
            }
        }
        return C58096Mr6.W7;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper
    public final boolean LIZ(Activity activity, boolean z, boolean z2, boolean z3, String str) {
        if (z) {
            C62905OmT c62905OmT = new C62905OmT(activity);
            c62905OmT.LJ(R.string.jbw);
            c62905OmT.LIZ(R.string.jbu);
            c62905OmT.LJIIIIZZ(R.string.gt7, new IDCListenerS79S0000000_7(0), false);
            c62905OmT.LJIIJJI(R.string.blv, new DialogInterfaceOnClickListenerC42454GlO(activity, str, z2, z3), false);
            new C62906OmU(c62905OmT).LIZLLL();
            return true;
        }
        return C42453GlN.LIZ(activity, str, z2, z3);
    }
}
