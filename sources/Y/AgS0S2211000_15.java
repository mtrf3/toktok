package Y;

import X.C10I;
import X.C10K;
import X.C76800UCe;
import X.C78685UuP;
import X.C82544WaS;
import X.C85144XbI;
import com.ss.android.ugc.aweme.account.login.twostep.AddVerificationResponse;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity;
import java.util.List;
import ujb.o;

/* loaded from: classes16.dex */
public class AgS0S2211000_15 implements C10I {
    public final int $t;
    public int i5;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;
    public boolean z4;

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

    public static final Object then$0(AgS0S2211000_15 agS0S2211000_15, C10K c10k) {
        Integer num;
        String str;
        String str2;
        String str3;
        if (!C82544WaS.LJ(c10k)) {
            TwoStepVerificationManageActivity twoStepVerificationManageActivity = (TwoStepVerificationManageActivity) agS0S2211000_15.l2;
            Exception LJIIJ = c10k.LJIIJ();
            if (LJIIJ != null) {
                str3 = LJIIJ.toString();
            } else {
                str3 = null;
            }
            twoStepVerificationManageActivity.LLIIJI(null, str3);
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
            if (num == null || 1015 != num.intValue()) {
                ((TwoStepVerificationManageActivity) agS0S2211000_15.l2).LLIIJI(num, str);
            } else {
                ((TwoStepVerificationManageActivity) agS0S2211000_15.l2).LLIIIZ(agS0S2211000_15.i5, agS0S2211000_15.z4, (List) agS0S2211000_15.l3);
            }
            return null;
        }
        if (C78685UuP.LJJJZ(addVerificationResponse.getData().getDefault_verify_way())) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        String str4 = agS0S2211000_15.s0;
        int i = agS0S2211000_15.i5;
        String enterFrom = ((TwoStepVerificationManageActivity) agS0S2211000_15.l2).getEnterFrom();
        kotlin.jvm.internal.o.LJIIIIZZ(enterFrom, "enterFrom");
        C85144XbI.LJIIL(i, str4, enterFrom, agS0S2211000_15.s1, str2, ((TwoStepVerificationManageActivity) agS0S2211000_15.l2).LLIILII());
        if (((TwoStepVerificationManageActivity) agS0S2211000_15.l2).LLIL()) {
            ((TwoStepVerificationManageActivity) agS0S2211000_15.l2).finish();
        } else {
            ((TwoStepVerificationManageActivity) agS0S2211000_15.l2).LLILIL(addVerificationResponse);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$1(AgS0S2211000_15 agS0S2211000_15, C10K c10k) {
        Integer num;
        String str;
        String str2;
        if (!C82544WaS.LJ(c10k)) {
            TwoStepVerificationActivityViewModel.hv0((TwoStepVerificationActivityViewModel) agS0S2211000_15.l2, null, null, 7);
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
            if (num == null || 1015 != num.intValue()) {
                TwoStepVerificationActivityViewModel.hv0((TwoStepVerificationActivityViewModel) agS0S2211000_15.l2, num, str, 4);
            } else {
                ((TwoStepVerificationActivityViewModel) agS0S2211000_15.l2).ov0((List) agS0S2211000_15.l3, agS0S2211000_15.z4);
            }
            return null;
        }
        if (C78685UuP.LJJJZ(addVerificationResponse.getData().getDefault_verify_way())) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        C85144XbI.LJIIL(agS0S2211000_15.i5, agS0S2211000_15.s0, ((TwoStepVerificationActivityViewModel) agS0S2211000_15.l2).getEnterFrom(), agS0S2211000_15.s1, str2, ((TwoStepVerificationActivityViewModel) agS0S2211000_15.l2).rv0());
        ((TwoStepVerificationActivityViewModel) agS0S2211000_15.l2).zv0(addVerificationResponse);
        return C76800UCe.LIZ;
    }

    public AgS0S2211000_15(int i, Object obj, String str, String str2, Object obj2, boolean z, int i2) {
        this.$t = i2;
        this.l2 = obj;
        this.z4 = z;
        this.l3 = obj2;
        this.s0 = str;
        this.i5 = i;
        this.s1 = str2;
    }
}
