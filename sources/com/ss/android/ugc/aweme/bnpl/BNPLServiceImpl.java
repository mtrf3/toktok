package com.ss.android.ugc.aweme.bnpl;

import X.APL;
import X.ActivityC45651qj;
import X.C26045AKb;
import X.C48841JEv;
import X.C58096Mr6;
import X.C76800UCe;
import X.C78613UtF;
import X.C78685UuP;
import X.C91657Zy9;
import X.C91824a0q;
import X.C91825a0r;
import X.C91826a0s;
import X.C91924a2S;
import X.C92033a4D;
import X.C93058aKk;
import X.EnumC91923a2R;
import X.InterfaceC88472Yns;
import X.SAK;
import X.XKX;
import android.text.TextUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.bnpl.BnplMiddleActivity;
import kotlin.jvm.internal.IDqS14S0400000_31;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class BNPLServiceImpl implements IBNPLService {
    public static IBNPLService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IBNPLService.class, false);
        if (LIZ != null) {
            return (IBNPLService) LIZ;
        }
        if (C58096Mr6.LLJJIJIL == null) {
            synchronized (IBNPLService.class) {
                if (C58096Mr6.LLJJIJIL == null) {
                    C58096Mr6.LLJJIJIL = new BNPLServiceImpl();
                }
            }
        }
        return (BNPLServiceImpl) C58096Mr6.LLJJIJIL;
    }

    public final void LIZLLL(ActivityC45651qj activityC45651qj, String str, String str2, String str3, APL apl, InterfaceC88472Yns<? super SAK, C76800UCe> interfaceC88472Yns) {
        if (o.LJ(str, "PASS") && C78685UuP.LJJJZ(str2)) {
            C92033a4D.LIZJ(activityC45651qj, apl, str2, str3, new IDqS14S0400000_31(this, activityC45651qj, apl, interfaceC88472Yns, 0));
            return;
        }
        switch (str.hashCode()) {
            case -1881380961:
                if (!str.equals("REJECT")) {
                    return;
                }
                break;
            case 2448401:
                if (!str.equals("PASS")) {
                    return;
                }
                interfaceC88472Yns.invoke(SAK.PASS);
                return;
            case 35394935:
                if (!str.equals("PENDING")) {
                    return;
                }
                break;
            case 1980572282:
                if (!str.equals("CANCEL")) {
                    return;
                }
                interfaceC88472Yns.invoke(SAK.CANCEL);
                return;
            default:
                return;
        }
        interfaceC88472Yns.invoke(SAK.REJECT);
    }

    @Override // com.ss.android.ugc.aweme.bnpl.IBNPLService
    public final void LIZIZ(BnplMiddleActivity activity, String token, String apiHost, String str, String merchantId, String merchantUserId, String priorityRegion, String str2) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(token, "token");
        o.LJIIIZ(apiHost, "apiHost");
        o.LJIIIZ(merchantId, "merchantId");
        o.LJIIIZ(merchantUserId, "merchantUserId");
        o.LJIIIZ(priorityRegion, "priorityRegion");
        if (TextUtils.isEmpty(token)) {
            C26045AKb c26045AKb = new C26045AKb(activity);
            c26045AKb.LJIIIZ("token is empty");
            c26045AKb.LIZLLL(1200L);
            c26045AKb.LJIIJ();
            return;
        }
        if (TextUtils.isEmpty(apiHost)) {
            C26045AKb c26045AKb2 = new C26045AKb(activity);
            c26045AKb2.LJIIIZ("apiHost is empty");
            c26045AKb2.LIZLLL(1200L);
            c26045AKb2.LJIIJ();
            return;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(activity, "//bnpl/entry");
        buildRoute.withParam("host", apiHost);
        buildRoute.withParam("token", token);
        buildRoute.withParam("source", str);
        buildRoute.withParam("merchant_id", merchantId);
        buildRoute.withParam("merchant_user_id", merchantUserId);
        buildRoute.withParam("priority_region", priorityRegion);
        buildRoute.withParam("landing_info", str2);
        buildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.bnpl.IBNPLService
    public final void LIZ(ActivityC45651qj activityC45651qj, String verifyInfo, String token, String apiHost, String source, String merchantId, String merchantUserId, APL pageStyle, String priorityRegion, InterfaceC88472Yns<? super SAK, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(verifyInfo, "verifyInfo");
        o.LJIIIZ(token, "token");
        o.LJIIIZ(apiHost, "apiHost");
        o.LJIIIZ(source, "source");
        o.LJIIIZ(merchantId, "merchantId");
        o.LJIIIZ(merchantUserId, "merchantUserId");
        o.LJIIIZ(pageStyle, "pageStyle");
        o.LJIIIZ(priorityRegion, "priorityRegion");
        if (token.length() == 0 || verifyInfo.length() == 0 || apiHost.length() == 0) {
            StringBuffer stringBuffer = new StringBuffer();
            if (token.length() == 0) {
                stringBuffer.append("token,");
            }
            if (verifyInfo.length() == 0) {
                stringBuffer.append("verify info,");
            }
            if (apiHost.length() == 0) {
                stringBuffer.append("api host");
            }
            stringBuffer.append("empty");
            EnumC91923a2R enumC91923a2R = EnumC91923a2R.PARAM;
            String stringBuffer2 = stringBuffer.toString();
            o.LJIIIIZZ(stringBuffer2, "errorMessage.toString()");
            C91924a2S.LIZ.LIZLLL("unknown", enumC91923a2R, stringBuffer2, "");
            interfaceC88472Yns.invoke(SAK.REJECT);
        }
        C91826a0s.LIZ = apiHost;
        C91824a0q.LIZ = new C91825a0r(merchantId, merchantUserId);
        C91824a0q.LIZIZ = priorityRegion;
        C91824a0q.LJFF = source;
        C91657Zy9.LIZIZ();
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C93058aKk(token, null), 3);
        C92033a4D.LIZJ(activityC45651qj, pageStyle, verifyInfo, source, new IDqS14S0400000_31(this, activityC45651qj, pageStyle, interfaceC88472Yns, 1));
    }
}
