package Y;

import X.C10I;
import X.C10K;
import X.C76800UCe;
import X.C82544WaS;
import X.C85115Xap;
import X.C85144XbI;
import com.ss.android.ugc.aweme.account.login.twostep.AddVerificationResponse;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity;
import kotlin.jvm.internal.AqS68S1100000_15;
import ujb.o;

/* loaded from: classes16.dex */
public class AgS11S2100000_15 implements C10I {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // X.C10I
    public final Object then(C10K<AddVerificationResponse> c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            default:
                return null;
        }
    }

    public static final Object then$0(AgS11S2100000_15 agS11S2100000_15, C10K c10k) {
        Integer num;
        String str;
        if (!C82544WaS.LJ(c10k)) {
            ((TwoStepVerificationManageActivity) agS11S2100000_15.l2).LLIIJI(null, "");
            return null;
        }
        AddVerificationResponse addVerificationResponse = (AddVerificationResponse) c10k.LJIIJJI();
        if (!o.LJJJJIZL("success", addVerificationResponse.getMessage(), true) || addVerificationResponse.getData() == null) {
            AddVerificationResponse.Data data = addVerificationResponse.getData();
            if (data != null) {
                num = data.getErrorCode();
            } else {
                num = null;
            }
            AddVerificationResponse.Data data2 = addVerificationResponse.getData();
            if (data2 != null) {
                str = data2.getErrorDescription();
            } else {
                str = null;
            }
            if (num == null || num.intValue() != 1356) {
                ((TwoStepVerificationManageActivity) agS11S2100000_15.l2).LLIIJI(num, str);
            } else {
                ((TwoStepVerificationManageActivity) agS11S2100000_15.l2).LLJJJJ("", new AqS68S1100000_15((TwoStepVerificationManageActivity) agS11S2100000_15.l2, agS11S2100000_15.s0, 0));
            }
            return null;
        }
        if (kotlin.jvm.internal.o.LJ(agS11S2100000_15.s0, "totp_verify")) {
            C85115Xap.LIZLLL = false;
        }
        boolean LJ = kotlin.jvm.internal.o.LJ(agS11S2100000_15.s0, "mobile_sms_verify");
        boolean LJ2 = kotlin.jvm.internal.o.LJ(agS11S2100000_15.s0, "email_verify");
        boolean LJ3 = kotlin.jvm.internal.o.LJ(agS11S2100000_15.s0, "pwd_verify");
        boolean LJ4 = kotlin.jvm.internal.o.LJ(agS11S2100000_15.s0, "totp_verify");
        String enterFrom = ((TwoStepVerificationManageActivity) agS11S2100000_15.l2).getEnterFrom();
        kotlin.jvm.internal.o.LJIIIIZZ(enterFrom, "enterFrom");
        C85144XbI.LJIILIIL("remove", enterFrom, agS11S2100000_15.s1, LJ, LJ2, LJ3, LJ4);
        ((TwoStepVerificationManageActivity) agS11S2100000_15.l2).LLILIL(addVerificationResponse);
        return C76800UCe.LIZ;
    }

    public static final Object then$1(AgS11S2100000_15 agS11S2100000_15, C10K c10k) {
        Integer num;
        String str;
        if (!C82544WaS.LJ(c10k)) {
            ((TwoStepVerificationManageActivity) agS11S2100000_15.l2).LLIIJI(null, "");
            return null;
        }
        AddVerificationResponse addVerificationResponse = (AddVerificationResponse) c10k.LJIIJJI();
        if (!o.LJJJJIZL("success", addVerificationResponse.getMessage(), true) || addVerificationResponse.getData() == null) {
            AddVerificationResponse.Data data = addVerificationResponse.getData();
            if (data != null) {
                num = data.getErrorCode();
            } else {
                num = null;
            }
            AddVerificationResponse.Data data2 = addVerificationResponse.getData();
            if (data2 != null) {
                str = data2.getErrorDescription();
            } else {
                str = null;
            }
            if (num == null || num.intValue() != 1356) {
                ((TwoStepVerificationManageActivity) agS11S2100000_15.l2).LLIIJI(num, str);
            } else {
                ((TwoStepVerificationManageActivity) agS11S2100000_15.l2).LLJJJJ("", new AqS68S1100000_15((TwoStepVerificationManageActivity) agS11S2100000_15.l2, agS11S2100000_15.s1, 1));
            }
            return null;
        }
        String enterFrom = ((TwoStepVerificationManageActivity) agS11S2100000_15.l2).getEnterFrom();
        kotlin.jvm.internal.o.LJIIIIZZ(enterFrom, "enterFrom");
        C85144XbI.LJIILIIL("turn_off", enterFrom, agS11S2100000_15.s0, true, true, true, true);
        C85115Xap.LIZ = false;
        C85115Xap.LIZIZ = false;
        C85115Xap.LIZJ = false;
        C85115Xap.LIZLLL = false;
        ((TwoStepVerificationManageActivity) agS11S2100000_15.l2).LLILIL(addVerificationResponse);
        return C76800UCe.LIZ;
    }

    public AgS11S2100000_15(TwoStepVerificationManageActivity twoStepVerificationManageActivity, String str, String str2, int i) {
        this.$t = i;
        this.l2 = twoStepVerificationManageActivity;
        this.s0 = str;
        this.s1 = str2;
    }
}
