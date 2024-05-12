package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C113554cx;
import X.C212428Vi;
import X.C26045AKb;
import X.C76800UCe;
import X.C8W0;
import X.C91793a0L;
import X.C91834a10;
import X.C91924a2S;
import X.C92007a3n;
import X.C92252a7k;
import X.EnumC91916a2K;
import X.EnumC91995a3b;
import X.InterfaceC88475Ynv;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.RepaymentResultInfo;
import com.ss.android.ugc.aweme.bnpl.biz.bill.result.RepaymentViewModel;
import com.ss.android.ugc.aweme.bnpl.biz.credit.landing.LandingAssem;
import com.ss.android.ugc.aweme.bnpl.biz.credit.landing.LandingAssemVM;
import com.ss.android.ugc.aweme.bnpl.biz.credit.phone.PhoneRouteArg;
import com.ss.android.ugc.aweme.bnpl.network.model.ConsultRegisterInfoResponse;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* loaded from: classes20.dex */
public class IDqS463S0100000_31 extends AbstractC65781Prl implements InterfaceC88475Ynv {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88475Ynv
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4, obj5);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4, obj5);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS463S0100000_31(RepaymentViewModel repaymentViewModel, int i) {
        super(5);
        this.$t = i;
        this.l0 = repaymentViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS463S0100000_31(LandingAssem landingAssem, int i) {
        super(5);
        this.$t = i;
        this.l0 = landingAssem;
    }

    public static final Object invoke$0(IDqS463S0100000_31 iDqS463S0100000_31, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        String str;
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        EnumC91916a2K requestStatus = (EnumC91916a2K) obj3;
        EnumC91995a3b enumC91995a3b = (EnumC91995a3b) obj4;
        RepaymentResultInfo repaymentResultInfo = (RepaymentResultInfo) obj5;
        o.LJIIIZ(requestStatus, "requestStatus");
        RepaymentViewModel repaymentViewModel = (RepaymentViewModel) iDqS463S0100000_31.l0;
        if (enumC91995a3b == null) {
            repaymentViewModel.getClass();
        } else if (enumC91995a3b != repaymentViewModel.LJLJJLL) {
            repaymentViewModel.LJLJJLL = enumC91995a3b;
            C91834a10.LIZJ = System.currentTimeMillis();
            int i = C91793a0L.LIZ[enumC91995a3b.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        str = "";
                    } else {
                        str = "processing";
                    }
                } else {
                    str = "fail";
                }
            } else {
                str = "success";
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("interface_return_cost", String.valueOf(repaymentViewModel.LJLJJL));
            linkedHashMap.put("polling_num", String.valueOf(intValue));
            linkedHashMap.put("polling_cost", String.valueOf(longValue));
            linkedHashMap.put("is_page_updated", String.valueOf(repaymentViewModel.LJLJJI));
            linkedHashMap.put("repayment_result", str);
            C91924a2S.LIZ(C91924a2S.LIZ, "fp_sdk_bnpl_repayment_result_show", "bnpl_repayment_result", ((C92252a7k) repaymentViewModel.LJLJI.getValue()).LJLILLLLZI, C113554cx.LJJLIIIJLLLLLLLZ(linkedHashMap), 8);
            repaymentViewModel.LJLJJI = 1;
        }
        ((RepaymentViewModel) iDqS463S0100000_31.l0).setState(new IDqS30S0300000_31(repaymentResultInfo, requestStatus, enumC91995a3b, 5));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS463S0100000_31 iDqS463S0100000_31, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ActivityC45651qj LIZ;
        C8W0 selectSubscribe = (C8W0) obj;
        EnumC91916a2K status = (EnumC91916a2K) obj2;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        ConsultRegisterInfoResponse consultRegisterInfoResponse = (ConsultRegisterInfoResponse) obj4;
        String str = (String) obj5;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(status, "status");
        int i = C92007a3n.LIZ[status.ordinal()];
        if (i != 1) {
            if (i == 2 && (LIZ = C212428Vi.LIZ(selectSubscribe)) != null) {
                if (str == null) {
                    str = LIZ.getString(R.string.f3f);
                } else if (str.length() == 0) {
                    str = LIZ.getString(R.string.f3g);
                }
                o.LJIIIIZZ(str, "when {\n                 …                        }");
                C26045AKb c26045AKb = new C26045AKb(LIZ);
                c26045AKb.LJIIIZ(str);
                c26045AKb.LJIIJ();
            }
        } else if (booleanValue) {
            LandingAssem landingAssem = (LandingAssem) iDqS463S0100000_31.l0;
            if (consultRegisterInfoResponse != null) {
                SmartRoute buildRoute = SmartRouter.buildRoute(landingAssem.getContainerView().getContext(), "//bnpl/onboarding/tel");
                Object obj6 = ListProtector.get(consultRegisterInfoResponse.callingCodeList, 0);
                o.LJIIIIZZ(obj6, "consultRegisterInfoResponse.callingCodeList[0]");
                buildRoute.withNavArg(new PhoneRouteArg((String) obj6, consultRegisterInfoResponse.mobileRuleList, "bnpl_activate_landing"));
                buildRoute.open();
            } else {
                landingAssem.getClass();
            }
            LandingAssemVM v3 = ((LandingAssem) iDqS463S0100000_31.l0).v3();
            v3.getClass();
            v3.withState(new IDqS418S0100000_31(v3, 92));
        }
        return C76800UCe.LIZ;
    }
}
