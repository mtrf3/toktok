package com.ss.android.ugc.aweme.bullet.business;

import X.C58909NAb;
import X.InterfaceC59440NUm;
import X.N5S;
import X.NH3;
import X.NTF;
import android.content.Intent;
import com.ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public final class WalletBusiness extends BulletBusinessService.Business {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletBusiness(N5S bulletBusiness) {
        super(bulletBusiness);
        o.LJIIIZ(bulletBusiness, "bulletBusiness");
    }

    public static void LIZ(String str, int i, int i2, Intent intent) {
        if (str != null && s.LJJJLZIJ(str, "wallet/home", false)) {
            C58909NAb.LIZ.getClass();
            InterfaceC59440NUm LIZ = NH3.LIZ();
            if (LIZ != null) {
                ((NTF) LIZ).LJJIIZ();
            }
        }
    }
}
