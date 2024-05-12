package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C188727au;
import X.C76800UCe;
import X.C85144XbI;
import X.FMX;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationDetailFragment;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity;
import com.zhiliaoapp.musically.R;

/* loaded from: classes16.dex */
public class AqS2S2110000_15 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;
    public boolean z3;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS2S2110000_15 aqS2S2110000_15, Object it) {
        TwoStepVerificationManageActivity twoStepVerificationManageActivity;
        o.LJIIIZ(it, "it");
        String str = aqS2S2110000_15.s0;
        String enterFrom = ((TwoStepVerificationDetailFragment) aqS2S2110000_15.l2).getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        C85144XbI.LJJIJ(str, enterFrom);
        String enterFrom2 = ((TwoStepVerificationDetailFragment) aqS2S2110000_15.l2).getEnterFrom();
        o.LJIIIIZZ(enterFrom2, "enterFrom");
        C85144XbI.LIZJ("confirm", "method_remove", enterFrom2);
        String enterFrom3 = ((TwoStepVerificationDetailFragment) aqS2S2110000_15.l2).getEnterFrom();
        o.LJIIIIZZ(enterFrom3, "enterFrom");
        String popupType = aqS2S2110000_15.s1;
        o.LJIIIZ(popupType, "popupType");
        C188727au LJFF = C85144XbI.LJFF();
        LJFF.LJIIIZ("enter_from", enterFrom3);
        LJFF.LJIIIZ("popup_type", popupType);
        LJFF.LJIIIZ("click_button", "remove");
        FMX.LJIIL("twosv_setup_update_remove_click", LJFF.LIZ);
        ActivityC45651qj mo49getActivity = ((TwoStepVerificationDetailFragment) aqS2S2110000_15.l2).mo49getActivity();
        if ((mo49getActivity instanceof TwoStepVerificationManageActivity) && (twoStepVerificationManageActivity = (TwoStepVerificationManageActivity) mo49getActivity) != null) {
            twoStepVerificationManageActivity.LLILLJJLI(aqS2S2110000_15.s0, "", "authorized_logins");
        }
        if (aqS2S2110000_15.z3) {
            ((TwoStepVerificationDetailFragment) aqS2S2110000_15.l2).LJLJJL = false;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS2S2110000_15 aqS2S2110000_15, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI = true;
        actionGroup.LJI(R.string.s7, new AqS2S2110000_15(aqS2S2110000_15.s0, (TwoStepVerificationDetailFragment) aqS2S2110000_15.l2, aqS2S2110000_15.s1, aqS2S2110000_15.z3, 0));
        actionGroup.LJIIIIZZ(R.string.rmt, null);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS2S2110000_15(String str, TwoStepVerificationDetailFragment twoStepVerificationDetailFragment, String str2, boolean z, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l2 = twoStepVerificationDetailFragment;
        this.s1 = str2;
        this.z3 = z;
    }
}
