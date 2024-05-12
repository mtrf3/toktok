package com.ss.android.ugc.aweme.pipo;

import X.APL;
import X.ActivityC45651qj;
import X.C37131Ehj;
import X.C37132Ehk;
import X.C37256Ejk;
import X.C37257Ejl;
import X.C58096Mr6;
import X.C76800UCe;
import X.EnumC217558gJ;
import X.F5Q;
import X.F5R;
import X.InterfaceC88472Yns;
import X.SAK;
import com.ss.android.ugc.aweme.bnpl.BNPLServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.bnpl.BnplMiddleActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PipoService implements IPipoService {
    public static IPipoService LJ() {
        Object LIZ = C58096Mr6.LIZ(IPipoService.class, false);
        if (LIZ != null) {
            return (IPipoService) LIZ;
        }
        if (C58096Mr6.Q3 == null) {
            synchronized (IPipoService.class) {
                if (C58096Mr6.Q3 == null) {
                    C58096Mr6.Q3 = new PipoService();
                }
            }
        }
        return C58096Mr6.Q3;
    }

    @Override // com.ss.android.ugc.aweme.pipo.IPipoService
    public final boolean LIZJ() {
        return C37256Ejk.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.pipo.IPipoService
    public final void LIZIZ(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        EnumC217558gJ downloadPolicy = EnumC217558gJ.REPLACE;
        o.LJIIIZ(downloadPolicy, "downloadPolicy");
        if (C37256Ejk.LIZ()) {
            interfaceC88472Yns.invoke(Boolean.TRUE);
            return;
        }
        C37257Ejl c37257Ejl = new C37257Ejl(interfaceC88472Yns);
        C37132Ehk c37132Ehk = new C37132Ehk();
        c37132Ehk.LIZ = "com.ss.android.ugc.aweme.df_pipo_bnpl";
        c37132Ehk.LIZIZ = true;
        F5Q f5q = new F5Q();
        f5q.LIZ = false;
        f5q.LJI = downloadPolicy;
        c37132Ehk.LJ = new F5R(f5q);
        c37132Ehk.LIZLLL = c37257Ejl;
        C37256Ejk.LIZIZ.LIZ(new C37131Ehj(c37132Ehk));
    }

    @Override // com.ss.android.ugc.aweme.pipo.IPipoService
    public final boolean LIZLLL(BnplMiddleActivity activity, String token, String apiHost, String str, String merchantId, String merchantUserId, String priorityRegion, String str2) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(token, "token");
        o.LJIIIZ(apiHost, "apiHost");
        o.LJIIIZ(merchantId, "merchantId");
        o.LJIIIZ(merchantUserId, "merchantUserId");
        o.LJIIIZ(priorityRegion, "priorityRegion");
        if (C37256Ejk.LIZ()) {
            BNPLServiceImpl.LIZJ().LIZIZ(activity, token, apiHost, str, merchantId, merchantUserId, priorityRegion, str2);
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.pipo.IPipoService
    public final boolean LIZ(ActivityC45651qj activityC45651qj, String verifyInfo, String token, String apiHost, String source, String merchantId, String merchantUserId, APL pageStyle, String priorityRegion, InterfaceC88472Yns<? super SAK, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(verifyInfo, "verifyInfo");
        o.LJIIIZ(token, "token");
        o.LJIIIZ(apiHost, "apiHost");
        o.LJIIIZ(source, "source");
        o.LJIIIZ(merchantId, "merchantId");
        o.LJIIIZ(merchantUserId, "merchantUserId");
        o.LJIIIZ(pageStyle, "pageStyle");
        o.LJIIIZ(priorityRegion, "priorityRegion");
        if (C37256Ejk.LIZ()) {
            BNPLServiceImpl.LIZJ().LIZ(activityC45651qj, verifyInfo, token, apiHost, source, merchantId, merchantUserId, pageStyle, priorityRegion, interfaceC88472Yns);
            return true;
        }
        return false;
    }
}
