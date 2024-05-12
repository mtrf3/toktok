package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C10K;
import X.C45804HyK;
import X.C76800UCe;
import X.C85060XZw;
import X.C85144XbI;
import X.EnumC69113RAn;
import X.EnumC69116RAq;
import X.InterfaceC88475Ynv;
import Y.AgS0S2211000_15;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import java.util.List;

/* loaded from: classes16.dex */
public class IDqS462S0100000_15 extends AbstractC65781Prl implements InterfaceC88475Ynv {
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
    public IDqS462S0100000_15(TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel, int i) {
        super(5);
        this.$t = i;
        this.l0 = twoStepVerificationActivityViewModel;
    }

    public static final Object invoke$0(IDqS462S0100000_15 iDqS462S0100000_15, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String verifyMethod = (String) obj2;
        String ticket = (String) obj3;
        List ways = (List) obj4;
        int intValue = ((Number) obj5).intValue();
        o.LJIIIZ(verifyMethod, "verifyMethod");
        o.LJIIIZ(ticket, "ticket");
        o.LJIIIZ(ways, "ways");
        TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel = (TwoStepVerificationActivityViewModel) iDqS462S0100000_15.l0;
        twoStepVerificationActivityViewModel.getClass();
        String verify_way = C85144XbI.LJII(ways);
        TwoStepAuthApi.LIZ.getClass();
        o.LJIIIZ(verify_way, "verify_way");
        TwoStepAuthApi.LIZIZ().addVerification(ticket, verify_way, intValue).LJ(new AgS0S2211000_15(intValue, twoStepVerificationActivityViewModel, verify_way, verifyMethod, ways, booleanValue, 1), C10K.LJIIIIZZ, null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS462S0100000_15 iDqS462S0100000_15, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Activity LJIJJ;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String verifyMethod = (String) obj2;
        String ticket = (String) obj3;
        List ways = (List) obj4;
        int intValue = ((Number) obj5).intValue();
        o.LJIIIZ(verifyMethod, "verifyMethod");
        o.LJIIIZ(ticket, "ticket");
        o.LJIIIZ(ways, "ways");
        TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel = (TwoStepVerificationActivityViewModel) iDqS462S0100000_15.l0;
        IDqS462S0100000_15 iDqS462S0100000_152 = new IDqS462S0100000_15(twoStepVerificationActivityViewModel, 0);
        if (!twoStepVerificationActivityViewModel.LJLJLLL) {
            Context context = twoStepVerificationActivityViewModel.lv0().LJLJI;
            if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
                EnumC69113RAn enumC69113RAn = EnumC69113RAn.ADD_AUTH_DEVICE;
                EnumC69116RAq enumC69116RAq = EnumC69116RAq.ADD_CURRENT_DEVICE_TO_TRUST_DEVICE;
                Bundle jv0 = twoStepVerificationActivityViewModel.jv0();
                jv0.putString("enter_from", twoStepVerificationActivityViewModel.getEnterFrom());
                jv0.putString("ticket", ticket);
                CommonFlowActivity.Companion.LIZIZ(LJIJJ, enumC69113RAn, enumC69116RAq, jv0, new C85060XZw(intValue, twoStepVerificationActivityViewModel, ticket, verifyMethod, ways, iDqS462S0100000_152, booleanValue), null, Boolean.FALSE);
            }
        } else {
            iDqS462S0100000_152.invoke(Boolean.valueOf(booleanValue), verifyMethod, ticket, ways, Integer.valueOf(intValue));
        }
        return C76800UCe.LIZ;
    }
}
