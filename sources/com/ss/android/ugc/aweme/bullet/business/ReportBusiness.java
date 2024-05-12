package com.ss.android.ugc.aweme.bullet.business;

import X.C58909NAb;
import X.N5S;
import X.NH3;
import X.NTF;
import android.app.Activity;
import com.ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ReportBusiness extends BulletBusinessService.Business {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportBusiness(N5S bulletBusiness) {
        super(bulletBusiness);
        o.LJIIIZ(bulletBusiness, "bulletBusiness");
    }

    public static void LIZ(Activity activity, String str) {
        C58909NAb.LIZ.getClass();
        if (NH3.LIZ() != null) {
            NTF.LJIJJ(activity, str);
        }
    }
}
